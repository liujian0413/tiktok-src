package com.bytedance.android.livesdk.chatroom.model;

import com.google.gson.p276a.C6593c;

public class TaskGiftEvent {
    public static final int TYPE_FOLLOW = 4;
    public static final int TYPE_SHARE = 2;
    public static final int TYPE_WATCH = 1;
    @C6593c(mo15949a = "data")
    private String data;
    @C6593c(mo15949a = "subtitle")
    private String subtitle;
    @C6593c(mo15949a = "type")
    private int type;

    public String getData() {
        return this.data;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public int getType() {
        return this.type;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
