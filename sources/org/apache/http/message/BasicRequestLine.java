package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;

public class BasicRequestLine implements Cloneable, RequestLine {
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public String getMethod() {
        return this.method;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    public String getUri() {
        return this.uri;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatRequestLine(null, this).toString();
    }

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        if (str == null) {
            throw new IllegalArgumentException("Method must not be null.");
        } else if (str2 == null) {
            throw new IllegalArgumentException("URI must not be null.");
        } else if (protocolVersion != null) {
            this.method = str;
            this.uri = str2;
            this.protoversion = protocolVersion;
        } else {
            throw new IllegalArgumentException("Protocol version must not be null.");
        }
    }
}
