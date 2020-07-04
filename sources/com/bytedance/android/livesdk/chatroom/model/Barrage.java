package com.bytedance.android.livesdk.chatroom.model;

import com.google.gson.p276a.C6593c;

public class Barrage {
    @C6593c(mo15949a = "content")
    private String content;
    @C6593c(mo15949a = "left_diamond")
    private int leftDiamond;
    @C6593c(mo15949a = "msg_id")
    private long msgId;
    @C6593c(mo15949a = "order_id")
    private String orderId;
    @C6593c(mo15949a = "msg")
    private String screenChatMsg;

    public String getContent() {
        return this.content;
    }

    public int getLeftDiamond() {
        return this.leftDiamond;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getScreenChatMsg() {
        return this.screenChatMsg;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLeftDiamond(int i) {
        this.leftDiamond = i;
    }

    public void setMsgId(long j) {
        this.msgId = j;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setScreenChatMsg(String str) {
        this.screenChatMsg = str;
    }
}
