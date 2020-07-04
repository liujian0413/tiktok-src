package com.google.android.gms.internal.ads;

public final class bli {

    /* renamed from: a */
    public static final bli f42500a = new bli(1.0f, 1.0f);

    /* renamed from: b */
    public final float f42501b;

    /* renamed from: c */
    public final float f42502c;

    /* renamed from: d */
    private final int f42503d;

    public bli(float f, float f2) {
        this.f42501b = f;
        this.f42502c = f2;
        this.f42503d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo40893a(long j) {
        return j * ((long) this.f42503d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bli bli = (bli) obj;
        return this.f42501b == bli.f42501b && this.f42502c == bli.f42502c;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f42501b) + 527) * 31) + Float.floatToRawIntBits(this.f42502c);
    }
}
