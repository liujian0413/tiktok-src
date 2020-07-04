package com.p280ss.android.ugc.aweme.p304ab;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ab.a */
public final class C6857a {

    /* renamed from: a */
    public boolean f19501a;

    /* renamed from: b */
    public long f19502b;

    /* renamed from: c */
    public long f19503c;

    /* renamed from: d */
    private Map<String, Long> f19504d;

    /* renamed from: e */
    private Map<String, Long> f19505e;

    /* renamed from: f */
    private Map<String, Long> f19506f;

    /* renamed from: g */
    private boolean f19507g;

    /* renamed from: h */
    private volatile int f19508h;

    /* renamed from: i */
    private boolean f19509i;

    /* renamed from: j */
    private HashMap<String, Long> f19510j;

    /* renamed from: com.ss.android.ugc.aweme.ab.a$b */
    static class C6859b {

        /* renamed from: a */
        public static final C6857a f19511a = new C6857a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ab.a$a */
    public static class C6860a implements ActivityLifecycleCallbacks {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: e */
    public static C6857a m21312e() {
        return C6859b.f19511a;
    }

    /* renamed from: a */
    public final void mo16818a() {
        this.f19501a = false;
    }

    /* renamed from: b */
    public final void mo16824b() {
        this.f19509i = false;
    }

    /* renamed from: c */
    public final void mo16829c() {
        this.f19507g = true;
    }

    /* renamed from: f */
    private static boolean m21313f() {
        return C6887b.m21436b().mo16896a(C6399b.m19921a(), "log_release_build_version_v4").isEmpty();
    }

    /* renamed from: g */
    private boolean m21314g() {
        if (this.f19505e.isEmpty() || this.f19507g) {
            return m21315h();
        }
        return false;
    }

    private C6857a() {
        this.f19504d = new ConcurrentHashMap();
        this.f19505e = new ConcurrentHashMap();
        this.f19506f = new ConcurrentHashMap();
        this.f19501a = true;
        this.f19507g = false;
        this.f19508h = -1;
        this.f19509i = true;
        this.f19510j = new HashMap<>();
    }

    /* renamed from: i */
    private static boolean m21316i() {
        Context a = C6399b.m19921a();
        String g = C6399b.m19931g();
        String a2 = C6887b.m21436b().mo16896a(a, "log_release_build_version_v4");
        if (g.isEmpty()) {
            g = "default_version";
        }
        if (a2.equals(g)) {
            return false;
        }
        C6887b.m21436b().mo16901a(a, "log_release_build_version_v4", g);
        return true;
    }

    /* renamed from: j */
    private void m21317j() {
        HashMap<String, Long> hashMap = this.f19510j;
        if (hashMap != null && !hashMap.isEmpty()) {
            long j = 0;
            for (Entry value : hashMap.entrySet()) {
                j += ((Long) value.getValue()).longValue();
            }
            this.f19506f.put("load_sp_total", Long.valueOf(j));
        }
    }

    /* renamed from: h */
    private boolean m21315h() {
        Long l = (Long) this.f19506f.get("cold_boot_application_to_main");
        if (l != null && l.longValue() > 1000) {
            return false;
        }
        Long l2 = (Long) this.f19506f.get("cold_boot_application_to_splash");
        if (l2 != null && l2.longValue() > 1000) {
            return false;
        }
        Long l3 = (Long) this.f19506f.get("cold_boot_splash_to_main");
        if (l3 != null && l3.longValue() > 1000) {
            return false;
        }
        Long l4 = (Long) this.f19506f.get("cold_boot_main_create_to_resume");
        if (l4 == null || l4.longValue() <= 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo16831d() {
        if (m21313f()) {
            m21311c("first_feed_show_time_new_user");
            m21316i();
        } else if (!this.f19501a || !m21314g() || m21316i()) {
            return;
        } else {
            if (this.f19507g) {
                m21311c("first_feed_show_time_v3_cache");
            } else {
                m21311c("first_feed_show_time_v3");
            }
        }
        mo16818a();
        mo16824b();
        this.f19504d.clear();
        this.f19505e.clear();
        this.f19506f.clear();
    }

    /* renamed from: a */
    public final void mo16819a(int i) {
        if (this.f19508h == -1) {
            this.f19508h = i;
        }
    }

    /* renamed from: b */
    public final boolean mo16828b(String str) {
        if (this.f19506f.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo16823a(String str) {
        if (this.f19504d.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m21311c(String str) {
        int i;
        boolean f = m21313f();
        m21317j();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        int i2 = 1;
        try {
            jSONObject.put("app2main5s", 1);
            if (!str.equals("first_feed_show_time_new_user") || (this.f19509i && m21315h())) {
                for (Entry entry : this.f19506f.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            } else {
                jSONObject2.put("new_user_report_bad_case", 1);
            }
            String str2 = "cold_boot_use_cache";
            if (this.f19507g) {
                i = 1;
            } else {
                i = 2;
            }
            jSONObject2.put(str2, i);
            String str3 = "is_new_user";
            if (!f) {
                i2 = 2;
            }
            jSONObject2.put(str3, i2);
            jSONObject2.put("convert_type", this.f19508h);
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException unused) {
        }
        C6379c.m19827a(str, jSONObject4, jSONObject3);
        if (!f) {
            C6379c.m19827a("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        C6759a.m20910a("first_feed_show_time_v3", jSONObject2);
    }

    /* renamed from: b */
    public final void mo16827b(String str, boolean z) {
        mo16826b(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: a */
    public final void mo16822a(String str, boolean z) {
        mo16821a(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: a */
    public final void mo16820a(String str, long j) {
        Long l = (Long) this.f19506f.get(str);
        if (l != null) {
            j += l.longValue();
        }
        this.f19506f.put(str, Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo16825b(String str, long j) {
        if (j > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            this.f19510j.put(str, Long.valueOf(SystemClock.uptimeMillis() - j));
        }
    }

    /* renamed from: c */
    public final void mo16830c(String str, long j, boolean z) {
        if (this.f19506f.get(str) == null) {
            this.f19506f.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo16821a(String str, long j, boolean z) {
        if (this.f19504d.get(str) != null) {
            if (z) {
                mo16818a();
            }
            return;
        }
        this.f19504d.put(str, Long.valueOf(j));
        if (z) {
            this.f19505e.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo16826b(String str, long j, boolean z) {
        Long l = (Long) this.f19504d.get(str);
        if (l != null) {
            if (this.f19506f.get(str) == null) {
                this.f19506f.put(str, Long.valueOf(j - l.longValue()));
            }
            if (z) {
                this.f19505e.remove(str);
            }
        } else if (z) {
            mo16818a();
        } else {
            this.f19506f.put(str, Long.valueOf(0));
        }
    }
}
