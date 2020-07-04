package com.p280ss.android.ugc.aweme.account.api.p937b;

import android.text.TextUtils;
import com.google.common.util.concurrent.C18245g;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.api.b.a */
public abstract class C21111a implements C18245g<String> {
    /* renamed from: a */
    public abstract void mo56962a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract void mo56963b(JSONObject jSONObject);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onSuccess(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("error".equals(jSONObject.opt("message"))) {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    if (optJSONObject.optInt("error_code") != 1006) {
                        if (!TextUtils.isEmpty(optJSONObject.optString("captcha"))) {
                            optJSONObject.optString("captcha");
                            optJSONObject.optString("description");
                            return;
                        }
                    } else {
                        return;
                    }
                }
                mo56963b(jSONObject);
                return;
            }
            mo56962a(jSONObject);
        } catch (Exception unused) {
        }
    }
}
