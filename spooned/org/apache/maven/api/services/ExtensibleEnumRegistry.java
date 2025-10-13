package org.apache.maven.api.services;
public interface ExtensibleEnumRegistry<T extends org.apache.maven.api.ExtensibleEnum> extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<T> lookup(@org.apache.maven.api.annotations.Nonnull
    java.lang.String id);

    @org.apache.maven.api.annotations.Nonnull
    default T require(@org.apache.maven.api.annotations.Nonnull
    java.lang.String id) {
        return lookup(id).orElseThrow(() -> new java.lang.IllegalArgumentException(("Unknown extensible enum value '" + id) + "'"));
    }
}
