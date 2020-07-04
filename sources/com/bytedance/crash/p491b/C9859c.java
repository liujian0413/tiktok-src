package com.bytedance.crash.p491b;

import android.os.SystemClock;
import com.bytedance.crash.p501j.C9952f;
import com.bytedance.crash.p501j.C9954g;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;

/* renamed from: com.bytedance.crash.b.c */
public final class C9859c implements Runnable {

    /* renamed from: b */
    public static long f26889b;

    /* renamed from: a */
    public final C9857b f26890a;

    /* renamed from: c */
    public final Runnable f26891c = new Runnable() {
        public final void run() {
            C9859c.this.f26890a.mo24428b();
            C9859c.f26889b = SystemClock.uptimeMillis();
            if (C9862e.m29106a()) {
                C9954g.m29460b().mo24597a(C9859c.this.f26891c, 500);
            } else {
                C9954g.m29460b().mo24597a(C9859c.this.f26891c, 500);
            }
        }
    };

    public final void run() {
        C9862e.m29105a(true);
        this.f26891c.run();
    }

    C9859c(C9857b bVar) {
        this.f26890a = bVar;
        C9952f.m29447a().mo24573a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, (Runnable) this);
        C9954g.m29460b().mo24597a(this.f26891c, (long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }
}
