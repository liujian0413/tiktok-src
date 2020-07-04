package com.p280ss.android.p817ad.splash.core.p829d;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.C19155q;
import com.p280ss.android.p817ad.splash.core.C18962a;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19044j;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.d.a */
public final class C19016a {

    /* renamed from: a */
    private static ExecutorService f51361a = C19021b.m62079a();

    /* renamed from: a */
    public static void m62076a() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                C19025f.m62089C().submit(new Runnable() {
                    public final void run() {
                        C18962a.m61921a();
                        C18962a.m61922b();
                    }
                });
            }
        }, C19025f.m62133ab());
    }

    /* renamed from: a */
    public static void m62077a(final C19001b bVar) {
        final Future submit = C19025f.m62189t().submit(new Runnable() {
            public final void run() {
                if (C19025f.m62192w() != null && C19044j.m62231a().f51467h) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    String f = C19129h.m62724f();
                    JSONObject jSONObject = new JSONObject();
                    int i = 0;
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("ad_id", bVar.mo50375n());
                        jSONObject2.put("timestamp", currentTimeMillis);
                        jSONObject2.put("position", 0);
                        jSONObject2.put("log_extra", bVar.mo50376p());
                        jSONArray.put(jSONObject2);
                        jSONObject.put("ads", jSONArray);
                    } catch (Exception unused) {
                    }
                    if (!TextUtils.isEmpty(f)) {
                        while (i < 4) {
                            C19155q a = C19025f.m62192w().mo50859a(f, 3, null, jSONObject);
                            if (a != null && a.f51783b && C19016a.m62078a(a.f51782a)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        });
        f51361a.execute(new Runnable() {
            public final void run() {
                try {
                    submit.get(5, TimeUnit.SECONDS);
                } catch (Exception unused) {
                } finally {
                    C19016a.m62076a();
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m62078a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optInt("code", -1) != 30001) {
            return false;
        }
        return true;
    }
}
