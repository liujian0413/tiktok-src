package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fe */
public final class C15676fe extends bfy implements C15674fc {
    C15676fe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    /* renamed from: n */
    public final C15345b mo41508n() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final String mo41496a() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo41500f() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: g */
    public final String mo41501g() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: h */
    public final C15658en mo41502h() throws RemoteException {
        C15658en enVar;
        Parcel a = mo40587a(6, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            enVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof C15658en) {
                enVar = (C15658en) queryLocalInterface;
            } else {
                enVar = new C15660ep(readStrongBinder);
            }
        }
        a.recycle();
        return enVar;
    }

    /* renamed from: i */
    public final String mo41503i() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final double mo41504j() throws RemoteException {
        Parcel a = mo40587a(8, mo40591z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: k */
    public final String mo41505k() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo41506l() throws RemoteException {
        Parcel a = mo40587a(10, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final Bundle mo41509o() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: s */
    public final void mo41513s() throws RemoteException {
        mo40589b(12, mo40591z());
    }

    /* renamed from: m */
    public final C15488ak mo41507m() throws RemoteException {
        Parcel a = mo40587a(13, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41497a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(14, z);
    }

    /* renamed from: b */
    public final boolean mo41498b(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        Parcel a = mo40587a(15, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo41499c(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(16, z);
    }

    /* renamed from: r */
    public final C15654ej mo41512r() throws RemoteException {
        C15654ej ejVar;
        Parcel a = mo40587a(17, mo40591z());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            ejVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            if (queryLocalInterface instanceof C15654ej) {
                ejVar = (C15654ej) queryLocalInterface;
            } else {
                ejVar = new C15656el(readStrongBinder);
            }
        }
        a.recycle();
        return ejVar;
    }

    /* renamed from: p */
    public final C15345b mo41510p() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: q */
    public final String mo41511q() throws RemoteException {
        Parcel a = mo40587a(19, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
