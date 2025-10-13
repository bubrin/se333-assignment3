package org.apache.maven.api.cli;
import org.apache.maven.api.cli.extensions.CoreExtension;
@org.apache.maven.api.annotations.Immutable
@org.apache.maven.api.annotations.Experimental
public interface InvokerRequest {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.ParserRequest parserRequest();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path cwd();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path installationDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path userHomeDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> jvmArguments();

    default org.apache.maven.api.cli.Logger logger() {
        return parserRequest().logger();
    }

    default org.apache.maven.api.services.MessageBuilderFactory messageBuilderFactory() {
        return parserRequest().messageBuilderFactory();
    }

    default org.apache.maven.api.services.Lookup lookup() {
        return parserRequest().lookup();
    }

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> userProperties();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Map<java.lang.String, java.lang.String> systemProperties();

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path topDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.nio.file.Path> rootDirectory();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.io.InputStream> in();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.io.OutputStream> out();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.io.OutputStream> err();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<org.apache.maven.api.cli.extensions.CoreExtension>> coreExtensions();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.Options options();
}
