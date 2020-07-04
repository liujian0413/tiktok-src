package com.bytedance.p263im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessageType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.utils.e */
public final class C11405e {
    /* renamed from: b */
    public static Message m33597b(Message message) {
        if (message != null && !C6417a.m20015a().mo15551e(message.getConversationId()) && !message.isSelf()) {
            return message;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m33598b(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null && fromValue == MessageType.MESSAGE_TYPE_MESSAGE_PROPERTY) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static long m33599c(Message message) {
        if (message == null) {
            return -1;
        }
        Map ext = message.getExt();
        if (ext != null && ext.containsKey("s:do_not_pop_conversation")) {
            if ("true".equals((String) ext.get("s:do_not_pop_conversation"))) {
                return -1;
            }
        }
        return message.getCreatedAt();
    }

    /* renamed from: d */
    public static boolean m33600d(Message message) {
        if (message == null) {
            return false;
        }
        Map localExt = message.getLocalExt();
        if (localExt == null || !localExt.containsKey("s:send_response_check_code")) {
            return true;
        }
        return TextUtils.equals("0", (String) localExt.get("s:send_response_check_code"));
    }

    /* renamed from: a */
    public static boolean m33595a(Message message) {
        if (message == null || message.getSvrStatus() != 0) {
            return false;
        }
        Map ext = message.getExt();
        if (ext != null && ext.containsKey("s:do_not_increase_unread")) {
            if ("true".equals((String) ext.get("s:do_not_increase_unread"))) {
                return false;
            }
        }
        C11368l.m33375a();
        Conversation a = C11368l.m33377a(message.getConversationId());
        boolean e = C6417a.m20015a().mo15551e(message.getConversationId());
        C11198c.m32777a();
        if (a != null) {
            long readIndex = a.getReadIndex();
            if (e || message.isSelf() || message.getIndex() <= readIndex) {
                return false;
            }
            return true;
        } else if (e || message.isSelf()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m33596a(MessageBody messageBody) {
        if (messageBody == null) {
            return false;
        }
        MessageType fromValue = MessageType.fromValue(messageBody.message_type.intValue());
        if (fromValue != null) {
            switch (fromValue) {
                case MESSAGE_TYPE_NOT_USED:
                    return false;
                case MESSAGE_TYPE_COMMAND:
                case MESSAGE_TYPE_UPDATE_MESSAGE_EXT:
                case MESSAGE_TYPE_CONVERSATION_DESTROY:
                case MESSAGE_TYPE_MODE_CHANGE:
                case MESSAGE_TYPE_MESSAGE_PROPERTY:
                case MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY:
                    return true;
            }
        }
        if (messageBody.message_type.intValue() < MessageType.MESSAGE_TYPE_COMMAND.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<Message> m33594a(String str, List<Message> list) {
        if (list == null || list.isEmpty() || C6417a.m20015a().mo15551e(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Message message : list) {
            if (!message.isSelf()) {
                arrayList.add(message);
            }
        }
        return arrayList;
    }
}
