package org.apache.http.client.methods;

import java.net.URI;

public class HttpGet extends HttpRequestBase {
    public HttpGet() {
    }

    public String getMethod() {
        return "GET";
    }

    public HttpGet(String str) {
        setURI(URI.create(str));
    }
}
