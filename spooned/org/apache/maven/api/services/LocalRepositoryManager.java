package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface LocalRepositoryManager extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path getPathForLocalArtifact(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.LocalRepository local, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Artifact artifact);

    @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path getPathForRemoteArtifact(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.LocalRepository local, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.RemoteRepository remote, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Artifact artifact);
}
