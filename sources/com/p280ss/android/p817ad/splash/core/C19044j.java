package com.p280ss.android.p817ad.splash.core;

import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19008g;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.j */
public final class C19044j {

    /* renamed from: k */
    private static volatile C19044j f51459k;

    /* renamed from: a */
    public volatile List<C19001b> f51460a;

    /* renamed from: b */
    public volatile List<C19001b> f51461b;

    /* renamed from: c */
    public volatile C19008g f51462c;

    /* renamed from: d */
    public long f51463d = 1800000;

    /* renamed from: e */
    public long f51464e = 300000;

    /* renamed from: f */
    public volatile long f51465f = -1;

    /* renamed from: g */
    public volatile long f51466g = -1;

    /* renamed from: h */
    public boolean f51467h;

    /* renamed from: i */
    public int f51468i;

    /* renamed from: j */
    public String f51469j = "{}";

    private C19044j() {
    }

    /* renamed from: a */
    public static C19044j m62231a() {
        if (f51459k == null) {
            synchronized (C19044j.class) {
                if (f51459k == null) {
                    f51459k = new C19044j();
                }
            }
        }
        return f51459k;
    }

    /* renamed from: a */
    public final void mo50539a(long j) {
        if (j > 0) {
            this.f51465f = j;
        }
    }

    /* renamed from: b */
    public final void mo50540b(long j) {
        if (j > 0) {
            this.f51466g = j;
        }
    }
}
