package org.apache.maven.api.services.model;
public interface PathTranslator {
    java.lang.String alignToBaseDirectory(java.lang.String path, java.nio.file.Path basedir);
}
