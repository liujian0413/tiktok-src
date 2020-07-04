package com.p280ss.android.ugc.aweme.p313im.sdk.detail.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyInfo */
public final class GroupVerifyInfo implements Serializable {
    @C6593c(mo15949a = "conversation_id")
    private String conversationId;
    @C6593c(mo15949a = "conversation_short_id")
    private String conversationShortId;
    @C6593c(mo15949a = "group_avatar")
    private String groupAvatar;
    @C6593c(mo15949a = "group_member_count")
    private Integer groupMemberCount;
    @C6593c(mo15949a = "group_name")
    private String groupName;
    @C6593c(mo15949a = "inviter_id")
    private String inviterUserId;
    @C6593c(mo15949a = "share_scene")
    private Integer shareScene;
    @C6593c(mo15949a = "share_type")
    private Integer shareType;
    @C6593c(mo15949a = "ticket")
    private String ticket;

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationShortId() {
        return this.conversationShortId;
    }

    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    public final Integer getGroupMemberCount() {
        return this.groupMemberCount;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getInviterUserId() {
        return this.inviterUserId;
    }

    public final Integer getShareScene() {
        return this.shareScene;
    }

    public final Integer getShareType() {
        return this.shareType;
    }

    public final String getTicket() {
        return this.ticket;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupVerifyInfo:{");
        sb.append("groupName:");
        sb.append(this.groupName);
        sb.append(", groupMemberCount:");
        sb.append(this.groupMemberCount);
        sb.append(", conversationId:");
        sb.append(this.conversationId);
        sb.append(", conversationShortId:");
        sb.append(this.conversationShortId);
        sb.append(", inviterUserId:");
        sb.append(this.inviterUserId);
        sb.append(", shareType:");
        sb.append(this.shareType);
        sb.append(", shareScene:");
        sb.append(this.shareScene);
        sb.append(", ticket:");
        sb.append(this.ticket);
        sb.append('}');
        return sb.toString();
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(String str) {
        this.conversationShortId = str;
    }

    public final void setGroupAvatar(String str) {
        this.groupAvatar = str;
    }

    public final void setGroupMemberCount(Integer num) {
        this.groupMemberCount = num;
    }

    public final void setGroupName(String str) {
        this.groupName = str;
    }

    public final void setInviterUserId(String str) {
        this.inviterUserId = str;
    }

    public final void setShareScene(Integer num) {
        this.shareScene = num;
    }

    public final void setShareType(Integer num) {
        this.shareType = num;
    }

    public final void setTicket(String str) {
        this.ticket = str;
    }
}
