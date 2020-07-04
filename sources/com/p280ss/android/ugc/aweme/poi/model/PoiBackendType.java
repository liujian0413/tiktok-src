package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiBackendType */
public final class PoiBackendType implements Serializable {
    @C6593c(mo15949a = "code")
    public String code;
    @C6593c(mo15949a = "name")
    public String name;

    public PoiBackendType() {
    }

    public static /* synthetic */ PoiBackendType copy$default(PoiBackendType poiBackendType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = poiBackendType.code;
        }
        if ((i & 2) != 0) {
            str2 = poiBackendType.name;
        }
        return poiBackendType.copy(str, str2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.name;
    }

    public final PoiBackendType copy(String str, String str2) {
        return new PoiBackendType(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.PoiBackendType
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.poi.model.PoiBackendType r3 = (com.p280ss.android.ugc.aweme.poi.model.PoiBackendType) r3
            java.lang.String r0 = r2.code
            java.lang.String r1 = r3.code
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.name
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.PoiBackendType.equals(java.lang.Object):boolean");
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.code;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiBackendType(code=");
        sb.append(this.code);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public PoiBackendType(String str, String str2) {
        this.code = str;
        this.name = str2;
    }
}
