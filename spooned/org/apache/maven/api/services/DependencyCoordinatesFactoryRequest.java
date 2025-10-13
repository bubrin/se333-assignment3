package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface DependencyCoordinatesFactoryRequest extends org.apache.maven.api.services.ArtifactCoordinatesFactoryRequest {
    java.lang.String getScope();

    boolean isOptional();

    @org.apache.maven.api.annotations.Nonnull
    java.util.Collection<org.apache.maven.api.Exclusion> getExclusions();

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyCoordinatesFactoryRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
        return org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).groupId(groupId).artifactId(artifactId).version(version).classifier(classifier).extension(extension).type(type).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyCoordinatesFactoryRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.ArtifactCoordinates coordinates) {
        return org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).groupId(java.util.Objects.requireNonNull(coordinates, "coordinates cannot be null").getGroupId()).artifactId(coordinates.getArtifactId()).version(coordinates.getVersionConstraint().asString()).classifier(coordinates.getClassifier()).extension(coordinates.getExtension()).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyCoordinatesFactoryRequest build(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session session, @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Dependency dependency) {
        return org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).groupId(java.util.Objects.requireNonNull(dependency, "dependency").getGroupId()).artifactId(dependency.getArtifactId()).version(dependency.getVersion().asString()).classifier(dependency.getClassifier()).extension(dependency.getExtension()).type(dependency.getType().id()).scope(dependency.getScope().id()).optional(dependency.isOptional()).build();
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder builder() {
        return new org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class DependencyCoordinatesFactoryRequestBuilder {
        private org.apache.maven.api.Session session;

        private java.lang.String groupId;

        private java.lang.String artifactId;

        private java.lang.String version;

        private java.lang.String classifier;

        private java.lang.String extension;

        private java.lang.String type;

        private java.lang.String coordinateString;

        private java.lang.String scope;

        private boolean optional;

        private java.util.Collection<org.apache.maven.api.Exclusion> exclusions = java.util.Collections.emptyList();

        DependencyCoordinatesFactoryRequestBuilder() {
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder session(org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder groupId(java.lang.String groupId) {
            this.groupId = groupId;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder artifactId(java.lang.String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder classifier(java.lang.String classifier) {
            this.classifier = classifier;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder extension(java.lang.String extension) {
            this.extension = extension;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder coordinateString(java.lang.String coordinateString) {
            this.coordinateString = coordinateString;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder scope(java.lang.String scope) {
            this.scope = scope;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder optional(boolean optional) {
            this.optional = optional;
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder exclusions(java.util.Collection<org.apache.maven.api.Exclusion> exclusions) {
            if (exclusions != null) {
                if (this.exclusions.isEmpty()) {
                    this.exclusions = new java.util.ArrayList<>();
                }
                this.exclusions.addAll(exclusions);
            }
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder exclusion(org.apache.maven.api.Exclusion exclusion) {
            if (exclusion != null) {
                if (this.exclusions.isEmpty()) {
                    this.exclusions = new java.util.ArrayList<>();
                }
                this.exclusions.add(exclusion);
            }
            return this;
        }

        public org.apache.maven.api.services.DependencyCoordinatesFactoryRequest build() {
            return new org.apache.maven.api.services.DependencyCoordinatesFactoryRequest.DependencyCoordinatesFactoryRequestBuilder.DefaultDependencyCoordinatesFactoryRequest(session, groupId, artifactId, version, classifier, extension, type, coordinateString, scope, optional, exclusions);
        }

        private static class DefaultDependencyCoordinatesFactoryRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.DependencyCoordinatesFactoryRequest {
            private final java.lang.String groupId;

            private final java.lang.String artifactId;

            private final java.lang.String version;

            private final java.lang.String classifier;

            private final java.lang.String extension;

            private final java.lang.String type;

            private final java.lang.String coordinateString;

            private final java.lang.String scope;

            private final boolean optional;

            private final java.util.Collection<org.apache.maven.api.Exclusion> exclusions;

            @java.lang.SuppressWarnings("checkstyle:ParameterNumber")
            private DefaultDependencyCoordinatesFactoryRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type, java.lang.String coordinateString, java.lang.String scope, boolean optional, java.util.Collection<org.apache.maven.api.Exclusion> exclusions) {
                super(session);
                this.groupId = groupId;
                this.artifactId = artifactId;
                this.version = version;
                this.classifier = classifier;
                this.extension = extension;
                this.type = type;
                this.coordinateString = coordinateString;
                this.scope = scope;
                this.optional = optional;
                this.exclusions = exclusions;
            }

            @java.lang.Override
            public java.lang.String getGroupId() {
                return groupId;
            }

            @java.lang.Override
            public java.lang.String getArtifactId() {
                return artifactId;
            }

            @java.lang.Override
            public java.lang.String getVersion() {
                return version;
            }

            @java.lang.Override
            public java.lang.String getClassifier() {
                return classifier;
            }

            @java.lang.Override
            public java.lang.String getExtension() {
                return extension;
            }

            @java.lang.Override
            public java.lang.String getType() {
                return type;
            }

            public java.lang.String getCoordinatesString() {
                return coordinateString;
            }

            @java.lang.Override
            public java.lang.String getScope() {
                return scope;
            }

            @java.lang.Override
            public boolean isOptional() {
                return optional;
            }

            @org.apache.maven.api.annotations.Nonnull
            @java.lang.Override
            public java.util.Collection<org.apache.maven.api.Exclusion> getExclusions() {
                return exclusions;
            }
        }
    }
}
