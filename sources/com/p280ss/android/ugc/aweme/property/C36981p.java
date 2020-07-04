package com.p280ss.android.ugc.aweme.property;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.p */
public final class C36981p {

    /* renamed from: a */
    public final String f96888a;

    /* renamed from: b */
    public final String f96889b;

    /* renamed from: c */
    public final String f96890c;

    /* renamed from: d */
    public final String f96891d;

    /* renamed from: e */
    public final String f96892e;

    /* renamed from: f */
    public final String f96893f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f96893f, (java.lang.Object) r3.f96893f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.property.C36981p
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.property.p r3 = (com.p280ss.android.ugc.aweme.property.C36981p) r3
            java.lang.String r0 = r2.f96888a
            java.lang.String r1 = r3.f96888a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f96889b
            java.lang.String r1 = r3.f96889b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f96890c
            java.lang.String r1 = r3.f96890c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f96891d
            java.lang.String r1 = r3.f96891d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f96892e
            java.lang.String r1 = r3.f96892e
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f96893f
            java.lang.String r3 = r3.f96893f
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.property.C36981p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f96888a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f96889b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f96890c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f96891d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f96892e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f96893f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemMoreMessage(owner=");
        sb.append(this.f96888a);
        sb.append(", chineseKey=");
        sb.append(this.f96889b);
        sb.append(", paraMeaning=");
        sb.append(this.f96890c);
        sb.append(", time=");
        sb.append(this.f96891d);
        sb.append(", wiki=");
        sb.append(this.f96892e);
        sb.append(", others=");
        sb.append(this.f96893f);
        sb.append(")");
        return sb.toString();
    }

    public C36981p(String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(str, "owner");
        C7573i.m23587b(str2, "chineseKey");
        C7573i.m23587b(str3, "paraMeaning");
        C7573i.m23587b(str4, "time");
        C7573i.m23587b(str5, "wiki");
        C7573i.m23587b(str6, "others");
        this.f96888a = str;
        this.f96889b = str2;
        this.f96890c = str3;
        this.f96891d = str4;
        this.f96892e = str5;
        this.f96893f = str6;
    }
}
