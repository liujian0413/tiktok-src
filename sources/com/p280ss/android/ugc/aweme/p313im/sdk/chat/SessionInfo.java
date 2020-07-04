package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.SessionInfo */
public class SessionInfo implements Serializable {
    private int chatType;
    private String conversationId = "";
    private int enterFrom;
    private List<Message> selectMsgList;
    private int selectMsgType;

    public static /* synthetic */ void chatType$annotations() {
    }

    public static /* synthetic */ void enterFrom$annotations() {
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getEnterFrom() {
        return this.enterFrom;
    }

    public final List<Message> getSelectMsgList() {
        return this.selectMsgList;
    }

    public final int getSelectMsgType() {
        return this.selectMsgType;
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final boolean isFriendChat() {
        if (this.chatType == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.chatType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isAuthorSupporterChat() {
        if (this.chatType == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.chatType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.chatType == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        if (this.chatType == 0 || this.chatType == 1 || this.chatType == 2 || this.chatType == 4) {
            return true;
        }
        return false;
    }

    public final void setChatType(int i) {
        this.chatType = i;
    }

    public final void setEnterFrom(int i) {
        this.enterFrom = i;
    }

    public final void setSelectMsgList(List<Message> list) {
        this.selectMsgList = list;
    }

    public final void setSelectMsgType(int i) {
        this.selectMsgType = i;
    }

    public final void setConversationId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.conversationId = str;
    }
}
