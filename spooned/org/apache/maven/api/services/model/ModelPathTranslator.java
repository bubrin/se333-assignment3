package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelPathTranslator {
    org.apache.maven.api.model.Model alignToBaseDirectory(org.apache.maven.api.model.Model model, java.nio.file.Path basedir, org.apache.maven.api.services.ModelBuilderRequest request);
}
