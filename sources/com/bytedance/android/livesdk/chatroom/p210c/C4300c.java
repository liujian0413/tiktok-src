package com.bytedance.android.livesdk.chatroom.p210c;

import android.text.TextUtils;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.c */
public final class C4300c {

    /* renamed from: a */
    public static boolean f12488a = true;

    /* renamed from: m */
    private static Map<String, Long> f12489m = new HashMap();

    /* renamed from: r */
    private static Map<String, Long> f12490r = new HashMap();

    /* renamed from: s */
    private static Map<String, String> f12491s = new HashMap();

    /* renamed from: b */
    public boolean f12492b;

    /* renamed from: c */
    public String f12493c;

    /* renamed from: d */
    private Map<String, Long> f12494d = new HashMap(6);

    /* renamed from: e */
    private int f12495e;

    /* renamed from: f */
    private String f12496f;

    /* renamed from: g */
    private String f12497g;

    /* renamed from: h */
    private String f12498h;

    /* renamed from: i */
    private String f12499i;

    /* renamed from: j */
    private int f12500j;

    /* renamed from: k */
    private long f12501k;

    /* renamed from: l */
    private boolean f12502l = false;

    /* renamed from: n */
    private long f12503n = 0;

    /* renamed from: o */
    private long f12504o = 0;

    /* renamed from: p */
    private long f12505p = 0;

    /* renamed from: q */
    private final String f12506q = "2.0";

