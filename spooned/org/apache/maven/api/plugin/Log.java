package org.apache.maven.api.plugin;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Provider
public interface Log {
    boolean isDebugEnabled();

    void debug(java.lang.CharSequence content);

    void debug(java.lang.CharSequence content, java.lang.Throwable error);

    void debug(java.lang.Throwable error);

    void debug(java.util.function.Supplier<java.lang.String> content);

    void debug(java.util.function.Supplier<java.lang.String> content, java.lang.Throwable error);

    boolean isInfoEnabled();

    void info(java.lang.CharSequence content);

    void info(java.lang.CharSequence content, java.lang.Throwable error);

    void info(java.lang.Throwable error);

    void info(java.util.function.Supplier<java.lang.String> content);

    void info(java.util.function.Supplier<java.lang.String> content, java.lang.Throwable error);

    boolean isWarnEnabled();

    void warn(java.lang.CharSequence content);

    void warn(java.lang.CharSequence content, java.lang.Throwable error);

    void warn(java.lang.Throwable error);

    void warn(java.util.function.Supplier<java.lang.String> content);

    void warn(java.util.function.Supplier<java.lang.String> content, java.lang.Throwable error);

    boolean isErrorEnabled();

    void error(java.lang.CharSequence content);

    void error(java.lang.CharSequence content, java.lang.Throwable error);

    void error(java.lang.Throwable error);

    void error(java.util.function.Supplier<java.lang.String> content);

    void error(java.util.function.Supplier<java.lang.String> content, java.lang.Throwable error);
}
