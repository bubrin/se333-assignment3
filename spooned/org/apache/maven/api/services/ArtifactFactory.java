package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactFactory extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Artifact create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ArtifactFactoryRequest request);

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.Artifact create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String extension) {
        return create(org.apache.maven.api.services.ArtifactFactoryRequest.build(session, groupId, artifactId, version, extension));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.Artifact create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
        return create(org.apache.maven.api.services.ArtifactFactoryRequest.build(session, groupId, artifactId, version, classifier, extension, type));
    }

    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.ProducedArtifact createProduced(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ArtifactFactoryRequest request);

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ProducedArtifact createProduced(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String extension) {
        return createProduced(org.apache.maven.api.services.ArtifactFactoryRequest.build(session, groupId, artifactId, version, extension));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ProducedArtifact createProduced(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
        return createProduced(org.apache.maven.api.services.ArtifactFactoryRequest.build(session, groupId, artifactId, version, classifier, extension, type));
    }
}
