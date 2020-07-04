package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem */
public final class MessageItem {
    @C6593c(mo15949a = "check_profile")
    private final CheckProfileNotice checkProfileNotice;
    @C6593c(mo15949a = "follow_request")
    private final FollowRequestNotice followRequestNotice;
    @C6593c(mo15949a = "live_message")
    private final LiveMessageResult liveNotice;
    @C6593c(mo15949a = "notice")
    private final NoticeItems notices;

    public static /* synthetic */ MessageItem copy$default(MessageItem messageItem, CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, LiveMessageResult liveMessageResult, NoticeItems noticeItems, int i, Object obj) {
        if ((i & 1) != 0) {
            checkProfileNotice2 = messageItem.checkProfileNotice;
        }
        if ((i & 2) != 0) {
            followRequestNotice2 = messageItem.followRequestNotice;
        }
        if ((i & 4) != 0) {
            liveMessageResult = messageItem.liveNotice;
        }
        if ((i & 8) != 0) {
            noticeItems = messageItem.notices;
        }
        return messageItem.copy(checkProfileNotice2, followRequestNotice2, liveMessageResult, noticeItems);
    }

    public final CheckProfileNotice component1() {
        return this.checkProfileNotice;
    }

    public final FollowRequestNotice component2() {
        return this.followRequestNotice;
    }

    public final LiveMessageResult component3() {
        return this.liveNotice;
    }

    public final NoticeItems component4() {
        return this.notices;
    }

    public final MessageItem copy(CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, LiveMessageResult liveMessageResult, NoticeItems noticeItems) {
        return new MessageItem(checkProfileNotice2, followRequestNotice2, liveMessageResult, noticeItems);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.notices, (java.lang.Object) r3.notices) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageItem
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageItem) r3
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r0 = r2.checkProfileNotice
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r1 = r3.checkProfileNotice
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r0 = r2.followRequestNotice
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r1 = r3.followRequestNotice
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r0 = r2.liveNotice
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveMessageResult r1 = r3.liveNotice
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r0 = r2.notices
            com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems r3 = r3.notices
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageItem.equals(java.lang.Object):boolean");
    }

    public final CheckProfileNotice getCheckProfileNotice() {
        return this.checkProfileNotice;
    }

    public final FollowRequestNotice getFollowRequestNotice() {
        return this.followRequestNotice;
    }

    public final LiveMessageResult getLiveNotice() {
        return this.liveNotice;
    }

    public final NoticeItems getNotices() {
        return this.notices;
    }

    public final int hashCode() {
        CheckProfileNotice checkProfileNotice2 = this.checkProfileNotice;
        int i = 0;
        int hashCode = (checkProfileNotice2 != null ? checkProfileNotice2.hashCode() : 0) * 31;
        FollowRequestNotice followRequestNotice2 = this.followRequestNotice;
        int hashCode2 = (hashCode + (followRequestNotice2 != null ? followRequestNotice2.hashCode() : 0)) * 31;
        LiveMessageResult liveMessageResult = this.liveNotice;
        int hashCode3 = (hashCode2 + (liveMessageResult != null ? liveMessageResult.hashCode() : 0)) * 31;
        NoticeItems noticeItems = this.notices;
        if (noticeItems != null) {
            i = noticeItems.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageItem(checkProfileNotice=");
        sb.append(this.checkProfileNotice);
        sb.append(", followRequestNotice=");
        sb.append(this.followRequestNotice);
        sb.append(", liveNotice=");
        sb.append(this.liveNotice);
        sb.append(", notices=");
        sb.append(this.notices);
        sb.append(")");
        return sb.toString();
    }

    public MessageItem(CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, LiveMessageResult liveMessageResult, NoticeItems noticeItems) {
        this.checkProfileNotice = checkProfileNotice2;
        this.followRequestNotice = followRequestNotice2;
        this.liveNotice = liveMessageResult;
        this.notices = noticeItems;
    }

    public /* synthetic */ MessageItem(CheckProfileNotice checkProfileNotice2, FollowRequestNotice followRequestNotice2, LiveMessageResult liveMessageResult, NoticeItems noticeItems, int i, C7571f fVar) {
        if ((i & 4) != 0) {
            liveMessageResult = null;
        }
        this(checkProfileNotice2, followRequestNotice2, liveMessageResult, noticeItems);
    }
}
