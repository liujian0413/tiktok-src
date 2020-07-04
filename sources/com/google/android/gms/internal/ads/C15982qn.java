package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qn */
public final class C15982qn extends bfy implements C15981qm {
    C15982qn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* renamed from: a */
    public final void mo41911a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(3, z);
    }
}
