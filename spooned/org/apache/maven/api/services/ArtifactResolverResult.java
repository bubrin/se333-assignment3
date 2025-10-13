package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactResolverResult {
    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.DownloadedArtifact> getArtifacts();

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path getPath(org.apache.maven.api.Artifact artifact);
}
