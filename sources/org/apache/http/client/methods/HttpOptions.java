package org.apache.http.client.methods;

import java.net.URI;

public class HttpOptions extends HttpRequestBase {
    public HttpOptions() {
    }

    public String getMethod() {
        return "OPTIONS";
    }

    public HttpOptions(String str) {
        setURI(URI.create(str));
    }
}
