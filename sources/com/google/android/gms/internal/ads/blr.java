package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class blr {

    /* renamed from: a */
    private static final blr f42529a = new blr(new int[]{2}, 2);

    /* renamed from: b */
    private final int[] f42530b;

    /* renamed from: c */
    private final int f42531c = 2;

    private blr(int[] iArr, int i) {
        this.f42530b = Arrays.copyOf(iArr, 1);
        Arrays.sort(this.f42530b);
    }

    /* renamed from: a */
    public final boolean mo40912a(int i) {
        return Arrays.binarySearch(this.f42530b, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blr)) {
            return false;
        }
        blr blr = (blr) obj;
        return Arrays.equals(this.f42530b, blr.f42530b) && this.f42531c == blr.f42531c;
    }

    public final int hashCode() {
        return this.f42531c + (Arrays.hashCode(this.f42530b) * 31);
    }

    public final String toString() {
        int i = this.f42531c;
        String arrays = Arrays.toString(this.f42530b);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(i);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
