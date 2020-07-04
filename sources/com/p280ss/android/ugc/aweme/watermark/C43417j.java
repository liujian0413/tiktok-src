package com.p280ss.android.ugc.aweme.watermark;

import java.util.Arrays;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.j */
public final class C43417j {

    /* renamed from: a */
    public final String f112440a;

    /* renamed from: b */
    public final String f112441b;

    /* renamed from: c */
    public final int f112442c = 3000;

    /* renamed from: d */
    public int f112443d = 0;

    /* renamed from: e */
    public final String[] f112444e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43417j) {
                C43417j jVar = (C43417j) obj;
                if (C7573i.m23585a((Object) this.f112440a, (Object) jVar.f112440a) && C7573i.m23585a((Object) this.f112441b, (Object) jVar.f112441b)) {
                    if (this.f112442c == jVar.f112442c) {
                        if (!(this.f112443d == jVar.f112443d) || !C7573i.m23585a((Object) this.f112444e, (Object) jVar.f112444e)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f112440a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f112441b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f112442c) * 31) + this.f112443d) * 31;
        String[] strArr = this.f112444e;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEndWatermarkData(endWatermarkFrame=");
        sb.append(this.f112440a);
        sb.append(", endAudioPath=");
        sb.append(this.f112441b);
        sb.append(", watermarkDuration=");
        sb.append(this.f112442c);
        sb.append(", inputMediaDuration=");
        sb.append(this.f112443d);
        sb.append(", transitions=");
        sb.append(Arrays.toString(this.f112444e));
        sb.append(")");
        return sb.toString();
    }

    public C43417j(String str, String str2, int i, int i2, String[] strArr) {
        C7573i.m23587b(str, "endWatermarkFrame");
        C7573i.m23587b(strArr, "transitions");
        this.f112440a = str;
        this.f112441b = str2;
        this.f112444e = strArr;
    }
}
