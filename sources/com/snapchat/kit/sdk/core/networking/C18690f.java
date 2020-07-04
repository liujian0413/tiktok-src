package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18647a;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.networking.f */
public final class C18690f implements C47373d<C18688e> {

    /* renamed from: a */
    private final C47883a<OAuth2Manager> f50488a;

    /* renamed from: b */
    private final C47883a<C18647a> f50489b;

    /* renamed from: c */
    private final C47883a<String> f50490c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18688e get() {
        return new C18688e((OAuth2Manager) this.f50488a.get(), (C18647a) this.f50489b.get(), (String) this.f50490c.get());
    }

    /* renamed from: a */
    public static C47373d<C18688e> m61238a(C47883a<OAuth2Manager> aVar, C47883a<C18647a> aVar2, C47883a<String> aVar3) {
        return new C18690f(aVar, aVar2, aVar3);
    }

    private C18690f(C47883a<OAuth2Manager> aVar, C47883a<C18647a> aVar2, C47883a<String> aVar3) {
        this.f50488a = aVar;
        this.f50489b = aVar2;
        this.f50490c = aVar3;
    }
}
