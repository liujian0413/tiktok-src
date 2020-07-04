package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.networking.d */
public final class C18687d implements C47373d<C18686c> {

    /* renamed from: a */
    private final C47883a<OAuth2Manager> f50480a;

    /* renamed from: b */
    private final C47883a<C18647a> f50481b;

    /* renamed from: c */
    private final C47883a<String> f50482c;

    /* renamed from: d */
    private final C47883a<Fingerprint> f50483d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18686c get() {
        return new C18686c((OAuth2Manager) this.f50480a.get(), (C18647a) this.f50481b.get(), (String) this.f50482c.get(), (Fingerprint) this.f50483d.get());
    }

    /* renamed from: a */
    public static C47373d<C18686c> m61231a(C47883a<OAuth2Manager> aVar, C47883a<C18647a> aVar2, C47883a<String> aVar3, C47883a<Fingerprint> aVar4) {
        return new C18687d(aVar, aVar2, aVar3, aVar4);
    }

    private C18687d(C47883a<OAuth2Manager> aVar, C47883a<C18647a> aVar2, C47883a<String> aVar3, C47883a<Fingerprint> aVar4) {
        this.f50480a = aVar;
        this.f50481b = aVar2;
        this.f50482c = aVar3;
        this.f50483d = aVar4;
    }
}
