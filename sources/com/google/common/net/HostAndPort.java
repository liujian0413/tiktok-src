package com.google.common.net;

import com.google.common.base.C17434j;
import com.google.common.base.C17439m;
import com.google.common.base.C17456r;
import java.io.Serializable;

public final class HostAndPort implements Serializable {
    private static final long serialVersionUID = 0;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private static boolean isValidPort(int i) {
        return i >= 0 && i <= 65535;
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean hasPort() {
        if (this.port >= 0) {
            return true;
        }
        return false;
    }

    public final int getPort() {
        C17439m.m57981b(hasPort());
        return this.port;
    }

    public final HostAndPort requireBracketsForIPv6() {
        C17439m.m57976a(!this.hasBracketlessColons, "Possible bracketless IPv6 literal: %s", (Object) this.host);
        return this;
    }

    public final int hashCode() {
        return C17434j.m57954a(this.host, Integer.valueOf(this.port), Boolean.valueOf(this.hasBracketlessColons));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.host.length() + 8);
        if (this.host.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.host);
            sb.append(']');
        } else {
            sb.append(this.host);
        }
        if (hasPort()) {
            sb.append(':');
            sb.append(this.port);
        }
        return sb.toString();
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort fromString = fromString(str);
        C17439m.m57976a(!fromString.hasPort(), "Host has a port: %s", (Object) str);
        return fromString;
    }

    public final int getPortOrDefault(int i) {
        if (hasPort()) {
            return this.port;
        }
        return i;
    }

    public final HostAndPort withDefaultPort(int i) {
        C17439m.m57968a(isValidPort(i));
        if (hasPort()) {
            return this;
        }
        return new HostAndPort(this.host, i, this.hasBracketlessColons);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        if (C17434j.m57955a(this.host, hostAndPort.host) && this.port == hostAndPort.port && this.hasBracketlessColons == hostAndPort.hasBracketlessColons) {
            return true;
        }
        return false;
    }

    public static HostAndPort fromString(String str) {
        String str2;
        String str3;
        C17439m.m57962a(str);
        int i = -1;
        boolean z = false;
        if (str.startsWith("[")) {
            String[] hostAndPortFromBracketedHost = getHostAndPortFromBracketedHost(str);
            str2 = hostAndPortFromBracketedHost[0];
            str3 = hostAndPortFromBracketedHost[1];
        } else {
            int indexOf = str.indexOf(58);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (str.indexOf(58, i2) == -1) {
                    String substring = str.substring(0, indexOf);
                    str2 = substring;
                    str3 = str.substring(i2);
                }
            }
            if (indexOf >= 0) {
                z = true;
            }
            str3 = null;
            str2 = str;
        }
        if (!C17456r.m58013a(str3)) {
            C17439m.m57976a(!str3.startsWith("+"), "Unparseable port number: %s", (Object) str);
            try {
                i = Integer.parseInt(str3);
                C17439m.m57976a(isValidPort(i), "Port number out of range: %s", (Object) str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder("Unparseable port number: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return new HostAndPort(str2, i, z);
    }

    private static String[] getHostAndPortFromBracketedHost(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str.charAt(0) == '[') {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57976a(z, "Bracketed host-port string must start with a bracket: %s", (Object) str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        if (indexOf < 0 || lastIndexOf <= indexOf) {
            z2 = false;
        } else {
            z2 = true;
        }
        C17439m.m57976a(z2, "Invalid bracketed host/port: %s", (Object) str);
        String substring = str.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{substring, ""};
        }
        if (str.charAt(i) == ':') {
            z3 = true;
        } else {
            z3 = false;
        }
        C17439m.m57976a(z3, "Only a colon may follow a close bracket: %s", (Object) str);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            C17439m.m57976a(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", (Object) str);
        }
        return new String[]{substring, str.substring(i2)};
    }

    public static HostAndPort fromParts(String str, int i) {
        C17439m.m57971a(isValidPort(i), "Port out of range: %s", i);
        HostAndPort fromString = fromString(str);
        C17439m.m57976a(!fromString.hasPort(), "Host has a port: %s", (Object) str);
        return new HostAndPort(fromString.host, i, fromString.hasBracketlessColons);
    }

    private HostAndPort(String str, int i, boolean z) {
        this.host = str;
        this.port = i;
        this.hasBracketlessColons = z;
    }
}
