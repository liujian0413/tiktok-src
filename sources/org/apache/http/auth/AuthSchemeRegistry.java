package org.apache.http.auth;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.params.HttpParams;

public final class AuthSchemeRegistry {
    private final Map<String, AuthSchemeFactory> registeredSchemes = new LinkedHashMap();

    public final synchronized AuthScheme getAuthScheme(String str, HttpParams httpParams) throws IllegalStateException {
        AuthSchemeFactory authSchemeFactory;
        if (str != null) {
            authSchemeFactory = (AuthSchemeFactory) this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
            if (authSchemeFactory != null) {
            } else {
                StringBuilder sb = new StringBuilder("Unsupported authentication scheme: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return authSchemeFactory.newInstance(httpParams);
    }

    public final synchronized void register(String str, AuthSchemeFactory authSchemeFactory) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (authSchemeFactory != null) {
            this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
        } else {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
    }
}
