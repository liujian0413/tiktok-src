package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ai */
public final class C15486ai extends bfy implements C15478ag {
    C15486ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* renamed from: a */
    public final String mo39300a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
