package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.el */
public final class C15656el extends bfy implements C15654ej {
    C15656el(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: a */
    public final String mo41472a() throws RemoteException {
        Parcel a = mo40587a(2, mo40591z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final List<C15658en> mo41473b() throws RemoteException {
        Parcel a = mo40587a(3, mo40591z());
        ArrayList b = bga.m48619b(a);
        a.recycle();
        return b;
    }
}
