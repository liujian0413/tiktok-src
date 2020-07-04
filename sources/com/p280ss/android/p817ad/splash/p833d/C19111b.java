package com.p280ss.android.p817ad.splash.p833d;

import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19062u;
import com.p280ss.android.p817ad.splash.p836g.C19132j;

/* renamed from: com.ss.android.ad.splash.d.b */
public class C19111b {

    /* renamed from: a */
    private static volatile C19111b f51693a;

    /* renamed from: b */
    private long f51694b;

    private C19111b() {
    }

    /* renamed from: a */
    public static C19111b m62633a() {
        if (f51693a == null) {
            synchronized (C19111b.class) {
                if (f51693a == null) {
                    f51693a = new C19111b();
                }
            }
        }
        return f51693a;
    }

    /* renamed from: c */
    private boolean m62635c() {
        if (System.currentTimeMillis() - this.f51694b > 3600000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo50818b() {
        if (m62635c() && C19025f.m62100N() != null) {
            C19110a a = C19025f.m62100N().mo50820a();
            if (a != null) {
                this.f51694b = System.currentTimeMillis();
                C19062u.m62368a().mo50620f(a.toString());
                m62634a(a.f51689a);
            }
        }
    }

    /* renamed from: a */
    private static void m62634a(String str) {
        String str2 = "";
        if (C19025f.m62159f() != null) {
            str2 = C19025f.m62159f().mo50358c();
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!C19132j.m62736a(str)) {
            C19062u.m62368a().mo50616d(str).mo50628j();
        }
    }
}
