package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.p263im.core.model.Message;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.ac */
public class C30926ac extends C30925ab {
    /* renamed from: a */
    public static String m100663a(Message message) {
        if (message == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("upload");
        sb.append(message.getIndex());
        sb.append("_");
        sb.append(message.getUuid());
        return sb.toString();
    }
}
