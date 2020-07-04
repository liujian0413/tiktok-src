package com.google.android.gms.maps.p764a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p763e.C16372e;

/* renamed from: com.google.android.gms.maps.a.t */
public abstract class C16741t extends C16372e implements C16740s {
    public C16741t() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C16726e eVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            eVar = queryLocalInterface instanceof C16726e ? (C16726e) queryLocalInterface : new C16742u(readStrongBinder);
        }
        mo43357a(eVar);
        parcel2.writeNoException();
        return true;
    }
}
