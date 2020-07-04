package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import android.arch.lifecycle.LiveData;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.f */
public final class C24891f {

    /* renamed from: a */
    public final UrlModel f65635a;

    /* renamed from: b */
    public final String f65636b;

    /* renamed from: c */
    public final LiveData<Float> f65637c;

    /* renamed from: d */
    public final float f65638d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (java.lang.Float.compare(r2.f65638d, r3.f65638d) == 0) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.loft.model.f r3 = (com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f65635a
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f65635a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f65636b
            java.lang.String r1 = r3.f65636b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            android.arch.lifecycle.LiveData<java.lang.Float> r0 = r2.f65637c
            android.arch.lifecycle.LiveData<java.lang.Float> r1 = r3.f65637c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            float r0 = r2.f65638d
            float r3 = r3.f65638d
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        UrlModel urlModel = this.f65635a;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f65636b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LiveData<Float> liveData = this.f65637c;
        if (liveData != null) {
            i = liveData.hashCode();
        }
        return ((hashCode2 + i) * 31) + Float.hashCode(this.f65638d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullGuide(imageUrl=");
        sb.append(this.f65635a);
        sb.append(", guideText=");
        sb.append(this.f65636b);
        sb.append(", totalConsume=");
        sb.append(this.f65637c);
        sb.append(", refreshLayoutHeight=");
        sb.append(this.f65638d);
        sb.append(")");
        return sb.toString();
    }

    public C24891f(UrlModel urlModel, String str, LiveData<Float> liveData, float f) {
        C7573i.m23587b(str, "guideText");
        C7573i.m23587b(liveData, "totalConsume");
        this.f65635a = urlModel;
        this.f65636b = str;
        this.f65637c = liveData;
        this.f65638d = f;
    }
}
