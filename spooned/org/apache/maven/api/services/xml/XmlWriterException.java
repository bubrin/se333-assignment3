package org.apache.maven.api.services.xml;
@org.apache.maven.api.annotations.Experimental
public class XmlWriterException extends org.apache.maven.api.services.MavenException {
    private final org.apache.maven.api.services.xml.Location location;

    public XmlWriterException(java.lang.String message, org.apache.maven.api.services.xml.Location location, java.lang.Exception e) {
        super(message, e);
        this.location = location;
    }

    public org.apache.maven.api.services.xml.Location getLocation() {
        return location;
    }
}
