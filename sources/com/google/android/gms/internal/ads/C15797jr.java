package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jr */
final class C15797jr extends byt {

    /* renamed from: a */
    private final /* synthetic */ C15796jq f44532a;

    C15797jr(C15796jq jqVar) {
        this.f44532a = jqVar;
    }

    /* renamed from: a */
    public final void mo41419a() throws RemoteException {
        this.f44532a.f44531a.add(new C15798js(this));
    }

    /* renamed from: a */
    public final void mo41420a(int i) throws RemoteException {
        this.f44532a.f44531a.add(new C15799jt(this, i));
        acd.m45438a("Pooled interstitial failed to load.");
    }

    /* renamed from: b */
    public final void mo41421b() throws RemoteException {
        this.f44532a.f44531a.add(new C15800ju(this));
    }

    /* renamed from: c */
    public final void mo41422c() throws RemoteException {
        this.f44532a.f44531a.add(new C15801jv(this));
        acd.m45438a("Pooled interstitial loaded.");
    }

    /* renamed from: d */
    public final void mo41423d() throws RemoteException {
        this.f44532a.f44531a.add(new C15802jw(this));
    }

    /* renamed from: e */
    public final void mo41424e() throws RemoteException {
        this.f44532a.f44531a.add(new C15803jx(this));
    }

    /* renamed from: f */
    public final void mo41425f() throws RemoteException {
        this.f44532a.f44531a.add(new C15804jy(this));
    }
}
