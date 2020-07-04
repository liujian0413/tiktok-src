package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse */
public final class DiscoverV4PlayListResponse extends BaseResponse {
    @C6593c(mo15949a = "cells")
    public final List<DiscoverPlayListStructV4> cells;
    @C6593c(mo15949a = "has_more")
    public final int hasMore;
    @C6593c(mo15949a = "log_pb")
    public final LogPbBean logPb;
    @C6593c(mo15949a = "next_cursor")
    public final int nextCursor;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4>, for r3v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse copy$default(com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r0, int r1, int r2, java.util.List<com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r3, com.p280ss.android.ugc.aweme.feed.model.LogPbBean r4, int r5, java.lang.Object r6) {
        /*
            r6 = r5 & 1
            if (r6 == 0) goto L_0x0006
            int r1 = r0.nextCursor
        L_0x0006:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x000c
            int r2 = r0.hasMore
        L_0x000c:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x0012
            java.util.List<com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4> r3 = r0.cells
        L_0x0012:
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r0.logPb
        L_0x0018:
            com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse r0 = r0.copy(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse.copy$default(com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse, int, int, java.util.List, com.ss.android.ugc.aweme.feed.model.LogPbBean, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse");
    }

    public final DiscoverV4PlayListResponse copy(int i, int i2, List<DiscoverPlayListStructV4> list, LogPbBean logPbBean) {
        C7573i.m23587b(logPbBean, "logPb");
        return new DiscoverV4PlayListResponse(i, i2, list, logPbBean);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscoverV4PlayListResponse) {
                DiscoverV4PlayListResponse discoverV4PlayListResponse = (DiscoverV4PlayListResponse) obj;
                if (this.nextCursor == discoverV4PlayListResponse.nextCursor) {
                    if (!(this.hasMore == discoverV4PlayListResponse.hasMore) || !C7573i.m23585a((Object) this.cells, (Object) discoverV4PlayListResponse.cells) || !C7573i.m23585a((Object) this.logPb, (Object) discoverV4PlayListResponse.logPb)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.nextCursor) * 31) + Integer.hashCode(this.hasMore)) * 31;
        List<DiscoverPlayListStructV4> list = this.cells;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverV4PlayListResponse(nextCursor=");
        sb.append(this.nextCursor);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", cells=");
        sb.append(this.cells);
        sb.append(", logPb=");
        sb.append(this.logPb);
        sb.append(")");
        return sb.toString();
    }

    public DiscoverV4PlayListResponse(int i, int i2, List<DiscoverPlayListStructV4> list, LogPbBean logPbBean) {
        C7573i.m23587b(logPbBean, "logPb");
        this.nextCursor = i;
        this.hasMore = i2;
        this.cells = list;
        this.logPb = logPbBean;
    }
}
