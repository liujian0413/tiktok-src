package com.tencent.wcdb;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.tencent.wcdb.C46437k.C46438a;

/* renamed from: com.tencent.wcdb.c */
public abstract class C46400c extends Binder implements C46436j {
    /* renamed from: a */
    public static C46436j m145752a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        C46436j jVar = (C46436j) iBinder.queryLocalInterface("android.content.IBulkCursor");
        if (jVar != null) {
            return jVar;
        }
        return new C46401d(iBinder);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                parcel.enforceInterface("android.content.IBulkCursor");
                CursorWindow a = mo115418a(parcel.readInt());
                parcel2.writeNoException();
                if (a == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.content.IBulkCursor");
                mo115419a();
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("android.content.IBulkCursor");
                int a2 = mo115416a(C46438a.m145995a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(a2);
                parcel2.writeBundle(mo115423c());
                return true;
            case 4:
                parcel.enforceInterface("android.content.IBulkCursor");
                mo115422b(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.content.IBulkCursor");
                Bundle c = mo115423c();
                parcel2.writeNoException();
                parcel2.writeBundle(c);
                return true;
            case 6:
                parcel.enforceInterface("android.content.IBulkCursor");
                Bundle a3 = mo115417a(parcel.readBundle(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeBundle(a3);
                return true;
            case 7:
                try {
                    parcel.enforceInterface("android.content.IBulkCursor");
                    mo115421b();
                    parcel2.writeNoException();
                    return true;
                } catch (Exception e) {
                    C46434h.m145974a(parcel2, e);
                    return true;
                }
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
