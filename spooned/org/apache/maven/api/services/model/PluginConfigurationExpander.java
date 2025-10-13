package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface PluginConfigurationExpander {
    org.apache.maven.api.model.Model expandPluginConfiguration(org.apache.maven.api.model.Model model, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
