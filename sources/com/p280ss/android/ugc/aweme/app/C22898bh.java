package com.p280ss.android.ugc.aweme.app;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.bh */
public final class C22898bh {

    /* renamed from: a */
    public final String f60616a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f60616a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.app.C22898bh) r2).f60616a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.app.C22898bh
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.app.bh r2 = (com.p280ss.android.ugc.aweme.app.C22898bh) r2
            java.lang.String r0 = r1.f60616a
            java.lang.String r2 = r2.f60616a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C22898bh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f60616a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchTabInfo(type=");
        sb.append(this.f60616a);
        sb.append(")");
        return sb.toString();
    }

    public C22898bh(String str) {
        C7573i.m23587b(str, "type");
        this.f60616a = str;
    }
}
