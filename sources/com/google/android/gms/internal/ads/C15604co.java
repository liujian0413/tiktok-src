package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.co */
public abstract class C15604co extends bfz implements C15603cn {
    public C15604co() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String a = mo41463a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                String b = mo41465b();
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            case 3:
                mo41464a(C15346a.m44656a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                mo41466c();
                parcel2.writeNoException();
                break;
            case 5:
                mo41467d();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
