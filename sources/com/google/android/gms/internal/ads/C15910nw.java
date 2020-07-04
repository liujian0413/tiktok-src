package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.measurement.C14876a.C14877a;
import com.google.android.gms.ads.measurement.C14879c;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.measurement.p765a.C16799a;
import java.util.List;
import java.util.Map;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.nw */
public final class C15910nw extends C14877a {

    /* renamed from: a */
    private static final Object f44709a = new Object();

    /* renamed from: b */
    private static C15910nw f44710b;

    /* renamed from: c */
    private final C16799a f44711c;

    private C15910nw(C16799a aVar) {
        this.f44711c = aVar;
    }

    /* renamed from: a */
    public static void m51402a(Context context, String str, Bundle bundle) {
        synchronized (f44709a) {
            if (f44710b == null) {
                C15910nw nwVar = new C15910nw(C16799a.m55344a(context, "Ads", "am", str, bundle));
                f44710b = nwVar;
                new Thread(new C15911nx(context, nwVar)).start();
            }
        }
    }

    /* renamed from: a */
    public final void mo37884a(Bundle bundle) throws RemoteException {
        this.f44711c.mo43562c(bundle);
    }

    /* renamed from: b */
    public final Bundle mo37888b(Bundle bundle) throws RemoteException {
        return this.f44711c.mo43556b(bundle);
    }

    /* renamed from: a */
    public final void mo37886a(String str, String str2, Bundle bundle) throws RemoteException {
        this.f44711c.mo43554a(str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo37887a(String str, String str2, C15345b bVar) throws RemoteException {
        this.f44711c.mo43555a(str, str2, bVar != null ? C15349d.m44669a(bVar) : null);
    }

    /* renamed from: a */
    public final Map mo37883a(String str, String str2, boolean z) throws RemoteException {
        return this.f44711c.mo43550a(str, str2, z);
    }

    /* renamed from: a */
    public final int mo37880a(String str) throws RemoteException {
        return this.f44711c.mo43560c(str);
    }

    /* renamed from: c */
    public final void mo37893c(Bundle bundle) throws RemoteException {
        this.f44711c.mo43552a(bundle);
    }

    /* renamed from: b */
    public final void mo37891b(String str, String str2, Bundle bundle) throws RemoteException {
        this.f44711c.mo43559b(str, str2, bundle);
    }

    /* renamed from: a */
    public final List mo37882a(String str, String str2) throws RemoteException {
        return this.f44711c.mo43549a(str, str2);
    }

    /* renamed from: a */
    public final String mo37881a() throws RemoteException {
        return this.f44711c.mo43561c();
    }

    /* renamed from: b */
    public final String mo37889b() throws RemoteException {
        return this.f44711c.mo43563d();
    }

    /* renamed from: c */
    public final long mo37892c() throws RemoteException {
        return this.f44711c.mo43564e();
    }

    /* renamed from: b */
    public final void mo37890b(String str) throws RemoteException {
        this.f44711c.mo43553a(str);
    }

    /* renamed from: c */
    public final void mo37894c(String str) throws RemoteException {
        this.f44711c.mo43558b(str);
    }

    /* renamed from: a */
    public final void mo37885a(C15345b bVar, String str, String str2) throws RemoteException {
        this.f44711c.mo43551a(bVar != null ? (Activity) C15349d.m44669a(bVar) : null, str, str2);
    }

    /* renamed from: d */
    public final String mo37895d() throws RemoteException {
        return this.f44711c.mo43548a();
    }

    /* renamed from: e */
    public final String mo37896e() throws RemoteException {
        return this.f44711c.mo43557b();
    }

    /* renamed from: f */
    public final String mo37897f() throws RemoteException {
        return this.f44711c.mo43565f();
    }

    /* renamed from: a */
    static final /* synthetic */ void m51401a(Context context, C15910nw nwVar) {
        try {
            ((C14879c) afn.m45788b(context, "com.google.android.gms.ads.measurement.MeasurementManager", C15912ny.f44714a)).registerAppMeasurementProxy(nwVar);
        } catch (RemoteException | zzbgx | NullPointerException e) {
            afm.m45782d("#007 Could not call remote method.", e);
        }
    }
}
