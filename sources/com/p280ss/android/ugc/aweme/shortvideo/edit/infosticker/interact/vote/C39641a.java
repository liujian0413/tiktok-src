package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.a */
public final class C39641a {

    /* renamed from: a */
    public float f103082a;

    /* renamed from: b */
    public float f103083b;

    /* renamed from: c */
    public float f103084c;

    /* renamed from: d */
    public float f103085d;

    /* renamed from: e */
    public float f103086e;

    /* renamed from: f */
    public int f103087f;

    public C39641a() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39641a) {
                C39641a aVar = (C39641a) obj;
                if (Float.compare(this.f103082a, aVar.f103082a) == 0 && Float.compare(this.f103083b, aVar.f103083b) == 0 && Float.compare(this.f103084c, aVar.f103084c) == 0 && Float.compare(this.f103085d, aVar.f103085d) == 0 && Float.compare(this.f103086e, aVar.f103086e) == 0) {
                    if (this.f103087f == aVar.f103087f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.f103082a) * 31) + Float.floatToIntBits(this.f103083b)) * 31) + Float.floatToIntBits(this.f103084c)) * 31) + Float.floatToIntBits(this.f103085d)) * 31) + Float.floatToIntBits(this.f103086e)) * 31) + this.f103087f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatorInfo(scaleX=");
        sb.append(this.f103082a);
        sb.append(", scaleY=");
        sb.append(this.f103083b);
        sb.append(", rotation=");
        sb.append(this.f103084c);
        sb.append(", x=");
        sb.append(this.f103085d);
        sb.append(", y=");
        sb.append(this.f103086e);
        sb.append(", focusIndex=");
        sb.append(this.f103087f);
        sb.append(")");
        return sb.toString();
    }

    private C39641a(float f, float f2, float f3, float f4, float f5, int i) {
        this.f103082a = f;
        this.f103083b = f2;
        this.f103084c = f3;
        this.f103085d = f4;
        this.f103086e = f5;
        this.f103087f = i;
    }

    public /* synthetic */ C39641a(float f, float f2, float f3, float f4, float f5, int i, int i2, C7571f fVar) {
        this(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0);
    }
}
