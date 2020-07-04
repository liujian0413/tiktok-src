package org.apache.http.cookie;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.params.HttpParams;

public final class CookieSpecRegistry {
    private final Map<String, CookieSpecFactory> registeredSpecs = new LinkedHashMap();

    public final synchronized CookieSpec getCookieSpec(String str, HttpParams httpParams) throws IllegalStateException {
        CookieSpecFactory cookieSpecFactory;
        if (str != null) {
            cookieSpecFactory = (CookieSpecFactory) this.registeredSpecs.get(str.toLowerCase(Locale.ENGLISH));
            if (cookieSpecFactory != null) {
            } else {
                StringBuilder sb = new StringBuilder("Unsupported cookie spec: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return cookieSpecFactory.newInstance(httpParams);
    }

    public final synchronized void register(String str, CookieSpecFactory cookieSpecFactory) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (cookieSpecFactory != null) {
            this.registeredSpecs.put(str.toLowerCase(Locale.ENGLISH), cookieSpecFactory);
        } else {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        }
    }
}
