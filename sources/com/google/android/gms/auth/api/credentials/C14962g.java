package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.g */
public final class C14962g implements Creator<HintRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m44409a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 3:
                        z2 = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 4:
                        strArr = SafeParcelReader.m44440y(parcel, a);
                        break;
                    case 5:
                        z3 = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 6:
                        str = SafeParcelReader.m44429n(parcel, a);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m44429n(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m44410a(parcel, a);
                        break;
                }
            } else {
                i = SafeParcelReader.m44419d(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        HintRequest hintRequest = new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return hintRequest;
    }
}
