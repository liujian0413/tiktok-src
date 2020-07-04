package com.p280ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse */
public final class PoiStreetFeedResponse {
    @C6593c(mo15949a = "status_code")
    public final int code;
    @C6593c(mo15949a = "has_more")
    public final int hasMore;
    @C6593c(mo15949a = "log_pb")
    public final LogPbBean logPb;
    @C6593c(mo15949a = "page_view_count")
    public final String pageViewCount;
    @C6593c(mo15949a = "aweme_list")
    public final List<Aweme> poiAwemeList;

    public PoiStreetFeedResponse() {
        this(0, 0, null, null, null, 31, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse copy$default(com.p280ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse r3, int r4, int r5, java.lang.String r6, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r7, java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            int r4 = r3.code
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            int r5 = r3.hasMore
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.lang.String r6 = r3.pageViewCount
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r3.logPb
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r8 = r3.poiAwemeList
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse.copy$default(com.ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse, int, int, java.lang.String, com.ss.android.ugc.aweme.feed.model.LogPbBean, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.feed.model.poi.PoiStreetFeedResponse");
    }

    public final PoiStreetFeedResponse copy(int i, int i2, String str, LogPbBean logPbBean, List<Aweme> list) {
        PoiStreetFeedResponse poiStreetFeedResponse = new PoiStreetFeedResponse(i, i2, str, logPbBean, list);
        return poiStreetFeedResponse;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PoiStreetFeedResponse) {
                PoiStreetFeedResponse poiStreetFeedResponse = (PoiStreetFeedResponse) obj;
                if (this.code == poiStreetFeedResponse.code) {
                    if (!(this.hasMore == poiStreetFeedResponse.hasMore) || !C7573i.m23585a((Object) this.pageViewCount, (Object) poiStreetFeedResponse.pageViewCount) || !C7573i.m23585a((Object) this.logPb, (Object) poiStreetFeedResponse.logPb) || !C7573i.m23585a((Object) this.poiAwemeList, (Object) poiStreetFeedResponse.poiAwemeList)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.code * 31) + this.hasMore) * 31;
        String str = this.pageViewCount;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode2 = (hashCode + (logPbBean != null ? logPbBean.hashCode() : 0)) * 31;
        List<Aweme> list = this.poiAwemeList;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiStreetFeedResponse(code=");
        sb.append(this.code);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", pageViewCount=");
        sb.append(this.pageViewCount);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(", poiAwemeList=");
        sb.append(this.poiAwemeList);
        sb.append(")");
        return sb.toString();
    }

    public PoiStreetFeedResponse(int i, int i2, String str, LogPbBean logPbBean, List<Aweme> list) {
        this.code = i;
        this.hasMore = i2;
        this.pageViewCount = str;
        this.logPb = logPbBean;
        this.poiAwemeList = list;
    }

    public /* synthetic */ PoiStreetFeedResponse(int i, int i2, String str, LogPbBean logPbBean, List list, int i3, C7571f fVar) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i4 = 1;
        } else {
            i4 = i2;
        }
        if ((i3 & 4) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            logPbBean = null;
        }
        LogPbBean logPbBean2 = logPbBean;
        if ((i3 & 16) != 0) {
            list = new ArrayList();
        }
        this(i, i4, str2, logPbBean2, list);
    }
}
