package org.apache.maven.api.services.xml;
@org.apache.maven.api.annotations.Experimental
public interface XmlFactory<T> extends org.apache.maven.api.Service {
    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(path, true);
    }

    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path, boolean strict) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(org.apache.maven.api.services.xml.XmlReaderRequest.builder().path(path).strict(strict).build());
    }

    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.io.InputStream input) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(input, true);
    }

    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.io.InputStream input, boolean strict) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(org.apache.maven.api.services.xml.XmlReaderRequest.builder().inputStream(input).strict(strict).build());
    }

    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.io.Reader reader) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(reader, true);
    }

    @org.apache.maven.api.annotations.Nonnull
    default T read(@org.apache.maven.api.annotations.Nonnull
    java.io.Reader reader, boolean strict) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(org.apache.maven.api.services.xml.XmlReaderRequest.builder().reader(reader).strict(strict).build());
    }

    @org.apache.maven.api.annotations.Nonnull
    T read(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.xml.XmlReaderRequest request) throws org.apache.maven.api.services.xml.XmlReaderException;

    default void write(@org.apache.maven.api.annotations.Nonnull
    T content, @org.apache.maven.api.annotations.Nonnull
    java.nio.file.Path path) throws org.apache.maven.api.services.xml.XmlWriterException {
        write(org.apache.maven.api.services.xml.XmlWriterRequest.<T>builder().content(content).path(path).build());
    }

    default void write(@org.apache.maven.api.annotations.Nonnull
    T content, @org.apache.maven.api.annotations.Nonnull
    java.io.OutputStream outputStream) throws org.apache.maven.api.services.xml.XmlWriterException {
        write(org.apache.maven.api.services.xml.XmlWriterRequest.<T>builder().content(content).outputStream(outputStream).build());
    }

    default void write(@org.apache.maven.api.annotations.Nonnull
    T content, @org.apache.maven.api.annotations.Nonnull
    java.io.Writer writer) throws org.apache.maven.api.services.xml.XmlWriterException {
        write(org.apache.maven.api.services.xml.XmlWriterRequest.<T>builder().content(content).writer(writer).build());
    }

    void write(@org.apache.maven.api.annotations.Nonnull
    org.apache.maven.api.services.xml.XmlWriterRequest<T> request) throws org.apache.maven.api.services.xml.XmlWriterException;

    @org.apache.maven.api.annotations.Nonnull
    default T fromXmlString(@org.apache.maven.api.annotations.Nonnull
    java.lang.String xml) throws org.apache.maven.api.services.xml.XmlReaderException {
        return read(new java.io.StringReader(xml));
    }

    @org.apache.maven.api.annotations.Nonnull
    default java.lang.String toXmlString(@org.apache.maven.api.annotations.Nonnull
    T content) throws org.apache.maven.api.services.xml.XmlWriterException {
        java.io.StringWriter sw = new java.io.StringWriter();
        write(content, sw);
        return sw.toString();
    }
}
