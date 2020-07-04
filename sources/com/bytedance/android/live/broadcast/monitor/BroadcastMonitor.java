package com.bytedance.android.live.broadcast.monitor;

import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.livesdk.log.C8449h;
import org.json.JSONException;
import org.json.JSONObject;

public final class BroadcastMonitor {

    /* renamed from: a */
    private static long f8739a;

    /* renamed from: b */
    private static boolean f8740b;

    public enum Domain {
        API("api"),
        LIVE_SDK("livesdk"),
        AGORA("agora");
        
        public final String value;

        private Domain(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    public static void m11026a() {
        f8739a = System.currentTimeMillis();
    }

    /* renamed from: b */
    private static long m11031b() {
        long j;
        if (f8739a > 0) {
            j = System.currentTimeMillis() - f8739a;
        } else {
            j = 0;
        }
        f8739a = 0;
        return j;
    }

    /* renamed from: b */
    public static void m11032b(boolean z) {
        f8740b = z;
    }

    /* renamed from: a */
    public static void m11029a(boolean z) {
        String str;
        long b = m11031b();
        C8449h a = new C8449h().mo21612a("duration", (float) b).mo21613a("errorDomain", (Object) Domain.API.value);
        String str2 = "mediaType";
        if (z) {
            str = "audio";
        } else {
            str = "video";
        }
        a.mo21613a(str2, (Object) str).mo21616a("hotsoon_live_start_live_failure_rate", 0);
        C2758a.m11034a(b, z);
    }

    /* renamed from: a */
    public static void m11027a(Exception exc, boolean z) {
        m11031b();
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            m11028a(Domain.API.value, apiServerException.getErrorCode(), apiServerException.getErrorMsg(), z);
            return;
        }
        m11028a(Domain.API.value, -1, exc.toString(), z);
    }

    /* renamed from: a */
    public static void m11030a(boolean z, int i, String str) {
        new C8449h().mo21613a("errorCode", (Object) Integer.valueOf(i)).mo21613a("errorDesc", (Object) str).mo21616a("hotsoon_live_anchor_close_room", z ^ true ? 1 : 0);
    }

    /* renamed from: a */
    private static void m11028a(String str, int i, String str2, boolean z) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDomain", str);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorDesc", str2);
            String str4 = "mediaType";
            if (z) {
                str3 = "audio";
            } else {
                str3 = "video";
            }
            jSONObject.put(str4, str3);
            new C8449h().mo21614a(jSONObject).mo21616a("hotsoon_live_start_live_failure_rate", 1);
            C2758a.m11033a(i, str2, z);
        } catch (JSONException unused) {
        }
    }
}
