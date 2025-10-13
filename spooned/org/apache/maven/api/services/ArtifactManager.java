package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactManager extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    java.util.Optional<java.nio.file.Path> getPath(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Artifact artifact);

    void setPath(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.ProducedArtifact artifact, java.nio.file.Path path);
}
