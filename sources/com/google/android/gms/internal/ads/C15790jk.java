package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.jk */
public final class C15790jk extends bfy implements C15789jj {
    C15790jk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* renamed from: a */
    public final void mo41671a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: a */
    public final void mo41672a(int i) throws RemoteException {
        Parcel z = mo40591z();
        z.writeInt(i);
        mo40589b(2, z);
    }
}
