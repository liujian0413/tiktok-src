package com.snapchat.kit.sdk;

import android.content.Context;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.snapchat.kit.sdk.h */
public final class C18716h implements C47373d<Context> {

    /* renamed from: a */
    private final C18713e f50539a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Context get() {
        return (Context) C47375f.m147940a(this.f50539a.f50533a, "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18716h(C18713e eVar) {
        this.f50539a = eVar;
    }

    /* renamed from: a */
    public static C47373d<Context> m61289a(C18713e eVar) {
        return new C18716h(eVar);
    }
}
