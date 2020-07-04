package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.ad */
class C16804ad extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f46909a = "com.google.android.gms.measurement.internal.ad";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C16912ed f46910b;

    /* renamed from: c */
    private boolean f46911c;

    /* renamed from: d */
    private boolean f46912d;

    C16804ad(C16912ed edVar) {
        C15267r.m44384a(edVar);
        this.f46910b = edVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f46910b.mo43871j();
        String action = intent.getAction();
        this.f46910b.mo43585q().f47495i.mo44161a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = this.f46910b.mo43862c().mo44165e();
            if (this.f46912d != e) {
                this.f46912d = e;
                this.f46910b.mo43584p().mo43645a((Runnable) new C16805ae(this, e));
            }
            return;
        }
        this.f46910b.mo43585q().f47490d.mo44161a("NetworkBroadcastReceiver received unknown action", action);
    }

    /* renamed from: a */
    public final void mo43590a() {
        this.f46910b.mo43871j();
        this.f46910b.mo43584p().mo43571c();
        if (!this.f46911c) {
            this.f46910b.mo43581m().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f46912d = this.f46910b.mo43862c().mo44165e();
            this.f46910b.mo43585q().f47495i.mo44161a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f46912d));
            this.f46911c = true;
        }
    }

    /* renamed from: b */
    public final void mo43591b() {
        this.f46910b.mo43871j();
        this.f46910b.mo43584p().mo43571c();
        this.f46910b.mo43584p().mo43571c();
        if (this.f46911c) {
            this.f46910b.mo43585q().f47495i.mo44160a("Unregistering connectivity change receiver");
            this.f46911c = false;
            this.f46912d = false;
            try {
                this.f46910b.mo43581m().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f46910b.mo43585q().f47487a.mo44161a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
