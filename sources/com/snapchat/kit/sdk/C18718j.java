package com.snapchat.kit.sdk;

import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.business.C18673e;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.security.C18701h;
import dagger.p1859a.C47372c;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;
import okhttp3.OkHttpClient;

/* renamed from: com.snapchat.kit.sdk.j */
public final class C18718j implements C47373d<OAuth2Manager> {

    /* renamed from: a */
    private final C18713e f50541a;

    /* renamed from: b */
    private final C47883a<C18701h> f50542b;

    /* renamed from: c */
    private final C47883a<C18647a> f50543c;

    /* renamed from: d */
    private final C47883a<OkHttpClient> f50544d;

    /* renamed from: e */
    private final C47883a<C6600e> f50545e;

    /* renamed from: f */
    private final C47883a<MetricQueue<ServerEvent>> f50546f;

    /* renamed from: g */
    private final C47883a<C18673e> f50547g;

    /* renamed from: h */
    private final C47883a<MetricQueue<OpMetric>> f50548h;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public OAuth2Manager get() {
        return (OAuth2Manager) C47375f.m147940a(this.f50541a.mo49223a((C18701h) this.f50542b.get(), (C18647a) this.f50543c.get(), (OkHttpClient) this.f50544d.get(), (C6600e) this.f50545e.get(), C47372c.m147938b(this.f50546f), (C18673e) this.f50547g.get(), C47372c.m147938b(this.f50548h)), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18718j(C18713e eVar, C47883a<C18701h> aVar, C47883a<C18647a> aVar2, C47883a<OkHttpClient> aVar3, C47883a<C6600e> aVar4, C47883a<MetricQueue<ServerEvent>> aVar5, C47883a<C18673e> aVar6, C47883a<MetricQueue<OpMetric>> aVar7) {
        this.f50541a = eVar;
        this.f50542b = aVar;
        this.f50543c = aVar2;
        this.f50544d = aVar3;
        this.f50545e = aVar4;
        this.f50546f = aVar5;
        this.f50547g = aVar6;
        this.f50548h = aVar7;
    }

    /* renamed from: a */
    public static C47373d<OAuth2Manager> m61293a(C18713e eVar, C47883a<C18701h> aVar, C47883a<C18647a> aVar2, C47883a<OkHttpClient> aVar3, C47883a<C6600e> aVar4, C47883a<MetricQueue<ServerEvent>> aVar5, C47883a<C18673e> aVar6, C47883a<MetricQueue<OpMetric>> aVar7) {
        C18718j jVar = new C18718j(eVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
        return jVar;
    }
}
