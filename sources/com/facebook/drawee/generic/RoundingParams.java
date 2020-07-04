package com.facebook.drawee.generic;

import com.facebook.common.internal.C13307g;
import java.util.Arrays;

public final class RoundingParams {

    /* renamed from: a */
    public RoundingMethod f35611a = RoundingMethod.BITMAP_ONLY;

    /* renamed from: b */
    public boolean f35612b;

    /* renamed from: c */
    public float[] f35613c;

    /* renamed from: d */
    public int f35614d;

    /* renamed from: e */
    public float f35615e;

    /* renamed from: f */
    public int f35616f;

    /* renamed from: g */
    public float f35617g;

    /* renamed from: h */
    public boolean f35618h;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    /* renamed from: a */
    private float[] m39398a() {
        if (this.f35613c == null) {
            this.f35613c = new float[8];
        }
        return this.f35613c;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f35611a != null) {
            i = this.f35611a.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f35612b ? 1 : 0)) * 31;
        if (this.f35613c != null) {
            i2 = Arrays.hashCode(this.f35613c);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f35614d) * 31;
        if (this.f35615e != 0.0f) {
            i3 = Float.floatToIntBits(this.f35615e);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f35616f) * 31;
        if (this.f35617g != 0.0f) {
            i4 = Float.floatToIntBits(this.f35617g);
        }
        return ((i7 + i4) * 31) + (this.f35618h ? 1 : 0);
    }

    /* renamed from: a */
    public final RoundingParams mo32883a(RoundingMethod roundingMethod) {
        this.f35611a = roundingMethod;
        return this;
    }

    /* renamed from: b */
    public final RoundingParams mo32885b(int i) {
        this.f35616f = i;
        return this;
    }

    /* renamed from: a */
    public final RoundingParams mo32879a(float f) {
        Arrays.fill(m39398a(), f);
        return this;
    }

    /* renamed from: b */
    public static RoundingParams m39399b(float f) {
        return new RoundingParams().mo32879a(f);
    }

    /* renamed from: c */
    public final RoundingParams mo32886c(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38944a(z, (Object) "the border width cannot be < 0");
        this.f35615e = f;
        return this;
    }

    /* renamed from: d */
    public final RoundingParams mo32887d(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38944a(z, (Object) "the padding cannot be < 0");
        this.f35617g = f;
        return this;
    }

    /* renamed from: a */
    public final RoundingParams mo32881a(int i) {
        this.f35614d = i;
        this.f35611a = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f35612b == roundingParams.f35612b && this.f35614d == roundingParams.f35614d && Float.compare(roundingParams.f35615e, this.f35615e) == 0 && this.f35616f == roundingParams.f35616f && Float.compare(roundingParams.f35617g, this.f35617g) == 0 && this.f35611a == roundingParams.f35611a && this.f35618h == roundingParams.f35618h) {
            return Arrays.equals(this.f35613c, roundingParams.f35613c);
        }
        return false;
    }

    /* renamed from: a */
    public final RoundingParams mo32884a(boolean z) {
        this.f35612b = z;
        return this;
    }

    /* renamed from: a */
    public final RoundingParams mo32882a(int i, float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38944a(z, (Object) "the border width cannot be < 0");
        this.f35615e = f;
        this.f35616f = i;
        return this;
    }

    /* renamed from: b */
    public static RoundingParams m39400b(float f, float f2, float f3, float f4) {
        return new RoundingParams().mo32880a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public final RoundingParams mo32880a(float f, float f2, float f3, float f4) {
        float[] a = m39398a();
        a[1] = f;
        a[0] = f;
        a[3] = f2;
        a[2] = f2;
        a[5] = f3;
        a[4] = f3;
        a[7] = f4;
        a[6] = f4;
        return this;
    }
}
