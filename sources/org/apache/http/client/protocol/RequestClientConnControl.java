package org.apache.http.client.protocol;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

public class RequestClientConnControl implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            httpRequest.setHeader("Proxy-Connection", "Keep-Alive");
        } else {
            ManagedClientConnection managedClientConnection = (ManagedClientConnection) httpContext.getAttribute("http.connection");
            if (managedClientConnection != null) {
                HttpRoute route = managedClientConnection.getRoute();
                if ((route.getHopCount() == 1 || route.isTunnelled()) && !httpRequest.containsHeader("Connection")) {
                    httpRequest.addHeader("Connection", "Keep-Alive");
                }
                if (route.getHopCount() == 2 && !route.isTunnelled() && !httpRequest.containsHeader("Proxy-Connection")) {
                    httpRequest.addHeader("Proxy-Connection", "Keep-Alive");
                }
                return;
            }
            throw new IllegalStateException("Client connection not specified in HTTP context");
        }
    }
}
