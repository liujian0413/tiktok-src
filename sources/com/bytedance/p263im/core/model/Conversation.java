package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.Conversation */
public class Conversation implements Serializable, Cloneable, Comparable<Conversation> {
    private String conversationId;
    private long conversationShortId;
    private int conversationType;
    private ConversationCoreInfo coreInfo;
    private String draftContent;
    private long draftTime;
    private boolean hasMore = true;
    private int inboxType;
    private boolean isMember;
    private Message lastMessage;
    private long lastMessageIndex;
    private long lastMessageOrderIndex;
    private Map<String, String> localExt;
    private Member member;
    private int memberCount;
    private List<Long> memberIds;
    private List<Message> mentionMessages;
    private long minIndex;
    private long readIndex;
    private ConversationSettingInfo settingInfo;
    private int status;
    private String ticket;
    private long unreadCount;
    private long updatedTime;

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public ConversationCoreInfo getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public Message getLastMessage() {
        return this.lastMessage;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public long getLastMessageOrderIndex() {
        return this.lastMessageOrderIndex;
    }

    public Member getMember() {
        return this.member;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<Message> getMentionMessages() {
        return this.mentionMessages;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public ConversationSettingInfo getSettingInfo() {
        return this.settingInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTicket() {
        return this.ticket;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public String getLocalExtStr() {
        return C11401b.m33573a(this.localExt);
    }

    public String getMemberStr() {
        return C11401b.m33572a(this.member);
    }

    public boolean isDissolved() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public Conversation clone() {
        try {
            return (Conversation) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<Long> getMemberIds() {
        if (this.memberIds != null) {
            return this.memberIds;
        }
        return new ArrayList();
    }

    public int getMuted() {
        if (this.settingInfo != null) {
            return this.settingInfo.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        if (this.settingInfo != null) {
            return this.settingInfo.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        if (this.conversationId != null) {
            return this.conversationId.hashCode();
        }
        return 0;
    }

    public boolean isFavorite() {
        if (this.settingInfo == null || !this.settingInfo.isFavor()) {
            return false;
        }
        return true;
    }

    public boolean isGroupChat() {
        if (this.conversationType == C11203a.f30381b) {
            return true;
        }
        return false;
    }

    public boolean isLiveChat() {
        if (this.conversationType == C11203a.f30382c) {
            return true;
        }
        return false;
    }

    public boolean isLocal() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.settingInfo == null || !this.settingInfo.isMute()) {
            return false;
        }
        return true;
    }

    public boolean isSingleChat() {
        if (this.conversationType == C11203a.f30380a) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.settingInfo == null || !this.settingInfo.isStickTop()) {
            return false;
        }
        return true;
    }

    public boolean isTemp() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public synchronized Map<String, String> getExt() {
        if (this.settingInfo == null) {
            return null;
        }
        return this.settingInfo.getExt();
    }

    public synchronized Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public boolean isStranger() {
        if (this.localExt == null || !this.localExt.containsKey("s:conv_is_stranger")) {
            return false;
        }
        return true;
    }

    public boolean isWaitingInfo() {
        if (this.localExt == null || !this.localExt.containsKey("s:conv_wait_info")) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Conversation{conversationId='");
        sb.append(this.conversationId);
        sb.append('\'');
        sb.append(", conversationShortId=");
        sb.append(this.conversationShortId);
        sb.append(", conversationType=");
        sb.append(this.conversationType);
        sb.append(", isMember=");
        sb.append(this.isMember);
        sb.append(", memberCount=");
        sb.append(this.memberCount);
        sb.append(", unreadCount=");
        sb.append(this.unreadCount);
        sb.append(", updatedTime=");
        sb.append(this.updatedTime);
        sb.append(", readIndex=");
        sb.append(this.readIndex);
        sb.append(", lastMessageIndex=");
        sb.append(this.lastMessageIndex);
        sb.append(", ticket='");
        sb.append(this.ticket);
        sb.append('\'');
        sb.append(", inboxType=");
        sb.append(this.inboxType);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", draftTime=");
        sb.append(this.draftTime);
        sb.append(", draftContent='");
        sb.append(this.draftContent);
        sb.append('\'');
        sb.append(", localExt=");
        sb.append(this.localExt);
        sb.append(", memberIds=");
        sb.append(this.memberIds);
        sb.append(", lastMessage=");
        sb.append(this.lastMessage);
        sb.append(", member=");
        sb.append(this.member);
        sb.append('}');
        return sb.toString();
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setCoreInfo(ConversationCoreInfo conversationCoreInfo) {
        this.coreInfo = conversationCoreInfo;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j) {
        this.draftTime = j;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessageIndex(long j) {
        this.lastMessageIndex = j;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public void setMember(Member member2) {
        this.member = member2;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMentionMessages(List<Message> list) {
        this.mentionMessages = list;
    }

    public void setMinIndex(long j) {
        this.minIndex = j;
    }

    public void setReadIndex(long j) {
        this.readIndex = j;
    }

    public void setSettingInfo(ConversationSettingInfo conversationSettingInfo) {
        this.settingInfo = conversationSettingInfo;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }

    public void setLocalExtStr(String str) {
        this.localExt = C11401b.m33577a(str);
    }

    public void setMemberStr(String str) {
        this.member = C11401b.m33579b(str);
    }

    public void setLastMessage(Message message) {
        this.lastMessage = message;
        if (message != null) {
            setLastMessageOrderIndex(message.getOrderIndex());
        }
    }

    public void setLastMessageOrderIndex(long j) {
        if (this.lastMessageOrderIndex < j) {
            this.lastMessageOrderIndex = j;
        }
    }

    public int compareTo(Conversation conversation) {
        if (conversation.getStickTop() != getStickTop()) {
            return conversation.getStickTop() - getStickTop();
        }
        long max = Math.max(conversation.getUpdatedTime(), conversation.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (max > 0) {
            return 1;
        }
        if (max < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        if (this.conversationId != null) {
            return this.conversationId.equals(conversation.conversationId);
        }
        if (conversation.conversationId == null) {
            return true;
        }
        return false;
    }

    public boolean removeMentionMessage(String str) {
        if (this.mentionMessages == null || this.mentionMessages.isEmpty()) {
            return false;
        }
        for (Message message : this.mentionMessages) {
            if (TextUtils.equals(str, message.getUuid())) {
                this.mentionMessages.remove(message);
                return true;
            }
        }
        return false;
    }
}
