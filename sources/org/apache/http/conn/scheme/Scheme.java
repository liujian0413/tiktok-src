package org.apache.http.conn.scheme;

import java.util.Locale;
import org.apache.http.util.LangUtils;

public final class Scheme {
    private final int defaultPort;
    private final boolean layered;
    private final String name;
    private final SocketFactory socketFactory;
    private String stringRep;

    public final int getDefaultPort() {
        return this.defaultPort;
    }

    public final String getName() {
        return this.name;
    }

    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    public final boolean isLayered() {
        return this.layered;
    }

    public final int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, this.defaultPort), (Object) this.name), this.layered), (Object) this.socketFactory);
    }

    public final String toString() {
        if (this.stringRep == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            sb.append(':');
            sb.append(Integer.toString(this.defaultPort));
            this.stringRep = sb.toString();
        }
        return this.stringRep;
    }

    public final int resolvePort(int i) {
        if (i <= 0) {
            return this.defaultPort;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (!this.name.equals(scheme.name) || this.defaultPort != scheme.defaultPort || this.layered != scheme.layered || !this.socketFactory.equals(scheme.socketFactory)) {
            return false;
        }
        return true;
    }

    public Scheme(String str, SocketFactory socketFactory2, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Scheme name may not be null");
        } else if (socketFactory2 == null) {
            throw new IllegalArgumentException("Socket factory may not be null");
        } else if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder("Port is invalid: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            this.name = str.toLowerCase(Locale.ENGLISH);
            this.socketFactory = socketFactory2;
            this.defaultPort = i;
            this.layered = socketFactory2 instanceof LayeredSocketFactory;
        }
    }
}
