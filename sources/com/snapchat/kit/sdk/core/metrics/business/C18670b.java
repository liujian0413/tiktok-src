package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.p807b.C18665a;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.b */
public final class C18670b implements C47373d<C18668a> {

    /* renamed from: a */
    private final C47883a<SharedPreferences> f50450a;

    /* renamed from: b */
    private final C47883a<C18676h> f50451b;

    /* renamed from: c */
    private final C47883a<MetricsClient> f50452c;

    /* renamed from: d */
    private final C47883a<C18665a> f50453d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18668a get() {
        return new C18668a((SharedPreferences) this.f50450a.get(), (C18676h) this.f50451b.get(), (MetricsClient) this.f50452c.get(), (C18665a) this.f50453d.get());
    }

    /* renamed from: a */
    public static C47373d<C18668a> m61195a(C47883a<SharedPreferences> aVar, C47883a<C18676h> aVar2, C47883a<MetricsClient> aVar3, C47883a<C18665a> aVar4) {
        return new C18670b(aVar, aVar2, aVar3, aVar4);
    }

    private C18670b(C47883a<SharedPreferences> aVar, C47883a<C18676h> aVar2, C47883a<MetricsClient> aVar3, C47883a<C18665a> aVar4) {
        this.f50450a = aVar;
        this.f50451b = aVar2;
        this.f50452c = aVar3;
        this.f50453d = aVar4;
    }
}
