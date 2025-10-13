package org.apache.maven.api.plugin;
import org.apache.maven.api.plugin.descriptor.lifecycle.Lifecycle;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Consumer
public interface LifecycleProvider {
    java.util.List<org.apache.maven.api.plugin.descriptor.lifecycle.Lifecycle> getLifecycles();
}
