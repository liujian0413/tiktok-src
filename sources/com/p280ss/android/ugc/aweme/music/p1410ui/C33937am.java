package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.graphics.BlurMaskFilter.Blur;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.am */
public final class C33937am {

    /* renamed from: a */
    public final float f88548a;

    /* renamed from: b */
    public final Blur f88549b;

    /* renamed from: c */
    public final float f88550c = 0.0f;

    /* renamed from: d */
    public final float f88551d;

    /* renamed from: e */
    public final int f88552e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33937am) {
                C33937am amVar = (C33937am) obj;
                if (Float.compare(this.f88548a, amVar.f88548a) == 0 && C7573i.m23585a((Object) this.f88549b, (Object) amVar.f88549b) && Float.compare(this.f88550c, amVar.f88550c) == 0 && Float.compare(this.f88551d, amVar.f88551d) == 0) {
                    if (this.f88552e == amVar.f88552e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f88548a) * 31;
        Blur blur = this.f88549b;
        return ((((((floatToIntBits + (blur != null ? blur.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f88550c)) * 31) + Float.floatToIntBits(this.f88551d)) * 31) + this.f88552e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(blurRadius=");
        sb.append(this.f88548a);
        sb.append(", blur=");
        sb.append(this.f88549b);
        sb.append(", dx=");
        sb.append(this.f88550c);
        sb.append(", dy=");
        sb.append(this.f88551d);
        sb.append(", shadowColor=");
        sb.append(this.f88552e);
        sb.append(")");
        return sb.toString();
    }

    public C33937am(float f, Blur blur, float f2, float f3, int i) {
        C7573i.m23587b(blur, "blur");
        this.f88548a = f;
        this.f88549b = blur;
        this.f88551d = f3;
        this.f88552e = i;
    }
}
