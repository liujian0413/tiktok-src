package org.apache.http;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.Serializable;
import java.util.Locale;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

public final class HttpHost implements Serializable, Cloneable {
    private static final long serialVersionUID = -7529410654042457626L;
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    public final String getHostName() {
        return this.hostname;
    }

    public final int getPort() {
        return this.port;
    }

    public final String getSchemeName() {
        return this.schemeName;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String toString() {
        return toURI();
    }

    public final int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.lcHostname), this.port), (Object) this.schemeName);
    }

    public final String toHostString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(this.hostname);
        if (this.port != -1) {
            charArrayBuffer.append(':');
            charArrayBuffer.append(Integer.toString(this.port));
        }
        return charArrayBuffer.toString();
    }

    public final String toURI() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(this.schemeName);
        charArrayBuffer.append("://");
        charArrayBuffer.append(this.hostname);
        if (this.port != -1) {
            charArrayBuffer.append(':');
            charArrayBuffer.append(Integer.toString(this.port));
        }
        return charArrayBuffer.toString();
    }

    public HttpHost(String str) {
        this(str, -1, null);
    }

    public HttpHost(HttpHost httpHost) {
        this(httpHost.hostname, httpHost.port, httpHost.schemeName);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHost)) {
            return false;
        }
        HttpHost httpHost = (HttpHost) obj;
        if (!this.lcHostname.equals(httpHost.lcHostname) || this.port != httpHost.port || !this.schemeName.equals(httpHost.schemeName)) {
            return false;
        }
        return true;
    }

    public HttpHost(String str, int i) {
        this(str, i, null);
    }

    public HttpHost(String str, int i, String str2) {
        if (str != null) {
            this.hostname = str;
            this.lcHostname = str.toLowerCase(Locale.ENGLISH);
            if (str2 != null) {
                this.schemeName = str2.toLowerCase(Locale.ENGLISH);
            } else {
                this.schemeName = WebKitApi.SCHEME_HTTP;
            }
            this.port = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }
}
