package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.business.C18676h;
import dagger.p1859a.C47373d;
import dagger.p1859a.C47375f;
import javax.p1876a.C47883a;

/* renamed from: com.snapchat.kit.sdk.core.metrics.i */
public final class C18683i implements C47373d<C18676h> {

    /* renamed from: a */
    private final C47883a<SharedPreferences> f50469a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C18676h get() {
        return (C18676h) C47375f.m147940a(C18677c.m61213a((SharedPreferences) this.f50469a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    private C18683i(C47883a<SharedPreferences> aVar) {
        this.f50469a = aVar;
    }

    /* renamed from: a */
    public static C47373d<C18676h> m61225a(C47883a<SharedPreferences> aVar) {
        return new C18683i(aVar);
    }
}
