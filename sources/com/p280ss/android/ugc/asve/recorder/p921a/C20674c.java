package com.p280ss.android.ugc.asve.recorder.p921a;

import com.p280ss.android.vesdk.C45330m;
import com.p280ss.android.vesdk.C45382z;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.a.c */
public final class C20674c implements C20673b {

    /* renamed from: a */
    private final C45382z f55834a;

    /* renamed from: a */
    public final boolean mo55877a() {
        return this.f55834a.mo108681a();
    }

    /* renamed from: a */
    public final void mo55874a(Runnable runnable) {
        this.f55834a.mo108671a(runnable);
    }

    /* renamed from: b */
    public final void mo55878b(boolean z) {
        this.f55834a.mo108718e(z);
    }

    /* renamed from: c */
    public final void mo55879c(boolean z) {
        this.f55834a.mo108722f(z);
    }

    public C20674c(C45382z zVar) {
        C7573i.m23587b(zVar, "recoder");
        this.f55834a = zVar;
    }

    /* renamed from: a */
    public final void mo55876a(boolean z) {
        this.f55834a.mo108709c(z);
    }

    /* renamed from: a */
    public final void mo55875a(String str, String str2, float f, float f2, float f3, boolean z) {
        C7573i.m23587b(str, "duetVideoPath");
        C45382z zVar = this.f55834a;
        if (str2 == null) {
            str2 = "";
        }
        C45330m mVar = new C45330m(str, str2, f, f2, f3, z);
        zVar.mo108663a(mVar);
    }
}
