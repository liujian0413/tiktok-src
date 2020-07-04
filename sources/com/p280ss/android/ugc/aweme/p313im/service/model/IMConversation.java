package com.p280ss.android.ugc.aweme.p313im.service.model;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.IMConversation */
public class IMConversation extends IMContact {
    private UrlModel mConversationAvatar;
    private String mConversationId;
    private int mConversationMemberCount;
    private String mConversationName;
    private int mConversationType;

    public UrlModel getConversationAvatar() {
        return this.mConversationAvatar;
    }

    public String getConversationId() {
        return this.mConversationId;
    }

    public int getConversationMemberCount() {
        return this.mConversationMemberCount;
    }

    public String getConversationName() {
        return this.mConversationName;
    }

    public int getConversationType() {
        return this.mConversationType;
    }

    public UrlModel getDisplayAvatar() {
        return this.mConversationAvatar;
    }

    public String getDisplayName() {
        return this.mConversationName;
    }

    public int hashCode() {
        if (getConversationId() != null) {
            return getConversationId().hashCode();
        }
        return 0;
    }

    public String toUidString() {
        StringBuilder sb = new StringBuilder("IMConversation{mConversationType=");
        sb.append(this.mConversationType);
        sb.append(", mConversationId='");
        sb.append(this.mConversationId);
        sb.append('\'');
        sb.append(", mConversationName='");
        sb.append(this.mConversationName);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IMConversation{mConversationType=");
        sb.append(this.mConversationType);
        sb.append(", mConversationId='");
        sb.append(this.mConversationId);
        sb.append('\'');
        sb.append(", mConversationName='");
        sb.append(this.mConversationName);
        sb.append('\'');
        sb.append(", mConversationMemberCount=");
        sb.append(this.mConversationMemberCount);
        sb.append(", mConversationAvatar=");
        sb.append(this.mConversationAvatar);
        sb.append(", relationListItemType=");
        sb.append(this.relationListItemType);
        sb.append('}');
        return sb.toString();
    }

    public void setConversationAvatar(UrlModel urlModel) {
        this.mConversationAvatar = urlModel;
    }

    public void setConversationId(String str) {
        this.mConversationId = str;
    }

    public void setConversationMemberCount(int i) {
        this.mConversationMemberCount = i;
    }

    public void setConversationName(String str) {
        this.mConversationName = str;
    }

    public void setConversationType(int i) {
        this.mConversationType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMConversation)) {
            return false;
        }
        IMConversation iMConversation = (IMConversation) obj;
        if (getConversationId() != null) {
            return getConversationId().equals(iMConversation.getConversationId());
        }
        if (iMConversation.getConversationId() == null) {
            return true;
        }
        return false;
    }
}
