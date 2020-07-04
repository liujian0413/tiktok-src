package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aw */
public final class C4124aw extends C11155d<C4125a, Object> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aw$a */
    static final class C4125a {
        @C6593c(mo15949a = "sec_anchor_id")

        /* renamed from: a */
        String f12117a;
        @C6593c(mo15949a = "enter_from")

        /* renamed from: b */
        String f12118b;

        C4125a() {
        }
    }

    public final /* synthetic */ Object invoke(Object obj, CallContext callContext) throws Exception {
        return m14213a((C4125a) obj, callContext);
    }

    /* renamed from: a */
    private static Object m14213a(C4125a aVar, CallContext callContext) throws Exception {
        C9295a aVar2 = (C9295a) C3596c.m13172a(C9295a.class);
        if (aVar2 != null) {
            Room currentRoom = TTLiveSDKContext.getLiveService().mo22018d().getCurrentRoom();
            if (currentRoom == null) {
                return null;
            }
            C3596c.m13172a(C9295a.class);
            currentRoom.author().getSecUid();
            currentRoom.getId();
            new C4126ax(callContext, aVar2, aVar);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m14214a(CallContext callContext, C9295a aVar, C4125a aVar2, DouPlusEntry douPlusEntry) {
        if (douPlusEntry != null && douPlusEntry.hasDouPlusEntry) {
            String.valueOf(aVar2.f12117a);
        } else if (C4127ay.m14216a(callContext.f30265a)) {
            C9049ap.m27022a((int) R.string.en1);
        } else {
            C9049ap.m27022a((int) R.string.fe1);
        }
    }
}
