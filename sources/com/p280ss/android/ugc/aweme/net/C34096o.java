package com.p280ss.android.ugc.aweme.net;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.o */
public final class C34096o {

    /* renamed from: a */
    public static final C34096o f88858a = new C34096o();

    /* renamed from: b */
    private static long f88859b;

    /* renamed from: c */
    private static int f88860c = 30;

    private C34096o() {
    }

    /* renamed from: a */
    public static void m109763a() {
        f88859b = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public final void mo86750a(String str) {
        C7573i.m23587b(str, "abKey");
        m109764a(SystemClock.uptimeMillis() - f88859b, str);
    }

    /* renamed from: a */
    public static void m109765a(Map<?, ?> map) {
        if (map != null && map.size() >= f88860c) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retrofit_map_size", map.size());
            } catch (JSONException unused) {
            }
            f88860c *= 2;
            C6893q.m21452b("retrofit_map_size", "", jSONObject);
        }
    }

    /* renamed from: a */
    private static void m109764a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("first_feed_duration", j);
            jSONObject.put("is_ab_test", str);
        } catch (JSONException unused) {
        }
        C6893q.m21452b("first_feed_duration", "", jSONObject);
    }
}
