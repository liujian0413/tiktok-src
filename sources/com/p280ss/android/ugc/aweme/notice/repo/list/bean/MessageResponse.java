package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse */
public final class MessageResponse extends BaseResponse {
    @C6593c(mo15949a = "messages")
    private final MessageItem item;
    @C6593c(mo15949a = "log_pb")
    private final LogPbBean mLogPbBean;

    public MessageResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, MessageItem messageItem, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            messageItem = messageResponse.item;
        }
        if ((i & 2) != 0) {
            logPbBean = messageResponse.mLogPbBean;
        }
        return messageResponse.copy(messageItem, logPbBean);
    }

    public final MessageItem component1() {
        return this.item;
    }

    public final LogPbBean component2() {
        return this.mLogPbBean;
    }

    public final MessageResponse copy(MessageItem messageItem, LogPbBean logPbBean) {
        return new MessageResponse(messageItem, logPbBean);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.mLogPbBean, (java.lang.Object) r3.mLogPbBean) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse) r3
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r0 = r2.item
            com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem r1 = r3.item
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r2.mLogPbBean
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r3.mLogPbBean
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse.equals(java.lang.Object):boolean");
    }

    public final MessageItem getItem() {
        return this.item;
    }

    public final LogPbBean getMLogPbBean() {
        return this.mLogPbBean;
    }

    public final int hashCode() {
        MessageItem messageItem = this.item;
        int i = 0;
        int hashCode = (messageItem != null ? messageItem.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.mLogPbBean;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageResponse(item=");
        sb.append(this.item);
        sb.append(", mLogPbBean=");
        sb.append(this.mLogPbBean);
        sb.append(")");
        return sb.toString();
    }

    public MessageResponse(MessageItem messageItem, LogPbBean logPbBean) {
        this.item = messageItem;
        this.mLogPbBean = logPbBean;
    }

    public /* synthetic */ MessageResponse(MessageItem messageItem, LogPbBean logPbBean, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            messageItem = null;
        }
        if ((i & 2) != 0) {
            logPbBean = null;
        }
        this(messageItem, logPbBean);
    }
}
