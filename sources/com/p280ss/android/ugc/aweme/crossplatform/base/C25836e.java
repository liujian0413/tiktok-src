package com.p280ss.android.ugc.aweme.crossplatform.base;

import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25917d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.base.e */
public final class C25836e {

    /* renamed from: a */
    private AtomicBoolean f68312a;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.base.e$a */
    static class C25838a {

        /* renamed from: a */
        public static C25836e f68313a = new C25836e();
    }

    /* renamed from: a */
    public static C25836e m84972a() {
        return C25838a.f68313a;
    }

    private C25836e() {
        this.f68312a = new AtomicBoolean(false);
    }

    /* renamed from: b */
    public final void mo67156b() {
        if (this.f68312a.compareAndSet(false, true)) {
            C25917d.m85213a();
        }
    }
}
