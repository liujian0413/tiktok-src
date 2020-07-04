package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.ae */
public final class C9036ae {
    /* renamed from: a */
    public static void m26993a(Room room) {
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        C8448g.m25682a(context);
        room.getOwner().getId();
        room.getId();
    }

    /* renamed from: a */
    public static void m26995a(Room room, boolean z, String str) {
        String str2;
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            String str3 = "connection_type";
            if (z) {
                str2 = "live_type";
            } else {
                str2 = "voice_type";
            }
            jSONObject.put(str3, str2);
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
        } catch (JSONException unused) {
        }
        C8448g.m25682a(context);
        TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        room.getId();
    }

    /* renamed from: a */
    public static void m26994a(Room room, String str, String str2, boolean z) {
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        if (z) {
            C8448g.m25682a(context);
            TTLiveSDKContext.getHostService().mo22367h().mo22179b();
            room.getId();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        C8448g.m25682a(context);
        TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        room.getId();
    }
}
