package com.p280ss.android.ugc.aweme.p1052b;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.p1052b.C23150e.C23151a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.b.f */
public final class C23152f extends C23154h {

    /* renamed from: e */
    private volatile boolean f61098e;

    public C23152f(Activity activity) {
        C7573i.m23587b(activity, "activity");
        super(activity);
    }

    /* renamed from: a */
    public final void mo60293a(C23151a aVar, long j) {
        C7573i.m23587b(aVar, "target");
        if (!this.f61098e) {
            synchronized (this) {
                if (!this.f61098e) {
                    this.f61098e = true;
                    super.mo60293a(aVar, j);
                }
            }
        }
    }
}
