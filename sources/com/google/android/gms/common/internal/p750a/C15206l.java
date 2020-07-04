package com.google.android.gms.common.internal.p750a;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.C16353b;

/* renamed from: com.google.android.gms.common.internal.a.l */
public abstract class C15206l extends C16353b implements C15205k {
    public C15206l() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    /* renamed from: a */
    public final boolean mo38517a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo38515a(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
