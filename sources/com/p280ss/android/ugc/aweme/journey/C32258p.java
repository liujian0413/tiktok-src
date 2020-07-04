package com.p280ss.android.ugc.aweme.journey;

import android.graphics.BlurMaskFilter.Blur;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.journey.p */
public final class C32258p {

    /* renamed from: a */
    public final float f84306a;

    /* renamed from: b */
    public final Blur f84307b;

    /* renamed from: c */
    public final float f84308c = 0.0f;

    /* renamed from: d */
    public final float f84309d;

    /* renamed from: e */
    public final int f84310e;

    /* renamed from: f */
    public final float f84311f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32258p) {
                C32258p pVar = (C32258p) obj;
                if (Float.compare(this.f84306a, pVar.f84306a) == 0 && C7573i.m23585a((Object) this.f84307b, (Object) pVar.f84307b) && Float.compare(this.f84308c, pVar.f84308c) == 0 && Float.compare(this.f84309d, pVar.f84309d) == 0) {
                    if (!(this.f84310e == pVar.f84310e) || Float.compare(this.f84311f, pVar.f84311f) != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.f84306a) * 31;
        Blur blur = this.f84307b;
        return ((((((((hashCode + (blur != null ? blur.hashCode() : 0)) * 31) + Float.hashCode(this.f84308c)) * 31) + Float.hashCode(this.f84309d)) * 31) + Integer.hashCode(this.f84310e)) * 31) + Float.hashCode(this.f84311f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(blurRadius=");
        sb.append(this.f84306a);
        sb.append(", blur=");
        sb.append(this.f84307b);
        sb.append(", dx=");
        sb.append(this.f84308c);
        sb.append(", dy=");
        sb.append(this.f84309d);
        sb.append(", shadowColor=");
        sb.append(this.f84310e);
        sb.append(", radius=");
        sb.append(this.f84311f);
        sb.append(")");
        return sb.toString();
    }

    public C32258p(float f, Blur blur, float f2, float f3, int i, float f4) {
        C7573i.m23587b(blur, "blur");
        this.f84306a = f;
        this.f84307b = blur;
        this.f84309d = f3;
        this.f84310e = i;
        this.f84311f = f4;
    }
}
