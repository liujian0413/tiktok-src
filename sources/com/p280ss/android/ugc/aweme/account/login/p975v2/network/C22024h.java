package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.h */
public final class C22024h {

    /* renamed from: a */
    public static final C22024h f58891a = new C22024h();

    private C22024h() {
    }

    /* renamed from: a */
    public static void m73305a(boolean z, String str, String str2) {
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(str2, "enterMethod");
        C6907h.m21524a("phone_bind_status", (Map) new C21102b().mo56946a("enter_from", str).mo56946a("enter_method", str2).mo56944a("status", z ? 1 : 0).f56672a);
    }
}
