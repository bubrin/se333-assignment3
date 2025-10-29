package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelProcessor {
    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path locateExistingPom(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path project);

    org.apache.maven.api.model.Model read(org.apache.maven.api.services.xml.XmlReaderRequest request) throws java.io.IOException, org.apache.maven.api.services.xml.XmlReaderException;
}
