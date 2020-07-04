package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.qh */
public final class C15976qh extends bfy implements C15975qg {
    C15976qh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* renamed from: a */
    public final void mo41909a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(3, z);
    }
}
