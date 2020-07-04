package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C16353b;
import com.google.android.gms.internal.base.C16354c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C16972e extends C16353b implements C16971d {
    public C16972e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo38517a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                C16354c.m53312a(parcel, ConnectionResult.CREATOR);
                C16354c.m53312a(parcel, zaa.CREATOR);
                break;
            case 4:
                C16354c.m53312a(parcel, Status.CREATOR);
                break;
            case 6:
                C16354c.m53312a(parcel, Status.CREATOR);
                break;
            case 7:
                C16354c.m53312a(parcel, Status.CREATOR);
                C16354c.m53312a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo38289a((zaj) C16354c.m53312a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
