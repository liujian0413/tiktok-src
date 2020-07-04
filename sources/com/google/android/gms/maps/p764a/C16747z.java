package com.google.android.gms.maps.p764a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.p763e.C16368a;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.internal.p763e.C16374g;
import com.google.android.gms.internal.p763e.C16375h;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: com.google.android.gms.maps.a.z */
public final class C16747z extends C16368a implements C16746y {
    C16747z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* renamed from: L_ */
    public final C16717a mo43358L_() throws RemoteException {
        C16717a aVar;
        Parcel a = mo42458a(4, mo42457a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof C16717a ? (C16717a) queryLocalInterface : new C16739r(readStrongBinder);
        }
        a.recycle();
        return aVar;
    }

    /* renamed from: a */
    public final C16724c mo43359a(C15345b bVar) throws RemoteException {
        C16724c cVar;
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        Parcel a2 = mo42458a(2, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            cVar = queryLocalInterface instanceof C16724c ? (C16724c) queryLocalInterface : new C16721ad(readStrongBinder);
        }
        a2.recycle();
        return cVar;
    }

    /* renamed from: a */
    public final C16725d mo43360a(C15345b bVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        C16725d dVar;
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        C16373f.m53343a(a, (Parcelable) googleMapOptions);
        Parcel a2 = mo42458a(3, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            dVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            dVar = queryLocalInterface instanceof C16725d ? (C16725d) queryLocalInterface : new C16722ae(readStrongBinder);
        }
        a2.recycle();
        return dVar;
    }

    /* renamed from: a */
    public final void mo43361a(C15345b bVar, int i) throws RemoteException {
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        a.writeInt(i);
        mo42460b(6, a);
    }

    /* renamed from: b */
    public final C16374g mo43362b() throws RemoteException {
        Parcel a = mo42458a(5, mo42457a());
        C16374g a2 = C16375h.m53348a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C16727f mo43363b(C15345b bVar) throws RemoteException {
        C16727f fVar;
        Parcel a = mo42457a();
        C16373f.m53342a(a, (IInterface) bVar);
        Parcel a2 = mo42458a(8, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            fVar = queryLocalInterface instanceof C16727f ? (C16727f) queryLocalInterface : new C16743v(readStrongBinder);
        }
        a2.recycle();
        return fVar;
    }
}
