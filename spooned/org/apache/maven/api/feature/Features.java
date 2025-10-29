package org.apache.maven.api.feature;
public final class Features {
    private Features() {
    }

    public static boolean consumerPom(@org.apache.maven.api.annotations.Nullable
    java.util.Properties userProperties) {
        return org.apache.maven.api.feature.Features.doGet(userProperties, org.apache.maven.api.Constants.MAVEN_CONSUMER_POM, true);
    }

    public static boolean consumerPom(@org.apache.maven.api.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> userProperties, boolean def) {
        return org.apache.maven.api.feature.Features.doGet(userProperties, org.apache.maven.api.Constants.MAVEN_CONSUMER_POM, def);
    }

    private static boolean doGet(java.util.Properties userProperties, java.lang.String key, boolean def) {
        return org.apache.maven.api.feature.Features.doGet(userProperties != null ? userProperties.get(key) : null, def);
    }

    private static boolean doGet(java.util.Map<java.lang.String, ?> userProperties, java.lang.String key, boolean def) {
        return org.apache.maven.api.feature.Features.doGet(userProperties != null ? userProperties.get(key) : null, def);
    }

    private static boolean doGet(java.lang.Object val, boolean def) {
        if (val instanceof java.lang.Boolean bool) {
            return bool;
        } else if (val != null) {
            return java.lang.Boolean.parseBoolean(val.toString());
        } else {
            return def;
        }
    }
}
