package com.bytedance.jedi.model.p604f;

import com.bytedance.jedi.model.p601c.C11785d;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.jedi.model.f.d */
public final class C11822d implements C11821c {

    /* renamed from: a */
    private C11785d<?, ?> f31615a;

    /* renamed from: b */
    private C11785d<?, ?> f31616b;

    /* renamed from: c */
    private final C7321c f31617c;

    /* renamed from: a */
    public final void mo29370a() {
        if (!this.f31617c.isDisposed()) {
            this.f31615a = null;
            this.f31616b = null;
            this.f31617c.dispose();
        }
    }

    public C11822d(C11785d<?, ?> dVar, C11785d<?, ?> dVar2, C7321c cVar) {
        C7573i.m23587b(cVar, "disposable");
        this.f31615a = dVar;
        this.f31616b = dVar2;
        this.f31617c = cVar;
    }
}
