package com.p280ss.android.ugc.aweme.mix;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.mix.q */
public final class C33563q {

    /* renamed from: a */
    public final String f87659a;

    public C33563q() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f87659a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.mix.C33563q) r2).f87659a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.mix.C33563q
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.mix.q r2 = (com.p280ss.android.ugc.aweme.mix.C33563q) r2
            java.lang.String r0 = r1.f87659a
            java.lang.String r2 = r2.f87659a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.C33563q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f87659a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixInfoRequestParams(mixId=");
        sb.append(this.f87659a);
        sb.append(")");
        return sb.toString();
    }

    public C33563q(String str) {
        this.f87659a = str;
    }

    private /* synthetic */ C33563q(String str, int i, C7571f fVar) {
        this(null);
    }
}
