package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.w */
public final class C16129w extends bfy implements C16076u {
    C16129w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    /* renamed from: a */
    public final long mo41443a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
