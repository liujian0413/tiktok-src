package com.bytedance.android.live.broadcast.monitor;

import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.monitor.a */
public final class C2758a extends C3168a {
    /* renamed from: a */
    public static void m11034a(long j, boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = "media_type";
        if (z) {
            str = "audio";
        } else {
            str = "video";
        }
        m11984a(jSONObject, str2, str);
        C3172e.m12000a("ttlive_create_room_all", 0, j, jSONObject);
    }

    /* renamed from: a */
    public static void m11033a(int i, String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str);
        String str3 = "media_type";
        if (z) {
            str2 = "audio";
        } else {
            str2 = "video";
        }
        m11984a(jSONObject, str3, str2);
        C3172e.m12008b("ttlive_create_room_all", 1, jSONObject);
        C3172e.m12002a("ttlive_create_room_error", 1, jSONObject);
        C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_create_room", 1, jSONObject);
    }
}
