package com.google.android.gms.internal.p760b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.b.g */
public abstract class C16346g extends C16341b implements C16345f {
    public C16346g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo42433a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo42437a((Status) C16342c.m53292a(parcel, Status.CREATOR));
        return true;
    }
}
