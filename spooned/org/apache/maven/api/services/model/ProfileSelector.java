package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Profile;
public interface ProfileSelector {
    java.util.List<org.apache.maven.api.model.Profile> getActiveProfiles(java.util.Collection<org.apache.maven.api.model.Profile> profiles, org.apache.maven.api.services.model.ProfileActivationContext context, org.apache.maven.api.services.ModelProblemCollector problems);
}
