package org.apache.http.client.methods;

import java.net.URI;

public class HttpHead extends HttpRequestBase {
    public HttpHead() {
    }

    public String getMethod() {
        return "HEAD";
    }

    public HttpHead(String str) {
        setURI(URI.create(str));
    }
}
