package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;
import java.net.Proxy.Type;

public final class RequestLine {
    private RequestLine() {
    }

    public static String requestPath(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery == null) {
            return encodedPath;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(encodedPath);
        sb.append('?');
        sb.append(encodedQuery);
        return sb.toString();
    }

    private static boolean includeAuthorityInRequestLine(Request request, Type type) {
        if (request.isHttps() || type != Type.HTTP) {
            return false;
        }
        return true;
    }

    static String get(Request request, Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (includeAuthorityInRequestLine(request, type)) {
            sb.append(request.httpUrl());
        } else {
            sb.append(requestPath(request.httpUrl()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }
}
