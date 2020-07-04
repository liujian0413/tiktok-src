package com.bytedance.jedi.arch.internal;

import com.bytedance.jedi.arch.C11671u;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.jedi.arch.internal.g */
public final class C11639g<S> implements C11671u<S> {

    /* renamed from: a */
    private final C11671u<S> f31298a;

    /* renamed from: a */
    public final S mo29160a() {
        return this.f31298a.mo29160a();
    }

    /* renamed from: b */
    public final C7492s<S> mo29162b() {
        return this.f31298a.mo29162b();
    }

    public C11639g(C11671u<S> uVar) {
        C7573i.m23587b(uVar, "realStore");
        this.f31298a = uVar;
    }

    /* renamed from: a */
    public final void mo29161a(C7562b<? super S, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        this.f31298a.mo29161a(bVar);
    }

    /* renamed from: b */
    public final void mo29163b(C7562b<? super S, ? extends S> bVar) {
        C7573i.m23587b(bVar, "stateReducer");
        this.f31298a.mo29163b(bVar);
    }
}
