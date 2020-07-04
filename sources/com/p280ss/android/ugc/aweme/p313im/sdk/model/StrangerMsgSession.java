package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerMsgSession */
public class StrangerMsgSession {
    @C6593c(mo15949a = "last_msg")
    StrangerMessage lastMsg;
    @C6593c(mo15949a = "session_id")
    long sessionId;
    @C6593c(mo15949a = "unread_count")
    int unreadCount;

    public StrangerMessage getLastMsg() {
        return this.lastMsg;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public int getUnreadCount() {
        return this.unreadCount;
    }

    public void setLastMsg(StrangerMessage strangerMessage) {
        this.lastMsg = strangerMessage;
    }

    public void setSessionId(long j) {
        this.sessionId = j;
    }

    public void setUnreadCount(int i) {
        this.unreadCount = i;
    }
}
