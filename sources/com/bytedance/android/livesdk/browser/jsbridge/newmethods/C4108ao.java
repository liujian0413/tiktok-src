package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.gift.C3433c;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.C8153h;
import com.bytedance.android.livesdk.gift.model.C8158m;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8429a;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ao */
public final class C4108ao extends C11152c<JSONObject, JSONObject> {

    /* renamed from: a */
    private String f12090a;

    /* renamed from: b */
    private C3433c f12091b = new C3433c() {
        /* renamed from: a */
        public final void mo10400a(Throwable th) {
            C4108ao.this.mo11693a(th);
        }

        /* renamed from: a */
        public final void mo10399a(C8158m mVar) {
            if (mVar == null || C6311g.m19573a(mVar.f22316t)) {
                C4108ao.this.mo11693a((Throwable) new AssertionError());
            } else {
                C4108ao.this.mo11692a(mVar);
            }
        }
    };

    public final void onTerminate() {
    }

    /* renamed from: a */
    public final void mo11693a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 0);
            if (th instanceof ApiException) {
                jSONObject.put("error_code", ((ApiException) th).getErrorCode());
            }
            finishWithResult(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo11692a(C8158m mVar) {
        int i;
        List<C8153h> list = mVar.f22316t;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            JSONArray jSONArray = new JSONArray();
            for (C8153h hVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("gift_id", hVar.f22270c);
                jSONObject2.put("group_count", hVar.f22271d);
                C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(hVar.f22270c);
                String str = "gift_type";
                if (findGiftById != null) {
                    i = findGiftById.f22234e;
                } else {
                    i = 1;
                }
                jSONObject2.put(str, i);
                jSONObject2.put("combo_count", hVar.f22273f);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("result_list", jSONArray);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        if ("lottery".equals(this.f12090a)) {
            hashMap.put("request_page", "lottery");
        }
        C8443c.m25663a().mo21606a("send_gift", hashMap, Room.class, C8438j.class, C8429a.class, ((IGiftService) C3596c.m13172a(IGiftService.class)).getSendGiftResultLog(mVar));
        finishWithResult(jSONObject);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(JSONObject jSONObject, CallContext callContext) {
        long optLong = jSONObject.optLong("gift_id");
        int optInt = jSONObject.optInt("gift_count");
        this.f12090a = jSONObject.optString("gift_type");
        if (optLong <= 0 || optInt <= 0) {
            mo11693a((Throwable) new IllegalArgumentException());
        } else {
            ((IGiftService) C3596c.m13172a(IGiftService.class)).sendGiftInternal(optLong, optInt, this.f12091b);
        }
    }
}
