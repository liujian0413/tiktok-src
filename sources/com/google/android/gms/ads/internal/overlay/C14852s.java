package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.ads.C16020ry;
import com.google.android.gms.internal.ads.C6505uv;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.s */
public final class C14852s extends C16020ry {

    /* renamed from: a */
    private AdOverlayInfoParcel f38463a;

    /* renamed from: b */
    private Activity f38464b;

    /* renamed from: c */
    private boolean f38465c;

    /* renamed from: d */
    private boolean f38466d;

    public C14852s(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f38463a = adOverlayInfoParcel;
        this.f38464b = activity;
    }

    /* renamed from: a */
    public final void mo37810a(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo37813a(C15345b bVar) throws RemoteException {
    }

    /* renamed from: d */
    public final void mo37818d() throws RemoteException {
    }

    /* renamed from: e */
    public final boolean mo37819e() throws RemoteException {
        return false;
    }

    /* renamed from: f */
    public final void mo37820f() throws RemoteException {
    }

    /* renamed from: g */
    public final void mo37821g() throws RemoteException {
    }

    /* renamed from: l */
    public final void mo37826l() throws RemoteException {
    }

    /* renamed from: a */
    public final void mo37811a(Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        if (this.f38463a == null) {
            this.f38464b.finish();
        } else if (z) {
            this.f38464b.finish();
        } else {
            if (bundle == null) {
                if (this.f38463a.f38409b != null) {
                    this.f38463a.f38409b.mo7870v_();
                }
                if (!(this.f38464b.getIntent() == null || !this.f38464b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || this.f38463a.f38410c == null)) {
                    this.f38463a.f38410c.mo37716F_();
                }
            }
            if (!C14834a.m43102a((Context) this.f38464b, this.f38463a.f38408a, this.f38463a.f38416i)) {
                this.f38464b.finish();
            }
        }
    }

    /* renamed from: h */
    public final void mo37822h() throws RemoteException {
        if (this.f38465c) {
            this.f38464b.finish();
            return;
        }
        this.f38465c = true;
        if (this.f38463a.f38410c != null) {
            this.f38463a.f38410c.mo37730d();
        }
    }

    /* renamed from: b */
    public final void mo37816b(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f38465c);
    }

    /* renamed from: i */
    public final void mo37823i() throws RemoteException {
        if (this.f38463a.f38410c != null) {
            this.f38463a.f38410c.mo37729c();
        }
        if (this.f38464b.isFinishing()) {
            m43143a();
        }
    }

    /* renamed from: j */
    public final void mo37824j() throws RemoteException {
        if (this.f38464b.isFinishing()) {
            m43143a();
        }
    }

    /* renamed from: k */
    public final void mo37825k() throws RemoteException {
        if (this.f38464b.isFinishing()) {
            m43143a();
        }
    }

    /* renamed from: a */
    private final synchronized void m43143a() {
        if (!this.f38466d) {
            if (this.f38463a.f38410c != null) {
                this.f38463a.f38410c.mo37715E_();
            }
            this.f38466d = true;
        }
    }
}
