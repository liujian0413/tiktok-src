package org.apache.http.cookie;

import java.util.Locale;

public final class CookieOrigin {
    private final String host;
    private final String path;
    private final int port;
    private final boolean secure;

    public final String getHost() {
        return this.host;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getPort() {
        return this.port;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.secure) {
            sb.append("(secure)");
        }
        sb.append(this.host);
        sb.append(':');
        sb.append(Integer.toString(this.port));
        sb.append(this.path);
        sb.append(']');
        return sb.toString();
    }

    public CookieOrigin(String str, int i, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Host of origin may not be null");
        } else if (str.trim().length() == 0) {
            throw new IllegalArgumentException("Host of origin may not be blank");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder("Invalid port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (str2 != null) {
            this.host = str.toLowerCase(Locale.ENGLISH);
            this.port = i;
            if (str2.trim().length() != 0) {
                this.path = str2;
            } else {
                this.path = "/";
            }
            this.secure = z;
        } else {
            throw new IllegalArgumentException("Path of origin may not be null.");
        }
    }
}
