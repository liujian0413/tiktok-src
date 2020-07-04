package org.apache.http.protocol;

import java.io.IOException;
import java.net.InetAddress;
import org.apache.http.HttpConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpInetConnection;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;

public class RequestTargetHost implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext != null) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            if ((!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") || !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) && !httpRequest.containsHeader("Host")) {
                HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                if (httpHost == null) {
                    HttpConnection httpConnection = (HttpConnection) httpContext.getAttribute("http.connection");
                    if (httpConnection instanceof HttpInetConnection) {
                        HttpInetConnection httpInetConnection = (HttpInetConnection) httpConnection;
                        InetAddress remoteAddress = httpInetConnection.getRemoteAddress();
                        int remotePort = httpInetConnection.getRemotePort();
                        if (remoteAddress != null) {
                            httpHost = new HttpHost(remoteAddress.getHostName(), remotePort);
                        }
                    }
                    if (httpHost == null) {
                        if (!protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                            throw new ProtocolException("Target host missing");
                        }
                        return;
                    }
                }
                httpRequest.addHeader("Host", httpHost.toHostString());
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
