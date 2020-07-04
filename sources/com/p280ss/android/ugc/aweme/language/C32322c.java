package com.p280ss.android.ugc.aweme.language;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.language.c */
public final class C32322c {
    @C6593c(mo15949a = "sub_region")

    /* renamed from: a */
    public final List<C32324f> f84424a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f84424a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.language.C32322c) r2).f84424a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.language.C32322c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.language.c r2 = (com.p280ss.android.ugc.aweme.language.C32322c) r2
            java.util.List<com.ss.android.ugc.aweme.language.f> r0 = r1.f84424a
            java.util.List<com.ss.android.ugc.aweme.language.f> r2 = r2.f84424a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.language.C32322c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C32324f> list = this.f84424a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CountryData(provinceData=");
        sb.append(this.f84424a);
        sb.append(")");
        return sb.toString();
    }
}
