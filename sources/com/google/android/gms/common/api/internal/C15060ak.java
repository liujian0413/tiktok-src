package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C15017a;
import com.google.android.gms.common.api.C15017a.C15019b;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.internal.C15104c.C15105a;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.internal.ak */
public final class C15060ak implements C15069at {

    /* renamed from: a */
    private final C15070au f38951a;

    public C15060ak(C15070au auVar) {
        this.f38951a = auVar;
    }

    /* renamed from: a */
    public final void mo38293a(int i) {
    }

    /* renamed from: a */
    public final void mo38294a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo38295a(ConnectionResult connectionResult, C15017a<?> aVar, boolean z) {
    }

    /* renamed from: b */
    public final boolean mo38296b() {
        return true;
    }

    /* renamed from: a */
    public final void mo38292a() {
        for (C15028f f : this.f38951a.f38989a.values()) {
            f.mo38215f();
        }
        this.f38951a.f38992d.f38954c = Collections.emptySet();
    }

    /* renamed from: a */
    public final <A extends C15019b, T extends C15105a<? extends C15044g, A>> T mo38291a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: c */
    public final void mo38297c() {
        this.f38951a.mo38320d();
    }
}
