package com.p280ss.android.monitor.privacy;

import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.b */
final /* synthetic */ class C19909b implements Callable {

    /* renamed from: a */
    private final C6399b f53963a;

    private C19909b(C6399b bVar) {
        this.f53963a = bVar;
    }

    /* renamed from: a */
    static Callable m65714a(C6399b bVar) {
        return new C19909b(bVar);
    }

    public final Object call() {
        return C6399b.m19937m();
    }
}