    /* renamed from: a */
    public final void mo11974a(String str, String str2, String str3, String str4, String str5, long j, long j2, long j3, String str6, String str7) {
        this.f12501k = j3;
        int i = 1;
        this.f12495e = (!TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7)) ? 1 : 3;
        C3491h livePlayController = ((C3450b) C3596c.m13172a(C3450b.class)).getLivePlayController();
        if (livePlayController == null) {
            i = 0;
        } else if (livePlayController.mo21795g()) {
            i = 2;
        }
        this.f12500j = i;
        if (TextUtils.isEmpty(str2)) {
            str2 = "other";
        }
        this.f12496f = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "other";
        }
        this.f12497g = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = "other";
        }
        this.f12498h = str4;
        if (TextUtils.isEmpty(str5)) {
            str5 = "other";
        }
        this.f12499i = str5;
        this.f12503n = m14496f(str);
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        this.f12504o = j;
        if (j2 <= 0) {
            j2 = System.currentTimeMillis();
        }
        this.f12505p = j2;
        this.f12502l = false;
        this.f12494d.clear();
        this.f12494d.put(m14493d("duration"), Long.valueOf(this.f12504o));
        this.f12494d.put(m14493d("innerDuration"), Long.valueOf(this.f12505p));
    }

    /* renamed from: a */
    public final void mo11973a(String str) {
        m14484a(str, true);
    }

    /* renamed from: a */
    public final void mo11972a() {
        if (!this.f12502l) {
            long b = m14488b();
            m14492c();
            JSONObject d = m14494d();
            if (d == null) {
                this.f12494d.clear();
                return;
            }
            m14486a(d, "room_id", Long.valueOf(this.f12501k));
            m14487a(d, "enter_room_type", this.f12496f);
            m14487a(d, "enter_room_merge_type", this.f12497g);
            m14487a(d, "enter_room_method_type", this.f12498h);
            m14485a(d, "enterRoomStage", Integer.valueOf(this.f12495e));
            m14485a(d, "playerStatus", Integer.valueOf(this.f12500j));
            int i = 2;
            m14485a(d, "is_first", Integer.valueOf(f12488a ? 1 : 2));
            m14487a(d, "monitor_version", "2.0");
            m14486a(d, "stopDuration", Long.valueOf(this.f12503n));
            m14487a(d, "monitor_version", "2.0");
            m14487a(d, "enter_room_sub_type", this.f12499i);
            m14486a(d, "callback_duration", Long.valueOf(b));
            String str = "looper_enable";
            if (((Boolean) LiveSettingKeys.ENABLE_SINGLE_LOOPER_PLAYER_PULL_STREAM.mo10240a()).booleanValue()) {
                i = 1;
            }
            m14485a(d, str, Integer.valueOf(i));
            m14485a(d, "has_warmed_up", Integer.valueOf(this.f12492b ? 1 : 0));
            C3172e.m12000a("ttlive_audience_enter_room_full_new_all", 0, m14480a(d, "duration"), d);
            this.f12494d.clear();
            this.f12502l = true;
            f12488a = false;
        }
    }

    /* renamed from: b */
    private long m14488b() {
        if (TextUtils.isEmpty(this.f12493c)) {
            return 0;
        }
        String str = (String) f12491s.get(this.f12493c);
        if (TextUtils.isEmpty(this.f12493c)) {
            return 0;
        }
        Long l = (Long) f12490r.get(str);
        if (l == null || l.longValue() < 0) {
            return 0;
        }
        return System.currentTimeMillis() - l.longValue();
    }

    /* renamed from: c */
    private void m14492c() {
        if (!TextUtils.isEmpty(this.f12493c)) {
            String str = (String) f12491s.get(this.f12493c);
            f12491s.remove(this.f12493c);
            if (!TextUtils.isEmpty(str)) {
                Long l = (Long) f12490r.get(str);
                f12490r.remove(str);
                if (l != null && l.longValue() >= 0) {
                    this.f12494d.put(m14495e("pullDuration"), l);
                    this.f12494d.put(m14495e("duration"), l);
                    this.f12494d.put(m14495e("innerDuration"), l);
                }
            }
        }
    }

    /* renamed from: d */
    private JSONObject m14494d() {
        JSONObject jSONObject = new JSONObject();
        if (this.f12494d.isEmpty()) {
            return null;
        }
        long c = m14491c("duration");
        long c2 = m14491c("innerDuration");
        long c3 = m14491c("apiDuration");
        long c4 = m14491c("pullDuration");
        long b = m14489b("duration", "apiDuration");
        if (c < c3 + c4) {
            return null;
        }
        m14486a(jSONObject, "duration", Long.valueOf(c));
        m14486a(jSONObject, "innerDuration", Long.valueOf(c2));
        m14486a(jSONObject, "apiDuration", Long.valueOf(c3));
        m14486a(jSONObject, "pullDuration", Long.valueOf(c4));
        m14486a(jSONObject, "beginToApiReDuration", Long.valueOf(b));
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo11975b(String str) {
        m14484a(str, false);
    }

    /* renamed from: c */
    private long m14491c(String str) {
        long a = m14479a(this.f12494d, m14495e(str)) - m14479a(this.f12494d, m14493d(str));
        if (a <= 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: d */
    private static String m14493d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        return sb.toString();
    }

    /* renamed from: e */
    private static String m14495e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        return sb.toString();
    }

    /* renamed from: f */
    private static long m14496f(String str) {
        Long l = (Long) f12489m.get(str);
        f12489m.remove(str);
        if (l == null || l.longValue() < 0) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public static String m14481a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static void m14483a(String str, String str2) {
        f12491s.put(str, str2);
    }

    /* renamed from: a */
    private static long m14479a(Map<String, Long> map, String str) {
        Long l = (Long) map.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: a */
    private static long m14480a(JSONObject jSONObject, String str) {
        return Long.valueOf(jSONObject.optLong(str, 0)).longValue();
    }

    /* renamed from: b */
    private long m14489b(String str, String str2) {
        long a = m14479a(this.f12494d, m14493d(str2)) - m14479a(this.f12494d, m14493d(str));
        if (a <= 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public static void m14482a(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            f12489m.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public static void m14490b(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            f12490r.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private void m14484a(String str, boolean z) {
        String str2;
        if (this.f12495e != 1 || !TextUtils.equals(str, "apiDuration")) {
            if (z) {
                str2 = m14493d(str);
            } else {
                str2 = m14495e(str);
            }
            this.f12494d.put(str2, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    private static void m14485a(JSONObject jSONObject, String str, Integer num) {
        try {
            jSONObject.put(str, num);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m14486a(JSONObject jSONObject, String str, Long l) {
        try {
            jSONObject.put(str, l);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m14487a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
