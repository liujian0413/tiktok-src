package com.bytedance.android.livesdk.chatroom.interact;

import android.text.TextUtils;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.i */
public final class C4811i {
    /* renamed from: a */
    public static void m15836a() {
        C8443c.m25663a().mo21606a("guest_connection_open", null, Room.class);
    }

    /* renamed from: b */
    public static void m15842b() {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        C8443c.m25663a().mo21606a("guest_connection_anchor", hashMap, Room.class);
    }

    /* renamed from: c */
    public static void m15844c() {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        C8443c.m25663a().mo21606a("guest_connection_anchor", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m15837a(int i) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "guest_connection_type";
        if (i == 1) {
            str = "video";
        } else {
            str = "voice";
        }
        hashMap.put(str2, str);
        C8443c.m25663a().mo21606a("guest_connection_apply", hashMap, new C8438j().mo21598a("live_take_detail"), Room.class);
    }

    /* renamed from: b */
    public static void m15843b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("request_page", str);
        C8443c.m25663a().mo21606a("guest_connection", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m15840a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", String.valueOf(j));
        C8443c.m25663a().mo21606a("guest_contributions_ranklist_show", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m15841a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("request_page", str);
        C8443c.m25663a().mo21606a("guest_connection", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m15838a(int i, String str) {
        C8438j jVar = new C8438j();
        if (!TextUtils.isEmpty(str)) {
            jVar.mo21598a("live_take_detail");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("guest_connection_type", "video");
        C8443c.m25663a().mo21606a("guest_connection_agree", hashMap, jVar, Room.class);
    }

    /* renamed from: a */
    public static void m15839a(int i, boolean z, long j) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "guest_connection_type";
        if (i == 1) {
            str = "video";
        } else {
            str = "voice";
        }
        hashMap.put(str2, str);
        hashMap.put("duration", String.valueOf(j));
        C8443c.m25663a().mo21606a("guest_connection_over", hashMap, new C8438j().mo21598a("live_detail"), Room.class);
    }
}
