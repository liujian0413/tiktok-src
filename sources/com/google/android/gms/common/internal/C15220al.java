package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.internal.p761c.C16357b;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.common.internal.al */
public abstract class C15220al extends C16357b implements C15219ak {
    public C15220al() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C15219ak m44237a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C15219ak) {
            return (C15219ak) queryLocalInterface;
        }
        return new C15221am(iBinder);
    }

    /* renamed from: a */
    public final boolean mo38544a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C15345b a = mo38542a();
                parcel2.writeNoException();
                C16358c.m53321a(parcel2, (IInterface) a);
                break;
            case 2:
                int b = mo38543b();
                parcel2.writeNoException();
                parcel2.writeInt(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
