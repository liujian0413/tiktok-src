package com.bytedance.android.p089a.p099b.p101b;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.d */
public final class C2251d {

    /* renamed from: a */
    public int f7511a = -1;

    /* renamed from: b */
    public String f7512b;

    /* renamed from: c */
    public Map<String, List<String>> f7513c;

    /* renamed from: d */
    public final long f7514d;

    /* renamed from: e */
    public final C2249c f7515e;

    /* renamed from: f */
    public Throwable f7516f;

    /* renamed from: a */
    public final boolean mo7989a() {
        if (this.f7511a < 200 || this.f7511a >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C2251d m9665a(Throwable th) {
        return m9666a(th, null);
    }

    /* renamed from: a */
    public static C2251d m9666a(Throwable th, C2249c cVar) {
        C2251d dVar = new C2251d(-1, th.getMessage(), null, cVar, th);
        return dVar;
    }

    public C2251d(int i, String str, Map<String, List<String>> map, C2249c cVar, Throwable th) {
        this.f7511a = i;
        this.f7512b = str;
        this.f7513c = map;
        this.f7515e = cVar;
        this.f7516f = th;
        this.f7514d = System.currentTimeMillis();
    }
}
