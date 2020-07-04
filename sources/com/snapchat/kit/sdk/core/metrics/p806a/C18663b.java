package com.snapchat.kit.sdk.core.metrics.p806a;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p807b.C18665a;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a.b */
public final class C18663b implements C47373d<C18661a> {

    /* renamed from: a */
    private final C47883a<SharedPreferences> f50435a;

    /* renamed from: b */
    private final C47883a<MetricsClient> f50436b;

    /* renamed from: c */
    private final C47883a<C18665a> f50437c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18661a get() {
        return new C18661a((SharedPreferences) this.f50435a.get(), (MetricsClient) this.f50436b.get(), (C18665a) this.f50437c.get());
    }

    /* renamed from: a */
    public static C47373d<C18661a> m61182a(C47883a<SharedPreferences> aVar, C47883a<MetricsClient> aVar2, C47883a<C18665a> aVar3) {
        return new C18663b(aVar, aVar2, aVar3);
    }

    private C18663b(C47883a<SharedPreferences> aVar, C47883a<MetricsClient> aVar2, C47883a<C18665a> aVar3) {
        this.f50435a = aVar;
        this.f50436b = aVar2;
        this.f50437c = aVar3;
    }
}
