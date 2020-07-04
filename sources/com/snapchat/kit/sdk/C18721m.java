package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;

/* renamed from: com.snapchat.kit.sdk.m */
public final class C18721m implements C47373d<SharedPreferences> {

    /* renamed from: a */
    private final C18713e f50553a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SharedPreferences get() {
        return (SharedPreferences) C47375f.m147940a(this.f50553a.mo49225b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18721m(C18713e eVar) {
        this.f50553a = eVar;
    }

    /* renamed from: a */
    public static C47373d<SharedPreferences> m61299a(C18713e eVar) {
        return new C18721m(eVar);
    }
}
