package com.p280ss.android.ugc.aweme.poi.model.feed;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.model.feed.f */
public final class C35116f {
    @C6593c(mo15949a = "poi_id")

    /* renamed from: a */
    public final String f91858a;
    @C6593c(mo15949a = "poi_info")

    /* renamed from: b */
    public final SimplePoiInfoStruct f91859b;
    @C6593c(mo15949a = "aweme_info")

    /* renamed from: c */
    public final Aweme f91860c;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f91860c, (java.lang.Object) r3.f91860c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.feed.C35116f
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.model.feed.f r3 = (com.p280ss.android.ugc.aweme.poi.model.feed.C35116f) r3
            java.lang.String r0 = r2.f91858a
            java.lang.String r1 = r3.f91858a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r0 = r2.f91859b
            com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct r1 = r3.f91859b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.f91860c
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f91860c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.feed.C35116f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f91858a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SimplePoiInfoStruct simplePoiInfoStruct = this.f91859b;
        int hashCode2 = (hashCode + (simplePoiInfoStruct != null ? simplePoiInfoStruct.hashCode() : 0)) * 31;
        Aweme aweme = this.f91860c;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RankPoiInfoStruct(poiId=");
        sb.append(this.f91858a);
        sb.append(", poi=");
        sb.append(this.f91859b);
        sb.append(", aweme=");
        sb.append(this.f91860c);
        sb.append(")");
        return sb.toString();
    }
}
