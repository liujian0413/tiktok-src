package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.ap */
public final class C15493ap extends bfy implements C15491an {
    C15493ap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: a */
    public final void mo39836a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: b */
    public final void mo39838b() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: c */
    public final void mo39839c() throws RemoteException {
        mo40589b(3, mo40591z());
    }

    /* renamed from: d */
    public final void mo39840d() throws RemoteException {
        mo40589b(4, mo40591z());
    }

    /* renamed from: a */
    public final void mo39837a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(5, z2);
    }
}
