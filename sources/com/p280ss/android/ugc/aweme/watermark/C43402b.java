package com.p280ss.android.ugc.aweme.watermark;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.b */
public final class C43402b {

    /* renamed from: a */
    public final int f112409a;

    /* renamed from: b */
    public final int f112410b;

    /* renamed from: c */
    public final int f112411c;

    /* renamed from: d */
    public final String f112412d;

    /* renamed from: e */
    public final int f112413e;

    /* renamed from: f */
    public final int f112414f;

    /* renamed from: g */
    public final boolean f112415g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43402b) {
                C43402b bVar = (C43402b) obj;
                if (this.f112409a == bVar.f112409a) {
                    if (this.f112410b == bVar.f112410b) {
                        if ((this.f112411c == bVar.f112411c) && C7573i.m23585a((Object) this.f112412d, (Object) bVar.f112412d)) {
                            if (this.f112413e == bVar.f112413e) {
                                if (this.f112414f == bVar.f112414f) {
                                    if (this.f112415g == bVar.f112415g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f112409a * 31) + this.f112410b) * 31) + this.f112411c) * 31;
        String str = this.f112412d;
        int hashCode = (((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f112413e) * 31) + this.f112414f) * 31;
        boolean z = this.f112415g;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentWatermarkParam(inputMediaDuration=");
        sb.append(this.f112409a);
        sb.append(", inputMediaWidth=");
        sb.append(this.f112410b);
        sb.append(", inputMediaHeight=");
        sb.append(this.f112411c);
        sb.append(", commentWaterMarkPath=");
        sb.append(this.f112412d);
        sb.append(", commentWaterMarkHeight=");
        sb.append(this.f112413e);
        sb.append(", commentWaterMarkWidth=");
        sb.append(this.f112414f);
        sb.append(", is1To1=");
        sb.append(this.f112415g);
        sb.append(")");
        return sb.toString();
    }

    public C43402b(int i, int i2, int i3, String str, int i4, int i5, boolean z) {
        C7573i.m23587b(str, "commentWaterMarkPath");
        this.f112409a = i;
        this.f112410b = i2;
        this.f112411c = i3;
        this.f112412d = str;
        this.f112413e = i4;
        this.f112414f = i5;
        this.f112415g = z;
    }
}
