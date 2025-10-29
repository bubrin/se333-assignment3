package org.apache.maven.api.services;
public interface MessageBuilder extends java.lang.Appendable {
    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder trace(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_TRACE_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_TRACE_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder debug(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_DEBUG_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_DEBUG_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder info(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_INFO_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_INFO_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder warning(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_WARNING_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_WARNING_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder error(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_ERROR_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_ERROR_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder success(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_SUCCESS_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_SUCCESS_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder failure(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_FAILURE_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_FAILURE_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder strong(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_STRONG_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_STRONG_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder mojo(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_MOJO_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_MOJO_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder project(java.lang.Object message) {
        return style((("." + org.apache.maven.api.Constants.MAVEN_STYLE_PROJECT_NAME) + ":-") + org.apache.maven.api.Constants.MAVEN_STYLE_PROJECT_DEFAULT, message);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder style(java.lang.String style, java.lang.Object message) {
        return style(style).a(message).resetStyle();
    }

    org.apache.maven.api.services.MessageBuilder style(java.lang.String style);

    org.apache.maven.api.services.MessageBuilder resetStyle();

    @org.apache.maven.api.annotations.Nonnull
    @java.lang.Override
    org.apache.maven.api.services.MessageBuilder append(java.lang.CharSequence cs);

    @org.apache.maven.api.annotations.Nonnull
    @java.lang.Override
    org.apache.maven.api.services.MessageBuilder append(java.lang.CharSequence cs, int start, int end);

    @org.apache.maven.api.annotations.Nonnull
    @java.lang.Override
    org.apache.maven.api.services.MessageBuilder append(char c);

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder a(char[] value, int offset, int len) {
        return append(java.lang.String.valueOf(value, offset, len));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder a(char[] value) {
        return append(java.lang.String.valueOf(value));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder a(java.lang.CharSequence value, int start, int end) {
        return append(value, start, end);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder a(java.lang.CharSequence value) {
        return append(value);
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder a(java.lang.Object value) {
        return append(java.lang.String.valueOf(value));
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder newline() {
        return append(java.lang.System.lineSeparator());
    }

    @org.apache.maven.api.annotations.Nonnull
    default org.apache.maven.api.services.MessageBuilder format(java.lang.String pattern, java.lang.Object... args) {
        return append(java.lang.String.format(pattern, args));
    }

    org.apache.maven.api.services.MessageBuilder setLength(int length);

    @org.apache.maven.api.annotations.Nonnull
    java.lang.String build();
}
