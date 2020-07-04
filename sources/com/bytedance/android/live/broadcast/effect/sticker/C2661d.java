package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.d */
public final class C2661d extends C2662e {
    /* renamed from: a */
    public final void mo9326a() {
        C3172e.m12000a("ttlive_load_sticker_list_all", 0, mo9331d(), new JSONObject());
    }

    /* renamed from: b */
    public final void mo9328b() {
        C3172e.m12000a("ttlive_download_sticker_all", 0, mo9333f(), new JSONObject());
    }

    /* renamed from: a */
    public final void mo9327a(int i, String str) {
        mo9331d();
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str);
        C3172e.m12008b("ttlive_load_sticker_list_all", 1, jSONObject);
        C3172e.m12002a("ttlive_load_sticker_list_error", 1, jSONObject);
        C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_load_sticker_list", 1, jSONObject);
    }

    /* renamed from: b */
    public final void mo9329b(int i, String str) {
        mo9333f();
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str);
        C3172e.m12008b("ttlive_download_sticker_all", 1, jSONObject);
        C3172e.m12002a("ttlive_download_sticker_error", 1, jSONObject);
        C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_download_sticker", 1, jSONObject);
    }
}
