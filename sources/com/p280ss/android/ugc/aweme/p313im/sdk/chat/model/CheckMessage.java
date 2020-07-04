package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CheckMessage */
public class CheckMessage {
    public int status_code;
    public StatusMsg status_msg;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.CheckMessage$StatusMsg */
    public static class StatusMsg {
        public SystemContent msg_content;
    }

    public static SystemContent getContent(CheckMessage checkMessage) {
        if (checkMessage == null || checkMessage.status_msg == null || checkMessage.status_msg.msg_content == null) {
            return null;
        }
        return checkMessage.status_msg.msg_content;
    }
}
