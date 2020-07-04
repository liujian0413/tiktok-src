package com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b;

import android.text.TextUtils;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.d */
public final class C30736d {

    /* renamed from: a */
    public static final C30736d f80482a = new C30736d();

    private C30736d() {
    }

    /* renamed from: a */
    public static final String m100131a(Message message, String str) {
        String str2;
        C7573i.m23587b(message, "msg");
        C7573i.m23587b(str, "msgHint");
        if (message.isSelf()) {
            IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(message.getConversationId())));
            if (b != null) {
                str2 = b.getNickName();
            } else {
                str2 = null;
            }
        } else {
            User c = C7074e.m22071c();
            C7573i.m23582a((Object) c, "AppUtil.getCurrentUser()");
            str2 = c.getNickname();
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(str2);
        sb.append(' ');
        sb.append(str);
        return sb.toString();
    }
}
