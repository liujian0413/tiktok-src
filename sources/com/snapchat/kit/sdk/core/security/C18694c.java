package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.security.c */
public final class C18694c implements C47373d<Fingerprint> {

    /* renamed from: a */
    private final C47883a<Context> f50496a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Fingerprint get() {
        return new Fingerprint((Context) this.f50496a.get());
    }

    private C18694c(C47883a<Context> aVar) {
        this.f50496a = aVar;
    }

    /* renamed from: a */
    public static C47373d<Fingerprint> m61245a(C47883a<Context> aVar) {
        return new C18694c(aVar);
    }
}
