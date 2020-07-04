package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.google.gson.C6600e;
import com.snapchat.kit.sdk.core.security.C18701h;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.l */
public final class C18720l implements C47373d<C18701h> {

    /* renamed from: a */
    private final C18713e f50550a;

    /* renamed from: b */
    private final C47883a<C6600e> f50551b;

    /* renamed from: c */
    private final C47883a<SharedPreferences> f50552c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18701h get() {
        return (C18701h) C47375f.m147940a(this.f50550a.mo49224a((C6600e) this.f50551b.get(), (SharedPreferences) this.f50552c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C47373d<C18701h> m61297a(C18713e eVar, C47883a<C6600e> aVar, C47883a<SharedPreferences> aVar2) {
        return new C18720l(eVar, aVar, aVar2);
    }

    private C18720l(C18713e eVar, C47883a<C6600e> aVar, C47883a<SharedPreferences> aVar2) {
        this.f50550a = eVar;
        this.f50551b = aVar;
        this.f50552c = aVar2;
    }
}
