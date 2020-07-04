package org.apache.http.client.methods;

import java.net.URI;

public class HttpPost extends HttpEntityEnclosingRequestBase {
    public HttpPost() {
    }

    public String getMethod() {
        return "POST";
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }
}
