package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xw */
public final class C16179xw extends C16190yg {

    /* renamed from: a */
    private final Context f45418a;

    /* renamed from: b */
    private final Object f45419b;

    /* renamed from: c */
    private final zzbgz f45420c;

    /* renamed from: d */
    private final C16180xx f45421d;

    public C16179xw(Context context, C14816bu buVar, C15931oq oqVar, zzbgz zzbgz) {
        C16180xx xxVar = new C16180xx(context, buVar, zzyz.m53263a(), oqVar, zzbgz);
        this(context, zzbgz, xxVar);
    }

    private C16179xw(Context context, zzbgz zzbgz, C16180xx xxVar) {
        this.f45419b = new Object();
        this.f45418a = context;
        this.f45420c = zzbgz;
        this.f45421d = xxVar;
    }

    /* renamed from: a */
    public final void mo42092a(String str) throws RemoteException {
        if (this.f45418a instanceof C16178xv) {
            try {
                C16178xv.m52405a(str);
            } catch (NameNotFoundException unused) {
                if (VERSION.SDK_INT > 15) {
                    throw new RemoteException(NameNotFoundException.class.getSimpleName());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo42091a(zzbad zzbad) {
        synchronized (this.f45419b) {
            this.f45421d.mo42108a(zzbad);
        }
    }

    /* renamed from: a */
    public final void mo42086a() {
        synchronized (this.f45419b) {
            this.f45421d.mo42105G();
        }
    }

    /* renamed from: a */
    public final synchronized void mo42087a(C15345b bVar) throws RemoteException {
        if (this.f45418a instanceof C16178xv) {
            C16178xv.m52404a((Activity) C15349d.m44669a(bVar));
        }
        mo42086a();
    }

    /* renamed from: a */
    public final void mo42090a(C16194yk ykVar) {
        synchronized (this.f45419b) {
            this.f45421d.mo37598a(ykVar);
        }
    }

    /* renamed from: a */
    public final void mo42089a(C16187yd ydVar) {
        synchronized (this.f45419b) {
            this.f45421d.mo37597a(ydVar);
        }
    }

    /* renamed from: a */
    public final void mo42088a(C15833l lVar) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43754aA)).booleanValue()) {
            synchronized (this.f45419b) {
                this.f45421d.mo37592a(lVar);
            }
        }
    }

    /* renamed from: b */
    public final Bundle mo42094b() {
        Bundle n;
        if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43754aA)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f45419b) {
            n = this.f45421d.mo37624n();
        }
        return n;
    }

    /* renamed from: b */
    public final void mo42096b(String str) {
        synchronized (this.f45419b) {
            this.f45421d.mo37603a(str);
        }
    }

    /* renamed from: c */
    public final void mo42098c(String str) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43755aB)).booleanValue()) {
            synchronized (this.f45419b) {
                this.f45421d.mo37612b(str);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo42099c() {
        boolean H;
        synchronized (this.f45419b) {
            H = this.f45421d.mo42106H();
        }
        return H;
    }

    /* renamed from: d */
    public final void mo42100d() {
        mo42095b((C15345b) null);
    }

    /* renamed from: b */
    public final void mo42095b(C15345b bVar) {
        synchronized (this.f45419b) {
            this.f45421d.mo37622l();
        }
    }

    /* renamed from: e */
    public final void mo42102e() {
        mo42097c((C15345b) null);
    }

    /* renamed from: c */
    public final void mo42097c(C15345b bVar) {
        Context context;
        synchronized (this.f45419b) {
            if (bVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C15349d.m44669a(bVar);
                } catch (Exception e) {
                    acd.m45780c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f45421d.mo42107a(context);
            }
            this.f45421d.mo37623m();
        }
    }

    /* renamed from: f */
    public final void mo42103f() {
        mo42101d(null);
    }

    /* renamed from: d */
    public final void mo42101d(C15345b bVar) {
        synchronized (this.f45419b) {
            this.f45421d.mo37617g();
        }
    }

    /* renamed from: g */
    public final String mo42104g() {
        String a;
        synchronized (this.f45419b) {
            a = this.f45421d.mo37684a();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo42093a(boolean z) {
        synchronized (this.f45419b) {
            this.f45421d.mo37613b(z);
        }
    }
}
