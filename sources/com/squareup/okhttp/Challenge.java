package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;

public final class Challenge {
    private final String realm;
    private final String scheme;

    public final String getRealm() {
        return this.realm;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.realm != null) {
            i = this.realm.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 899) * 31;
        if (this.scheme != null) {
            i2 = this.scheme.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.scheme);
        sb.append(" realm=\"");
        sb.append(this.realm);
        sb.append("\"");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            if (Util.equal(this.scheme, challenge.scheme) && Util.equal(this.realm, challenge.realm)) {
                return true;
            }
        }
        return false;
    }

    public Challenge(String str, String str2) {
        this.scheme = str;
        this.realm = str2;
    }
}
