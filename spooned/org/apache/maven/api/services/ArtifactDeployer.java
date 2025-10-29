package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactDeployer extends org.apache.maven.api.Service {
    void deploy(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ArtifactDeployerRequest request);

    default void deploy(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.RemoteRepository repository, @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
        deploy(org.apache.maven.api.services.ArtifactDeployerRequest.build(session, repository, artifacts));
    }
}
