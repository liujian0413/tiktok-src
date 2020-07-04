package org.apache.http.client.params;

import org.apache.http.params.HttpParams;

public class HttpClientParams {
    public static String getCookiePolicy(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter("http.protocol.cookie-policy");
            if (str == null) {
                return "best-match";
            }
            return str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter("http.protocol.handle-authentication", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter("http.protocol.handle-redirects", true);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
