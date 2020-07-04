package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

public class ConnRouteParams {
    public static final HttpHost NO_HOST = new HttpHost("127.0.0.255", 0, "no-host");
    public static final HttpRoute NO_ROUTE = new HttpRoute(NO_HOST);

    public static HttpHost getDefaultProxy(HttpParams httpParams) {
        if (httpParams != null) {
            HttpHost httpHost = (HttpHost) httpParams.getParameter("http.route.default-proxy");
            if (httpHost == null || !NO_HOST.equals(httpHost)) {
                return httpHost;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static HttpRoute getForcedRoute(HttpParams httpParams) {
        if (httpParams != null) {
            HttpRoute httpRoute = (HttpRoute) httpParams.getParameter("http.route.forced-route");
            if (httpRoute == null || !NO_ROUTE.equals(httpRoute)) {
                return httpRoute;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static InetAddress getLocalAddress(HttpParams httpParams) {
        if (httpParams != null) {
            return (InetAddress) httpParams.getParameter("http.route.local-address");
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
