package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c */
public final class C28980c {

    /* renamed from: a */
    public final String f76345a;

    /* renamed from: b */
    public final String f76346b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f76346b, (java.lang.Object) r3.f76346b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28980c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.c r3 = (com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28980c) r3
            java.lang.String r0 = r2.f76345a
            java.lang.String r1 = r3.f76345a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f76346b
            java.lang.String r3 = r3.f76346b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28980c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f76345a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f76346b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DislikeReasonVO(id=");
        sb.append(this.f76345a);
        sb.append(", reason=");
        sb.append(this.f76346b);
        sb.append(")");
        return sb.toString();
    }

    public C28980c(String str, String str2) {
        this.f76345a = str;
        this.f76346b = str2;
    }
}
