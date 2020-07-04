package okhttp3;

import java.nio.charset.Charset;
import okhttp3.internal.Util;

public final class Challenge {
    public final Charset charset;
    public final String realm;
    public final String scheme;

    public final int hashCode() {
        return ((((this.realm.hashCode() + 899) * 31) + this.scheme.hashCode()) * 31) + this.charset.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme);
        sb.append(" realm=\"");
        sb.append(this.realm);
        sb.append("\" charset=\"");
        sb.append(this.charset);
        sb.append("\"");
        return sb.toString();
    }

    public final Challenge withCharset(Charset charset2) {
        return new Challenge(this.scheme, this.realm, charset2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (challenge.scheme.equals(this.scheme) && challenge.realm.equals(this.realm) && challenge.charset.equals(this.charset)) {
                return true;
            }
        }
        return false;
    }

    public Challenge(String str, String str2) {
        this(str, str2, Util.ISO_8859_1);
    }

    private Challenge(String str, String str2, Charset charset2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 == null) {
            throw new NullPointerException("realm == null");
        } else if (charset2 != null) {
            this.scheme = str;
            this.realm = str2;
            this.charset = charset2;
        } else {
            throw new NullPointerException("charset == null");
        }
    }
}
