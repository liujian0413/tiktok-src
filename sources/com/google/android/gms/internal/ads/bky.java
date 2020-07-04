package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class bky {

    /* renamed from: a */
    public final String f42430a;

    /* renamed from: b */
    public final String f42431b;

    public bky(String str, String str2) {
        this.f42430a = str;
        this.f42431b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bky bky = (bky) obj;
        return TextUtils.equals(this.f42430a, bky.f42430a) && TextUtils.equals(this.f42431b, bky.f42431b);
    }

    public final int hashCode() {
        return (this.f42430a.hashCode() * 31) + this.f42431b.hashCode();
    }

    public final String toString() {
        String str = this.f42430a;
        String str2 = this.f42431b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
