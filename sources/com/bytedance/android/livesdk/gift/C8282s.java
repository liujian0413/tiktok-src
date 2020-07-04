package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.log.alog.C8427a;
import com.bytedance.android.livesdk.log.alog.TTLiveALogTag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.s */
public final class C8282s {
    /* renamed from: a */
    public static void m25316a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        C3172e.m12001a(m25330d("ttlive_gift_icon_load_status"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25317a(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        hashMap.put("error_msg", str2);
        C3172e.m12001a(m25330d("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_icon_load_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25319a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        hashMap.put("source_type", Integer.valueOf(i));
        C3172e.m12001a(m25330d("ttlive_gift_asset_download_list_status"), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_asset_download_list_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_asset_download_list_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25318a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3172e.m11999a(m25330d("ttlive_gift_list_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_list_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_list_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25314a(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3172e.m11999a(m25330d("ttlive_gift_send_status"), 0, j3, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25315a(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof ApiException) {
            hashMap.put("error_code", Integer.valueOf(((ApiException) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        C3172e.m11999a(m25330d("ttlive_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_send_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_send_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25320a(boolean z, long j, String str, int i, String str2, int i2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("url", str);
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("error_msg", str2);
        hashMap.put("asset_show_extra", Integer.valueOf(i2));
        hashMap.put("gift_player_type", str3);
        if (z) {
            C3172e.m12001a(m25330d("ttlive_gift_asset_show_status"), 0, (Map<String, Object>) hashMap);
            return;
        }
        C3172e.m12001a(m25330d("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_asset_show_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_asset_show_status", 1, (Map) hashMap);
    }

    /* renamed from: d */
    private static String m25330d(String str) {
        return C3171d.m11992a(str);
    }

    /* renamed from: e */
    private static String m25331e(String str) {
        return C3171d.m11993b(str);
    }

    /* renamed from: a */
    public static void m25307a(long j) {
        C3172e.m11998a(m25330d("ttlive_gift_list_status"), 0, j);
    }

    /* renamed from: b */
    public static void m25322b(long j) {
        C3172e.m11998a(m25330d("ttlive_prop_list_status"), 0, j);
    }

    /* renamed from: a */
    public static void m25306a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("source_type", Integer.valueOf(i));
        C3172e.m12001a(m25330d("ttlive_gift_asset_download_list_status"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m25321b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_page_type", Integer.valueOf(i));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
        }
        C3172e.m12001a(m25330d("ttlive_gift_panel_red_dot_show"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: c */
    public static void m25326c(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("room_type", Integer.valueOf(currentRoom.getOrientation()));
            hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3172e.m12001a(m25331e("ttlive_gift_id_not_found"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_id_not_found", 1, (Map) hashMap);
    }

    /* renamed from: b */
    public static void m25325b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3172e.m11999a(m25330d("ttlive_prop_list_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_prop_list_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_prop_list_status", 1, (Map) hashMap);
    }

    /* renamed from: c */
    public static void m25329c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3172e.m12001a(m25331e("ttlive_turn_table_url_empty"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_turn_table_url_empty", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25308a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("source_type", Integer.valueOf(i));
        C3172e.m12001a(m25330d("ttlive_gift_asset_download_source"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25311a(long j, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("asset_id", Long.valueOf(j2));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("room_type", Integer.valueOf(currentRoom.getOrientation()));
            hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3172e.m12001a(m25331e("ttlive_asset_id_not_found"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_asset_id_not_found", 1, (Map) hashMap);
    }

    /* renamed from: b */
    public static void m25323b(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3172e.m11999a(m25330d("ttlive_xg_gift_send"), 0, j3, (Map<String, Object>) hashMap);
    }

    /* renamed from: c */
    public static void m25327c(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        C3172e.m11999a(m25330d("ttlive_prop_send_status"), 0, j3, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m25309a(long j, int i, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("asset_type", Integer.valueOf(i));
        hashMap.put("download_assets_from", Long.valueOf(j2));
        C3172e.m12001a(m25330d("ttlive_gift_asset_download_status"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m25324b(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof ApiException) {
            hashMap.put("error_code", Integer.valueOf(((ApiException) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        hashMap.put("error_msg", th.getMessage());
        C3172e.m11999a(m25330d("ttlive_xg_gift_send"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_xg_gift_send"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_xg_gift_send", 1, (Map) hashMap);
    }

    /* renamed from: c */
    public static void m25328c(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        if (th instanceof ApiException) {
            hashMap.put("error_code", Integer.valueOf(((ApiException) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        hashMap.put("error_msg", th.getMessage());
        C3172e.m11999a(m25330d("ttlive_prop_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_prop_send_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_prop_send_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25310a(long j, int i, long j2, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("asset_type", Integer.valueOf(i));
        hashMap.put("download_assets_from", Long.valueOf(j2));
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C3172e.m12001a(m25330d("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_gift_asset_download_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_gift_asset_download_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25312a(long j, long j2, int i, String str, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("count", Integer.valueOf(i));
        hashMap.put("send_gift_position", str);
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3172e.m11999a(m25330d("ttlive_cny_gift_send_status"), 0, j3, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_cny_gift_send_status", 0, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m25313a(long j, long j2, int i, String str, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("count", Integer.valueOf(i));
        hashMap.put("send_gift_position", str);
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof ApiException) {
            hashMap.put("error_code", Integer.valueOf(((ApiException) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        C3172e.m11999a(m25330d("ttlive_cny_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3172e.m12001a(m25331e("ttlive_cny_gift_send_status"), 1, (Map<String, Object>) hashMap);
        C8427a.m25623a().mo21578a(TTLiveALogTag.Gift.info, "ttlive_cny_gift_send_status", 1, (Map) hashMap);
    }
}
