package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HomeStay */
public final class HomeStay implements Serializable {
    @C6593c(mo15949a = "icon_url")
    private final UrlModel homeStayIcon;
    @C6593c(mo15949a = "roomtype_list")
    private final List<RoomType> roomType;
    @C6593c(mo15949a = "title")
    private final String title;
    @C6593c(mo15949a = "view_more_url")
    private final String viewMore;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType>, for r4v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.model.HomeStay copy$default(com.p280ss.android.ugc.aweme.discover.model.HomeStay r0, java.lang.String r1, java.lang.String r2, com.p280ss.android.ugc.aweme.base.model.UrlModel r3, java.util.List<com.p280ss.android.ugc.aweme.discover.model.RoomType> r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            java.lang.String r1 = r0.viewMore
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            java.lang.String r2 = r0.title
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.homeStayIcon
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r4 = r0.roomType
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.HomeStay r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.HomeStay.copy$default(com.ss.android.ugc.aweme.discover.model.HomeStay, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.HomeStay");
    }

    public final String component1() {
        return this.viewMore;
    }

    public final String component2() {
        return this.title;
    }

    public final UrlModel component3() {
        return this.homeStayIcon;
    }

    public final List<RoomType> component4() {
        return this.roomType;
    }

    public final HomeStay copy(String str, String str2, UrlModel urlModel, List<RoomType> list) {
        C7573i.m23587b(str, "viewMore");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(list, "roomType");
        return new HomeStay(str, str2, urlModel, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.roomType, (java.lang.Object) r3.roomType) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.HomeStay
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.discover.model.HomeStay r3 = (com.p280ss.android.ugc.aweme.discover.model.HomeStay) r3
            java.lang.String r0 = r2.viewMore
            java.lang.String r1 = r3.viewMore
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.homeStayIcon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.homeStayIcon
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r0 = r2.roomType
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r3 = r3.roomType
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.HomeStay.equals(java.lang.Object):boolean");
    }

    public final UrlModel getHomeStayIcon() {
        return this.homeStayIcon;
    }

    public final List<RoomType> getRoomType() {
        return this.roomType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewMore() {
        return this.viewMore;
    }

    public final int hashCode() {
        String str = this.viewMore;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.homeStayIcon;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        List<RoomType> list = this.roomType;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeStay(viewMore=");
        sb.append(this.viewMore);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", homeStayIcon=");
        sb.append(this.homeStayIcon);
        sb.append(", roomType=");
        sb.append(this.roomType);
        sb.append(")");
        return sb.toString();
    }

    public final int getSize() {
        return this.roomType.size();
    }

    public final boolean isShowMore() {
        if (TextUtils.isEmpty(this.viewMore) || getSize() <= 2) {
            return false;
        }
        return true;
    }

    public HomeStay(String str, String str2, UrlModel urlModel, List<RoomType> list) {
        C7573i.m23587b(str, "viewMore");
        C7573i.m23587b(str2, "title");
        C7573i.m23587b(list, "roomType");
        this.viewMore = str;
        this.title = str2;
        this.homeStayIcon = urlModel;
        this.roomType = list;
    }

    public /* synthetic */ HomeStay(String str, String str2, UrlModel urlModel, List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        this(str, str2, urlModel, list);
    }
}
