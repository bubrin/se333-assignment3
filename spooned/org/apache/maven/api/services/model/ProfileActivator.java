package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Profile;
public interface ProfileActivator {
    boolean isActive(org.apache.maven.api.model.Profile profile, org.apache.maven.api.services.model.ProfileActivationContext context, org.apache.maven.api.services.ModelProblemCollector problems);

    boolean presentInConfig(org.apache.maven.api.model.Profile profile, org.apache.maven.api.services.model.ProfileActivationContext context, org.apache.maven.api.services.ModelProblemCollector problems);
}
