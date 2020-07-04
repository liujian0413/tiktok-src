package com.p280ss.android.ugc.aweme.feed;

import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ah */
public final class C28204ah {
    /* renamed from: a */
    public static void m92703a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fetch_type", str3);
        } catch (JSONException unused) {
        }
        C6907h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setJsonObject(jSONObject));
    }
}
