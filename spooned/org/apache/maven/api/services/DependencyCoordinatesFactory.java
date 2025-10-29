package org.apache.maven.api.services;
import org.apache.maven.api.model.Dependency;
import org.apache.maven.api.model.Plugin;
import org.apache.maven.api.model.ReportPlugin;
@org.apache.maven.api.annotations.Experimental
public interface DependencyCoordinatesFactory extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.DependencyCoordinatesFactoryRequest request);

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.ArtifactCoordinates coordinates) {
        return create(org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.build(session, coordinates));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Dependency dependency) {
        return create(org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.build(session, dependency));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, org.apache.maven.api.model.Dependency dependency) {
        return create(org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.build(session, dependency.getGroupId(), dependency.getArtifactId(), dependency.getVersion(), dependency.getClassifier(), null, dependency.getType()));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, org.apache.maven.api.model.Plugin plugin) {
        return create(org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.build(session, plugin.getGroupId(), plugin.getArtifactId(), plugin.getVersion(), null, null, "maven-plugin"));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.DependencyCoordinates create(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, org.apache.maven.api.model.ReportPlugin reportPlugin) {
        return create(org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.build(session, reportPlugin.getGroupId(), reportPlugin.getArtifactId(), reportPlugin.getVersion(), null, null, "maven-plugin"));
    }
}
