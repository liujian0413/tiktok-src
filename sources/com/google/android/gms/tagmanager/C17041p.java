package com.google.android.gms.tagmanager;

import java.util.Arrays;

/* renamed from: com.google.android.gms.tagmanager.p */
final class C17041p {

    /* renamed from: a */
    final String f47721a;

    /* renamed from: b */
    final byte[] f47722b;

    C17041p(String str, byte[] bArr) {
        this.f47721a = str;
        this.f47722b = bArr;
    }

    public final String toString() {
        String str = this.f47721a;
        int hashCode = Arrays.hashCode(this.f47722b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
        sb.append("KeyAndSerialized: key = ");
        sb.append(str);
        sb.append(" serialized hash = ");
        sb.append(hashCode);
        return sb.toString();
    }
}
