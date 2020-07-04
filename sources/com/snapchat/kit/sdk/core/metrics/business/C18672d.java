package com.snapchat.kit.sdk.core.metrics.business;

import com.snapchat.kit.sdk.core.metrics.C18653a;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.d */
public final class C18672d implements C47373d<C18671c> {

    /* renamed from: a */
    private final C47883a<C18676h> f50456a;

    /* renamed from: b */
    private final C47883a<C18653a<ServerEvent>> f50457b;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18671c get() {
        return new C18671c((C18676h) this.f50456a.get(), (C18653a) this.f50457b.get());
    }

    private C18672d(C47883a<C18676h> aVar, C47883a<C18653a<ServerEvent>> aVar2) {
        this.f50456a = aVar;
        this.f50457b = aVar2;
    }

    /* renamed from: a */
    public static C47373d<C18671c> m61198a(C47883a<C18676h> aVar, C47883a<C18653a<ServerEvent>> aVar2) {
        return new C18672d(aVar, aVar2);
    }
}
