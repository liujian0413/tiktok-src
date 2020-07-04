package com.p280ss.android.ugc.aweme.recommend.viewmodel;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewmodel.a */
public final class C37182a {

    /* renamed from: a */
    public final String f97284a;

    /* renamed from: b */
    public final String f97285b;

    /* renamed from: c */
    public final String f97286c;

    public C37182a() {
        this(null, null, null, 7, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C37182a m119514a(String str, String str2, String str3) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "previousPage");
        C7573i.m23587b(str3, "pageStatus");
        return new C37182a(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f97286c, (java.lang.Object) r3.f97286c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.recommend.viewmodel.C37182a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.recommend.viewmodel.a r3 = (com.p280ss.android.ugc.aweme.recommend.viewmodel.C37182a) r3
            java.lang.String r0 = r2.f97284a
            java.lang.String r1 = r3.f97284a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f97285b
            java.lang.String r1 = r3.f97285b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f97286c
            java.lang.String r3 = r3.f97286c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.recommend.viewmodel.C37182a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f97284a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f97285b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f97286c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendMobParams(enterFrom=");
        sb.append(this.f97284a);
        sb.append(", previousPage=");
        sb.append(this.f97285b);
        sb.append(", pageStatus=");
        sb.append(this.f97286c);
        sb.append(")");
        return sb.toString();
    }

    public C37182a(String str, String str2, String str3) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "previousPage");
        C7573i.m23587b(str3, "pageStatus");
        this.f97284a = str;
        this.f97285b = str2;
        this.f97286c = str3;
    }

    public /* synthetic */ C37182a(String str, String str2, String str3, int i, C7571f fVar) {
        this("", "", "");
    }
}
