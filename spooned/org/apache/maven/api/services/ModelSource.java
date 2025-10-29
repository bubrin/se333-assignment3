package org.apache.maven.api.services;
public interface ModelSource extends org.apache.maven.api.services.Source {
    interface ModelLocator {
        @org.apache.maven.api.annotations.Nullable
        java.nio.file.Path locateExistingPom(@org.apache.maven.api.annotations.Nonnull
        java.nio.file.Path project);
    }

    @org.apache.maven.api.annotations.Nullable
    org.apache.maven.api.services.ModelSource resolve(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ModelSource.ModelLocator modelLocator, @org.apache.maven.api.annotations.Nonnull
    java.lang.String relative);

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelSource fromPath(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path) {
        return org.apache.maven.api.services.ModelSource.fromPath(path, null);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.ModelSource fromPath(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path, @org.apache.maven.api.annotations.Nullable
    java.lang.String location) {
        return new org.apache.maven.api.services.PathSource(java.util.Objects.requireNonNull(path, "path cannot be null"), location);
    }
}
