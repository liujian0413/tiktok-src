package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C15003u implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m44429n(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.m44409a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }
}
