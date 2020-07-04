package com.bytedance.android.live.broadcast.p134e;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.e.b */
public final class C2562b {
    /* renamed from: a */
    public static void m10529a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("event_module", "location");
        hashMap.put("user_id", String.valueOf(j));
        C8443c.m25663a().mo21606a("remind_location_click", hashMap, new Object[0]);
    }

    /* renamed from: b */
    public static void m10533b(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "pv");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("enter_from", "live_take_page");
        hashMap.put("source", "location");
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("is_success", "1");
        C8443c.m25663a().mo21606a("location_feedback", hashMap, new C8438j().mo21599b("live").mo21603f("pv"));
    }

    /* renamed from: c */
    public static void m10534c(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "pv");
        hashMap.put("event_page", "live_take_page");
        hashMap.put("enter_from", "live_take_page");
        hashMap.put("source", "location");
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("is_success", "0");
        C8443c.m25663a().mo21606a("location_feedback", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public static void m10532a(String str, String str2, String str3, String str4) {
        CharSequence charSequence;
        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
            charSequence = "system_position";
        } else if (str.equals("android.permission.READ_PHONE_STATE")) {
            charSequence = "call";
        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            charSequence = "save";
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C8438j jVar = new C8438j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.mo21601d(null);
            }
            if (!TextUtils.isEmpty(str4)) {
                jVar.mo21604g(str4);
            }
            hashMap.put("popup_type", charSequence);
            C8443c.m25663a().mo21606a("system_popup", hashMap, jVar.mo21599b("video").mo21603f(str2));
        }
    }

    /* renamed from: a */
    public static void m10531a(String str, Room room, LiveMode liveMode, Game game, String str2, Boolean bool) {
        String str3;
        String str4;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("room_id", String.valueOf(room.getId()));
        String str5 = "live_type";
        if (room.isLiveTypeAudio()) {
            str3 = "voice_live";
        } else {
            str3 = "video_live";
        }
        hashMap.put(str5, str3);
        hashMap.put("streaming_type", liveMode.logStreamingType);
        if (str2 != null) {
            hashMap.put("title_type", str2);
        }
        if (bool != null) {
            String str6 = "location_status";
            if (bool.booleanValue()) {
                str4 = "on";
            } else {
                str4 = "off";
            }
            hashMap.put(str6, str4);
        }
        if (liveMode == LiveMode.SCREEN_RECORD && game != null) {
            hashMap.put("game_name", game.name);
        }
        C8438j a = new C8438j().mo21599b("live_take").mo21598a("live_take_page");
        if (!C6319n.m19593a((String) null)) {
            a.mo21602e(null);
        }
        C8443c.m25663a().mo21606a("live_take", hashMap, a);
    }

    /* renamed from: a */
    public static void m10530a(IPropertyCache iPropertyCache, C8947c<Float> cVar, C8947c<Float> cVar2, Room room, LiveMode liveMode, User user, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        float floatValue = ((Float) cVar.mo22117a()).floatValue() * 100.0f;
        float floatValue2 = ((Float) cVar2.mo22117a()).floatValue() * 100.0f;
        float floatValue3 = ((Float) C8946b.f24364P.mo22117a()).floatValue() * 100.0f;
        float floatValue4 = ((Float) C8946b.f24365Q.mo22117a()).floatValue() * 100.0f;
        HashMap hashMap = new HashMap();
        hashMap.put("event_page", "live_take_page");
        String str8 = "live_type";
        if (room.isLiveTypeAudio()) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        hashMap.put(str8, str);
        hashMap.put("streaming_type", liveMode.logStreamingType);
        hashMap.put("anchor_id", String.valueOf(user.getId()));
        String str9 = "is_tag";
        if (i == -1) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        hashMap.put(str9, str2);
        String str10 = "is_beauty";
        if (liveMode == LiveMode.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put(str10, str3);
        String str11 = "beauty_white";
        if (liveMode != LiveMode.VIDEO) {
            str4 = "0";
        } else {
            str4 = String.valueOf(floatValue);
        }
        hashMap.put(str11, str4);
        String str12 = "beauty_skin";
        if (liveMode != LiveMode.VIDEO) {
            str5 = "0";
        } else {
            str5 = String.valueOf(floatValue2);
        }
        hashMap.put(str12, str5);
        String str13 = "beauty_bigeye";
        if (liveMode != LiveMode.VIDEO) {
            str6 = "0";
        } else {
            str6 = String.valueOf(floatValue3);
        }
        hashMap.put(str13, str6);
        String str14 = "beauty_facethin";
        if (liveMode != LiveMode.VIDEO) {
            str7 = "0";
        } else {
            str7 = String.valueOf(floatValue4);
        }
        hashMap.put(str14, str7);
        C8443c.m25663a().mo21606a("pm_live_take_edit_features", hashMap, new C8438j().mo21599b("live_take").mo21603f("click"));
    }
}
