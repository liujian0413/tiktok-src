package com.google.android.gms.internal.p763e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: com.google.android.gms.internal.e.c */
public abstract class C16370c extends C16372e implements C16369b {
    /* renamed from: a */
    public static C16369b m53337a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof C16369b ? (C16369b) queryLocalInterface : new C16371d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo42462a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Tile a = mo42461a(parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel2.writeNoException();
        C16373f.m53346b(parcel2, a);
        return true;
    }
}
