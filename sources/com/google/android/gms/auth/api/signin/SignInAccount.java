package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C14981i();

    /* renamed from: a */
    public GoogleSignInAccount f38809a;

    /* renamed from: b */
    private String f38810b;

    /* renamed from: c */
    private String f38811c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f38809a = googleSignInAccount;
        this.f38810b = C15267r.m44387a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f38811c = C15267r.m44387a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 4, this.f38810b, false);
        C15269a.m44452a(parcel, 7, (Parcelable) this.f38809a, i, false);
        C15269a.m44457a(parcel, 8, this.f38811c, false);
        C15269a.m44443a(parcel, a);
    }
}
