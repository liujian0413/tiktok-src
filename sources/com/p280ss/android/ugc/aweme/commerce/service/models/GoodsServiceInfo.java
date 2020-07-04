package com.p280ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.GoodsServiceInfo */
public final class GoodsServiceInfo implements Serializable {
    @C6593c(mo15949a = "content")
    private String content;
    @C6593c(mo15949a = "icon")
    private String icon;
    @C6593c(mo15949a = "small_icon")
    private String smallIcon;
    @C6593c(mo15949a = "title")
    private String title;
    @C6593c(mo15949a = "url")
    private final String url;

    public GoodsServiceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ GoodsServiceInfo copy$default(GoodsServiceInfo goodsServiceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goodsServiceInfo.icon;
        }
        if ((i & 2) != 0) {
            str2 = goodsServiceInfo.title;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = goodsServiceInfo.content;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = goodsServiceInfo.smallIcon;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = goodsServiceInfo.url;
        }
        return goodsServiceInfo.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.content;
    }

    public final String component4() {
        return this.smallIcon;
    }

    public final String component5() {
        return this.url;
    }

    public final GoodsServiceInfo copy(String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str, "icon");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(str3, C38347c.f99553h);
        C7573i.m23587b(str4, "smallIcon");
        C7573i.m23587b(str5, "url");
        GoodsServiceInfo goodsServiceInfo = new GoodsServiceInfo(str, str2, str3, str4, str5);
        return goodsServiceInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.url, (java.lang.Object) r3.url) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commerce.service.models.GoodsServiceInfo
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.commerce.service.models.GoodsServiceInfo r3 = (com.p280ss.android.ugc.aweme.commerce.service.models.GoodsServiceInfo) r3
            java.lang.String r0 = r2.icon
            java.lang.String r1 = r3.icon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.smallIcon
            java.lang.String r1 = r3.smallIcon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.url
            java.lang.String r3 = r3.url
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commerce.service.models.GoodsServiceInfo.equals(java.lang.Object):boolean");
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSmallIcon() {
        return this.smallIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.smallIcon;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.url;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodsServiceInfo(icon=");
        sb.append(this.icon);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", smallIcon=");
        sb.append(this.smallIcon);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(")");
        return sb.toString();
    }

    public final void setContent(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.content = str;
    }

    public final void setIcon(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.icon = str;
    }

    public final void setSmallIcon(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.smallIcon = str;
    }

    public final void setTitle(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.title = str;
    }

    public GoodsServiceInfo(String str, String str2, String str3, String str4, String str5) {
        C7573i.m23587b(str, "icon");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(str3, C38347c.f99553h);
        C7573i.m23587b(str4, "smallIcon");
        C7573i.m23587b(str5, "url");
        this.icon = str;
        this.title = str2;
        this.content = str3;
        this.smallIcon = str4;
        this.url = str5;
    }

    public /* synthetic */ GoodsServiceInfo(String str, String str2, String str3, String str4, String str5, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = "";
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = "";
        }
        this(str, str6, str7, str8, str5);
    }
}
