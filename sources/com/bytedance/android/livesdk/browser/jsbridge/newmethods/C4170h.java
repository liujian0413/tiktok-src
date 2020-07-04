package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.h */
public final class C4170h extends C11155d<Object, JSONObject> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public JSONObject invoke(Object obj, CallContext callContext) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        User from = User.from(TTLiveSDKContext.getHostService().mo22367h().mo22165a());
        JSONObject jSONObject2 = new JSONObject();
        m14272a(from, jSONObject2);
        jSONObject.put("user_info", jSONObject2);
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("room_id", currentRoom.getId());
            jSONObject.put("room_info", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            m14272a(currentRoom.getOwner(), jSONObject4);
            jSONObject.put("anchor_info", jSONObject4);
        }
        jSONObject.put("code", 1);
        return jSONObject;
    }

    /* renamed from: a */
    private static void m14272a(User user, JSONObject jSONObject) throws JSONException {
        jSONObject.put("short_id", user.getShortId());
        jSONObject.put("user_id", user.getId());
        jSONObject.put("sec_user_id", user.getSecUid());
        if (user.getAvatarThumb() != null) {
            jSONObject.put("avatar", user.getAvatarThumb().getUrls().get(0));
        }
        jSONObject.put("nickname", user.getNickName());
        jSONObject.put("user_level", user.getLevel());
        if (user.getAnchorInfo() != null) {
            jSONObject.put("anchor_level", user.getAnchorInfo().f7794a);
            jSONObject.put("anchor_type", user.getAnchorInfo().f7795b);
        }
    }
}
