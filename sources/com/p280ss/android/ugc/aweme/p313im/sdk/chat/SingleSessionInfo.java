package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SingleSessionInfo */
public final class SingleSessionInfo extends SessionInfo {
    private Serializable chatExt;
    private IMUser fromUser;
    private String fromUserId;
    private IMAdLog imAdLog;

    public final Serializable getChatExt() {
        return this.chatExt;
    }

    public final IMUser getFromUser() {
        return this.fromUser;
    }

    public final String getFromUserId() {
        return this.fromUserId;
    }

    public final IMAdLog getImAdLog() {
        return this.imAdLog;
    }

    public final IMUser getSingleChatFromUser() {
        return this.fromUser;
    }

    public final String getSingleChatFromUserId() {
        IMUser iMUser = this.fromUser;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final void setChatExt(Serializable serializable) {
        this.chatExt = serializable;
    }

    public final void setFromUser(IMUser iMUser) {
        this.fromUser = iMUser;
    }

    public final void setFromUserId(String str) {
        this.fromUserId = str;
    }

    public final void setImAdLog(IMAdLog iMAdLog) {
        this.imAdLog = iMAdLog;
    }
}
