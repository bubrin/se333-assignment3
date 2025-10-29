package org.apache.maven.api.cli.mvn;
@org.apache.maven.api.annotations.Experimental
public interface MavenOptions extends org.apache.maven.api.cli.Options {
    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> alternatePomFile();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> nonRecursive();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> updateSnapshots();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> activatedProfiles();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> suppressSnapshotUpdates();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> strictChecksums();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> relaxedChecksums();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> failFast();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> failAtEnd();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> failNever();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> resume();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> resumeFrom();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> projects();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> alsoMake();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> alsoMakeDependents();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> threads();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.String> builder();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> noTransferProgress();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> cacheArtifactNotFound();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> strictArtifactDescriptorPolicy();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.lang.Boolean> ignoreTransitiveRepositories();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.util.List<java.lang.String>> goals();

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.cli.mvn.MavenOptions interpolate(@org.apache.maven.api.annotations.Nonnull
    java.util.function.UnaryOperator<java.lang.String> callback);
}
