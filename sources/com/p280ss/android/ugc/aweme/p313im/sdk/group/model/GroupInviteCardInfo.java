package com.p280ss.android.ugc.aweme.p313im.sdk.group.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.GroupInviteCardInfo */
public final class GroupInviteCardInfo implements Serializable {
    @C6593c(mo15949a = "conversation_id")
    private String conversationId;
    @C6593c(mo15949a = "conversation_short_id")
    private String conversationShortId;
    @C6593c(mo15949a = "from_uid")
    private String fromUserId;
    @C6593c(mo15949a = "sec_from_uid")
    private String fromUserSecId;
    @C6593c(mo15949a = "group_icon")
    private UrlModel groupIcon;
    @C6593c(mo15949a = "group_name")
    private String groupName;
    @C6593c(mo15949a = "group_member_count")
    private int memberCount = -1;
    @C6593c(mo15949a = "ticket")
    private String ticket;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    public final String getFromUserId() {
        return this.fromUserId;
    }

    public final String getFromUserSecId() {
        return this.fromUserSecId;
    }

    public final UrlModel getGroupIcon() {
        return this.groupIcon;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(String str) {
        this.conversationShortId = str;
    }

    public final void setFromUserId(String str) {
        this.fromUserId = str;
    }

    public final void setFromUserSecId(String str) {
        this.fromUserSecId = str;
    }

    public final void setGroupIcon(UrlModel urlModel) {
        this.groupIcon = urlModel;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setMemberCount(int i) {
        this.memberCount = i;
    }

    public final void setTicket(String str) {
        this.ticket = str;
    }
}
