package com.p280ss.android.ugc.aweme.commercialize.egg;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.a */
public final class C24635a {

    /* renamed from: a */
    public final String f64959a;

    /* renamed from: b */
    public final String f64960b;

    /* renamed from: c */
    public final String f64961c;

    /* renamed from: d */
    public final String f64962d;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f64962d, (java.lang.Object) r3.f64962d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.egg.C24635a
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.commercialize.egg.a r3 = (com.p280ss.android.ugc.aweme.commercialize.egg.C24635a) r3
            java.lang.String r0 = r2.f64959a
            java.lang.String r1 = r3.f64959a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f64960b
            java.lang.String r1 = r3.f64960b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f64961c
            java.lang.String r1 = r3.f64961c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f64962d
            java.lang.String r3 = r3.f64962d
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.C24635a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f64959a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f64960b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f64961c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f64962d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentEggExtParam(eggId=");
        sb.append(this.f64959a);
        sb.append(", regex=");
        sb.append(this.f64960b);
        sb.append(", webUrl=");
        sb.append(this.f64961c);
        sb.append(", openUrl=");
        sb.append(this.f64962d);
        sb.append(")");
        return sb.toString();
    }

    public C24635a(String str, String str2, String str3, String str4) {
        this.f64959a = str;
        this.f64960b = str2;
        this.f64961c = str3;
        this.f64962d = str4;
    }
}
