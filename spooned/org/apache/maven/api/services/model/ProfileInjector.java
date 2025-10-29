package org.apache.maven.api.services.model;
import org.apache.maven.api.model.Model;
import org.apache.maven.api.model.Profile;
public interface ProfileInjector {
    default org.apache.maven.api.model.Model injectProfile(org.apache.maven.api.model.Model model, org.apache.maven.api.model.Profile profile, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems) {
        return injectProfiles(model, java.util.List.of(profile), request, problems);
    }

    org.apache.maven.api.model.Model injectProfiles(org.apache.maven.api.model.Model model, java.util.List<org.apache.maven.api.model.Profile> profiles, org.apache.maven.api.services.ModelBuilderRequest request, org.apache.maven.api.services.ModelProblemCollector problems);
}
