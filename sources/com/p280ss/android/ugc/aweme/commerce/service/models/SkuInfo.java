package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.SkuInfo */
public final class SkuInfo implements Serializable {
    @C6593c(mo15949a = "default_user_limit")
    private int defaultLimit;
    @C6593c(mo15949a = "one_pic")
    private boolean onePic;
    @C6593c(mo15949a = "pic_map")
    private Map<String, String> pictureMap;
    @C6593c(mo15949a = "sku_list")
    private Map<String, SkuItem> skuList;
    @C6593c(mo15949a = "spec_info")
    private List<SpecInfo> specificInfoList;
    @C6593c(mo15949a = "status")
    private int status;

    public SkuInfo() {
        this(null, null, null, 0, false, 0, 63, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfo>, for r7v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.SkuItem>, for r5v0, types: [java.util.Map] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Map, code=java.util.Map<java.lang.String, java.lang.String>, for r6v0, types: [java.util.Map] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.commerce.service.models.SkuInfo copy$default(com.p280ss.android.ugc.aweme.commerce.service.models.SkuInfo r4, java.util.Map<java.lang.String, com.p280ss.android.ugc.aweme.commerce.service.models.SkuItem> r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.List<com.p280ss.android.ugc.aweme.commerce.service.models.SpecInfo> r7, int r8, boolean r9, int r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.SkuItem> r5 = r4.skuList
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.util.Map<java.lang.String, java.lang.String> r6 = r4.pictureMap
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.SpecInfo> r7 = r4.specificInfoList
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            int r8 = r4.status
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            boolean r9 = r4.onePic
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            int r10 = r4.defaultLimit
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            com.ss.android.ugc.aweme.commerce.service.models.SkuInfo r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.SkuInfo.copy$default(com.ss.android.ugc.aweme.commerce.service.models.SkuInfo, java.util.Map, java.util.Map, java.util.List, int, boolean, int, int, java.lang.Object):com.ss.android.ugc.aweme.commerce.service.models.SkuInfo");
    }

    public final Map<String, SkuItem> component1() {
        return this.skuList;
    }

    public final Map<String, String> component2() {
        return this.pictureMap;
    }

    public final List<SpecInfo> component3() {
        return this.specificInfoList;
    }

    public final int component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.onePic;
    }

    public final int component6() {
        return this.defaultLimit;
    }

    public final SkuInfo copy(Map<String, SkuItem> map, Map<String, String> map2, List<SpecInfo> list, int i, boolean z, int i2) {
        SkuInfo skuInfo = new SkuInfo(map, map2, list, i, z, i2);
        return skuInfo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkuInfo) {
                SkuInfo skuInfo = (SkuInfo) obj;
                if (C7573i.m23585a((Object) this.skuList, (Object) skuInfo.skuList) && C7573i.m23585a((Object) this.pictureMap, (Object) skuInfo.pictureMap) && C7573i.m23585a((Object) this.specificInfoList, (Object) skuInfo.specificInfoList)) {
                    if (this.status == skuInfo.status) {
                        if (this.onePic == skuInfo.onePic) {
                            if (this.defaultLimit == skuInfo.defaultLimit) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getDefaultLimit() {
        return this.defaultLimit;
    }

    public final boolean getOnePic() {
        return this.onePic;
    }

    public final Map<String, String> getPictureMap() {
        return this.pictureMap;
    }

    public final Map<String, SkuItem> getSkuList() {
        return this.skuList;
    }

    public final List<SpecInfo> getSpecificInfoList() {
        return this.specificInfoList;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        Map<String, SkuItem> map = this.skuList;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.pictureMap;
        int hashCode2 = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        List<SpecInfo> list = this.specificInfoList;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (((hashCode2 + i) * 31) + this.status) * 31;
        boolean z = this.onePic;
        if (z) {
            z = true;
        }
        return ((i2 + (z ? 1 : 0)) * 31) + this.defaultLimit;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkuInfo(skuList=");
        sb.append(this.skuList);
        sb.append(", pictureMap=");
        sb.append(this.pictureMap);
        sb.append(", specificInfoList=");
        sb.append(this.specificInfoList);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", onePic=");
        sb.append(this.onePic);
        sb.append(", defaultLimit=");
        sb.append(this.defaultLimit);
        sb.append(")");
        return sb.toString();
    }

    public final void setDefaultLimit(int i) {
        this.defaultLimit = i;
    }

    public final void setOnePic(boolean z) {
        this.onePic = z;
    }

    public final void setPictureMap(Map<String, String> map) {
        this.pictureMap = map;
    }

    public final void setSkuList(Map<String, SkuItem> map) {
        this.skuList = map;
    }

    public final void setSpecificInfoList(List<SpecInfo> list) {
        this.specificInfoList = list;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public SkuInfo(Map<String, SkuItem> map, Map<String, String> map2, List<SpecInfo> list, int i, boolean z, int i2) {
        this.skuList = map;
        this.pictureMap = map2;
        this.specificInfoList = list;
        this.status = i;
        this.onePic = z;
        this.defaultLimit = i2;
    }

    public /* synthetic */ SkuInfo(Map map, Map map2, List list, int i, boolean z, int i2, int i3, C7571f fVar) {
        int i4;
        boolean z2;
        int i5;
        if ((i3 & 1) != 0) {
            map = new HashMap();
        }
        if ((i3 & 2) != 0) {
            map2 = new HashMap();
        }
        Map map3 = map2;
        if ((i3 & 4) != 0) {
            list = C7525m.m23461a();
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i4 = 2;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i3 & 32) != 0) {
            i5 = 30;
        } else {
            i5 = i2;
        }
        this(map, map3, list2, i4, z2, i5);
    }
}
