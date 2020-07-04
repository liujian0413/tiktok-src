package com.bytedance.android.livesdk.chatroom.interact.p213a;

import com.bytedance.android.livesdk.app.dataholder.C3912d;
import com.bytedance.android.livesdk.chatroom.interact.data.C4761c;
import com.p280ss.avframework.livestreamv2.core.LiveCore.InteractConfig;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.a.a */
public final class C4465a {
    /* renamed from: c */
    private static long m14944c() {
        return 4120036982L;
    }

    /* renamed from: a */
    private static String m14941a() {
        return C4761c.m15640a();
    }

    /* renamed from: b */
    private static String m14943b() {
        return C4761c.m15641b();
    }

    /* renamed from: d */
    private static byte[] m14945d() {
        return C4761c.m15642c();
    }

    /* renamed from: e */
    private static String m14946e() {
        return C3912d.m13795a().f11712g;
    }

    /* renamed from: a */
    public static void m14942a(InteractConfig interactConfig) {
        interactConfig.setAgoraAppId(m14941a()).setAgoraAppKey(m14946e()).setZegoAppId(m14944c()).setZegoSignature(m14945d()).setZegoThirdPartyToken(m14946e()).setByteAppId(m14943b()).setByteToken(m14946e());
    }
}
