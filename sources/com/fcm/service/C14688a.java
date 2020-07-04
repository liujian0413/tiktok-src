package com.fcm.service;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* renamed from: com.fcm.service.a */
final class C14688a {
    /* renamed from: a */
    static void m42503a(Context context, int i, String str, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("id"))) {
                C6907h.onEvent(MobClick.obtain().setEventName("push_receive").setLabelName("perf_monitor").setValue(jSONObject.optString("id")));
            }
        } catch (Exception unused) {
        }
        SSGcmListenerService.handleMessage$___twin___(context, i, str, i2, str2);
    }
}
