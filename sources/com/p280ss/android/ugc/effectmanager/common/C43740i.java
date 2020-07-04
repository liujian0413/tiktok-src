package com.p280ss.android.ugc.effectmanager.common;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.network.p1741a.C43860a;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.effectmanager.common.i */
public final class C43740i {

    /* renamed from: a */
    public Map<String, C43860a> f113236a;

    /* renamed from: b */
    private boolean f113237b;

    /* renamed from: c */
    private ExecutorService f113238c;

    /* renamed from: d */
    private boolean f113239d;

    /* renamed from: e */
    private C43680a f113240e;

    /* renamed from: com.ss.android.ugc.effectmanager.common.i$a */
    public static class C43742a {

        /* renamed from: a */
        public ExecutorService f113243a;

        /* renamed from: b */
        public boolean f113244b;

        /* renamed from: c */
        public C43680a f113245c;

        /* renamed from: a */
        public final C43742a mo105786a(C43680a aVar) {
            this.f113245c = aVar;
            return this;
        }

        /* renamed from: a */
        public final C43742a mo105787a(ExecutorService executorService, boolean z) {
            this.f113243a = executorService;
            return this;
        }
    }

    /* renamed from: b */
    private void m138613b() {
        if (!this.f113237b) {
            throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
        }
    }

    /* renamed from: a */
    public final void mo105781a() {
        if (this.f113239d) {
            this.f113238c.shutdown();
        }
    }

    /* renamed from: a */
    public final void mo105783a(C43742a aVar) {
        this.f113238c = aVar.f113243a;
        this.f113239d = aVar.f113244b;
        this.f113240e = aVar.f113245c;
        this.f113237b = true;
        this.f113236a = new HashMap();
    }

    /* renamed from: a */
    public final void mo105782a(final C43724a aVar) {
        m138613b();
        for (C43860a a : this.f113236a.values()) {
            a.mo106117a(aVar);
        }
        this.f113238c.execute(new Runnable() {
            public final void run() {
                aVar.mo105685a();
            }
        });
    }

    /* renamed from: a */
    public final void mo105784a(String str, C43860a aVar) {
        this.f113236a.put(str, aVar);
    }
}
