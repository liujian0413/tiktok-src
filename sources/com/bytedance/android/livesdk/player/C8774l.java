package com.bytedance.android.livesdk.player;

import android.os.Build;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.l */
public final class C8774l {
    /* renamed from: a */
    public static void m26226a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        C3168a.m11984a(jSONObject, "device_name", Build.MODEL);
        C3168a.m11984a(jSONObject, "last_cdn_play_url", str);
        C3168a.m11984a(jSONObject, "url", str2);
        C3168a.m11984a(jSONObject, "pull_stream_data", str3);
        C3168a.m11984a(jSONObject, "default_resolution", str4);
        C3168a.m11984a(jSONObject, "sdk_params", str5);
        C3168a.m11983a(jSONObject, "uid", ((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b());
        C3172e.m12008b("ttlive_audience_enter_room_stream_switch", 0, jSONObject);
    }
}
