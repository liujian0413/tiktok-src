package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C16563gr;
import com.google.android.gms.internal.measurement.C16593ho;

/* renamed from: com.google.android.gms.measurement.internal.am */
public final class C16813am implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C16812al f46956a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f46957b;

    C16813am(C16812al alVar, String str) {
        this.f46956a = alVar;
        this.f46957b = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f46956a.f46955a.mo43585q().f47490d.mo44160a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            C16563gr a = C16593ho.m54197a(iBinder);
            if (a == null) {
                this.f46956a.f46955a.mo43585q().f47490d.mo44160a("Install Referrer Service implementation was not found");
                return;
            }
            this.f46956a.f46955a.mo43585q().f47493g.mo44160a("Install Referrer Service connected");
            this.f46956a.f46955a.mo43584p().mo43645a((Runnable) new C16814an(this, a, this));
        } catch (Exception e) {
            this.f46956a.f46955a.mo43585q().f47490d.mo44161a("Exception occurred while calling Install Referrer API", e);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f46956a.f46955a.mo43585q().f47493g.mo44160a("Install Referrer Service disconnected");
    }
}
