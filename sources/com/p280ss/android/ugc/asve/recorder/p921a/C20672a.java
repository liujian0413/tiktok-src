package com.p280ss.android.ugc.asve.recorder.p921a;

import com.p280ss.android.medialib.presenter.C19764d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.a.a */
public final class C20672a implements C20673b {

    /* renamed from: a */
    private final C19764d f55833a;

    /* renamed from: a */
    public final boolean mo55877a() {
        return this.f55833a.mo52959a();
    }

    /* renamed from: a */
    public final void mo55874a(Runnable runnable) {
        C19764d.m65155a(runnable);
    }

    /* renamed from: a */
    public final void mo55876a(boolean z) {
        this.f55833a.mo52994c(z);
    }

    /* renamed from: b */
    public final void mo55878b(boolean z) {
        this.f55833a.f53653j = z;
    }

    /* renamed from: c */
    public final void mo55879c(boolean z) {
        this.f55833a.mo53009e(z);
    }

    public C20672a(C19764d dVar) {
        C7573i.m23587b(dVar, "mediaRecordPresenter");
        this.f55833a = dVar;
    }

    /* renamed from: a */
    public final void mo55875a(String str, String str2, float f, float f2, float f3, boolean z) {
        C7573i.m23587b(str, "duetVideoPath");
        this.f55833a.mo52950a(str, str2, f, f2, f3, z);
    }
}
