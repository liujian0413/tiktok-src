package com.google.android.gms.ads.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.ads.bfy;
import com.google.android.gms.internal.ads.bga;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.measurement.b */
public final class C14878b extends bfy implements C14876a {
    C14878b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* renamed from: a */
    public final void mo37884a(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(1, z);
    }

    /* renamed from: b */
    public final Bundle mo37888b(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        Parcel a = mo40587a(2, z);
        Bundle bundle2 = (Bundle) bga.m48614a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final void mo37886a(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(3, z);
    }

    /* renamed from: a */
    public final void mo37887a(String str, String str2, C15345b bVar) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48615a(z, (IInterface) bVar);
        mo40589b(4, z);
    }

    /* renamed from: a */
    public final Map mo37883a(String str, String str2, boolean z) throws RemoteException {
        Parcel z2 = mo40591z();
        z2.writeString(str);
        z2.writeString(str2);
        bga.m48617a(z2, z);
        Parcel a = mo40587a(5, z2);
        HashMap c = bga.m48621c(a);
        a.recycle();
        return c;
    }

    /* renamed from: a */
    public final int mo37880a(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        Parcel a = mo40587a(6, z);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final void mo37893c(Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(7, z);
    }

    /* renamed from: b */
    public final void mo37891b(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        bga.m48616a(z, (Parcelable) bundle);
        mo40589b(8, z);
    }

    /* renamed from: a */
    public final List mo37882a(String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        z.writeString(str2);
        Parcel a = mo40587a(9, z);
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }

    /* renamed from: a */
    public final String mo37881a() throws RemoteException {
        Parcel a = mo40587a(10, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final String mo37889b() throws RemoteException {
        Parcel a = mo40587a(11, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final long mo37892c() throws RemoteException {
        Parcel a = mo40587a(12, mo40591z());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }

    /* renamed from: b */
    public final void mo37890b(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(13, z);
    }

    /* renamed from: c */
    public final void mo37894c(String str) throws RemoteException {
        Parcel z = mo40591z();
        z.writeString(str);
        mo40589b(14, z);
    }

    /* renamed from: a */
    public final void mo37885a(C15345b bVar, String str, String str2) throws RemoteException {
        Parcel z = mo40591z();
        bga.m48615a(z, (IInterface) bVar);
        z.writeString(str);
        z.writeString(str2);
        mo40589b(15, z);
    }

    /* renamed from: d */
    public final String mo37895d() throws RemoteException {
        Parcel a = mo40587a(16, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final String mo37896e() throws RemoteException {
        Parcel a = mo40587a(17, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: f */
    public final String mo37897f() throws RemoteException {
        Parcel a = mo40587a(18, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
