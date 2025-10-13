package org.apache.maven.api.plugin.descriptor.another;
import org.apache.maven.api.plugin.descriptor.PluginDescriptor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ExtendedPluginDescriptorTest {
    public static class ExtendedPluginDescriptor extends org.apache.maven.api.plugin.descriptor.PluginDescriptor {
        private final java.lang.String additionalField;

        protected ExtendedPluginDescriptor(org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor.Builder builder) {
            super(builder);
            this.additionalField = builder.additionalField;
        }

        public java.lang.String getAdditionalField() {
            return additionalField;
        }

        public static class Builder extends org.apache.maven.api.plugin.descriptor.PluginDescriptor.Builder {
            protected java.lang.String additionalField;

            public Builder() {
                super(false);
            }

            public org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor.Builder additionalField(java.lang.String additionalField) {
                this.additionalField = additionalField;
                return this;
            }

            public org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor build() {
                return new org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor(this);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void testExtendedPluginDescriptor() {
        org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor.Builder builder = new org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor.Builder();
        builder.additionalField("additional").groupId("org.apache.maven").artifactId("maven-plugin-api").version("1.0.0");
        org.apache.maven.api.plugin.descriptor.another.ExtendedPluginDescriptorTest.ExtendedPluginDescriptor descriptor = builder.build();
        org.junit.jupiter.api.Assertions.assertEquals("additional", descriptor.getAdditionalField());
        org.junit.jupiter.api.Assertions.assertEquals("org.apache.maven", descriptor.getGroupId());
    }
}
