package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

public class BasicLineFormatter implements LineFormatter {
    public static final BasicLineFormatter DEFAULT = new BasicLineFormatter();

    /* access modifiers changed from: protected */
    public int estimateProtocolVersionLen(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    /* access modifiers changed from: protected */
    public CharArrayBuffer initBuffer(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return new CharArrayBuffer(64);
        }
        charArrayBuffer.clear();
        return charArrayBuffer;
    }

    public CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (header instanceof FormattedHeader) {
            return ((FormattedHeader) header).getBuffer();
        } else {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatHeader(initBuffer, header);
            return initBuffer;
        }
    }

    public CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        if (requestLine != null) {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatRequestLine(initBuffer, requestLine);
            return initBuffer;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }

    public CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        if (statusLine != null) {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatStatusLine(initBuffer, statusLine);
            return initBuffer;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* access modifiers changed from: protected */
    public void doFormatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        String name = header.getName();
        String value = header.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.append(value);
        }
    }

    /* access modifiers changed from: protected */
    public void doFormatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        charArrayBuffer.ensureCapacity(method.length() + 1 + uri.length() + 1 + estimateProtocolVersionLen(requestLine.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        appendProtocolVersion(charArrayBuffer, requestLine.getProtocolVersion());
    }

    /* access modifiers changed from: protected */
    public void doFormatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        int estimateProtocolVersionLen = estimateProtocolVersionLen(statusLine.getProtocolVersion()) + 1 + 3 + 1;
        String reasonPhrase = statusLine.getReasonPhrase();
        if (reasonPhrase != null) {
            estimateProtocolVersionLen += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(estimateProtocolVersionLen);
        appendProtocolVersion(charArrayBuffer, statusLine.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(Integer.toString(statusLine.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        if (protocolVersion != null) {
            int estimateProtocolVersionLen = estimateProtocolVersionLen(protocolVersion);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateProtocolVersionLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateProtocolVersionLen);
            }
            charArrayBuffer.append(protocolVersion.getProtocol());
            charArrayBuffer.append('/');
            charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
            charArrayBuffer.append('.');
            charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("Protocol version may not be null");
    }
}
