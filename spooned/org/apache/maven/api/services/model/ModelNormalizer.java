package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface ModelNormalizer {
    org.apache.maven.api.model.Model mergeDuplicates(org.apache.maven.api.model.Model model, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);

    org.apache.maven.api.model.Model injectDefaultValues(org.apache.maven.api.model.Model model, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
