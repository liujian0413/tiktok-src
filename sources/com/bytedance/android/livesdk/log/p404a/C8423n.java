package com.bytedance.android.livesdk.log.p404a;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.n */
public final class C8423n extends C8410a<Room> {

    /* renamed from: a */
    public String f23039a;

    /* renamed from: b */
    public long f23040b;

    /* renamed from: c */
    private Map<String, String> f23041c = new HashMap();

    /* renamed from: d */
    private Map<String, String> f23042d = new HashMap();

    /* renamed from: a */
    public final void mo21571a(Map<String, String> map) {
        super.mo21571a(map);
        map.put("request_id", this.f23042d.get(this.f23039a));
        map.put("log_pb", this.f23041c.get(this.f23039a));
    }

    /* renamed from: b */
    public final String mo21575b(String str) {
        if (this.f23041c.containsKey(str)) {
            return (String) this.f23041c.get(str);
        }
        return "";
    }

    /* renamed from: c */
    public final String mo21576c(String str) {
        if (this.f23042d.containsKey(str)) {
            return (String) this.f23042d.get(str);
        }
        return "";
    }

    /* renamed from: a */
    public final void mo21573a(Room room) {
        String str;
        if (room != null) {
            this.f23039a = String.valueOf(room.getId());
            Map a = mo21568a();
            if (room.getId() != 0) {
                a.put("room_id", String.valueOf(room.getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                a.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                a.put("log_pb", room.getLog_pb());
            } else {
                a.remove("log_pb");
            }
            if (room.getOwner() != null) {
                a.put("anchor_id", String.valueOf(room.getOwner().getId()));
            } else {
                a.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                a.put("moment_room_source", room.getSourceType());
            }
            String str2 = "live_type";
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            a.put(str2, str);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21572a(Map map, Object obj) {
        m25610a(map, (Room) obj);
    }

    /* renamed from: a */
    private static void m25610a(Map<String, String> map, Room room) {
        String str;
        if (room != null) {
            if (room.getId() != 0) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                map.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                map.put("log_pb", room.getLog_pb());
            }
            if (room.getOwner() != null) {
                map.put("anchor_id", String.valueOf(room.getOwner().getId()));
            } else {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                map.put("moment_room_source", room.getSourceType());
            }
            String str2 = "live_type";
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            map.put(str2, str);
        }
    }

    /* renamed from: a */
    public final void mo21574a(String str, String str2, String str3) {
        this.f23041c.put(str, str2);
        this.f23042d.put(str, str3);
    }
}
