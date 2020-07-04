package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.C16321b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.o */
public abstract class C14997o extends C16321b implements C14996n {
    public C14997o() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* renamed from: a */
    public final boolean mo38141a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo38139a();
                break;
            case 2:
                mo38140b();
                break;
            default:
                return false;
        }
        return true;
    }
}
