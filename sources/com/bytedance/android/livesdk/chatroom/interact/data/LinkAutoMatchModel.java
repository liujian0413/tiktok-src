package com.bytedance.android.livesdk.chatroom.interact.data;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.p276a.C6593c;

public class LinkAutoMatchModel {
    @C6593c(mo15949a = "default_avatar")
    private ImageModel defaultAvatar;
    @C6593c(mo15949a = "default_content")
    private String defaultContent;
    @C6593c(mo15949a = "rival_room")
    private Room rivalRoom;
    @C6593c(mo15949a = "rival_user_id")
    private long rivalUserId;

    public ImageModel getDefaultAvatar() {
        return this.defaultAvatar;
    }

    public String getDefaultContent() {
        return this.defaultContent;
    }

    public Room getRivalRoom() {
        return this.rivalRoom;
    }

    public long getRivalUserId() {
        return this.rivalUserId;
    }

    public void setDefaultAvatar(ImageModel imageModel) {
        this.defaultAvatar = imageModel;
    }

    public void setDefaultContent(String str) {
        this.defaultContent = str;
    }

    public void setRivalRoom(Room room) {
        this.rivalRoom = room;
    }

    public void setRivalUserId(long j) {
        this.rivalUserId = j;
    }
}
