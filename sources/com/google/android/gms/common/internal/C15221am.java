package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.p761c.C16356a;

/* renamed from: com.google.android.gms.common.internal.am */
public final class C15221am extends C16356a implements C15219ak {
    C15221am(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final C15345b mo38542a() throws RemoteException {
        Parcel a = mo42446a(1, mo42449c());
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo38543b() throws RemoteException {
        Parcel a = mo42446a(2, mo42449c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
