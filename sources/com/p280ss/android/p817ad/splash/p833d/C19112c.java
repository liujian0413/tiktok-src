package com.p280ss.android.p817ad.splash.p833d;

import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19045k;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p836g.C19128g;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.d.c */
public class C19112c {

    /* renamed from: a */
    private static volatile C19112c f51695a;

    /* renamed from: b */
    private volatile boolean f51696b;

    private C19112c() {
    }

    /* renamed from: a */
    public static C19112c m62637a() {
        if (f51695a == null) {
            synchronized (C19112c.class) {
                if (f51695a == null) {
                    f51695a = new C19112c();
                }
            }
        }
        return f51695a;
    }

    /* renamed from: b */
    public final void mo50819b() {
        if (C19025f.m62136ae() && C19025f.m62099M() && C19025f.m62100N() != null && C19128g.m62689b(C19025f.m62096J()) && !this.f51696b) {
            this.f51696b = true;
            C19129h.m62723e();
            C19129h.m62722d();
            new C19045k() {
                /* renamed from: a */
                public final void mo50368a(int i, Object obj) {
                }

                /* renamed from: b */
                public final void mo50369b(int i, Object obj) {
                    C18949a.m61865a().mo50362a("service_real_time_request_result", 0, (JSONObject) null);
                }
            };
            this.f51696b = false;
        }
    }
}
