package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface DependencyManagementInjector {
    org.apache.maven.api.model.Model injectManagement(org.apache.maven.api.model.Model model, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
