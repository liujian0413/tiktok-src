package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ye */
public final class C16188ye extends bfy implements C16187yd {
    C16188ye(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: a */
    public final void mo42111a(C16184ya yaVar, String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) yaVar);
        z.writeString(str);
        z.writeString(str2);
        mo40589b(2, z);
    }
}
