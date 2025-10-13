package org.apache.maven.api.services.xml;
public interface Location {
    int getLineNumber();

    int getColumnNumber();

    int getCharacterOffset();

    java.lang.String getPublicId();

    java.lang.String getSystemId();
}
