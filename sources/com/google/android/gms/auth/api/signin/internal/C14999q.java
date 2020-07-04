package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.C16321b;
import com.google.android.gms.internal.auth-api.C16322c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C14999q extends C16321b implements C14998p {
    public C14999q() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo38141a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case BaseNotice.HASHTAG /*101*/:
                mo38126a((GoogleSignInAccount) C16322c.m53273a(parcel, GoogleSignInAccount.CREATOR), (Status) C16322c.m53273a(parcel, Status.CREATOR));
                break;
            case 102:
                mo38127a((Status) C16322c.m53273a(parcel, Status.CREATOR));
                break;
            case 103:
                mo38128b((Status) C16322c.m53273a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
