package com.bytedance.android.livesdk.chatroom.presenter;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p209bl.C4275g;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8440l;
import com.bytedance.android.livesdk.message.model.C8541cc;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.h */
public final class C5022h {

    /* renamed from: a */
    private final Handler f14285a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private boolean f14286b = false;

    /* renamed from: a */
    public final void mo13035a() {
        if (this.f14286b) {
            this.f14286b = false;
            this.f14285a.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    private static Map<String, String> m16108b(Room room) {
        long j;
        String str;
        HashMap hashMap = new HashMap();
        if (room != null) {
            long id = room.getId();
            String requestId = room.getRequestId();
            if (room.getOwner() == null) {
                j = 0;
            } else {
                j = room.getOwner().getId();
            }
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put("user_id", String.valueOf(j));
            hashMap.put("request_id", requestId);
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(id));
            hashMap.put("live_type", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m16107a(Room room) {
        if (room == null || room.getOwner() == null || room.getUserCount() >= 3500) {
            return false;
        }
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c() && room.getOwner().isFollowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m16105a(C8541cc ccVar, Map<String, String> map) {
        C8440l lVar = new C8440l();
        if (ccVar != null) {
            lVar.f23087a = ccVar.f23506e;
        }
        C8443c.m25663a().mo21606a("audience_live_message", map, lVar, Room.class, new C8438j().mo21598a("live_detail").mo21600c("comment"));
    }

    /* renamed from: a */
    public final void mo13036a(final Room room, final Handler handler) {
        if (!this.f14286b && m16107a(room)) {
            long intValue = (long) ((Integer) LiveSettingKeys.COMMENT_PROMOTION_DELAY.mo10240a()).intValue();
            if (intValue > 0) {
                this.f14285a.postDelayed(new Runnable() {
                    public final void run() {
                        if (!C5022h.m16107a(room)) {
                            C5022h.this.mo13035a();
                        } else {
                            C4275g.m14452a(handler, room);
                        }
                    }
                }, intValue * 1000);
                this.f14286b = true;
            }
        }
    }

    /* renamed from: a */
    public static void m16106a(Room room, String str, C8541cc ccVar) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(m16108b(room));
        if (ccVar != null) {
            hashMap.put("prompt", ccVar.f23506e);
        }
        C8443c.m25663a().mo21606a("message_guide_show", hashMap, new C8438j().mo21598a("live_detail").mo21600c("comment").mo21602e(str));
    }
}
