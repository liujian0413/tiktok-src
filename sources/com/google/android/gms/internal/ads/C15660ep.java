package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;

/* renamed from: com.google.android.gms.internal.ads.ep */
public final class C15660ep extends bfy implements C15658en {
    C15660ep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public final C15345b mo41491a() throws RemoteException {
        Parcel a = mo40587a(1, mo40591z());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final Uri mo41492b() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        Uri uri = (Uri) bga.m48614a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: c */
    public final double mo41493c() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: d */
    public final int mo41494d() throws RemoteException {
        Parcel a = mo40587a(4, mo40591z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: e */
    public final int mo41495e() throws RemoteException {
        Parcel a = mo40587a(5, mo40591z());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
