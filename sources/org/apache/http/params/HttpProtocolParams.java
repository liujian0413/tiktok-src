package org.apache.http.params;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

public final class HttpProtocolParams {
    public static String getHttpElementCharset(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter("http.protocol.element-charset");
            if (str == null) {
                return "US-ASCII";
            }
            return str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static String getUserAgent(HttpParams httpParams) {
        if (httpParams != null) {
            return (String) httpParams.getParameter("http.useragent");
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static ProtocolVersion getVersion(HttpParams httpParams) {
        if (httpParams != null) {
            Object parameter = httpParams.getParameter("http.protocol.version");
            if (parameter == null) {
                return HttpVersion.HTTP_1_1;
            }
            return (ProtocolVersion) parameter;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean useExpectContinue(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter("http.protocol.expect-continue", false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setContentCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.content-charset", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUseExpectContinue(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.protocol.expect-continue", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUserAgent(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setVersion(HttpParams httpParams, ProtocolVersion protocolVersion) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.version", protocolVersion);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
