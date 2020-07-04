package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.client.methods.HttpRequestBase;

class HttpRedirect extends HttpRequestBase {
    private String method;

    public String getMethod() {
        return this.method;
    }

    public HttpRedirect(String str, URI uri) {
        if (str.equalsIgnoreCase("HEAD")) {
            this.method = "HEAD";
        } else {
            this.method = "GET";
        }
        setURI(uri);
    }
}
