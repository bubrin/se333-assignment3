package org.apache.maven.api.services;
class PathSource implements org.apache.maven.api.services.ModelSource {
    private final java.nio.file.Path path;

    private final java.lang.String location;

    PathSource(java.nio.file.Path path) {
        this(path, null);
    }

    PathSource(java.nio.file.Path path, java.lang.String location) {
        this.path = path.normalize();
        this.location = (location != null) ? location : this.path.toString();
    }

    @java.lang.Override
    public java.nio.file.Path getPath() {
        return path;
    }

    @java.lang.Override
    public java.io.InputStream openStream() throws java.io.IOException {
        return java.nio.file.Files.newInputStream(path);
    }

    @java.lang.Override
    public java.lang.String getLocation() {
        return location;
    }

    @java.lang.Override
    public org.apache.maven.api.services.Source resolve(java.lang.String relative) {
        return new org.apache.maven.api.services.PathSource(path.resolve(relative));
    }

    @java.lang.Override
    public org.apache.maven.api.services.ModelSource resolve(org.apache.maven.api.services.ModelSource.ModelLocator locator, java.lang.String relative) {
        java.lang.String norm = relative.replace('\\', java.io.File.separatorChar).replace('/', java.io.File.separatorChar);
        java.nio.file.Path path = getPath().getParent().resolve(norm);
        java.nio.file.Path relatedPom = locator.locateExistingPom(path);
        if (relatedPom != null) {
            return new org.apache.maven.api.services.PathSource(relatedPom);
        }
        return null;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (o == null) {
            return false;
        }
        return (this == o) || ((o.getClass() == getClass()) && java.util.Objects.equals(path, ((org.apache.maven.api.services.PathSource) (o)).path));
    }

    @java.lang.Override
    public int hashCode() {
        return java.util.Objects.hash(path);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return (((((("PathSource[" + "location='") + location) + '\'') + ", ") + "path=") + path) + ']';
    }
}
