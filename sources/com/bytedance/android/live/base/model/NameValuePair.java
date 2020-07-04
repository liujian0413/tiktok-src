package com.bytedance.android.live.base.model;

import com.bytedance.android.live.base.C2329c;
import java.io.Serializable;

public class NameValuePair implements Serializable, Cloneable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int hashCode() {
        return C2329c.m9948a(C2329c.m9948a(17, (Object) this.name), (Object) this.value);
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        NameValuePair nameValuePair = (NameValuePair) obj;
        if (!this.name.equals(nameValuePair.name) || !C2329c.m9949a((Object) this.value, (Object) nameValuePair.value)) {
            return false;
        }
        return true;
    }

    public NameValuePair(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
