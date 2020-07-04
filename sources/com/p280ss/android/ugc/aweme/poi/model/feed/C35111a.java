package com.p280ss.android.ugc.aweme.poi.model.feed;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.feed.a */
public final class C35111a {
    @C6593c(mo15949a = "poi_class_code")

    /* renamed from: a */
    public final String f91837a;
    @C6593c(mo15949a = "class_option_type")

    /* renamed from: b */
    public final String f91838b;
    @C6593c(mo15949a = "poi_rank_banner")

    /* renamed from: c */
    public final PoiClassRankBannerStruct f91839c;
    @C6593c(mo15949a = "rank_poi_list")

    /* renamed from: d */
    public final List<C35116f> f91840d;
    @C6593c(mo15949a = "poi_city_option")

    /* renamed from: e */
    public final C35114d f91841e;
    @C6593c(mo15949a = "backend_type_code")

    /* renamed from: f */
    public final String f91842f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f91842f, (java.lang.Object) r3.f91842f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.feed.C35111a
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.feed.a r3 = (com.p280ss.android.ugc.aweme.poi.model.feed.C35111a) r3
            java.lang.String r0 = r2.f91837a
            java.lang.String r1 = r3.f91837a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f91838b
            java.lang.String r1 = r3.f91838b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct r0 = r2.f91839c
            com.ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct r1 = r3.f91839c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<com.ss.android.ugc.aweme.poi.model.feed.f> r0 = r2.f91840d
            java.util.List<com.ss.android.ugc.aweme.poi.model.feed.f> r1 = r3.f91840d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.poi.model.feed.d r0 = r2.f91841e
            com.ss.android.ugc.aweme.poi.model.feed.d r1 = r3.f91841e
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f91842f
            java.lang.String r3 = r3.f91842f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.feed.C35111a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f91837a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f91838b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        PoiClassRankBannerStruct poiClassRankBannerStruct = this.f91839c;
        int hashCode3 = (hashCode2 + (poiClassRankBannerStruct != null ? poiClassRankBannerStruct.hashCode() : 0)) * 31;
        List<C35116f> list = this.f91840d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        C35114d dVar = this.f91841e;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str3 = this.f91842f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiAwemeRankStruct(poiClassCode=");
        sb.append(this.f91837a);
        sb.append(", classOptionType=");
        sb.append(this.f91838b);
        sb.append(", rankBanner=");
        sb.append(this.f91839c);
        sb.append(", rankPoiInfoStruct=");
        sb.append(this.f91840d);
        sb.append(", poiRankCityOptionStruct=");
        sb.append(this.f91841e);
        sb.append(", backendTypeCode=");
        sb.append(this.f91842f);
        sb.append(")");
        return sb.toString();
    }
}
