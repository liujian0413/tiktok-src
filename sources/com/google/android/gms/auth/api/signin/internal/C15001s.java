package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.C16320a;
import com.google.android.gms.internal.auth-api.C16322c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public final class C15001s extends C16320a implements C15000r {
    C15001s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo38142a(C14998p pVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = mo42403a();
        C16322c.m53274a(a, (IInterface) pVar);
        C16322c.m53275a(a, (Parcelable) googleSignInOptions);
        mo42404a(102, a);
    }

    /* renamed from: b */
    public final void mo38143b(C14998p pVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = mo42403a();
        C16322c.m53274a(a, (IInterface) pVar);
        C16322c.m53275a(a, (Parcelable) googleSignInOptions);
        mo42404a(103, a);
    }
}
