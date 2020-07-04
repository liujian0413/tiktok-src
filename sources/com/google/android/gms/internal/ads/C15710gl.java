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

/* renamed from: com.google.android.gms.internal.ads.gl */
public final class C15710gl extends bfy implements C15708gj {
    C15710gl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* renamed from: a */
    public final String mo41544a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final List mo41500f() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: i */
    public final String mo41553i() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: j */
    public final C15658en mo41554j() throws RemoteException {
        C15658en enVar;
        Parcel a = mo40587a(5, mo40591z());
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

    /* renamed from: k */
    public final String mo41555k() throws RemoteException {
        Parcel a = mo40587a(6, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final String mo41556l() throws RemoteException {
        Parcel a = mo40587a(7, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: m */
    public final double mo41557m() throws RemoteException {
        Parcel a = mo40587a(8, mo40591z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: n */
    public final String mo41558n() throws RemoteException {
        Parcel a = mo40587a(9, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: o */
    public final String mo41559o() throws RemoteException {
        Parcel a = mo40587a(10, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: p */
    public final C15488ak mo41560p() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        C15488ak a2 = C15489al.m46249a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: s */
    public final String mo41563s() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: v */
    public final void mo41566v() throws RemoteException {
        mo40589b(13, mo40591z());
    }

    /* renamed from: u */
    public final C15654ej mo41565u() throws RemoteException {
        C15654ej ejVar;
        Parcel a = mo40587a(14, mo40591z());
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

    /* renamed from: a */
    public final void mo41545a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(15, z);
    }

    /* renamed from: b */
    public final boolean mo41549b(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        Parcel a = mo40587a(16, z);
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final void mo41550c(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(17, z);
    }

    /* renamed from: q */
    public final C15345b mo41561q() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: r */
    public final C15345b mo41562r() throws RemoteException {
        Parcel a = mo40587a(19, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: t */
    public final Bundle mo41564t() throws RemoteException {
        Parcel a = mo40587a(20, mo40591z());
        Bundle bundle = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: a */
    public final void mo41548a(C15706gh ghVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) ghVar);
        mo40589b(21, z);
    }

    /* renamed from: y */
    public final void mo41569y() throws RemoteException {
        mo40589b(22, mo40591z());
    }

    /* renamed from: g */
    public final List mo41551g() throws RemoteException {
        Parcel a = mo40587a(23, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: h */
    public final boolean mo41552h() throws RemoteException {
        Parcel a = mo40587a(24, mo40591z());
        boolean a2 = bga.m48618a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo41547a(C15478ag agVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) agVar);
        mo40589b(25, z);
    }

    /* renamed from: a */
    public final void mo41546a(C15470ad adVar) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) adVar);
        mo40589b(26, z);
    }

    /* renamed from: w */
    public final void mo41567w() throws RemoteException {
        mo40589b(27, mo40591z());
    }

    /* renamed from: x */
    public final void mo41568x() throws RemoteException {
        mo40589b(28, mo40591z());
    }
}
