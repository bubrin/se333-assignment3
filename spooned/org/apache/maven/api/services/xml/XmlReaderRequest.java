package org.apache.maven.api.services.xml;
@org.apache.maven.api.annotations.Experimental
@org.apache.maven.api.annotations.Immutable
public interface XmlReaderRequest {
    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path getPath();

    @org.apache.maven.api.annotations.Nullable
    java.nio.file.Path getRootDirectory();

    @org.apache.maven.api.annotations.Nullable
    java.net.URL getURL();

    @org.apache.maven.api.annotations.Nullable
    java.io.InputStream getInputStream();

    @org.apache.maven.api.annotations.Nullable
    java.io.Reader getReader();

    @org.apache.maven.api.annotations.Nullable
    org.apache.maven.api.services.xml.XmlReaderRequest.Transformer getTransformer();

    boolean isStrict();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getModelId();

    @org.apache.maven.api.annotations.Nullable
    java.lang.String getLocation();

    boolean isAddDefaultEntities();

    interface Transformer {
        java.lang.String transform(java.lang.String source, java.lang.String fieldName);
    }

    @org.apache.maven.api.annotations.Nonnull
    static org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder builder() {
        return new org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder();
    }

    @org.apache.maven.api.annotations.NotThreadSafe
    class XmlReaderRequestBuilder {
        java.nio.file.Path path;

        java.nio.file.Path rootDirectory;

        java.net.URL url;

        java.io.InputStream inputStream;

        java.io.Reader reader;

        org.apache.maven.api.services.xml.XmlReaderRequest.Transformer transformer;

        boolean strict;

        java.lang.String modelId;

        java.lang.String location;

        boolean addDefaultEntities = true;

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder path(java.nio.file.Path path) {
            this.path = path;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder rootDirectory(java.nio.file.Path rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder url(java.net.URL url) {
            this.url = url;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder reader(java.io.Reader reader) {
            this.reader = reader;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder transformer(org.apache.maven.api.services.xml.XmlReaderRequest.Transformer transformer) {
            this.transformer = transformer;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder strict(boolean strict) {
            this.strict = strict;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder modelId(java.lang.String modelId) {
            this.modelId = modelId;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder location(java.lang.String location) {
            this.location = location;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder addDefaultEntities(boolean addDefaultEntities) {
            this.addDefaultEntities = addDefaultEntities;
            return this;
        }

        public org.apache.maven.api.services.xml.XmlReaderRequest build() {
            return new org.apache.maven.api.services.xml.XmlReaderRequest.XmlReaderRequestBuilder.DefaultXmlReaderRequest(path, rootDirectory, url, inputStream, reader, transformer, strict, modelId, location, addDefaultEntities);
        }

        private static class DefaultXmlReaderRequest implements org.apache.maven.api.services.xml.XmlReaderRequest {
            final java.nio.file.Path path;

            final java.nio.file.Path rootDirectory;

            final java.net.URL url;

            final java.io.InputStream inputStream;

            final java.io.Reader reader;

            final org.apache.maven.api.services.xml.XmlReaderRequest.Transformer transformer;

            final boolean strict;

            final java.lang.String modelId;

            final java.lang.String location;

            final boolean addDefaultEntities;

            @java.lang.SuppressWarnings("checkstyle:ParameterNumber")
            DefaultXmlReaderRequest(java.nio.file.Path path, java.nio.file.Path rootDirectory, java.net.URL url, java.io.InputStream inputStream, java.io.Reader reader, org.apache.maven.api.services.xml.XmlReaderRequest.Transformer transformer, boolean strict, java.lang.String modelId, java.lang.String location, boolean addDefaultEntities) {
                this.path = path;
                this.rootDirectory = rootDirectory;
                this.url = url;
                this.inputStream = inputStream;
                this.reader = reader;
                this.transformer = transformer;
                this.strict = strict;
                this.modelId = modelId;
                this.location = location;
                this.addDefaultEntities = addDefaultEntities;
            }

            @java.lang.Override
            public java.nio.file.Path getPath() {
                return path;
            }

            @java.lang.Override
            public java.nio.file.Path getRootDirectory() {
                return rootDirectory;
            }

            @java.lang.Override
            public java.net.URL getURL() {
                return null;
            }

            @java.lang.Override
            public java.io.InputStream getInputStream() {
                return inputStream;
            }

            public java.io.Reader getReader() {
                return reader;
            }

            @java.lang.Override
            public org.apache.maven.api.services.xml.XmlReaderRequest.Transformer getTransformer() {
                return transformer;
            }

            @java.lang.Override
            public boolean isStrict() {
                return strict;
            }

            @java.lang.Override
            public java.lang.String getModelId() {
                return modelId;
            }

            @java.lang.Override
            public java.lang.String getLocation() {
                return location;
            }

            @java.lang.Override
            public boolean isAddDefaultEntities() {
                return addDefaultEntities;
            }
        }
    }
}
