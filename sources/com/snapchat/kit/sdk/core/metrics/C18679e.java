package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.business.C18668a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import java.util.concurrent.ScheduledExecutorService;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.e */
public final class C18679e implements C47373d<C18653a<ServerEvent>> {

    /* renamed from: a */
    private final C47883a<C18668a> f50463a;

    /* renamed from: b */
    private final C47883a<ScheduledExecutorService> f50464b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18653a<ServerEvent> get() {
        return (C18653a) C47375f.m147940a(C18677c.m61212a((C18668a) this.f50463a.get(), (ScheduledExecutorService) this.f50464b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18679e(C47883a<C18668a> aVar, C47883a<ScheduledExecutorService> aVar2) {
        this.f50463a = aVar;
        this.f50464b = aVar2;
    }

    /* renamed from: a */
    public static C47373d<C18653a<ServerEvent>> m61217a(C47883a<C18668a> aVar, C47883a<ScheduledExecutorService> aVar2) {
        return new C18679e(aVar, aVar2);
    }
}
