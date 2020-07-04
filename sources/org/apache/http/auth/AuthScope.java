package org.apache.http.auth;

import java.util.Locale;
import org.apache.http.util.LangUtils;

public class AuthScope {
    public static final AuthScope ANY = new AuthScope(ANY_HOST, -1, ANY_REALM, ANY_SCHEME);
    public static final String ANY_HOST = null;
    public static final String ANY_REALM = null;
    public static final String ANY_SCHEME = null;
    private final String host;
    private final int port;
    private final String realm;
    private final String scheme;

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.host), this.port), (Object) this.realm), (Object) this.scheme);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.scheme != null) {
            stringBuffer.append(this.scheme.toUpperCase(Locale.ENGLISH));
            stringBuffer.append(' ');
        }
        if (this.realm != null) {
            stringBuffer.append('\'');
            stringBuffer.append(this.realm);
            stringBuffer.append('\'');
        } else {
            stringBuffer.append("<any realm>");
        }
        if (this.host != null) {
            stringBuffer.append('@');
            stringBuffer.append(this.host);
            if (this.port >= 0) {
                stringBuffer.append(':');
                stringBuffer.append(this.port);
            }
        }
        return stringBuffer.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthScope)) {
            return super.equals(obj);
        }
        AuthScope authScope = (AuthScope) obj;
        if (!LangUtils.equals((Object) this.host, (Object) authScope.host) || this.port != authScope.port || !LangUtils.equals((Object) this.realm, (Object) authScope.realm) || !LangUtils.equals((Object) this.scheme, (Object) authScope.scheme)) {
            return false;
        }
        return true;
    }

    public int match(AuthScope authScope) {
        int i;
        if (LangUtils.equals((Object) this.scheme, (Object) authScope.scheme)) {
            i = 1;
        } else if (this.scheme != ANY_SCHEME && authScope.scheme != ANY_SCHEME) {
            return -1;
        } else {
            i = 0;
        }
        if (LangUtils.equals((Object) this.realm, (Object) authScope.realm)) {
            i += 2;
        } else if (!(this.realm == ANY_REALM || authScope.realm == ANY_REALM)) {
            return -1;
        }
        if (this.port == authScope.port) {
            i += 4;
        } else if (!(this.port == -1 || authScope.port == -1)) {
            return -1;
        }
        if (LangUtils.equals((Object) this.host, (Object) authScope.host)) {
            i += 8;
        } else if (this.host == ANY_HOST || authScope.host == ANY_HOST) {
            return i;
        } else {
            return -1;
        }
        return i;
    }

    public AuthScope(String str, int i, String str2, String str3) {
        String str4;
        String str5;
        if (str == null) {
            str4 = ANY_HOST;
        } else {
            str4 = str.toLowerCase(Locale.ENGLISH);
        }
        this.host = str4;
        if (i < 0) {
            i = -1;
        }
        this.port = i;
        if (str2 == null) {
            str2 = ANY_REALM;
        }
        this.realm = str2;
        if (str3 == null) {
            str5 = ANY_SCHEME;
        } else {
            str5 = str3.toUpperCase(Locale.ENGLISH);
        }
        this.scheme = str5;
    }
}
