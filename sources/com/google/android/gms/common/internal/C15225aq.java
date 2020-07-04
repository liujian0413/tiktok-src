package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.common.internal.aq */
public final class C15225aq extends C16356a implements C15223ao {
    C15225aq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo38548a(zzk zzk, C15345b bVar) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53322a(c, (Parcelable) zzk);
        C16358c.m53321a(c, (IInterface) bVar);
        Parcel a = mo42446a(5, c);
        boolean a2 = C16358c.m53324a(a);
        a.recycle();
        return a2;
    }
}
