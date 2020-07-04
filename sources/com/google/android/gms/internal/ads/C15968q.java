package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.q */
public final class C15968q extends bfy implements C15914o {
    C15968q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: a */
    public final void mo41435a(String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        mo40589b(1, z);
    }
}
