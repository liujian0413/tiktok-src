package org.apache.http.message;

import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;

public class BasicStatusLine implements Cloneable, StatusLine {
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatStatusLine(null, this).toString();
    }

    public BasicStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        if (protocolVersion == null) {
            throw new IllegalArgumentException("Protocol version may not be null.");
        } else if (i >= 0) {
            this.protoVersion = protocolVersion;
            this.statusCode = i;
            this.reasonPhrase = str;
        } else {
            throw new IllegalArgumentException("Status code may not be negative.");
        }
    }
}
