package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.kw */
final class C16686kw {

    /* renamed from: a */
    final int f46609a;

    /* renamed from: b */
    final byte[] f46610b;

    C16686kw(int i, byte[] bArr) {
        this.f46609a = i;
        this.f46610b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16686kw)) {
            return false;
        }
        C16686kw kwVar = (C16686kw) obj;
        return this.f46609a == kwVar.f46609a && Arrays.equals(this.f46610b, kwVar.f46610b);
    }

    public final int hashCode() {
        return ((this.f46609a + 527) * 31) + Arrays.hashCode(this.f46610b);
    }
}
