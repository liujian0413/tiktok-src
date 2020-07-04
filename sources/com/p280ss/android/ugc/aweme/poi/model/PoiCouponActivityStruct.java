package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.C6319n;
import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct */
public final class PoiCouponActivityStruct implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private final String f91784id;
    @C6593c(mo15949a = "title")
    private final String title;

    public static /* synthetic */ PoiCouponActivityStruct copy$default(PoiCouponActivityStruct poiCouponActivityStruct, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiCouponActivityStruct.f91784id;
        }
        if ((i & 2) != 0) {
            str2 = poiCouponActivityStruct.title;
        }
        return poiCouponActivityStruct.copy(str, str2);
    }

    public final String component1() {
        return this.f91784id;
    }

    public final String component2() {
        return this.title;
    }

    public final PoiCouponActivityStruct copy(String str, String str2) {
        C7573i.m23587b(str, "id");
        C7573i.m23587b(str2, "title");
        return new PoiCouponActivityStruct(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.title, (java.lang.Object) r3.title) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct r3 = (com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct) r3
            java.lang.String r0 = r2.f91784id
            java.lang.String r1 = r3.f91784id
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.title
            java.lang.String r3 = r3.title
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct.equals(java.lang.Object):boolean");
    }

    public final String getId() {
        return this.f91784id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.f91784id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiCouponActivityStruct(id=");
        sb.append(this.f91784id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(")");
        return sb.toString();
    }

    public final boolean isValid() {
        if (!C6319n.m19593a(this.f91784id)) {
            return true;
        }
        return false;
    }

    public PoiCouponActivityStruct(String str, String str2) {
        C7573i.m23587b(str, "id");
        C7573i.m23587b(str2, "title");
        this.f91784id = str;
        this.title = str2;
    }
}
