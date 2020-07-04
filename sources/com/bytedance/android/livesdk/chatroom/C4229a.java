package com.bytedance.android.livesdk.chatroom;

import android.os.SystemClock;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.a */
public final class C4229a extends C3168a {

    /* renamed from: a */
    private long f12351a;

    /* renamed from: a */
    public final void mo11785a() {
        this.f12351a = SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final void mo11787b() {
        C3172e.m12000a("ttlive_load_decoration_list_all", 0, m14362c(), new JSONObject());
    }

    /* renamed from: c */
    private long m14362c() {
        long j;
        if (this.f12351a > 0) {
            j = SystemClock.uptimeMillis() - this.f12351a;
        } else {
            j = 0;
        }
        this.f12351a = 0;
        return j;
    }

    /* renamed from: a */
    public final void mo11786a(int i, String str) {
        m14362c();
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", 1);
        m11984a(jSONObject, "error_msg", str);
        C3172e.m12008b("ttlive_load_decoration_list_all", 1, jSONObject);
        C3172e.m12002a("ttlive_load_decoration_list_error", 1, jSONObject);
        C8427a.m25623a().mo21579a(TTLiveALogTag.Room.info, "ttlive_load_decoration_list", 1, jSONObject);
    }
}
