package com.google.android.gms.maps.p764a;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.p763e.C16372e;
import com.google.android.gms.internal.p763e.C16373f;
import com.google.android.gms.internal.p763e.C16378k;

/* renamed from: com.google.android.gms.maps.a.ac */
public abstract class C16720ac extends C16372e implements C16719ab {
    public C16720ac() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15345b bVar;
        switch (i) {
            case 1:
                bVar = mo43317a(C16378k.m53354a(parcel.readStrongBinder()));
                break;
            case 2:
                bVar = mo43318b(C16378k.m53354a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C16373f.m53342a(parcel2, (IInterface) bVar);
        return true;
    }
}
