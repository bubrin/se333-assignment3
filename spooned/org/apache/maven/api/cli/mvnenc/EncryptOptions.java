package org.apache.maven.api.cli.mvnenc;
@org.apache.maven.api.annotations.Experimental
public interface EncryptOptions extends org.apache.maven.api.cli.Options {
    java.util.Optional<java.lang.Boolean> force();

    java.util.Optional<java.lang.Boolean> yes();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> goals();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.mvnenc.EncryptOptions interpolate(java.util.function.UnaryOperator<java.lang.String> callback);
}
