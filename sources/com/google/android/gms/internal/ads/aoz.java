package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

final class aoz implements C15232a, C15233b {

    /* renamed from: a */
    private final C15494api f40887a;

    /* renamed from: b */
    private final zzbqh f40888b;

    /* renamed from: c */
    private final Object f40889c = new Object();

    /* renamed from: d */
    private boolean f40890d = false;

    /* renamed from: e */
    private boolean f40891e = false;

    aoz(Context context, Looper looper, zzbqh zzbqh) {
        this.f40888b = zzbqh;
        this.f40887a = new C15494api(context, looper, this, this);
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39915a() {
        synchronized (this.f40889c) {
            if (!this.f40890d) {
                this.f40890d = true;
                this.f40887a.mo38565l();
            }
        }
    }

    /* renamed from: b */
    private final void m46840b() {
        synchronized (this.f40889c) {
            if (this.f40887a.mo38560g() || this.f40887a.mo38561h()) {
                this.f40887a.mo38559f();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        synchronized (this.f40889c) {
            if (!this.f40891e) {
                this.f40891e = true;
                try {
                    this.f40887a.mo39918q().mo39924a(new zzbql(this.f40888b.mo40082g()));
                    m46840b();
                } catch (Exception unused) {
                    m46840b();
                } catch (Throwable th) {
                    m46840b();
                    throw th;
                }
            }
        }
    }
}
