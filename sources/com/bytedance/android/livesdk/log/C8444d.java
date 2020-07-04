package com.bytedance.android.livesdk.log;

import com.bytedance.android.live.core.p147c.C3167b;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.log.d */
public final class C8444d extends C3167b {

    /* renamed from: a */
    private static C8444d f23107a;

    private C8444d() {
    }

    /* renamed from: b */
    public static synchronized C8444d m25673b() {
        C8444d dVar;
        synchronized (C8444d.class) {
            if (f23107a == null) {
                f23107a = new C8444d();
            }
            dVar = f23107a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final JSONObject mo9998a() {
        long j;
        JSONObject jSONObject = new JSONObject();
        C8416g a = C8443c.m25663a().mo21605a(Room.class);
        String str = "";
        String str2 = "";
        if (a instanceof C8423n) {
            C8423n nVar = (C8423n) a;
            if (nVar.mo21568a().containsKey("room_id")) {
                str = (String) nVar.mo21568a().get("room_id");
            }
            if (nVar.mo21568a().containsKey("anchor_id")) {
                str2 = (String) nVar.mo21568a().get("anchor_id");
            }
            j = nVar.f23040b;
        } else {
            j = 0;
        }
        try {
            jSONObject.put("user_id", String.valueOf(j));
            jSONObject.put("room_id", str);
            jSONObject.put("anchor_id", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
