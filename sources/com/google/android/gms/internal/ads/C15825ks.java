package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.ks */
final class C15825ks extends byt {

    /* renamed from: a */
    private final bys f44555a;

    C15825ks(bys bys) {
        this.f44555a = bys;
    }

    /* renamed from: a */
    public final void mo41419a() throws RemoteException {
        if (C15835lb.m51254a()) {
            int intValue = ((Integer) bym.m50299d().mo41272a(C15585bw.f43774aU)).intValue();
            int intValue2 = ((Integer) bym.m50299d().mo41272a(C15585bw.f43775aV)).intValue();
            if (intValue <= 0 || intValue2 < 0) {
                C14793ay.m42906l().mo41697a();
            } else {
                acl.f40003a.postDelayed(C15826kt.f44556a, (long) (intValue + new Random().nextInt(intValue2 + 1)));
            }
        }
        this.f44555a.mo41419a();
    }

    /* renamed from: a */
    public final void mo41420a(int i) throws RemoteException {
        this.f44555a.mo41420a(i);
    }

    /* renamed from: b */
    public final void mo41421b() throws RemoteException {
        this.f44555a.mo41421b();
    }

    /* renamed from: c */
    public final void mo41422c() throws RemoteException {
        this.f44555a.mo41422c();
    }

    /* renamed from: d */
    public final void mo41423d() throws RemoteException {
        this.f44555a.mo41423d();
    }

    /* renamed from: e */
    public final void mo41424e() throws RemoteException {
        this.f44555a.mo41424e();
    }

    /* renamed from: f */
    public final void mo41425f() throws RemoteException {
        this.f44555a.mo41425f();
    }
}
