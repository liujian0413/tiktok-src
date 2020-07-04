package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.support.p029v7.util.C1143a.C1147c;
import com.bytedance.p263im.core.model.Message;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.MessageDiffer */
public final class MessageDiffer extends C1147c<Message> {
    /* renamed from: a */
    private static boolean m100049a(Message message, Message message2) {
        C7573i.m23587b(message, "p0");
        C7573i.m23587b(message2, "p1");
        return C7573i.m23585a((Object) message, (Object) message2);
    }

    /* renamed from: b */
    private static boolean m100050b(Message message, Message message2) {
        C7573i.m23587b(message, "p0");
        C7573i.m23587b(message2, "p1");
        return C7573i.m23585a((Object) message, (Object) message2);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo4549a(Object obj, Object obj2) {
        return m100050b((Message) obj, (Message) obj2);
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo4550b(Object obj, Object obj2) {
        return m100049a((Message) obj, (Message) obj2);
    }
}
