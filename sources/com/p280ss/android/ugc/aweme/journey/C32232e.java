package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.journey.e */
public final class C32232e {
    @C6593c(mo15949a = "code")

    /* renamed from: a */
    public final String f84179a;
    @C6593c(mo15949a = "en_name")

    /* renamed from: b */
    public final String f84180b;
    @C6593c(mo15949a = "local_name")

    /* renamed from: c */
    public final String f84181c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f84181c, (java.lang.Object) r3.f84181c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.journey.C32232e
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.journey.e r3 = (com.p280ss.android.ugc.aweme.journey.C32232e) r3
            java.lang.String r0 = r2.f84179a
            java.lang.String r1 = r3.f84179a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f84180b
            java.lang.String r1 = r3.f84180b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f84181c
            java.lang.String r3 = r3.f84181c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.C32232e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f84179a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84180b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f84181c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyContentLanguage(code=");
        sb.append(this.f84179a);
        sb.append(", en_name=");
        sb.append(this.f84180b);
        sb.append(", local_name=");
        sb.append(this.f84181c);
        sb.append(")");
        return sb.toString();
    }
}
