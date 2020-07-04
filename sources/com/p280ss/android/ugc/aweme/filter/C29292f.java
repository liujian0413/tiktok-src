package com.p280ss.android.ugc.aweme.filter;

import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.f */
public final class C29292f implements C29229ay {

    /* renamed from: a */
    private final EffectFilterAdapter f77265a;

    /* renamed from: a */
    public final BaseAdapter<C29296g> mo74835a() {
        return this.f77265a;
    }

    /* renamed from: b */
    public final void mo74840b() {
        this.f77265a.mo74660f();
    }

    /* renamed from: c */
    public final C29240bc mo74843c() {
        return this.f77265a.f76910e;
    }

    /* renamed from: c */
    public final int mo74842c(C29296g gVar) {
        return this.f77265a.mo74653a(gVar);
    }

    public C29292f(EffectFilterAdapter effectFilterAdapter) {
        C7573i.m23587b(effectFilterAdapter, "adapter");
        this.f77265a = effectFilterAdapter;
    }

    /* renamed from: a */
    public final void mo74836a(int i) {
        this.f77265a.mo74655b(i);
    }

    /* renamed from: b */
    public final C29296g mo74839b(int i) {
        C29296g c = this.f77265a.mo74657c(i);
        C7573i.m23582a((Object) c, "adapter.getFilterBeanByIndex(newFilterIndex)");
        return c;
    }

    /* renamed from: a */
    public final void mo74837a(C29249bi biVar) {
        this.f77265a.f76908c = biVar;
    }

    /* renamed from: b */
    public final void mo74841b(C29296g gVar) {
        this.f77265a.mo74658c(gVar);
    }

    /* renamed from: a */
    public final void mo74838a(C29296g gVar) {
        this.f77265a.mo74656b(gVar);
    }
}
