package com.p280ss.android.ugc.aweme.commerce;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.WillingListItemSeed */
public final class WillingListItemSeed implements Serializable {
    @C6593c(mo15949a = "cover")
    private final UrlModel cover;
    @C6593c(mo15949a = "icon")
    private final UrlModel icon;
    @C6593c(mo15949a = "seed_id")
    private final String seedId;
    @C6593c(mo15949a = "seed_tag")
    private final String seedTag;
    @C6593c(mo15949a = "title")
    private final String title;
    @C6593c(mo15949a = "url")
    private final String url;
    @C6593c(mo15949a = "views")
    private final String views;

    public static /* synthetic */ WillingListItemSeed copy$default(WillingListItemSeed willingListItemSeed, String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = willingListItemSeed.seedId;
        }
        if ((i & 2) != 0) {
            str2 = willingListItemSeed.seedTag;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = willingListItemSeed.title;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            urlModel = willingListItemSeed.cover;
        }
        UrlModel urlModel3 = urlModel;
        if ((i & 16) != 0) {
            urlModel2 = willingListItemSeed.icon;
        }
        UrlModel urlModel4 = urlModel2;
        if ((i & 32) != 0) {
            str4 = willingListItemSeed.url;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = willingListItemSeed.views;
        }
        return willingListItemSeed.copy(str, str6, str7, urlModel3, urlModel4, str8, str5);
    }

    public final String component1() {
        return this.seedId;
    }

    public final String component2() {
        return this.seedTag;
    }

    public final String component3() {
        return this.title;
    }

    public final UrlModel component4() {
        return this.cover;
    }

    public final UrlModel component5() {
        return this.icon;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.views;
    }

    public final WillingListItemSeed copy(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, String str4, String str5) {
        String str6 = str;
        C7573i.m23587b(str, "seedId");
        String str7 = str2;
        C7573i.m23587b(str2, "seedTag");
        String str8 = str3;
        C7573i.m23587b(str3, "title");
        UrlModel urlModel3 = urlModel;
        C7573i.m23587b(urlModel, "cover");
        UrlModel urlModel4 = urlModel2;
        C7573i.m23587b(urlModel2, "icon");
        String str9 = str4;
        C7573i.m23587b(str4, "url");
        String str10 = str5;
        C7573i.m23587b(str10, "views");
        WillingListItemSeed willingListItemSeed = new WillingListItemSeed(str6, str7, str8, urlModel3, urlModel4, str9, str10);
        return willingListItemSeed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.views, (java.lang.Object) r3.views) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.WillingListItemSeed
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.commerce.WillingListItemSeed r3 = (com.p280ss.android.ugc.aweme.commerce.WillingListItemSeed) r3
            java.lang.String r0 = r2.seedId
            java.lang.String r1 = r3.seedId
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.seedTag
            java.lang.String r1 = r3.seedTag
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.cover
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.cover
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.icon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.icon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.url
            java.lang.String r1 = r3.url
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.views
            java.lang.String r3 = r3.views
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.WillingListItemSeed.equals(java.lang.Object):boolean");
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getSeedId() {
        return this.seedId;
    }

    public final String getSeedTag() {
        return this.seedTag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViews() {
        return this.views;
    }

    public final int hashCode() {
        String str = this.seedId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.seedTag;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.cover;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.icon;
        int hashCode5 = (hashCode4 + (urlModel2 != null ? urlModel2.hashCode() : 0)) * 31;
        String str4 = this.url;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.views;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WillingListItemSeed(seedId=");
        sb.append(this.seedId);
        sb.append(", seedTag=");
        sb.append(this.seedTag);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", views=");
        sb.append(this.views);
        sb.append(")");
        return sb.toString();
    }

    public WillingListItemSeed(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, String str4, String str5) {
        C7573i.m23587b(str, "seedId");
        C7573i.m23587b(str2, "seedTag");
        C7573i.m23587b(str3, "title");
        C7573i.m23587b(urlModel, "cover");
        C7573i.m23587b(urlModel2, "icon");
        C7573i.m23587b(str4, "url");
        C7573i.m23587b(str5, "views");
        this.seedId = str;
        this.seedTag = str2;
        this.title = str3;
        this.cover = urlModel;
        this.icon = urlModel2;
        this.url = str4;
        this.views = str5;
    }
}
