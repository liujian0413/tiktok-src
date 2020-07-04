package com.p280ss.android.ugc.network.observer.bean;

/* renamed from: com.ss.android.ugc.network.observer.bean.c */
public final class C44895c {

    /* renamed from: a */
    public final String f115442a;

    /* renamed from: b */
    public final String f115443b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f115443b, (java.lang.Object) r3.f115443b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.network.observer.bean.C44895c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.network.observer.bean.c r3 = (com.p280ss.android.ugc.network.observer.bean.C44895c) r3
            java.lang.String r0 = r2.f115442a
            java.lang.String r1 = r3.f115442a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f115443b
            java.lang.String r3 = r3.f115443b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.network.observer.bean.C44895c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f115442a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f115443b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalParam(topActivity=");
        sb.append(this.f115442a);
        sb.append(", topPage=");
        sb.append(this.f115443b);
        sb.append(")");
        return sb.toString();
    }

    public C44895c(String str, String str2) {
        this.f115442a = str;
        this.f115443b = str2;
    }
}
