package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15232a;
import com.google.android.gms.common.internal.C15231d.C15233b;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.vs */
public final class C16121vs extends C16116vn implements C15232a, C15233b {

    /* renamed from: a */
    private Context f45169a;

    /* renamed from: b */
    private zzbgz f45170b;

    /* renamed from: c */
    private agw<zzaxe> f45171c;

    /* renamed from: d */
    private adi f45172d;

    /* renamed from: e */
    private final C16114vl f45173e;

    /* renamed from: f */
    private final Object f45174f = new Object();

    /* renamed from: g */
    private C16122vt f45175g;

    public C16121vs(Context context, zzbgz zzbgz, agw<zzaxe> agw, C16114vl vlVar) {
        super(agw, vlVar);
        this.f45169a = context;
        this.f45170b = zzbgz;
        this.f45171c = agw;
        this.f45173e = vlVar;
        this.f45175g = new C16122vt(context, C14793ay.m42908n().mo39258a(), this, this);
        this.f45175g.mo38565l();
    }

    /* renamed from: d */
    public final C16128vz mo42032d() {
        C16128vz q;
        synchronized (this.f45174f) {
            try {
                q = this.f45175g.mo39918q();
            } catch (DeadObjectException | IllegalStateException unused) {
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q;
    }

    /* renamed from: a */
    public final void mo42030a() {
        synchronized (this.f45174f) {
            if (this.f45175g.mo38560g() || this.f45175g.mo38561h()) {
                this.f45175g.mo38559f();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
        acd.m45777b("Cannot connect to remote service, fallback to local instance.");
        this.f45172d = new C16120vr(this.f45169a, this.f45171c, this.f45173e);
        this.f45172d.mo39128c();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        C14793ay.m42895a().mo39177b(this.f45169a, this.f45170b.f45677a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        mo39128c();
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
        acd.m45777b("Disconnected from remote ad request service.");
    }
}
