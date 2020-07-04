package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class bnn {

    /* renamed from: a */
    public final int f42735a = 1;

    /* renamed from: b */
    public final byte[] f42736b;

    public bnn(int i, byte[] bArr) {
        this.f42736b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bnn bnn = (bnn) obj;
        return this.f42735a == bnn.f42735a && Arrays.equals(this.f42736b, bnn.f42736b);
    }

    public final int hashCode() {
        return (this.f42735a * 31) + Arrays.hashCode(this.f42736b);
    }
}
