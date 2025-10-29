package org.apache.maven.api.services.model;
public interface RootDetector extends org.apache.maven.api.Service {
    boolean isRootDirectory(java.nio.file.Path dir);
}
