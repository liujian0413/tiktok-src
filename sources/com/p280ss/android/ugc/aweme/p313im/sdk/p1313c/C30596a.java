package com.p280ss.android.ugc.aweme.p313im.sdk.p1313c;

import android.text.TextUtils;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.c.a */
public final class C30596a {
    /* renamed from: a */
    private static Map<String, String> m99922a(Map<String, String> map) {
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    /* renamed from: a */
    private static Map<String, String> m99921a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Conversation a = C6417a.m20015a().mo15530a(str);
        if (a == null) {
            return null;
        }
        return a.getLocalExt();
    }

    /* renamed from: a */
    private static void m99923a(Message message) {
        if (message != null && !message.isSelf()) {
            BaseContent content = MessageViewType.content(message);
            if (content != null && content.getType() == 770) {
                Map a = m99922a(m99921a(message.getConversationId()));
                a.put("commercialize.personal_info_count", "3");
                m99925a(message.getConversationId(), a);
            }
        }
    }

    /* renamed from: b */
    private static Integer m99927b(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = (String) map.get("commercialize.personal_info_count");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m99926a(List<Message> list) {
        if (list != null && !list.isEmpty()) {
            for (Message a : list) {
                m99923a(a);
            }
        }
    }

    /* renamed from: a */
    public static void m99924a(String str, BaseContent baseContent) {
        if (baseContent != null) {
            Map a = m99921a(str);
            Integer b = m99927b(a);
            if (b != null) {
                if (b.intValue() > 0) {
                    baseContent.setType(771);
                }
                int intValue = b.intValue() - 1;
                if (intValue > 0) {
                    a.put("commercialize.personal_info_count", Integer.toString(intValue));
                } else {
                    a.remove("commercialize.personal_info_count");
                }
                m99925a(str, a);
            }
        }
    }

    /* renamed from: a */
    private static void m99925a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            new C6425b(str).mo15570a(map, (Runnable) null);
        }
    }
}
