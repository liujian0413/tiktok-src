package com.p280ss.android.ugc.aweme.message.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse */
public final class MultiUserNoticeCountResponse extends BaseResponse {
    @C6593c(mo15949a = "data")
    public List<NoticeList> noticeLists;

    public MultiUserNoticeCountResponse() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.notice.api.bean.NoticeList>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse copy$default(com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse r0, java.util.List<com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.notice.api.bean.NoticeList> r1 = r0.noticeLists
        L_0x0006:
            com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse.copy$default(com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse");
    }

    public final MultiUserNoticeCountResponse copy(List<NoticeList> list) {
        return new MultiUserNoticeCountResponse(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.noticeLists, (java.lang.Object) ((com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse) r2).noticeLists) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse r2 = (com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse) r2
            java.util.List<com.ss.android.ugc.aweme.notice.api.bean.NoticeList> r0 = r1.noticeLists
            java.util.List<com.ss.android.ugc.aweme.notice.api.bean.NoticeList> r2 = r2.noticeLists
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<NoticeList> list = this.noticeLists;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiUserNoticeCountResponse(noticeLists=");
        sb.append(this.noticeLists);
        sb.append(")");
        return sb.toString();
    }

    public MultiUserNoticeCountResponse(List<NoticeList> list) {
        this.noticeLists = list;
    }

    public /* synthetic */ MultiUserNoticeCountResponse(List list, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            list = null;
        }
        this(list);
    }
}
