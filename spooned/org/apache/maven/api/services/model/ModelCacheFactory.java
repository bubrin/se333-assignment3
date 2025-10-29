package org.apache.maven.api.services.model;
@org.apache.maven.api.annotations.Experimental
public interface ModelCacheFactory {
    @org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.model.ModelCache newInstance();
}
