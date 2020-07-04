package com.p280ss.android.ugc.aweme.metrics.p1393a;

import android.content.Context;
import android.content.SharedPreferences;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.utils.C43048db;
import com.p280ss.android.ugc.aweme.utils.OneTimeEnum;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.a.a */
public final class C33221a {

    /* renamed from: a */
    private static boolean f86468a = C43048db.m136578a().mo104720a(OneTimeEnum.VIDEO_REQ);

    /* renamed from: b */
    private static volatile long f86469b = -1;

    /* renamed from: c */
    private static volatile boolean f86470c = false;

    /* renamed from: a */
    public static boolean m107193a() {
        return f86468a;
    }

    /* renamed from: b */
    public static void m107194b() {
        f86468a = false;
    }

    /* renamed from: d */
    private static void m107196d() {
        C7285c.m22838a(C6399b.m19921a(), "ies_log_flag", 0).edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
    }

    /* renamed from: c */
    public static boolean m107195c() {
        long j;
        if (f86470c) {
            return true;
        }
        Context a = C6399b.m19921a();
        if (f86469b <= 0) {
            SharedPreferences a2 = C7285c.m22838a(a, "ies_log_flag", 0);
            String str = "first_install_time_key";
            if (C28580o.m93833c()) {
                j = -1;
            } else {
                j = 1;
            }
            long j2 = a2.getLong(str, j);
            f86469b = j2;
            if (j2 <= 0) {
                f86469b = System.currentTimeMillis();
                m107196d();
            }
        }
        if (f86469b + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!f86470c) {
            f86470c = true;
            C7285c.m22838a(a, "ies_log_flag", 0).edit().putLong("first_install_time_key", 1).apply();
        }
        return true;
    }

    /* renamed from: a */
    public static void m107190a(String str, JSONObject jSONObject) {
        m107191a(str, jSONObject, System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m107189a(String str, String str2, String str3) {
        if (!m107195c()) {
            C1592h.m7853a((Callable<TResult>) new C33223c<TResult>(str, str2, str3, C6399b.m19921a()));
        }
    }

    /* renamed from: a */
    public static void m107191a(String str, JSONObject jSONObject, long j) {
        if (!m107195c()) {
            Context a = C6399b.m19921a();
            try {
                jSONObject.put("local_time", j / 1000);
            } catch (JSONException unused) {
            }
            m107188a(a, str, "low_retain", jSONObject);
        }
    }

    /* renamed from: a */
    private static void m107188a(Context context, String str, String str2, JSONObject jSONObject) {
        C1592h.m7853a((Callable<TResult>) new C33224d<TResult>(jSONObject, str, str2, context));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m107185a(String str, String str2, String str3, Context context) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", str);
        jSONObject.put("label", str2);
        jSONObject.put("session_id", str3);
        jSONObject.put("scene", "low_retain");
        jSONObject.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject);
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m107186a(JSONObject jSONObject, String str, String str2, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str3 = (String) keys.next();
                jSONObject2.put(str3, jSONObject.get(str3));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", C10985c.m32187c());
        jSONObject2.put("scene", str2);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    /* renamed from: a */
    public static void m107192a(String str, JSONObject jSONObject, String str2, String str3) {
        if (!m107195c()) {
            C33222b bVar = new C33222b(jSONObject, str, str2, str3, C6399b.m19921a());
            C1592h.m7853a((Callable<TResult>) bVar);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m107187a(JSONObject jSONObject, String str, String str2, String str3, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str4 = (String) keys.next();
                jSONObject2.put(str4, jSONObject.get(str4));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put(str2, str3);
        jSONObject2.put("session_id", C10985c.m32187c());
        jSONObject2.put("scene", "low_retain");
        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }
}
