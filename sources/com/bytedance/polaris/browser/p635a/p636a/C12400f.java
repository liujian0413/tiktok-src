package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.f */
public final class C12400f implements C12408b {

    /* renamed from: a */
    private final WeakReference<Activity> f32933a;

    /* renamed from: a */
    public final void mo30259a() {
    }

    /* renamed from: b */
    public final void mo30261b() {
    }

    public C12400f(WeakReference<Activity> weakReference) {
        this.f32933a = weakReference;
    }

    /* renamed from: a */
    private boolean m36054a(JSONObject jSONObject) {
        if (jSONObject == null || this.f32933a == null) {
            return false;
        }
        Context context = (Context) this.f32933a.get();
        if (context == null) {
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("smsto");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String optString = jSONObject.optString("sms_body");
        if (C6319n.m19593a(optString)) {
            return false;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                strArr[i] = optJSONArray.getString(i);
            } catch (Exception unused) {
            }
        }
        try {
            String join = TextUtils.join(";", strArr);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            StringBuilder sb = new StringBuilder("smsto:");
            sb.append(join);
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra("sms_body", optString);
            context.startActivity(intent);
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        try {
            jSONObject.put("code", m36054a(cVar.f32954d) ? 1 : 0);
        } catch (JSONException unused) {
        }
        return true;
    }
}
