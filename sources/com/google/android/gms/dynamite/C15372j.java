package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C15372j extends C16356a implements C15371i {
    C15372j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final C15345b mo38725a(C15345b bVar, String str, int i) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo42446a(2, c);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final int mo38724a(C15345b bVar, String str, boolean z) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        C16358c.m53323a(c, z);
        Parcel a = mo42446a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C15345b mo38727b(C15345b bVar, String str, int i) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo42446a(4, c);
        C15345b a2 = C15346a.m44656a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo38726b(C15345b bVar, String str, boolean z) throws RemoteException {
        Parcel c = mo42449c();
        C16358c.m53321a(c, (IInterface) bVar);
        c.writeString(str);
        C16358c.m53323a(c, z);
        Parcel a = mo42446a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo38723a() throws RemoteException {
        Parcel a = mo42446a(6, mo42449c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
