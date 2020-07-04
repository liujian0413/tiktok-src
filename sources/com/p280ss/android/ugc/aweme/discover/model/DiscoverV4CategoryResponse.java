package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse */
public final class DiscoverV4CategoryResponse {
    @C6593c(mo15949a = "category_list")
    public final List<DiscoverCategoryStructV4> categoryList;
    @C6593c(mo15949a = "log_pb")
    public final LogPbBean logPb;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse copy$default(com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r0, java.util.List<com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1 = r0.categoryList
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r0.logPb
        L_0x000c:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse");
    }

    public final DiscoverV4CategoryResponse copy(List<DiscoverCategoryStructV4> list, LogPbBean logPbBean) {
        return new DiscoverV4CategoryResponse(list, logPbBean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.logPb, (java.lang.Object) r3.logPb) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse r3 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse) r3
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r0 = r2.categoryList
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4> r1 = r3.categoryList
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.logPb
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.logPb
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<DiscoverCategoryStructV4> list = this.categoryList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4CategoryResponse(categoryList=");
        sb.append(this.categoryList);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4CategoryResponse(List<DiscoverCategoryStructV4> list, LogPbBean logPbBean) {
        this.categoryList = list;
        this.logPb = logPbBean;
    }
}
