package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.am */
public final class C15490am extends bfy implements C15488ak {
    C15490am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo39574a() throws RemoteException {
        mo40589b(1, mo40591z());
    }

    /* renamed from: b */
    public final void mo39577b() throws RemoteException {
        mo40589b(2, mo40591z());
    }

    /* renamed from: a */
    public final void mo39576a(boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        bga.m48617a(z2, z);
        mo40589b(3, z2);
    }

    /* renamed from: c */
    public final boolean mo39578c() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final int mo39579d() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final float mo39580e() throws RemoteException {
        Parcel a = mo40587a(6, mo40591z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: f */
    public final float mo39581f() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo39575a(C15491an anVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) anVar);
        mo40589b(8, z);
    }

    /* renamed from: g */
    public final float mo39582g() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: h */
    public final boolean mo39583h() throws RemoteException {
        Parcel a = mo40587a(10, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: i */
    public final C15491an mo39584i() throws RemoteException {
        C15491an anVar;
        Parcel a = mo40587a(11, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            anVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof C15491an) {
                anVar = (C15491an) queryLocalInterface;
            } else {
                anVar = new C15493ap(readStrongBinder);
            }
        }
        a.recycle();
        return anVar;
    }

    /* renamed from: j */
    public final boolean mo39585j() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: k */
    public final void mo39586k() throws RemoteException {
        mo40589b(13, mo40591z());
    }
}
