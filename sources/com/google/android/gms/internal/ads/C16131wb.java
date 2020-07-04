package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.wb */
public final class C16131wb extends bfy implements C16128vz {
    C16131wb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* renamed from: a */
    public final zzaxi mo42041a(zzaxe zzaxe) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaxe);
        Parcel a = mo40587a(1, z);
        zzaxi zzaxi = (zzaxi) bga.m48614a(a, zzaxi.CREATOR);
        a.recycle();
        return zzaxi;
    }

    /* renamed from: a */
    public final void mo42042a(zzaxe zzaxe, C16132wc wcVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaxe);
        bga.m48615a(z, (IInterface) wcVar);
        mo40589b(2, z);
    }

    /* renamed from: a */
    public final void mo42043a(zzaxx zzaxx, C16135wf wfVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaxx);
        bga.m48615a(z, (IInterface) wfVar);
        mo40589b(4, z);
    }

    /* renamed from: b */
    public final void mo42044b(zzaxx zzaxx, C16135wf wfVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaxx);
        bga.m48615a(z, (IInterface) wfVar);
        mo40589b(5, z);
    }
}
