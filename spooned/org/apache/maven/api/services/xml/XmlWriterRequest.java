package org.apache.maven.api.services.xml;
@org.apache.maven.api.annotations.Experimental
public interface XmlWriterRequest<T> {
    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path getPath();

    @org.apache.maven.api.annotations.Nullable
    java.io.OutputStream getOutputStream();

    @org.apache.maven.api.annotations.Nullable
    java.io.Writer getWriter();

    @org.apache.maven.api.annotations.Nonnull
    T getContent();

    @org.apache.maven.api.annotations.Nullable
    java.util.function.Function<java.lang.Object, java.lang.String> getInputLocationFormatter();

    static <T> org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> builder() {
        return new org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<>();
    }

    class XmlWriterRequestBuilder<T> {
        java.nio.file.Path path;

        java.io.OutputStream outputStream;

        java.io.Writer writer;

        T content;

        java.util.function.Function<java.lang.Object, java.lang.String> inputLocationFormatter;

        public org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> path(java.nio.file.Path path) {
            this.path = path;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> outputStream(java.io.OutputStream outputStream) {
            this.outputStream = outputStream;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> writer(java.io.Writer writer) {
            this.writer = writer;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> content(T content) {
            this.content = content;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder<T> inputLocationFormatter(java.util.function.Function<java.lang.Object, java.lang.String> inputLocationFormatter) {
            this.inputLocationFormatter = inputLocationFormatter;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlWriterRequest<T> build() {
            return new org.apache.maven.api.services.xml.XmlWriterRequest.XmlWriterRequestBuilder.DefaultXmlWriterRequest<>(path, outputStream, writer, content, inputLocationFormatter);
        }

        private static class DefaultXmlWriterRequest<T> implements org.apache.maven.api.services.xml.XmlWriterRequest<T> {
            final java.nio.file.Path path;

            final java.io.OutputStream outputStream;

            final java.io.Writer writer;

            final T content;

            final java.util.function.Function<java.lang.Object, java.lang.String> inputLocationFormatter;

            DefaultXmlWriterRequest(java.nio.file.Path path, java.io.OutputStream outputStream, java.io.Writer writer, T content, java.util.function.Function<java.lang.Object, java.lang.String> inputLocationFormatter) {
                this.path = path;
                this.outputStream = outputStream;
                this.writer = writer;
                this.content = content;
                this.inputLocationFormatter = inputLocationFormatter;
            }

            @java.lang.Override
            public java.nio.file.Path getPath() {
                return path;
            }

            @java.lang.Override
            public java.io.OutputStream getOutputStream() {
                return outputStream;
            }

            @java.lang.Override
            public java.io.Writer getWriter() {
                return writer;
            }

            @java.lang.Override
            public T getContent() {
                return content;
            }

            @java.lang.Override
            public java.util.function.Function<java.lang.Object, java.lang.String> getInputLocationFormatter() {
                return inputLocationFormatter;
            }
        }
    }
}
