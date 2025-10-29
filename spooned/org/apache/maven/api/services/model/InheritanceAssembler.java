package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
public interface InheritanceAssembler {
    org.apache.maven.api.model.Model assembleModelInheritance(org.apache.maven.api.model.Model child, org.apache.maven.api.model.Model parent, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
