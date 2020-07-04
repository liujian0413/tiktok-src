package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.g */
public final class C14979g implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m44418c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m44409a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 6:
                    z3 = SafeParcelReader.m44415b(parcel, a);
                    break;
                case 7:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m44418c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2);
        return googleSignInOptions;
    }
}
