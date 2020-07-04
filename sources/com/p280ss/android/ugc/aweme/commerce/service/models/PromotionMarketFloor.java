package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor */
public final class PromotionMarketFloor implements Serializable {
    @C6593c(mo15949a = "icon")
    private UrlModel icon;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "tma_url")
    private String tma_url;
    @C6593c(mo15949a = "url")
    private String url;

    public PromotionMarketFloor() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PromotionMarketFloor copy$default(PromotionMarketFloor promotionMarketFloor, String str, String str2, String str3, String str4, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionMarketFloor.title;
        }
        if ((i & 2) != 0) {
            str2 = promotionMarketFloor.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = promotionMarketFloor.url;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = promotionMarketFloor.tma_url;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            urlModel = promotionMarketFloor.icon;
        }
        return promotionMarketFloor.copy(str, str5, str6, str7, urlModel);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.tma_url;
    }

    public final UrlModel component5() {
        return this.icon;
    }

    public final PromotionMarketFloor copy(String str, String str2, String str3, String str4, UrlModel urlModel) {
        PromotionMarketFloor promotionMarketFloor = new PromotionMarketFloor(str, str2, str3, str4, urlModel);
        return promotionMarketFloor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.icon, (java.lang.Object) r3.icon) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor r3 = (com.p280ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.url
            java.lang.String r1 = r3.url
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.tma_url
            java.lang.String r1 = r3.tma_url
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.icon
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.icon
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor.equals(java.lang.Object):boolean");
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTma_url() {
        return this.tma_url;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tma_url;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.icon;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionMarketFloor(title=");
        sb.append(this.title);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", tma_url=");
        sb.append(this.tma_url);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(")");
        return sb.toString();
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTma_url(String str) {
        this.tma_url = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public PromotionMarketFloor(String str, String str2, String str3, String str4, UrlModel urlModel) {
        this.title = str;
        this.name = str2;
        this.url = str3;
        this.tma_url = str4;
        this.icon = urlModel;
    }

    public /* synthetic */ PromotionMarketFloor(String str, String str2, String str3, String str4, UrlModel urlModel, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = "";
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            urlModel = null;
        }
        this(str, str5, str6, str7, urlModel);
    }
}
