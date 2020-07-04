package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.google.gson.p276a.C6593c;

public class ChatResult {
    @C6593c(mo15949a = "background_image")
    private ImageModel background;
    @C6593c(mo15949a = "content")
    private String content;
    @C6593c(mo15949a = "display_text")
    private C9505f displayText;
    @C6593c(mo15949a = "fullscreen_text_color")
    private String fullScreenTextColor;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f13832id;
    @C6593c(mo15949a = "msg_id")
    private long msgId;
    @C6593c(mo15949a = "user")
    private User user;

    public ImageModel getBackground() {
        return this.background;
    }

    public String getContent() {
        return this.content;
    }

    public C9505f getDisplayText() {
        return this.displayText;
    }

    public String getFullScreenTextColor() {
        return this.fullScreenTextColor;
    }

    public long getId() {
        return this.f13832id;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public User getUser() {
        return this.user;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDisplayText(C9505f fVar) {
        this.displayText = fVar;
    }

    public void setFullScreenTextColor(String str) {
        this.fullScreenTextColor = str;
    }

    public void setId(long j) {
        this.f13832id = j;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
