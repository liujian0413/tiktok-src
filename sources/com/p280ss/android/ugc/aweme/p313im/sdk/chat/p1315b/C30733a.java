package com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b;

import android.view.View;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.a */
public final class C30733a {

    /* renamed from: a */
    public static final C30733a f80477a = new C30733a();

    /* renamed from: b */
    private static final int f80478b;

    /* renamed from: c */
    private static final int f80479c;

    /* renamed from: d */
    private static String f80480d = "";

    private C30733a() {
    }

    /* renamed from: a */
    public static final boolean m100114a() {
        if ((f80478b & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m100116b() {
        if ((f80478b & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m100119c() {
        if ((f80478b & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m100120d() {
        if ((f80478b & 8) == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m100121e() {
        if ((f80478b & 16) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m100122f() {
        if ((f80479c & 16) == 16) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m100123g() {
        if ((f80479c & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m100124h() {
        if ((f80479c & 2) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m100125i() {
        if ((f80479c & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m100126j() {
        if ((f80479c & 8) == 8) {
            return true;
        }
        return false;
    }

    static {
        int i;
        int i2;
        C6956a a = C6956a.m21632a();
        C7573i.m23582a((Object) a, "AwemeImManager.instance()");
        C7103h f = a.mo18009f();
        C7573i.m23582a((Object) f, "AwemeImManager.instance().proxy");
        C32025c iMSetting = f.getIMSetting();
        if (iMSetting != null) {
            i = iMSetting.f83750m;
        } else {
            i = 5;
        }
        f80478b = i;
        if (iMSetting != null) {
            i2 = iMSetting.f83751n;
        } else {
            i2 = 3;
        }
        f80479c = i2;
    }

    /* renamed from: a */
    public static final void m100113a(String str) {
        if (str != null) {
            f80480d = str;
        }
    }

    /* renamed from: b */
    public static final boolean m100118b(String str) {
        if (str != null) {
            return m100117b(C6417a.m20015a().mo15530a(str));
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m100117b(Conversation conversation) {
        if (conversation != null) {
            ConversationCoreInfo coreInfo = conversation.getCoreInfo();
            if (coreInfo != null) {
                Map ext = coreInfo.getExt();
                if (ext != null && C7573i.m23585a((Object) "1", (Object) (String) ext.get("a:s_author_im_supporter"))) {
                    return true;
                }
            }
            Map localExt = conversation.getLocalExt();
            if (localExt != null && C7573i.m23585a((Object) "1", (Object) (String) localExt.get("a:s_author_im_supporter"))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final void m100112a(Conversation conversation) {
        String str;
        StringBuilder sb = new StringBuilder("markAuthorSupporterChatLocal: ");
        String str2 = null;
        if (conversation != null) {
            str = conversation.getConversationId();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(", ");
        if (conversation != null) {
            Map localExt = conversation.getLocalExt();
            if (localExt != null) {
                str2 = (String) localExt.get("a:s_author_im_supporter");
            }
        }
        sb.append(str2);
        if (conversation != null && C7573i.m23585a((Object) f80480d, (Object) conversation.getConversationId()) && (!C7573i.m23585a((Object) "1", (Object) (String) conversation.getLocalExt().get("a:s_author_im_supporter")))) {
            Map localExt2 = conversation.getLocalExt();
            C7573i.m23582a((Object) localExt2, "localExt");
            localExt2.put("a:s_author_im_supporter", "1");
        }
    }

    /* renamed from: a */
    public static final boolean m100115a(View view, View view2, View view3, View view4) {
        boolean z;
        if (!m100123g()) {
            if (view != null) {
                view.setVisibility(8);
            }
            z = true;
        } else {
            z = false;
        }
        if (m100124h()) {
            z = false;
        } else if (view2 != null) {
            view2.setVisibility(8);
        }
        if (m100125i()) {
            z = false;
        } else if (view3 != null) {
            view3.setVisibility(8);
        }
        if (m100126j()) {
            return false;
        }
        if (view4 == null) {
            return z;
        }
        view4.setVisibility(8);
        return z;
    }
}
