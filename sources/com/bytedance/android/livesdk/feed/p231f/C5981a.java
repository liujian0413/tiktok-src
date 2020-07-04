package com.bytedance.android.livesdk.feed.p231f;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p147c.C3167b;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.f.a */
public final class C5981a extends C3167b {

    /* renamed from: a */
    private static C5981a f17727a;

    private C5981a() {
    }

    /* renamed from: b */
    public static synchronized C5981a m18718b() {
        C5981a aVar;
        synchronized (C5981a.class) {
            if (f17727a == null) {
                f17727a = new C5981a();
            }
            aVar = f17727a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final JSONObject mo9998a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", String.valueOf(C5951b.m18637b().mo14571k().getCurUserId()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo14636a(View view, Room room) {
        if (room != null && view != null) {
            JSONObject jSONObject = new JSONObject();
            User owner = room.getOwner();
            if (owner != null) {
                String title = room.title();
                String nickName = owner.getNickName();
                String city = owner.getCity();
                try {
                    jSONObject.put("title", title);
                    jSONObject.put("nickName", nickName);
                    jSONObject.put("city", city);
                    jSONObject.put("action", "View#onClick()");
                    jSONObject.put("className", view.getClass().getName());
                } catch (JSONException unused) {
                }
                mo10000a("ttlive_page", jSONObject);
            }
        }
    }
}
