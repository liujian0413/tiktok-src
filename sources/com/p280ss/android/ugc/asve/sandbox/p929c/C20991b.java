package com.p280ss.android.ugc.asve.sandbox.p929c;

import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21029h;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20908b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20908b.C20909a;
import java.lang.reflect.Proxy;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.b */
public final class C20991b implements C20673b {

    /* renamed from: a */
    private final C21029h f56433a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.c.b$a */
    public static final class C20992a extends C20909a {

        /* renamed from: a */
        final /* synthetic */ Runnable f56434a;

        /* renamed from: a */
        public final void mo56421a() {
            Runnable runnable = this.f56434a;
            if (runnable != null) {
                runnable.run();
            }
        }

        C20992a(Runnable runnable) {
            this.f56434a = runnable;
        }
    }

    /* renamed from: a */
    public final boolean mo55877a() {
        return this.f56433a.mo56552a();
    }

    /* renamed from: a */
    public final void mo55876a(boolean z) {
        this.f56433a.mo56551a(z);
    }

    /* renamed from: b */
    public final void mo55878b(boolean z) {
        this.f56433a.mo56553b(z);
    }

    /* renamed from: c */
    public final void mo55879c(boolean z) {
        this.f56433a.mo56554c(z);
    }

    /* renamed from: a */
    public final void mo55874a(Runnable runnable) {
        this.f56433a.mo56549a((C20908b) new C20992a(runnable));
    }

    public C20991b(C21029h hVar) {
        Object newProxyInstance = Proxy.newProxyInstance(C21029h.class.getClassLoader(), new Class[]{C21029h.class}, new C20996d(hVar));
        if (newProxyInstance != null) {
            this.f56433a = (C21029h) newProxyInstance;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteDuetService");
    }

    /* renamed from: a */
    public final void mo55875a(String str, String str2, float f, float f2, float f3, boolean z) {
        C7573i.m23587b(str, "duetVideoPath");
        this.f56433a.mo56550a(str, str2, f, f2, f3, z);
    }
}
