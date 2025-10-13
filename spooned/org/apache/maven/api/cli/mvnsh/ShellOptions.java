package org.apache.maven.api.cli.mvnsh;
@org.apache.maven.api.annotations.Experimental
public interface ShellOptions extends org.apache.maven.api.cli.Options {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.mvnsh.ShellOptions interpolate(java.util.function.UnaryOperator<java.lang.String> callback);
}
