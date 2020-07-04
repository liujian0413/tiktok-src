package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.base.C16355d;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.api.internal.cg */
public abstract class C15114cg extends LifecycleCallback implements OnCancelListener {

    /* renamed from: b */
    private final Handler f39079b;

    /* renamed from: c */
    protected volatile boolean f39080c;

    /* renamed from: d */
    protected final AtomicReference<C15115ch> f39081d;

    /* renamed from: e */
    protected final GoogleApiAvailability f39082e;

    protected C15114cg(C15139g gVar) {
        this(gVar, GoogleApiAvailability.getInstance());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo38371a(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo38372e();

    private C15114cg(C15139g gVar, GoogleApiAvailability googleApiAvailability) {
        super(gVar);
        this.f39081d = new AtomicReference<>(null);
        this.f39079b = new C16355d(Looper.getMainLooper());
        this.f39082e = googleApiAvailability;
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo38371a(new ConnectionResult(13, null), m43861a((C15115ch) this.f39081d.get()));
        mo38377f();
    }

    /* renamed from: a */
    public final void mo38278a(Bundle bundle) {
        super.mo38278a(bundle);
        if (bundle != null) {
            this.f39081d.set(bundle.getBoolean("resolving_error", false) ? new C15115ch(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: b */
    public final void mo38281b(Bundle bundle) {
        super.mo38281b(bundle);
        C15115ch chVar = (C15115ch) this.f39081d.get();
        if (chVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", chVar.f39083a);
            bundle.putInt("failed_status", chVar.f39084b.f38846b);
            bundle.putParcelable("failed_resolution", chVar.f39084b.f38847c);
        }
    }

    /* renamed from: b */
    public void mo38280b() {
        super.mo38280b();
        this.f39080c = true;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38277a(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.ch> r0 = r3.f39081d
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.ch r0 = (com.google.android.gms.common.api.internal.C15115ch) r0
            r1 = 1
            r2 = 0
            switch(r4) {
                case 1: goto L_0x002a;
                case 2: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004f
        L_0x000e:
            com.google.android.gms.common.GoogleApiAvailability r4 = r3.f39082e
            android.app.Activity r5 = r3.mo38276a()
            int r4 = r4.isGooglePlayServicesAvailable(r5)
            if (r4 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r0 != 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.common.ConnectionResult r5 = r0.f39084b
            int r5 = r5.f38846b
            r6 = 18
            if (r5 != r6) goto L_0x0050
            if (r4 != r6) goto L_0x0050
            return
        L_0x002a:
            r4 = -1
            if (r5 != r4) goto L_0x002e
            goto L_0x0050
        L_0x002e:
            if (r5 != 0) goto L_0x004f
            r4 = 13
            if (r6 == 0) goto L_0x003a
            java.lang.String r5 = "<<ResolutionFailureErrorDetail>>"
            int r4 = r6.getIntExtra(r5, r4)
        L_0x003a:
            com.google.android.gms.common.api.internal.ch r5 = new com.google.android.gms.common.api.internal.ch
            com.google.android.gms.common.ConnectionResult r6 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r6.<init>(r4, r1)
            int r4 = m43861a(r0)
            r5.<init>(r6, r4)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.ch> r4 = r3.f39081d
            r4.set(r5)
            r0 = r5
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x0056
            r3.mo38377f()
            return
        L_0x0056:
            if (r0 == 0) goto L_0x005f
            com.google.android.gms.common.ConnectionResult r4 = r0.f39084b
            int r5 = r0.f39083a
            r3.mo38371a(r4, r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C15114cg.mo38277a(int, int, android.content.Intent):void");
    }

    /* renamed from: d */
    public void mo38283d() {
        super.mo38283d();
        this.f39080c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo38377f() {
        this.f39081d.set(null);
        mo38372e();
    }

    /* renamed from: b */
    public final void mo38376b(ConnectionResult connectionResult, int i) {
        C15115ch chVar = new C15115ch(connectionResult, i);
        if (this.f39081d.compareAndSet(null, chVar)) {
            this.f39079b.post(new C15116ci(this, chVar));
        }
    }

    /* renamed from: a */
    private static int m43861a(C15115ch chVar) {
        if (chVar == null) {
            return -1;
        }
        return chVar.f39083a;
    }
}
