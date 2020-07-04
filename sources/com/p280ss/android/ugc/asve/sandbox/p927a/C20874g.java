package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m.C20942a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.g */
public final class C20874g extends C20942a {

    /* renamed from: a */
    private final WeakReference<C19629a> f56299a;

    /* renamed from: a */
    public final void mo56384a() {
        C19629a aVar = (C19629a) this.f56299a.get();
        if (aVar != null) {
            aVar.mo52246a();
        }
    }

    public C20874g(C19629a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f56299a = new WeakReference<>(aVar);
    }
}
