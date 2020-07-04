package com.p280ss.android.ugc.asve.sandbox.p927a;

import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20935k.C20936a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.n */
public final class C20883n extends C20936a {

    /* renamed from: a */
    private final WeakReference<C19622b> f56312a;

    public C20883n(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f56312a = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final void mo56392a(int i) {
        C19622b bVar = (C19622b) this.f56312a.get();
        if (bVar != null) {
            bVar.mo52204a(i);
        }
    }

    /* renamed from: a */
    public final void mo56393a(int i, int i2) {
        C19622b bVar = (C19622b) this.f56312a.get();
        if (bVar != null) {
            bVar.mo52205a(i, i2);
        }
    }
}
