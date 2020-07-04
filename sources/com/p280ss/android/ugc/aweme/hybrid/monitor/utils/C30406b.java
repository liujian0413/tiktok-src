package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.b */
public final class C30406b {

    /* renamed from: a */
    public final String f79906a;

    /* renamed from: b */
    public final String f79907b;

    /* renamed from: c */
    public final String f79908c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f79908c, (java.lang.Object) r3.f79908c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30406b
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.hybrid.monitor.utils.b r3 = (com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30406b) r3
            java.lang.String r0 = r2.f79906a
            java.lang.String r1 = r3.f79906a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f79907b
            java.lang.String r1 = r3.f79907b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f79908c
            java.lang.String r3 = r3.f79908c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30406b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f79906a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f79907b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f79908c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefinedTimingInfo(preTrigger=");
        sb.append(this.f79906a);
        sb.append(", curTrigger=");
        sb.append(this.f79907b);
        sb.append(", intervalName=");
        sb.append(this.f79908c);
        sb.append(")");
        return sb.toString();
    }

    public C30406b(String str, String str2, String str3) {
        C7573i.m23587b(str, "preTrigger");
        C7573i.m23587b(str2, "curTrigger");
        C7573i.m23587b(str3, "intervalName");
        this.f79906a = str;
        this.f79907b = str2;
        this.f79908c = str3;
    }
}
