package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C15374l extends C16356a implements C15373k {
    C15374l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C15345b mo38728a(C15345b bVar, String str, int i, C15345b bVar2) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C16358c.m53321a(c, (IInterface) bVar2);
        Parcel a = mo42446a(2, c);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C15345b mo38729b(C15345b bVar, String str, int i, C15345b bVar2) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C16358c.m53321a(c, (IInterface) bVar2);
        Parcel a = mo42446a(3, c);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
