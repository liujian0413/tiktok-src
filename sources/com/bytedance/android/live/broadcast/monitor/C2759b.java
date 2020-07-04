package com.bytedance.android.live.broadcast.monitor;

import com.bytedance.android.live.broadcast.effect.C2624k;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.monitor.b */
public final class C2759b {
    /* renamed from: a */
    public static void m11035a() {
        C8443c.m25663a().mo21607a("pm_live_take_banpopup_show", new C8438j().mo21599b("live_take").mo21603f("show").mo21598a("live_take_page"), new C8439k());
    }

    /* renamed from: a */
    public static void m11036a(int i, String str) {
        String str2 = "";
        List<FilterModel> list = C2624k.m10736a().f8419b;
        if (i < list.size()) {
            str2 = ((FilterModel) list.get(i)).getFilterId();
        }
        if (!C6319n.m19593a(str2) && !str2.equals("0")) {
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", str);
            hashMap.put("filter_id", str2);
            C8443c.m25663a().mo21606a("live_take_filter_select", hashMap, new C8438j().mo21599b("live_take").mo21603f("click").mo21598a("live_take_page"));
        }
    }

    /* renamed from: a */
    public static void m11037a(Room room, LiveMode liveMode) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "live_type";
        if (room.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str2, str);
        hashMap.put("streaming_type", liveMode.logStreamingType);
        C8443c.m25663a().mo21606a("pm_live_take_title_write", hashMap, new C8438j().mo21599b("live_take").mo21603f("other").mo21598a("live_take_page"), new C8439k());
    }
}
