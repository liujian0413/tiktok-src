package com.p280ss.android.p817ad.splash.p834e;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.p817ad.splash.C19155q;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ad.splash.e.a */
public class C19116a {

    /* renamed from: a */
    private static volatile C19116a f51698a;

    private C19116a() {
    }

    /* renamed from: a */
    public static C19116a m62645a() {
        if (f51698a == null) {
            synchronized (C19116a.class) {
                if (f51698a == null) {
                    f51698a = new C19116a();
                }
            }
        }
        return f51698a;
    }

    /* renamed from: a */
    public final void mo50824a(final boolean z) {
        if (C19025f.m62192w() != null) {
            long ac = C19025f.m62134ac();
            if (ac <= 0) {
                ac = 2000;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public final void run() {
                    C19025f.m62189t().submit(new Callable<C19155q>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public C19155q call() throws Exception {
                            if (C19025f.m62192w() == null) {
                                return null;
                            }
                            String a = C19129h.m62698a(z);
                            if (!C19132j.m62736a(a)) {
                                return C19025f.m62192w().mo50863b(a);
                            }
                            return null;
                        }
                    });
                }
            }, ac);
        }
    }
}
