package org.apache.maven.api.cli;
@org.apache.maven.api.annotations.Experimental
public interface Options {
    java.lang.String SOURCE_CLI = "CLI";

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String source();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.Map<java.lang.String, java.lang.String>> userProperties();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> showVersionAndExit();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> showVersion();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> quiet();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> verbose();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> showErrors();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> failOnSeverity();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> nonInteractive();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> forceInteractive();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> altUserSettings();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> altProjectSettings();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> altInstallationSettings();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> altUserToolchains();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> altInstallationToolchains();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> logFile();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> rawStreams();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> color();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> offline();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> help();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Options interpolate(@org.apache.maven.api.annotations.Nonnull
    java.util.function.UnaryOperator<java.lang.String> callback);

    default void warnAboutDeprecatedOptions(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ParserRequest request, @org.apache.maven.api.annotations.Nonnull
    java.util.function.Consumer<java.lang.String> printWriter) {
    }

    void displayHelp(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ParserRequest request, @org.apache.maven.api.annotations.Nonnull
    java.util.function.Consumer<java.lang.String> printWriter);
}
