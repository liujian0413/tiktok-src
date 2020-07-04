package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a;

import com.p280ss.android.ugc.effectmanager.common.p1729d.C43725b;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.a.a */
public final class C43784a extends C43725b {

    /* renamed from: b */
    public ProviderEffect f113282b;

    /* renamed from: c */
    public C43726c f113283c;

    /* renamed from: d */
    public long f113284d;

    /* renamed from: e */
    public int f113285e;

    /* renamed from: a */
    public final C43784a mo105838a(int i) {
        this.f113285e = i;
        return this;
    }

    /* renamed from: a */
    public final C43784a mo105839a(long j) {
        this.f113284d = j;
        return this;
    }

    public C43784a(ProviderEffect providerEffect, C43726c cVar) {
        this(providerEffect, cVar, -1, -1);
    }

    public C43784a(ProviderEffect providerEffect, C43726c cVar, int i, long j) {
        this.f113282b = providerEffect;
        this.f113283c = cVar;
        this.f113285e = i;
        this.f113284d = j;
    }
}
