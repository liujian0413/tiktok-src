package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.bytedance.p263im.core.model.Conversation;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aq */
public final class C31871aq {
    /* renamed from: a */
    public static final int m103559a(Conversation conversation) {
        C7573i.m23587b(conversation, "$this$priorityPlus");
        if (conversation.isStickTop()) {
            return 50;
        }
        return 0;
    }
}
