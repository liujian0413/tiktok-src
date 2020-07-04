package org.apache.http.conn.scheme;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;

public final class SchemeRegistry {
    private final Map<String, Scheme> registeredSchemes = new LinkedHashMap();

    public final synchronized Scheme get(String str) {
        if (str != null) {
        } else {
            throw new IllegalArgumentException("Name must not be null.");
        }
        return (Scheme) this.registeredSchemes.get(str);
    }

    public final synchronized Scheme getScheme(HttpHost httpHost) {
        if (httpHost != null) {
        } else {
            throw new IllegalArgumentException("Host must not be null.");
        }
        return getScheme(httpHost.getSchemeName());
    }

    public final synchronized Scheme register(Scheme scheme) {
        if (scheme != null) {
        } else {
            throw new IllegalArgumentException("Scheme must not be null.");
        }
        return (Scheme) this.registeredSchemes.put(scheme.getName(), scheme);
    }

    public final synchronized Scheme getScheme(String str) {
        Scheme scheme;
        scheme = get(str);
        if (scheme == null) {
            StringBuilder sb = new StringBuilder("Scheme '");
            sb.append(str);
            sb.append("' not registered.");
            throw new IllegalStateException(sb.toString());
        }
        return scheme;
    }
}
