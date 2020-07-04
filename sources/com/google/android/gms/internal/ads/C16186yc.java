package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yc */
public final class C16186yc extends bfy implements C16184ya {
    C16186yc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* renamed from: a */
    public final String mo42078a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final int mo42079b() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
