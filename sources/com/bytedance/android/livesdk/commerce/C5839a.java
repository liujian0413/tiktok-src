package com.bytedance.android.livesdk.commerce;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p447e.C9398c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.commerce.a */
public final class C5839a implements C9398c {

    /* renamed from: a */
    private HashMap<String, String> f17187a = new HashMap<>();

    /* renamed from: a */
    public final void mo14339a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17187a.put("enter_from_merge", str);
        }
    }

    /* renamed from: b */
    public final void mo14341b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17187a.put("enter_method", str);
        }
    }

    /* renamed from: c */
    public final void mo14343c(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17187a.put("action_type", str);
        }
    }

    /* renamed from: d */
    public final void mo14345d(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f17187a.put("group_id", str);
        }
    }

    /* renamed from: a */
    private static boolean m18294a(Room room) {
        if (room == null || room.getOwner() == null) {
            return false;
        }
        return room.getOwner().isFollowing();
    }

    /* renamed from: a */
    public final void mo14340a(Map<String, String> map) {
        if (map != null) {
            String str = "request_id";
            String str2 = (String) map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                this.f17187a.put(str, str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo14342b(Map map) {
        if (map != null) {
            Object obj = map.get("value");
            Object obj2 = map.get("log_extra");
            if (obj != null && obj2 != null) {
                this.f17187a.put("aweme_ad_type", "dou_plus");
                this.f17187a.put("creative_id", obj.toString());
                this.f17187a.put("log_extra", obj2.toString());
            }
        }
    }

    /* renamed from: c */
    public final void mo14344c(Map map) {
        if (map != null) {
            Object obj = map.get("value");
            Object obj2 = map.get("log_extra");
            if (obj != null && obj2 != null) {
                this.f17187a.put("aweme_ad_type", "effect_ad");
                this.f17187a.put("creative_id", obj.toString());
                this.f17187a.put("log_extra", obj2.toString());
            }
        }
    }

    public C5839a(Room room) {
        String str;
        String str2;
        HashMap<String, String> hashMap = this.f17187a;
        String str3 = "room_id";
        if (room == null) {
            str = "0";
        } else {
            str = String.valueOf(room.getId());
        }
        hashMap.put(str3, str);
        if (room != null) {
            if (room.getOwner() != null) {
                this.f17187a.put("anchor_id", String.valueOf(room.getOwner().getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                this.f17187a.put("request_id", room.getRequestId());
            }
            HashMap<String, String> hashMap2 = this.f17187a;
            String str4 = "follow_status";
            if (m18294a(room)) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap2.put(str4, str2);
        }
        this.f17187a.put("sdk_version", "1380");
        this.f17187a.put("_param_live_platform", "live");
    }
}
