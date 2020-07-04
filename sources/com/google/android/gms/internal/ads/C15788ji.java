package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.ji */
public abstract class C15788ji extends bfz implements C15787jh {
    public C15788ji() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        C15789jj jjVar;
        switch (i) {
            case 3:
                C15488ak f = mo41485f();
                parcel2.writeNoException();
                bga.m48615a(parcel2, (IInterface) f);
                break;
            case 4:
                mo41486g();
                parcel2.writeNoException();
                break;
            case 5:
                C15345b a = C15346a.m44656a(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    jjVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    if (queryLocalInterface instanceof C15789jj) {
                        jjVar = (C15789jj) queryLocalInterface;
                    } else {
                        jjVar = new C15790jk(readStrongBinder);
                    }
                }
                mo41479a(a, jjVar);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
