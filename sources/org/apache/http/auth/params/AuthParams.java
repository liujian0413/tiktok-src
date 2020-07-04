package org.apache.http.auth.params;

import org.apache.http.params.HttpParams;

public final class AuthParams {
    public static String getCredentialCharset(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter("http.auth.credential-charset");
            if (str == null) {
                return "US-ASCII";
            }
            return str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
