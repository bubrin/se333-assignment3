package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactInstaller extends org.apache.maven.api.Service {
    void install(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ArtifactInstallerRequest request);

    default void install(org.apache.maven.api.Session session, org.apache.maven.api.ProducedArtifact artifact) {
        install(session, java.util.Collections.singletonList(artifact));
    }

    default void install(org.apache.maven.api.Session session, java.util.Collection<org.apache.maven.api.ProducedArtifact> artifacts) {
        install(org.apache.maven.api.services.ArtifactInstallerRequest.build(session, artifacts));
    }
}
