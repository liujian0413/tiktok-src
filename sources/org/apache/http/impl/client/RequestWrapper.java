package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

public class RequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private int execCount;
    private String method;
    private final HttpRequest original;
    private URI uri;
    private ProtocolVersion version;

    public int getExecCount() {
        return this.execCount;
    }

    public String getMethod() {
        return this.method;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    public URI getURI() {
        return this.uri;
    }

    public boolean isRepeatable() {
        return true;
    }

    public void incrementExecCount() {
        this.execCount++;
    }

    public void resetHeaders() {
        this.headergroup.clear();
        setHeaders(this.original.getAllHeaders());
    }

    public ProtocolVersion getProtocolVersion() {
        if (this.version == null) {
            this.version = HttpProtocolParams.getVersion(getParams());
        }
        return this.version;
    }

    public RequestLine getRequestLine() {
        String str;
        String method2 = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        if (this.uri != null) {
            str = this.uri.toASCIIString();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = "/";
        }
        return new BasicRequestLine(method2, str, protocolVersion);
    }

    public void setURI(URI uri2) {
        this.uri = uri2;
    }

    public RequestWrapper(HttpRequest httpRequest) throws ProtocolException {
        if (httpRequest != null) {
            this.original = httpRequest;
            setParams(httpRequest.getParams());
            if (httpRequest instanceof HttpUriRequest) {
                HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
                this.uri = httpUriRequest.getURI();
                this.method = httpUriRequest.getMethod();
                this.version = null;
            } else {
                RequestLine requestLine = httpRequest.getRequestLine();
                try {
                    this.uri = new URI(requestLine.getUri());
                    this.method = requestLine.getMethod();
                    this.version = httpRequest.getProtocolVersion();
                } catch (URISyntaxException e) {
                    StringBuilder sb = new StringBuilder("Invalid request URI: ");
                    sb.append(requestLine.getUri());
                    throw new ProtocolException(sb.toString(), e);
                }
            }
            this.execCount = 0;
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }
}
