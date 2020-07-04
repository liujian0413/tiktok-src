package org.apache.http.params;

public final class HttpConnectionParams {
    public static int getConnectionTimeout(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.connection.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static int getLinger(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.socket.linger", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static int getSoTimeout(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.socket.timeout", 0);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static int getSocketBufferSize(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getIntParameter("http.socket.buffer-size", -1);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean getTcpNoDelay(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter("http.tcp.nodelay", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean isStaleCheckingEnabled(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter("http.connection.stalecheck", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setConnectionTimeout(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.connection.timeout", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setSoTimeout(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.socket.timeout", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setSocketBufferSize(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.socket.buffer-size", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setStaleCheckingEnabled(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.connection.stalecheck", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setTcpNoDelay(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.tcp.nodelay", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
