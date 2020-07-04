package com.p280ss.android.ugc.aweme.money.growth;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.money.growth.a */
public final class C33630a {
    @C6593c(mo15949a = "campaign_id")

    /* renamed from: a */
    public final String f87768a;
    @C6593c(mo15949a = "campaign")

    /* renamed from: b */
    public final String f87769b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f87769b, (java.lang.Object) r3.f87769b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.money.growth.C33630a
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.money.growth.a r3 = (com.p280ss.android.ugc.aweme.money.growth.C33630a) r3
            java.lang.String r0 = r2.f87768a
            java.lang.String r1 = r3.f87768a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f87769b
            java.lang.String r3 = r3.f87769b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.money.growth.C33630a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f87768a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87769b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleCampaignInfo(campaignId=");
        sb.append(this.f87768a);
        sb.append(", campaign=");
        sb.append(this.f87769b);
        sb.append(")");
        return sb.toString();
    }
}
