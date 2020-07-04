package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.network.CustomApiServerException;
import com.bytedance.android.live.core.p148d.C3168a;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.p280ss.avframework.livestreamv2.interact.model.SEI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.aj */
public final class C4484aj extends C3168a {

    /* renamed from: a */
    private static final String f13072a = C3171d.m11992a("ttlive_pk_open_api");

    /* renamed from: b */
    private static final String f13073b = C3171d.m11993b("ttlive_pk_open_api");

    /* renamed from: c */
    private static final String f13074c = C3171d.m11992a("ttlive_pk_finish_api");

    /* renamed from: d */
    private static final String f13075d = C3171d.m11993b("ttlive_pk_finish_api");

    /* renamed from: e */
    private static final String f13076e = C3171d.m11992a("ttlive_pk_stats_api");

    /* renamed from: f */
    private static final String f13077f = C3171d.m11993b("ttlive_pk_stats_api");

    /* renamed from: g */
    private static final String f13078g = C3171d.m11992a("ttlive_pk_sei_api");

    /* renamed from: h */
    private static final String f13079h = C3171d.m11993b("ttlive_pk_sei_api");

    /* renamed from: i */
    private static final String f13080i = C3171d.m11992a("ttlive_pk_permission_api");

    /* renamed from: j */
    private static final String f13081j = C3171d.m11993b("ttlive_pk_permission_api");

    /* renamed from: a */
    private static void m14994a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5, String str6) {
        m11984a(jSONObject, "role_type", str);
        m11984a(jSONObject, "line_type", str2);
        m11984a(jSONObject, "vendor", str3);
        m11984a(jSONObject, "interact_id", str4);
        m11984a(jSONObject, "channel_id", str5);
        m11984a(jSONObject, "to_uid", str6);
    }

    /* renamed from: a */
    public static void m14986a(long j) {
        m14989a(f13072a, j);
    }

    /* renamed from: b */
    public static void m14995b(long j) {
        m14989a(f13074c, j);
    }

    /* renamed from: c */
    public static void m14997c(long j) {
        m14989a(f13076e, j);
    }

    /* renamed from: d */
    public static void m14999d(long j) {
        m14989a(f13080i, j);
    }

    /* renamed from: b */
    public static void m14996b(Throwable th) {
        m14992a(f13074c, f13075d, th);
    }

    /* renamed from: c */
    public static void m14998c(Throwable th) {
        m14992a(f13076e, f13077f, th);
    }

    /* renamed from: d */
    public static void m15000d(Throwable th) {
        m14992a(f13080i, f13081j, th);
    }

    /* renamed from: a */
    public static void m14993a(Throwable th) {
        m14992a(f13072a, f13073b, th);
    }

    /* renamed from: a */
    private static void m14989a(String str, long j) {
        C3172e.m12000a(str, 0, j, (JSONObject) null);
    }

    /* renamed from: a */
    public static void m14988a(LinkCrossRoomDataHolder linkCrossRoomDataHolder, String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(linkCrossRoomDataHolder.f11665c));
        hashMap.put("match_type", Integer.valueOf(linkCrossRoomDataHolder.f11680r));
        hashMap.put("room_id", String.valueOf(str));
        hashMap.put("guest_id", Long.valueOf(linkCrossRoomDataHolder.f11667e));
        String str2 = "vendor";
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue() == 0) {
            obj = Integer.valueOf(linkCrossRoomDataHolder.f11675m);
        } else {
            obj = LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a();
        }
        hashMap.put(str2, obj);
        hashMap.put("startTimeMs", Long.valueOf(linkCrossRoomDataHolder.f11674l));
        C3172e.m12001a(f13079h, 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(f13078g, 1, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m14987a(LinkCrossRoomDataHolder linkCrossRoomDataHolder, SEI sei, String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        hashMap.put("channel_id", String.valueOf(linkCrossRoomDataHolder.f11665c));
        hashMap.put("match_type", Integer.valueOf(linkCrossRoomDataHolder.f11680r));
        hashMap.put("room_id", String.valueOf(str));
        hashMap.put("guest_id", Long.valueOf(linkCrossRoomDataHolder.f11667e));
        String str2 = "vendor";
        if (((Integer) LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a()).intValue() == 0) {
            obj = Integer.valueOf(linkCrossRoomDataHolder.f11675m);
        } else {
            obj = LiveConfigSettingKeys.INTERACT_VENDOR.mo10240a();
        }
        hashMap.put(str2, obj);
        hashMap.put("startTimeMs", Long.valueOf(linkCrossRoomDataHolder.f11674l));
        if (sei != null) {
            hashMap.put("sei", C2317a.m9932a().mo15979b((Object) sei));
        }
        C3172e.m12001a(f13078g, 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    private static void m14992a(String str, String str2, Throwable th) {
        String str3;
        int i;
        if (th instanceof CustomApiServerException) {
            CustomApiServerException customApiServerException = (CustomApiServerException) th;
            i = customApiServerException.getErrorCode();
            str3 = customApiServerException.getErrorMsg();
        } else {
            i = 0;
            if (th == null) {
                str3 = "Unknown";
            } else {
                str3 = th.getMessage();
            }
        }
        m14990a(str, str2, i, str3);
    }

    /* renamed from: a */
    private static void m14990a(String str, String str2, int i, String str3) {
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str3);
        C3172e.m12008b(str, 1, jSONObject);
        C3172e.m12002a(str2, 1, jSONObject);
    }

    /* renamed from: a */
    public static void m14991a(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONObject jSONObject = new JSONObject();
        m14994a(jSONObject, str, str2, str3, str4, str5, str6);
        C3172e.m12008b("ttlive_interact_connect_status_all", 0, jSONObject);
    }

    /* renamed from: a */
    public static void m14985a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        JSONObject jSONObject = new JSONObject();
        m11983a(jSONObject, "error_code", (long) i);
        m11984a(jSONObject, "error_msg", str);
        m14994a(jSONObject, str2, str3, str4, str5, str6, str7);
        C3172e.m12008b("ttlive_interact_connect_status_all", 1, jSONObject);
        C3172e.m12002a("ttlive_interact_connect_status_error", 1, jSONObject);
    }
}
