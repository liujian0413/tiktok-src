package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import com.p280ss.android.p817ad.splash.C19146j;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p824b.C18956b;
import com.p280ss.android.p817ad.splash.p833d.C19112c;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.h */
public final class C19042h {

    /* renamed from: a */
    private static volatile boolean f51458a;

    private C19042h() {
    }

    /* renamed from: a */
    private static void m62227a(long j) {
        String str;
        new StringBuilder("SDK init duration: ").append(j);
        JSONObject jSONObject = new JSONObject();
        try {
            if (C19025f.m62138ag()) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
        C18949a.m61865a().mo50363a("service_sdk_init_duration", 0, jSONObject, null);
    }

    /* renamed from: a */
    public static void m62228a(Context context, C19146j jVar) {
        if (!f51458a) {
            synchronized (C19042h.class) {
                if (!f51458a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    m62229b(context.getApplicationContext(), jVar);
                    f51458a = true;
                    m62227a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m62229b(Context context, C19146j jVar) {
        ExecutorService executorService;
        ExecutorService executorService2;
        ExecutorService executorService3;
        C19025f.m62116a(context);
        if (jVar != null) {
            C19025f.m62118a(jVar.f51766m);
            C19025f.m62126a(jVar.f51759f);
            if (jVar.f51754a != null) {
                executorService = jVar.f51754a;
            } else {
                executorService = C19043i.m62230a();
            }
            C19025f.m62128a(executorService);
            if (jVar.f51755b != null) {
                executorService2 = jVar.f51755b;
            } else {
                executorService2 = C19043i.m62230a();
            }
            C19025f.m62146c(executorService2);
            if (jVar.f51756c != null) {
                executorService3 = jVar.f51756c;
            } else {
                executorService3 = C19043i.m62230a();
            }
            C19025f.m62153d(executorService3);
            C19025f.m62157e(jVar.f51757d);
            C19025f.m62120a(jVar.f51758e);
            C19025f.m62117a(jVar.f51760g);
            C19025f.m62169h(jVar.f51761h);
            C19025f.m62178l(jVar.f51762i);
            C19025f.m62180m(jVar.f51763j);
            C19025f.m62182n(jVar.f51764k);
            C19025f.m62184o(jVar.f51765l);
        } else {
            C19025f.m62128a(C19043i.m62230a());
            C19025f.m62146c(C19043i.m62230a());
            C19025f.m62153d(C19043i.m62230a());
        }
        if (C19025f.m62136ae()) {
            C18962a.m61921a();
            C18962a.m61923c();
            C19112c.m62637a().mo50819b();
            C18956b.m61883a().mo50370b();
        }
    }
}
