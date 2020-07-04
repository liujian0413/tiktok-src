package org.apache.http.client.methods;

import java.net.URI;

public class HttpPut extends HttpEntityEnclosingRequestBase {
    public HttpPut() {
    }

    public String getMethod() {
        return "PUT";
    }

    public HttpPut(String str) {
        setURI(URI.create(str));
    }
}
