package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.event.C4442l;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a */
public final class C4085a extends C11155d<C4086a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$a */
    static final class C4086a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        String f12077a;
        @C6593c(mo15949a = "item")

        /* renamed from: b */
        String f12078b;

        C4086a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14165a((C4086a) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14165a(C4086a aVar, CallContext callContext) throws Exception {
        if (TextUtils.equals(aVar.f12077a, "toolbar")) {
            if (TextUtils.equals(aVar.f12078b, "gift")) {
                C9097a.m27146a().mo22267a((Object) new C4442l(1, 1));
            }
        } else if (TextUtils.equals(aVar.f12077a, "gift_panel") && TextUtils.equals(aVar.f12078b, "prop")) {
            C9097a.m27146a().mo22267a((Object) new C4442l(2, 1));
        }
        return null;
    }
}
