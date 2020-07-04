package com.google.android.gms.maps.p764a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p763e.C16372e;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.internal.p763e.C16378k;

/* renamed from: com.google.android.gms.maps.a.q */
public abstract class C16738q extends C16372e implements C16737p {
    public C16738q() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean a = mo43356a(C16378k.m53354a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        C16373f.m53344a(parcel2, a);
        return true;
    }
}
