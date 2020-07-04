package com.p280ss.android.ugc.aweme.shortvideo.p1557d;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d.g */
public final class C39329g {

    /* renamed from: a */
    public final String f102157a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f102157a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g) r2).f102157a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.d.g r2 = (com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g) r2
            java.lang.String r0 = r1.f102157a
            java.lang.String r2 = r2.f102157a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39329g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f102157a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEditBackRecordEvent(commerceData=");
        sb.append(this.f102157a);
        sb.append(")");
        return sb.toString();
    }

    public C39329g(String str) {
        C7573i.m23587b(str, "commerceData");
        this.f102157a = str;
    }
}
