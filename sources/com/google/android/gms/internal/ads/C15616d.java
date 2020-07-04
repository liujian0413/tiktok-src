package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

/* renamed from: com.google.android.gms.internal.ads.d */
public final class C15616d extends bfy implements C15553b {
    C15616d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: a */
    public final byv mo37787a() throws RemoteException {
        byv byv;
        Parcel a = mo40587a(1, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            byv = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof byv) {
                byv = (byv) queryLocalInterface;
            } else {
                byv = new byx(readStrongBinder);
            }
        }
        a.recycle();
        return byv;
    }

    /* renamed from: a */
    public final void mo37789a(bys bys) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bys);
        mo40589b(2, z);
    }

    /* renamed from: a */
    public final void mo37790a(C15686fo foVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) foVar);
        mo40589b(3, z);
    }

    /* renamed from: a */
    public final void mo37791a(C15690fs fsVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) fsVar);
        mo40589b(4, z);
    }

    /* renamed from: a */
    public final void mo37798a(String str, C15696fy fyVar, C15693fv fvVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        bga.m48615a(z, (IInterface) fyVar);
        bga.m48615a(z, (IInterface) fvVar);
        mo40589b(5, z);
    }

    /* renamed from: a */
    public final void mo37796a(zzafl zzafl) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzafl);
        mo40589b(6, z);
    }

    /* renamed from: a */
    public final void mo37795a(C16076u uVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) uVar);
        mo40589b(7, z);
    }

    /* renamed from: a */
    public final void mo37792a(C15700gb gbVar, zzyz zzyz) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) gbVar);
        bga.m48616a(z, (Parcelable) zzyz);
        mo40589b(8, z);
    }

    /* renamed from: a */
    public final void mo37788a(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) publisherAdViewOptions);
        mo40589b(9, z);
    }

    /* renamed from: a */
    public final void mo37793a(C15703ge geVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) geVar);
        mo40589b(10, z);
    }

    /* renamed from: a */
    public final void mo37797a(zzaks zzaks) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) zzaks);
        mo40589b(13, z);
    }

    /* renamed from: a */
    public final void mo37794a(C15791jl jlVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) jlVar);
        mo40589b(14, z);
    }
}
