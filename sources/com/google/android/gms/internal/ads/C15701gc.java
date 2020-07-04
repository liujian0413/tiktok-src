package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.gc */
public abstract class C15701gc extends bfz implements C15700gb {
    /* renamed from: a */
    public static C15700gb m50896a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        if (queryLocalInterface instanceof C15700gb) {
            return (C15700gb) queryLocalInterface;
        }
        return new C15702gd(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo41640a(C15725h.m50989a(parcel.readStrongBinder()), C15346a.m44656a(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }
}
