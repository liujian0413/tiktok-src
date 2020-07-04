package com.p280ss.android.ugc.aweme.commercialize.egg;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.f */
public final class C24657f {

    /* renamed from: a */
    public final String f65019a;

    /* renamed from: b */
    public final String f65020b;

    /* renamed from: c */
    public final String f65021c;

    /* renamed from: d */
    public final String f65022d;

    /* renamed from: e */
    public final String f65023e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f65023e, (java.lang.Object) r3.f65023e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.egg.C24657f
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commercialize.egg.f r3 = (com.p280ss.android.ugc.aweme.commercialize.egg.C24657f) r3
            java.lang.String r0 = r2.f65019a
            java.lang.String r1 = r3.f65019a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f65020b
            java.lang.String r1 = r3.f65020b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f65021c
            java.lang.String r1 = r3.f65021c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f65022d
            java.lang.String r1 = r3.f65022d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f65023e
            java.lang.String r3 = r3.f65023e
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.egg.C24657f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f65019a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f65020b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f65021c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f65022d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f65023e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommerceEggLogParam(eggType=");
        sb.append(this.f65019a);
        sb.append(", creativeId=");
        sb.append(this.f65020b);
        sb.append(", logExtra=");
        sb.append(this.f65021c);
        sb.append(", groupId=");
        sb.append(this.f65022d);
        sb.append(", eggId=");
        sb.append(this.f65023e);
        sb.append(")");
        return sb.toString();
    }

    public C24657f(String str, String str2, String str3, String str4, String str5) {
        this.f65019a = str;
        this.f65020b = str2;
        this.f65021c = str3;
        this.f65022d = str4;
        this.f65023e = str5;
    }

    public /* synthetic */ C24657f(String str, String str2, String str3, String str4, String str5, int i, C7571f fVar) {
        this(str, str2, str3, str4, null);
    }
}
