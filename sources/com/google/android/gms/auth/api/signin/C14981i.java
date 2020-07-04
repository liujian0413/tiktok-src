package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.i */
public final class C14981i implements Creator<SignInAccount> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = "";
        String str2 = "";
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 4) {
                switch (a2) {
                    case 7:
                        googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m44409a(parcel, a, GoogleSignInAccount.CREATOR);
                        break;
                    case 8:
                        str2 = SafeParcelReader.m44429n(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m44410a(parcel, a);
                        break;
                }
            } else {
                str = SafeParcelReader.m44429n(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }
}
