package org.apache.maven.api.services;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface ArtifactFactoryRequest {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.Session getSession();

    java.lang.String getGroupId();

    java.lang.String getArtifactId();

    java.lang.String getVersion();

    java.lang.String getClassifier();

    java.lang.String getExtension();

    java.lang.String getType();

    static org.apache.maven.api.services.ArtifactFactoryRequest build(org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String extension) {
        return org.apache.maven.api.services.ArtifactFactoryRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).groupId(groupId).artifactId(artifactId).version(version).extension(extension).build();
    }

    static org.apache.maven.api.services.ArtifactFactoryRequest build(org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
        return org.apache.maven.api.services.ArtifactFactoryRequest.builder().session(java.util.Objects.requireNonNull(session, "session cannot be null")).groupId(groupId).artifactId(artifactId).version(version).classifier(classifier).extension(extension).type(type).build();
    }

    static org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder builder() {
        return new org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class ArtifactFactoryRequestBuilder {
        private org.apache.maven.api.Session session;

        private java.lang.String groupId;

        private java.lang.String artifactId;

        private java.lang.String version;

        private java.lang.String classifier;

        private java.lang.String extension;

        private java.lang.String type;

        ArtifactFactoryRequestBuilder() {
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder session(org.apache.maven.api.Session session) {
            this.session = session;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder groupId(java.lang.String groupId) {
            this.groupId = groupId;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder artifactId(java.lang.String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder version(java.lang.String version) {
            this.version = version;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder classifier(java.lang.String classifier) {
            this.classifier = classifier;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder extension(java.lang.String extension) {
            this.extension = extension;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        public org.apache.maven.api.services.ArtifactFactoryRequest build() {
            return new org.apache.maven.api.services.ArtifactFactoryRequest.ArtifactFactoryRequestBuilder.DefaultArtifactFactoryRequest(session, groupId, artifactId, version, classifier, extension, type);
        }

        private static class DefaultArtifactFactoryRequest extends org.apache.maven.api.services.BaseRequest<org.apache.maven.api.Session> implements org.apache.maven.api.services.ArtifactFactoryRequest {
            private final java.lang.String groupId;

            private final java.lang.String artifactId;

            private final java.lang.String version;

            private final java.lang.String classifier;

            private final java.lang.String extension;

            private final java.lang.String type;

            DefaultArtifactFactoryRequest(@org.apache.maven.api.annotations.Nonnull
            org.apache.maven.api.Session session, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.String classifier, java.lang.String extension, java.lang.String type) {
                super(session);
                this.groupId = groupId;
                this.artifactId = artifactId;
                this.version = version;
                this.classifier = classifier;
                this.extension = extension;
                this.type = type;
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
        }
    }
}
