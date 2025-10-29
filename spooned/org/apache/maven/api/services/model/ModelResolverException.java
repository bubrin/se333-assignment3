package org.apache.maven.api.services.model;
public class ModelResolverException extends org.apache.maven.api.services.MavenException {
    private final java.lang.String groupId;

    private final java.lang.String artifactId;

    private final java.lang.String version;

    public ModelResolverException(java.lang.String message, java.lang.String groupId, java.lang.String artifactId, java.lang.String version, java.lang.Throwable cause) {
        super(message, cause);
        this.groupId = (groupId != null) ? groupId : "";
        this.artifactId = (artifactId != null) ? artifactId : "";
        this.version = (version != null) ? version : "";
    }

    public ModelResolverException(java.lang.String message, java.lang.String groupId, java.lang.String artifactId, java.lang.String version) {
        super(message);
        this.groupId = (groupId != null) ? groupId : "";
        this.artifactId = (artifactId != null) ? artifactId : "";
        this.version = (version != null) ? version : "";
    }

    public ModelResolverException(java.lang.Throwable cause, java.lang.String groupId, java.lang.String artifactId, java.lang.String version) {
        super(cause);
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
    }

    public java.lang.String getGroupId() {
        return groupId;
    }

    public java.lang.String getArtifactId() {
        return artifactId;
    }

    public java.lang.String getVersion() {
        return version;
    }
}
