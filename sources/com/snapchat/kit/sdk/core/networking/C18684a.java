package com.snapchat.kit.sdk.core.networking;

import com.google.gson.C6600e;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;
import okhttp3.Cache;

/* renamed from: com.snapchat.kit.sdk.core.networking.a */
public final class C18684a implements C47373d<ClientFactory> {

    /* renamed from: a */
    private final C47883a<Cache> f50474a;

    /* renamed from: b */
    private final C47883a<C6600e> f50475b;

    /* renamed from: c */
    private final C47883a<C18688e> f50476c;

    /* renamed from: d */
    private final C47883a<C18686c> f50477d;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ClientFactory get() {
        return new ClientFactory((Cache) this.f50474a.get(), (C6600e) this.f50475b.get(), (C18688e) this.f50476c.get(), (C18686c) this.f50477d.get());
    }

    /* renamed from: a */
    public static C47373d<ClientFactory> m61228a(C47883a<Cache> aVar, C47883a<C6600e> aVar2, C47883a<C18688e> aVar3, C47883a<C18686c> aVar4) {
        return new C18684a(aVar, aVar2, aVar3, aVar4);
    }

    private C18684a(C47883a<Cache> aVar, C47883a<C6600e> aVar2, C47883a<C18688e> aVar3, C47883a<C18686c> aVar4) {
        this.f50474a = aVar;
        this.f50475b = aVar2;
        this.f50476c = aVar3;
        this.f50477d = aVar4;
    }
}
