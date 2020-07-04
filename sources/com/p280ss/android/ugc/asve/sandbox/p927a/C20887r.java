package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.camera.C19667g.C19672a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t.C20963a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.r */
public final class C20887r extends C20963a {

    /* renamed from: a */
    private final WeakReference<C19672a> f56316a;

    /* renamed from: a */
    public final void mo56398a() {
        C19672a aVar = (C19672a) this.f56316a.get();
        if (aVar != null) {
            aVar.mo52343a();
        }
    }

    public C20887r(C19672a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f56316a = new WeakReference<>(aVar);
    }
}
