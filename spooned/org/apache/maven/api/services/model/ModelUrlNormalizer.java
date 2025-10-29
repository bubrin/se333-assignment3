package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelUrlNormalizer {
    org.apache.maven.api.model.Model normalize(org.apache.maven.api.model.Model model, org.apache.maven.api.services.ModelBuilderRequest request);
}
