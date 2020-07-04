package com.p280ss.android.ugc.aweme.p1076c.p1077a;

import com.bytedance.retrofit2.p637a.C12461b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.c.a.b */
public final class C23626b {

    /* renamed from: a */
    public String f62308a;

    /* renamed from: b */
    public String f62309b;

    /* renamed from: c */
    public List<C12461b> f62310c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f62310c, (java.lang.Object) r3.f62310c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.p1076c.p1077a.C23626b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.c.a.b r3 = (com.p280ss.android.ugc.aweme.p1076c.p1077a.C23626b) r3
            java.lang.String r0 = r2.f62308a
            java.lang.String r1 = r3.f62308a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f62309b
            java.lang.String r1 = r3.f62309b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<com.bytedance.retrofit2.a.b> r0 = r2.f62310c
            java.util.List<com.bytedance.retrofit2.a.b> r3 = r3.f62310c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1076c.p1077a.C23626b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f62308a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f62309b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<C12461b> list = this.f62310c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("URL:         ");
        sb.append(this.f62308a);
        sb.append("\r\n\r\nHEADERS:          ");
        List<C12461b> list = this.f62310c;
        if (list != null) {
            str = list.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\r\n\r\nRESPONSE:         ");
        sb.append(this.f62309b);
        sb.append("\r\n\r\n");
        return sb.toString();
    }
}
