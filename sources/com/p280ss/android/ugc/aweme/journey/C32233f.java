package com.p280ss.android.ugc.aweme.journey;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.journey.f */
public final class C32233f {
    @C6593c(mo15949a = "title")

    /* renamed from: a */
    public final String f84182a;
    @C6593c(mo15949a = "text")

    /* renamed from: b */
    public final String f84183b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f84183b, (java.lang.Object) r3.f84183b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.journey.C32233f
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.journey.f r3 = (com.p280ss.android.ugc.aweme.journey.C32233f) r3
            java.lang.String r0 = r2.f84182a
            java.lang.String r1 = r3.f84182a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f84183b
            java.lang.String r3 = r3.f84183b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.C32233f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f84182a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f84183b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JourneyContentLanguageExtra(title=");
        sb.append(this.f84182a);
        sb.append(", text=");
        sb.append(this.f84183b);
        sb.append(")");
        return sb.toString();
    }
}
