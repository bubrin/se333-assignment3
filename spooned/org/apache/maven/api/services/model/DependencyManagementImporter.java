package org.apache.maven.api.services.model;
import org.apache.maven.api.model.DependencyManagement;
import org.apache.maven.api.model.Model;
public interface DependencyManagementImporter {
    org.apache.maven.api.model.Model importManagement(org.apache.maven.api.model.Model target, java.util.List<? extends org.apache.maven.api.model.DependencyManagement> sources, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
