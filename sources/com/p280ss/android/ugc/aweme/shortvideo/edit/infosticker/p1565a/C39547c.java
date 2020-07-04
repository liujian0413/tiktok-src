package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.c */
public final class C39547c implements C39546b {

    /* renamed from: a */
    public int f102673a;

    /* renamed from: b */
    public int f102674b;

    /* renamed from: c */
    public float f102675c;

    /* renamed from: d */
    public float f102676d;

    /* renamed from: e */
    public float f102677e;

    /* renamed from: f */
    public float f102678f;

    public C39547c() {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39547c) {
                C39547c cVar = (C39547c) obj;
                if (this.f102673a == cVar.f102673a) {
                    if (!((this.f102674b == cVar.f102674b) && Float.compare(this.f102675c, cVar.f102675c) == 0 && Float.compare(this.f102676d, cVar.f102676d) == 0 && Float.compare(this.f102677e, cVar.f102677e) == 0 && Float.compare(this.f102678f, cVar.f102678f) == 0)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((this.f102673a * 31) + this.f102674b) * 31) + Float.floatToIntBits(this.f102675c)) * 31) + Float.floatToIntBits(this.f102676d)) * 31) + Float.floatToIntBits(this.f102677e)) * 31) + Float.floatToIntBits(this.f102678f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoStickerTimeEditData(startTime=");
        sb.append(this.f102673a);
        sb.append(", endTime=");
        sb.append(this.f102674b);
        sb.append(", rotate=");
        sb.append(this.f102675c);
        sb.append(", scale=");
        sb.append(this.f102676d);
        sb.append(", xPercent=");
        sb.append(this.f102677e);
        sb.append(", yPercent=");
        sb.append(this.f102678f);
        sb.append(")");
        return sb.toString();
    }

    public C39547c(int i, int i2, float f, float f2, float f3, float f4) {
        this.f102673a = i;
        this.f102674b = i2;
        this.f102675c = f;
        this.f102676d = f2;
        this.f102677e = f3;
        this.f102678f = f4;
    }

    private /* synthetic */ C39547c(int i, int i2, float f, float f2, float f3, float f4, int i3, C7571f fVar) {
        this(0, 0, 0.0f, 0.0f, 0.0f, 0.0f);
    }
}
