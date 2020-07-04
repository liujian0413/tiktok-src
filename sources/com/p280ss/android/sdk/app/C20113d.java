package com.p280ss.android.sdk.app;

import android.text.TextUtils;
import com.p280ss.android.newmedia.p893d.C19930a;
import com.p280ss.android.sdk.p899a.C20099c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.app.d */
public final class C20113d extends C19930a {

    /* renamed from: com.ss.android.sdk.app.d$a */
    public static class C20114a {

        /* renamed from: a */
        public String f54440a;

        /* renamed from: b */
        int f54441b;

        /* renamed from: c */
        String f54442c;

        /* renamed from: d */
        public String f54443d;

        /* renamed from: e */
        String f54444e;

        /* renamed from: f */
        public long f54445f;

        /* renamed from: g */
        public String f54446g;

        /* renamed from: h */
        boolean f54447h;

        /* renamed from: i */
        public boolean f54448i;

        /* renamed from: j */
        final Map<String, C20099c> f54449j = new HashMap();

        /* renamed from: k */
        long f54450k;

        /* renamed from: l */
        String f54451l;

        /* renamed from: m */
        String f54452m;
    }

    /* renamed from: a */
    public static C20114a m66310a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        C20114a aVar = new C20114a();
        aVar.f54440a = jSONObject2.optString("name");
        aVar.f54441b = jSONObject2.optInt("gender");
        aVar.f54442c = jSONObject2.optString("screen_name");
        aVar.f54444e = jSONObject2.optString("description");
        aVar.f54447h = jSONObject2.optBoolean("is_generated");
        aVar.f54446g = jSONObject2.optString("avatar_url");
        long j = 0;
        aVar.f54445f = jSONObject2.optLong("user_id", 0);
        aVar.f54443d = jSONObject2.optString("session_key", "");
        aVar.f54448i = jSONObject2.optBoolean("user_verified");
        String optString = jSONObject2.optString("mobile");
        C20099c.f54366c.f54380q = optString;
        if (!TextUtils.isEmpty(optString)) {
            aVar.f54449j.put(C20099c.f54366c.f54376m, C20099c.f54366c);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (i < length) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                String optString2 = optJSONObject.optString("platform");
                if (!(optString2 == null || optString2.length() == 0)) {
                    C20099c cVar = new C20099c(optString2, 0, 0);
                    cVar.f54380q = optJSONObject.optString("platform_screen_name");
                    cVar.f54381r = optJSONObject.optString("profile_image_url");
                    cVar.f54382s = optJSONObject.optString("platform_uid");
                    long optLong = optJSONObject.optLong("expires_in");
                    if (optLong > j) {
                        cVar.f54383t = currentTimeMillis + (1000 * optLong);
                    }
                    cVar.f54384u = optLong;
                    aVar.f54449j.put(optString2, cVar);
                }
                i++;
                j = 0;
            }
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("media");
        if (optJSONObject2 != null) {
            aVar.f54451l = optJSONObject2.optString("avatar_url");
            aVar.f54450k = optJSONObject2.optLong("id");
            aVar.f54452m = optJSONObject2.optString("name");
        }
        return aVar;
    }
}
