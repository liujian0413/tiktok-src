package com.snapchat.kit.sdk.core.controller;

import android.os.Handler;
import dagger.p1859a.C47373d;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.controller.b */
public final class C18652b implements C47373d<C18647a> {

    /* renamed from: a */
    private final C47883a<Handler> f50410a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18647a get() {
        return new C18647a((Handler) this.f50410a.get());
    }

    private C18652b(C47883a<Handler> aVar) {
        this.f50410a = aVar;
    }

    /* renamed from: a */
    public static C47373d<C18647a> m61165a(C47883a<Handler> aVar) {
        return new C18652b(aVar);
    }
}
