package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.p199a.C4032b;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.j */
public final class C4058j implements C11093e {
    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        String str = "in_room_dialog";
        String str2 = "H5";
        String str3 = "H5";
        String str4 = "H5";
        if (!(iVar == null || iVar.f30171d == null)) {
            if (TextUtils.equals("new_page", iVar.f30171d.optString("type", ""))) {
                str = "new_page";
            }
            str2 = iVar.f30171d.optString("enter_from", "H5");
            str3 = iVar.f30171d.optString("click_type", "H5");
            JSONObject optJSONObject = iVar.f30171d.optJSONObject("args");
            if (optJSONObject != null) {
                str4 = optJSONObject.optString("charge_reason", "H5");
            }
        }
        C9097a.m27146a().mo22267a((Object) new C4032b(str, str2, str3, str4));
        jSONObject.put("code", 1);
    }
}
