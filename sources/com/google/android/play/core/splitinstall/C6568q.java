package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.play.core.splitinstall.q */
public final class C6568q {

    /* renamed from: a */
    final /* synthetic */ C6563f f18887a;

    /* renamed from: b */
    final /* synthetic */ Intent f18888b;

    /* renamed from: c */
    final /* synthetic */ Context f18889c;

    /* renamed from: d */
    final /* synthetic */ C6575x f18890d;

    C6568q(C6575x xVar, C6563f fVar, Intent intent, Context context) {
        this.f18890d = xVar;
        this.f18887a = fVar;
        this.f18888b = intent;
        this.f18889c = context;
    }

    /* renamed from: a */
    public final void mo15931a() {
        this.f18890d.m20416a(this.f18887a, 5, 0);
    }

    /* renamed from: a */
    public final void mo15932a(int i) {
        this.f18890d.m20416a(this.f18887a, 6, i);
    }

    /* renamed from: b */
    public final void mo15933b() {
        if (!this.f18888b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f18888b.putExtra("triggered_from_app_after_verification", true);
            this.f18889c.sendBroadcast(this.f18888b);
            return;
        }
        this.f18890d.f18817a.mo15893d("Splits copied and verified more than once.", new Object[0]);
    }
}
