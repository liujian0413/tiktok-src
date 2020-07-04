package com.bytedance.android.live.core.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p148d.C3172e;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class TimeCostUtil {

    /* renamed from: a */
    private static boolean f9900a = false;

    /* renamed from: b */
    private static String f9901b = "ttlive_feed_base_performance_monitor_all";

    /* renamed from: c */
    private static String f9902c = "ttlive_create_room_base_performance_monitor_all";

    /* renamed from: d */
    private static String f9903d = "ttlive_enter_room_base_performance_monitor_all";

    /* renamed from: e */
    private static String f9904e = "ttlive_pk_watch_room_base_performance_monitor_all";

    /* renamed from: f */
    private static ConcurrentHashMap<String, Long> f9905f = new ConcurrentHashMap<>(C34943c.f91127w);

    /* renamed from: g */
    private static ConcurrentHashMap<String, Long> f9906g = new ConcurrentHashMap<>(C34943c.f91127w);

    public enum Tag {
        LiveFeedInit,
        LiveFeedPreview,
        LiveFeedScroll,
        StartLivePlay,
        ScrollWatchLivePlay,
        CreateStartLivePreview,
        CreateLive,
        ShowBInteractionFirstWidget,
        ShowVideoGift,
        ShowBarrage,
        ShowCInteractionFirstWidget,
        LivePk
    }

    /* renamed from: a */
    public static void m12206a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public static void m12207a(boolean z) {
        f9900a = z;
    }

    /* renamed from: c */
    public static void m12209c(Tag tag) {
        if (f9900a) {
            m12200a(tag, null);
        }
    }

    /* renamed from: b */
    public static void m12208b(Tag tag) {
        if (f9900a) {
            f9905f.put(tag.name(), Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public static void m12199a(Tag tag) {
        if (tag != null) {
            if (f9905f.containsKey(tag.name())) {
                f9905f.remove(tag.name());
            }
            if (f9906g.containsKey(tag.name())) {
                f9906g.remove(tag.name());
            }
            C3222b.m12218a().mo10143b(tag.name());
        }
    }

    /* renamed from: a */
    public static String m12197a(String str) {
        String str2 = f9901b;
        if (TextUtils.equals(str, Tag.LiveFeedInit.name()) || TextUtils.equals(str, Tag.LiveFeedPreview.name()) || TextUtils.equals(str, Tag.LiveFeedScroll.name())) {
            return f9901b;
        }
        if (TextUtils.equals(str, Tag.CreateStartLivePreview.name()) || TextUtils.equals(str, Tag.CreateLive.name()) || TextUtils.equals(str, Tag.CreateStartLivePreview.name()) || TextUtils.equals(str, Tag.ShowBInteractionFirstWidget.name())) {
            return f9902c;
        }
        if (TextUtils.equals(str, Tag.StartLivePlay.name()) || TextUtils.equals(str, Tag.ScrollWatchLivePlay.name()) || TextUtils.equals(str, Tag.ShowCInteractionFirstWidget.name()) || TextUtils.equals(str, Tag.ShowBarrage.name()) || TextUtils.equals(str, Tag.ShowVideoGift.name())) {
            return f9903d;
        }
        if (TextUtils.equals(str, Tag.LivePk.name())) {
            return f9904e;
        }
        return str2;
    }

    /* renamed from: a */
    public static HashMap<String, String> m12198a(String str, String str2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    /* renamed from: a */
    public static void m12200a(Tag tag, HashMap<String, String> hashMap) {
        if (f9900a && f9905f.containsKey(tag.name())) {
            f9906g.put(tag.name(), Long.valueOf(SystemClock.elapsedRealtime()));
            m12202a(tag.name(), hashMap);
        }
    }

    /* renamed from: a */
    private static void m12202a(String str, HashMap<String, String> hashMap) {
        if (f9906g.containsKey(str) && f9905f.containsKey(str)) {
            long longValue = ((Long) f9906g.get(str)).longValue() - ((Long) f9905f.get(str)).longValue();
            String str2 = "";
            if (hashMap != null) {
                str2 = C2317a.m9932a().mo15979b((Object) hashMap);
            }
            f9906g.remove(str);
            f9905f.remove(str);
            m12201a(str, longValue, str2);
        }
    }

    /* renamed from: a */
    public static void m12203a(JSONObject jSONObject, String str, double d) {
        try {
            jSONObject.put(str, d);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static void m12204a(JSONObject jSONObject, String str, long j) {
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static void m12201a(String str, long j, String str2) {
        JSONObject jSONObject = new JSONObject();
        m12205a(jSONObject, "biz", str);
        m12204a(jSONObject, "duration", j);
        if (!TextUtils.isEmpty(str2)) {
            m12205a(jSONObject, "extra", str2);
        }
        C3172e.m12008b(m12197a(str), 0, jSONObject);
    }

    /* renamed from: a */
    public static void m12205a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }
}
