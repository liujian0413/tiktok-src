package org.apache.http.client.methods;

import java.net.URI;

public class HttpTrace extends HttpRequestBase {
    public HttpTrace() {
    }

    public String getMethod() {
        return "TRACE";
    }

    public HttpTrace(String str) {
        setURI(URI.create(str));
    }
}
