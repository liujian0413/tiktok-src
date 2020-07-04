package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent.Key;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra */
public class BaseExtra implements Serializable {
    @C6593c(mo15949a = "status_code")
    int statusCode;
    @C6593c(mo15949a = "status_msg")
    StatusMessage statusMsg;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra$MessageContent */
    public static class MessageContent {
        @C6593c(mo15949a = "template")
        Key[] template;
        @C6593c(mo15949a = "tips")
        String tips;

        public Key[] getTemplate() {
            return this.template;
        }

        public String getTips() {
            return this.tips;
        }

        public void setTemplate(Key[] keyArr) {
            this.template = keyArr;
        }

        public void setTips(String str) {
            this.tips = str;
        }

        public static SystemContent toSystemContent(MessageContent messageContent) {
            SystemContent systemContent = new SystemContent();
            systemContent.setType(100);
            systemContent.tips = messageContent.tips;
            systemContent.template = messageContent.template;
            return systemContent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseExtra$StatusMessage */
    public static class StatusMessage {
        @C6593c(mo15949a = "msg_content")
        MessageContent msgContent;
        @C6593c(mo15949a = "msg_type")
        int msgType;

        public MessageContent getMsgContent() {
            return this.msgContent;
        }

        public int getMsgType() {
            return this.msgType;
        }

        public void setMsgContent(MessageContent messageContent) {
            this.msgContent = messageContent;
        }

        public void setMsgType(int i) {
            this.msgType = i;
        }
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public StatusMessage getStatusMsg() {
        return this.statusMsg;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMsg(StatusMessage statusMessage) {
        this.statusMsg = statusMessage;
    }
}
