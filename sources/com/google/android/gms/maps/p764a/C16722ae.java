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

/* renamed from: com.google.android.gms.maps.a.ae */
public final class C16722ae extends C16368a implements C16725d {
    C16722ae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    /* renamed from: N_ */
    public final void mo43331N_() throws RemoteException {
        mo42460b(3, mo42457a());
    }

    /* renamed from: a */
    public final void mo43332a(Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) bundle);
        mo42460b(2, a);
    }

    /* renamed from: a */
    public final void mo43333a(C16735n nVar) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) nVar);
        mo42460b(9, a);
    }

    /* renamed from: b */
    public final void mo43334b() throws RemoteException {
        mo42460b(4, mo42457a());
    }

    /* renamed from: b */
    public final void mo43335b(Bundle bundle) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53343a(a, (Parcelable) bundle);
        Parcel a2 = mo42458a(7, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    /* renamed from: c */
    public final void mo43336c() throws RemoteException {
        mo42460b(5, mo42457a());
    }

    /* renamed from: d */
    public final void mo43337d() throws RemoteException {
        mo42460b(6, mo42457a());
    }

    /* renamed from: e */
    public final C15345b mo43338e() throws RemoteException {
        Parcel a = mo42458a(8, mo42457a());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: f */
    public final void mo43339f() throws RemoteException {
        mo42460b(12, mo42457a());
    }

    /* renamed from: g */
    public final void mo43340g() throws RemoteException {
        mo42460b(13, mo42457a());
    }
}
