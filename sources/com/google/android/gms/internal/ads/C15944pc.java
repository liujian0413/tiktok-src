package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.pc */
public final class C15944pc extends bfy implements C15942pa {
    C15944pc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    /* renamed from: a */
    public final int mo41807a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
