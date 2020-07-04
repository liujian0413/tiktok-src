package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.et */
public abstract class C15664et extends bfz implements C15663es {
    public C15664et() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* renamed from: a */
    public static C15663es m50718a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        if (queryLocalInterface instanceof C15663es) {
            return (C15663es) queryLocalInterface;
        }
        return new C15665eu(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo40520a(parcel.readString(), C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 2:
                C15345b a = mo40516a(parcel.readString());
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) a);
                break;
            case 3:
                mo40518a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo40517a();
                parcel2.writeNoException();
                break;
            case 5:
                mo40519a(C15346a.m44656a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                mo40521b(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
