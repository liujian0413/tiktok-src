package org.apache.http.conn.params;

import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

public final class ConnManagerParams {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() {
        public final int getMaxForRoute(HttpRoute httpRoute) {
            return 2;
        }
    };

    public static ConnPerRoute getMaxConnectionsPerRoute(HttpParams httpParams) {
        if (httpParams != null) {
            ConnPerRoute connPerRoute = (ConnPerRoute) httpParams.getParameter("http.conn-manager.max-per-route");
            if (connPerRoute == null) {
                return DEFAULT_CONN_PER_ROUTE;
            }
            return connPerRoute;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static int getMaxTotalConnections(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.conn-manager.max-total", 20);
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static long getTimeout(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getLongParameter("http.conn-manager.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        if (httpParams != null) {
            httpParams.setParameter("http.conn-manager.max-per-route", connPerRoute);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.conn-manager.max-total", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static void setTimeout(HttpParams httpParams, long j) {
        if (httpParams != null) {
            httpParams.setLongParameter("http.conn-manager.timeout", j);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
