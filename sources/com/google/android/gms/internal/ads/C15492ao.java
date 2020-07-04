package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ao */
public abstract class C15492ao extends bfz implements C15491an {
    public C15492ao() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo39836a();
                break;
            case 2:
                mo39838b();
                break;
            case 3:
                mo39839c();
                break;
            case 4:
                mo39840d();
                break;
            case 5:
                mo39837a(bga.m48618a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
