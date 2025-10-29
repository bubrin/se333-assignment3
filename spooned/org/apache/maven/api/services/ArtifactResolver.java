package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
public interface ArtifactResolver extends org.apache.maven.api.Service {
    org.apache.maven.api.services.ArtifactResolverResult resolve(org.apache.maven.api.services.ArtifactResolverRequest request);

    default org.apache.maven.api.services.ArtifactResolverResult resolve(org.apache.maven.api.Session session, java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates) {
        return resolve(org.apache.maven.api.services.ArtifactResolverRequest.build(session, coordinates));
    }

    default org.apache.maven.api.services.ArtifactResolverResult resolve(org.apache.maven.api.Session session, java.util.Collection<? extends org.apache.maven.api.ArtifactCoordinates> coordinates, java.util.List<org.apache.maven.api.RemoteRepository> repositories) {
        return resolve(org.apache.maven.api.services.ArtifactResolverRequest.build(session, coordinates, repositories));
    }
}
