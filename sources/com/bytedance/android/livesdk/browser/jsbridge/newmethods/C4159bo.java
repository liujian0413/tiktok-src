package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo */
public final class C4159bo extends C11155d<Object, C4160a> {

    /* renamed from: a */
    public static boolean f12203a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bo$a */
    static final class C4160a {
        @C6593c(mo15949a = "is_login")

        /* renamed from: a */
        boolean f12204a;
        @C6593c(mo15949a = "user_id")

        /* renamed from: b */
        long f12205b = -1;
        @C6593c(mo15949a = "short_id")

        /* renamed from: c */
        long f12206c = -1;
        @C6593c(mo15949a = "sec_user_id")

        /* renamed from: d */
        String f12207d;
        @C6593c(mo15949a = "is_silent")

        /* renamed from: e */
        int f12208e;

        C4160a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14265a(obj, callContext);
    }

    /* renamed from: a */
    private static C4160a m14265a(Object obj, CallContext callContext) {
        C8984e h = TTLiveSDKContext.getHostService().mo22367h();
        IUser a = h.mo22165a();
        C4160a aVar = new C4160a();
        aVar.f12204a = h.mo22182c();
        if (aVar.f12204a) {
            aVar.f12206c = a.getShortId();
            aVar.f12205b = a.getId();
            aVar.f12207d = a.getSecUid();
        }
        aVar.f12208e = f12203a ? 1 : 0;
        return aVar;
    }
}
