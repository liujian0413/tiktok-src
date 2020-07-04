package com.google.android.gms.maps.p764a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p763e.C16372e;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.maps.a.m */
public abstract class C16734m extends C16372e implements C16733l {
    public C16734m() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo43354a((LatLng) C16373f.m53341a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
