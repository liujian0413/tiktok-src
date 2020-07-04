package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.ak */
public final class C4485ak {

    /* renamed from: a */
    private static String f13082a;

    /* renamed from: b */
    private static long f13083b;

    /* renamed from: c */
    private static String f13084c;

    /* renamed from: d */
    private static long f13085d;

    /* renamed from: c */
    private static void m15003c() {
        f13083b = 0;
        f13082a = null;
        f13084c = null;
        f13085d = 0;
    }

    /* renamed from: a */
    public static void m15001a() {
        f13083b = System.currentTimeMillis();
        LinkCrossRoomDataHolder a = LinkCrossRoomDataHolder.m13782a();
        a.f11686x = f13083b;
        if (a.f11680r == 2) {
            if (a.f11681s == 1) {
                f13082a = "non_connection_screen_match";
            } else {
                f13082a = "non_connection_screen";
            }
        } else if (a.f11672j <= 0) {
            f13082a = "anchor";
        } else {
            f13082a = "pk";
        }
        if (a.f11680r == 0) {
            f13084c = "manual";
        } else {
            f13084c = "random";
        }
        f13085d = a.f11667e;
    }

    /* renamed from: b */
    public static void m15002b() {
        if (f13083b != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - f13083b) / 1000));
            if (LinkCrossRoomDataHolder.m13782a().f11680r == 2 && LinkCrossRoomDataHolder.m13782a().f11659A != null) {
                hashMap.put("right_user_id", String.valueOf(LinkCrossRoomDataHolder.m13782a().f11659A.getId()));
                LinkCrossRoomDataHolder.m13782a().f11667e = LinkCrossRoomDataHolder.m13782a().f11659A.getId();
            }
            C8435g gVar = new C8435g();
            if (LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                gVar.mo21591a(LinkCrossRoomDataHolder.m13782a().f11669g);
            }
            C8443c.m25663a().mo21606a("livesdk_connection_watch_duration", hashMap, Room.class, new C8438j(), LinkCrossRoomDataHolder.m13782a().mo11449b(), gVar);
            m15003c();
        }
    }
}
