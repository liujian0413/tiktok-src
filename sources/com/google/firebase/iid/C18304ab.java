package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.ab */
final class C18304ab {

    /* renamed from: b */
    private static final long f49754b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f49755a;

    /* renamed from: c */
    private final String f49756c;

    /* renamed from: d */
    private final long f49757d;

    private C18304ab(String str, String str2, long j) {
        this.f49755a = str;
        this.f49756c = str2;
        this.f49757d = j;
    }

    /* renamed from: a */
    static C18304ab m60368a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C18304ab(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C18304ab(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m60370a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m60369a(C18304ab abVar) {
        if (abVar == null) {
            return null;
        }
        return abVar.f49755a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo47210b(String str) {
        return System.currentTimeMillis() > this.f49757d + f49754b || !str.equals(this.f49756c);
    }
}
