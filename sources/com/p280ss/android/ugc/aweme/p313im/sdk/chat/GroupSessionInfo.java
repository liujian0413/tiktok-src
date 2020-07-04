package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.bytedance.p263im.core.proto.GroupRole;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.GroupCheckMsg;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupSessionInfo */
public final class GroupSessionInfo extends SessionInfo {
    private GroupCheckMsg groupCheckMessage;
    private int groupRole = GroupRole.ORDINARY.getValue();

    public final GroupCheckMsg getGroupCheckMessage() {
        return this.groupCheckMessage;
    }

    public final int getGroupRole() {
        return this.groupRole;
    }

    public final boolean isGroupOwner() {
        if (this.groupRole == GroupRole.OWNER.getValue()) {
            return true;
        }
        return false;
    }

    public final boolean isGroupOwnerOrManager() {
        if (this.groupRole == GroupRole.MANAGER.getValue() || this.groupRole == GroupRole.OWNER.getValue()) {
            return true;
        }
        return false;
    }

    public final void setGroupCheckMessage(GroupCheckMsg groupCheckMsg) {
        this.groupCheckMessage = groupCheckMsg;
    }

    public final void setGroupRole(int i) {
        this.groupRole = i;
    }
}
