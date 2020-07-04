package com.facebook.imagepipeline.common;

import com.C1642a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.util.C13334a;

/* renamed from: com.facebook.imagepipeline.common.d */
public final class C13596d {

    /* renamed from: a */
    public final int f36024a;

    /* renamed from: b */
    public final int f36025b;

    /* renamed from: c */
    public final float f36026c;

    /* renamed from: d */
    public final float f36027d;

    public final int hashCode() {
        return C13334a.m39024a(this.f36024a, this.f36025b);
    }

    public final String toString() {
        return C1642a.m8035a(null, "%dx%d", new Object[]{Integer.valueOf(this.f36024a), Integer.valueOf(this.f36025b)});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13596d)) {
            return false;
        }
        C13596d dVar = (C13596d) obj;
        if (this.f36024a == dVar.f36024a && this.f36025b == dVar.f36025b) {
            return true;
        }
        return false;
    }

    public C13596d(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    private C13596d(int i, int i2, float f) {
        this(i, i2, 2048.0f, 0.6666667f);
    }

    private C13596d(int i, int i2, float f, float f2) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        this.f36024a = i;
        this.f36025b = i2;
        this.f36026c = f;
        this.f36027d = 0.6666667f;
    }
}
