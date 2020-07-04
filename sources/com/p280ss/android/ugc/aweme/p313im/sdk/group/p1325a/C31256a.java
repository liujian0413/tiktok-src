package com.p280ss.android.ugc.aweme.p313im.sdk.group.p1325a;

import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a */
public final class C31256a {

    /* renamed from: a */
    public static final C31256a f81940a = new C31256a();

    private C31256a() {
    }

    /* renamed from: a */
    public static final boolean m101859a(String str) {
        return m101858a(C6417a.m20015a().mo15530a(str));
    }

    /* renamed from: a */
    public static final boolean m101858a(Conversation conversation) {
        if (!(conversation == null || !conversation.isGroupChat() || conversation.getCoreInfo() == null)) {
            ConversationCoreInfo coreInfo = conversation.getCoreInfo();
            C7573i.m23582a((Object) coreInfo, "conversation.coreInfo");
            if (coreInfo.getExt() != null) {
                ConversationCoreInfo coreInfo2 = conversation.getCoreInfo();
                C7573i.m23582a((Object) coreInfo2, "conversation.coreInfo");
                if (C7573i.m23585a((Object) (String) coreInfo2.getExt().get("a:s_banned"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }
}
