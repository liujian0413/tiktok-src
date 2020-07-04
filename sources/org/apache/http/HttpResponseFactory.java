package org.apache.http;

import org.apache.http.protocol.HttpContext;

public interface HttpResponseFactory {
    HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext);
}
