package com.p280ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse */
public final class PoiNewsFeedResponse {
    @C6593c(mo15949a = "cover_avatar_url")
    public final List<UrlModel> avatarList;
    @C6593c(mo15949a = "status_code")
    public final int code;
    @C6593c(mo15949a = "cursor")
    public final int cursor;
    @C6593c(mo15949a = "has_more")
    public final int hasMore;
    @C6593c(mo15949a = "log_pb")
    public final LogPbBean logPb;
    @C6593c(mo15949a = "page_view_count")
    public final String pageViewCount;
    @C6593c(mo15949a = "aweme_list")
    public final List<Aweme> poiAwemeList;

    public PoiNewsFeedResponse() {
        this(0, 0, 0, null, null, null, null, 127, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel>, for r11v0, types: [java.util.List] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r12v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse copy$default(com.p280ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse r5, int r6, int r7, int r8, java.lang.String r9, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r10, java.util.List<com.p280ss.android.ugc.aweme.base.model.UrlModel> r11, java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r12, int r13, java.lang.Object r14) {
        /*
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            int r6 = r5.code
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000c
            int r7 = r5.hasMore
        L_0x000c:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0013
            int r8 = r5.cursor
        L_0x0013:
            r0 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001a
            java.lang.String r9 = r5.pageViewCount
        L_0x001a:
            r1 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.feed.model.LogPbBean r10 = r5.logPb
        L_0x0021:
            r2 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0028
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r11 = r5.avatarList
        L_0x0028:
            r3 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x002f
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r12 = r5.poiAwemeList
        L_0x002f:
            r4 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            com.ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse r5 = r7.copy(r8, r9, r10, r11, r12, r13, r14)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse.copy$default(com.ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse, int, int, int, java.lang.String, com.ss.android.ugc.aweme.feed.model.LogPbBean, java.util.List, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.feed.model.poi.PoiNewsFeedResponse");
    }

    public final PoiNewsFeedResponse copy(int i, int i2, int i3, String str, LogPbBean logPbBean, List<UrlModel> list, List<Aweme> list2) {
        PoiNewsFeedResponse poiNewsFeedResponse = new PoiNewsFeedResponse(i, i2, i3, str, logPbBean, list, list2);
        return poiNewsFeedResponse;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiNewsFeedResponse) {
                PoiNewsFeedResponse poiNewsFeedResponse = (PoiNewsFeedResponse) obj;
                if (this.code == poiNewsFeedResponse.code) {
                    if (this.hasMore == poiNewsFeedResponse.hasMore) {
                        if (!(this.cursor == poiNewsFeedResponse.cursor) || !C7573i.m23585a((Object) this.pageViewCount, (Object) poiNewsFeedResponse.pageViewCount) || !C7573i.m23585a((Object) this.logPb, (Object) poiNewsFeedResponse.logPb) || !C7573i.m23585a((Object) this.avatarList, (Object) poiNewsFeedResponse.avatarList) || !C7573i.m23585a((Object) this.poiAwemeList, (Object) poiNewsFeedResponse.poiAwemeList)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((Integer.hashCode(this.code) * 31) + Integer.hashCode(this.hasMore)) * 31) + Integer.hashCode(this.cursor)) * 31;
        String str = this.pageViewCount;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode3 = (hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        List<UrlModel> list = this.avatarList;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<Aweme> list2 = this.poiAwemeList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiNewsFeedResponse(code=");
        sb.append(this.code);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", pageViewCount=");
        sb.append(this.pageViewCount);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", avatarList=");
        sb.append(this.avatarList);
        sb.append(", poiAwemeList=");
        sb.append(this.poiAwemeList);
        sb.append(")");
        return sb.toString();
    }

    public PoiNewsFeedResponse(int i, int i2, int i3, String str, LogPbBean logPbBean, List<UrlModel> list, List<Aweme> list2) {
        this.code = i;
        this.hasMore = i2;
        this.cursor = i3;
        this.pageViewCount = str;
        this.logPb = logPbBean;
        this.avatarList = list;
        this.poiAwemeList = list2;
    }

    public /* synthetic */ PoiNewsFeedResponse(int i, int i2, int i3, String str, LogPbBean logPbBean, List list, List list2, int i4, C7571f fVar) {
        int i5;
        int i6;
        int i7 = 0;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 4) == 0) {
            i7 = i3;
        }
        if ((i4 & 8) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            logPbBean = null;
        }
        LogPbBean logPbBean2 = logPbBean;
        if ((i4 & 32) != 0) {
            list = new ArrayList();
        }
        List list3 = list;
        if ((i4 & 64) != 0) {
            list2 = new ArrayList();
        }
        this(i5, i6, i7, str2, logPbBean2, list3, list2);
    }
}
