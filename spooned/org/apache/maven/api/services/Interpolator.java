package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface Interpolator extends org.apache.maven.api.Service {
    default void interpolate(@org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> properties, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback) {
        interpolate(properties, callback, null, true);
    }

    default void interpolate(@org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> map, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback, boolean defaultsToEmpty) {
        interpolate(map, callback, null, defaultsToEmpty);
    }

    void interpolate(@org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> map, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback, @org.apache.maven.api.annotations.Nullable
    java.util.function.BinaryOperator<java.lang.String> postprocessor, boolean defaultsToEmpty);

    @org.apache.maven.api.annotations.Nullable
    default java.lang.String interpolate(@org.apache.maven.api.annotations.Nullable
    java.lang.String val, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback) {
        return interpolate(val, callback, false);
    }

    @org.apache.maven.api.annotations.Nullable
    default java.lang.String interpolate(@org.apache.maven.api.annotations.Nullable
    java.lang.String val, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback, boolean defaultsToEmpty) {
        return interpolate(val, callback, null, defaultsToEmpty);
    }

    @org.apache.maven.api.annotations.Nullable
    java.lang.String interpolate(@org.apache.maven.api.annotations.Nullable
    java.lang.String val, @org.apache.maven.api.annotations.Nullable
    java.util.function.UnaryOperator<java.lang.String> callback, @org.apache.maven.api.annotations.Nullable
    java.util.function.BinaryOperator<java.lang.String> postprocessor, boolean defaultsToEmpty);

    static java.util.function.UnaryOperator<java.lang.String> chain(java.util.Collection<? extends java.util.function.UnaryOperator<java.lang.String>> functions) {
        return s -> {
            for (java.util.function.UnaryOperator<java.lang.String> function : functions) {
                java.lang.String v = function.apply(s);
                if (v != null) {
                    return v;
                }
            }
            return null;
        };
    }

    @java.lang.SafeVarargs
    static java.util.function.UnaryOperator<java.lang.String> chain(java.util.function.UnaryOperator<java.lang.String>... functions) {
        return org.apache.maven.api.services.Interpolator.chain(java.util.List.of(functions));
    }

    static java.util.function.UnaryOperator<java.lang.String> memoize(java.util.function.UnaryOperator<java.lang.String> callback) {
        java.util.Map<java.lang.String, java.util.Optional<java.lang.String>> cache = new java.util.HashMap<>();
        return s -> cache.computeIfAbsent(s, v -> java.util.Optional.ofNullable(callback.apply(v))).orElse(null);
    }
}
