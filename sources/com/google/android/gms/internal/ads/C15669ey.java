package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.ey */
public abstract class C15669ey extends bfz implements C15668ex {
    public C15669ey() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* renamed from: a */
    public static C15668ex m50730a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        if (queryLocalInterface instanceof C15668ex) {
            return (C15668ex) queryLocalInterface;
        }
        return new C15670ez(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo41627a(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            case 2:
                mo41626a();
                break;
            case 3:
                mo41628b(C15346a.m44656a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
