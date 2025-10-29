package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactCoordinatesFactory extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.ArtifactCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest request);

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ArtifactCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    java.lang.String coordinatesString) {
        return create(org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest.build(session, coordinatesString));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ArtifactCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String extension) {
        return create(org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest.build(session, groupId, artifactId, version, extension));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ArtifactCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
        return create(org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest.build(session, groupId, artifactId, version, classifier, extension, type));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.ArtifactCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, org.apache.maven.api.Artifact artifact) {
        return create(org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest.build(session, artifact.getGroupId(), artifact.getArtifactId(), artifact.getVersion().asString(), artifact.getClassifier(), artifact.getExtension(), null));
    }
}
