package com.google.android.gms.maps.p764a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.p763e.C16368a;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: com.google.android.gms.maps.a.ad */
public final class C16721ad extends C16368a implements C16724c {
    C16721ad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* renamed from: M_ */
    public final void mo43319M_() throws RemoteException {
        mo42460b(5, mo42457a());
    }

    /* renamed from: a */
    public final C15345b mo43320a(C15345b bVar, C15345b bVar2, Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        C16373f.m53342a(a, (IInterface) bVar2);
        C16373f.m53343a(a, (Parcelable) bundle);
        Parcel a2 = mo42458a(4, a);
        C15345b a3 = C15346a.m44656a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: a */
    public final void mo43321a(Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) bundle);
        mo42460b(3, a);
    }

    /* renamed from: a */
    public final void mo43322a(C15345b bVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        C16373f.m53343a(a, (Parcelable) googleMapOptions);
        C16373f.m53343a(a, (Parcelable) bundle);
        mo42460b(2, a);
    }

    /* renamed from: a */
    public final void mo43323a(C16735n nVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) nVar);
        mo42460b(12, a);
    }

    /* renamed from: b */
    public final void mo43324b() throws RemoteException {
        mo42460b(6, mo42457a());
    }

    /* renamed from: b */
    public final void mo43325b(Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) bundle);
        Parcel a2 = mo42458a(10, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    /* renamed from: c */
    public final void mo43326c() throws RemoteException {
        mo42460b(7, mo42457a());
    }

    /* renamed from: d */
    public final void mo43327d() throws RemoteException {
        mo42460b(8, mo42457a());
    }

    /* renamed from: e */
    public final void mo43328e() throws RemoteException {
        mo42460b(9, mo42457a());
    }

    /* renamed from: f */
    public final void mo43329f() throws RemoteException {
        mo42460b(15, mo42457a());
    }

    /* renamed from: g */
    public final void mo43330g() throws RemoteException {
        mo42460b(16, mo42457a());
    }
}
