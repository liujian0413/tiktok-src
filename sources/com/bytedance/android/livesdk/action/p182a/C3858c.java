package com.bytedance.android.livesdk.action.p182a;

import android.text.TextUtils;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.action.C3867c;
import com.bytedance.android.livesdk.action.C3868d;
import com.bytedance.android.livesdkapi.depend.live.C9327c;
import java.util.Map;

@C3867c(mo11408a = "webcast_inroom_giftpanel")
/* renamed from: com.bytedance.android.livesdk.action.a.c */
public final class C3858c extends C3868d<Void> {
    /* renamed from: a */
    public final void mo11405a(Map map) throws Exception {
        String str = "gift";
        Object obj = map.get("tab");
        if (obj != null && TextUtils.equals(obj.toString(), "5")) {
            str = "prop";
        }
        ((C9327c) C3596c.m13172a(C9327c.class)).sendGift(str, true);
        mo11410a(null);
    }
}
