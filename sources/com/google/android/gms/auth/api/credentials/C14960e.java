package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.e */
public final class C14960e implements Creator<CredentialRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
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
                        z = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 2:
                        strArr = SafeParcelReader.m44440y(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m44409a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.m44409a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 6:
                        str = SafeParcelReader.m44429n(parcel, a);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m44429n(parcel, a);
                        break;
                    case 8:
                        z3 = SafeParcelReader.m44415b(parcel, a);
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
        CredentialRequest credentialRequest = new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return credentialRequest;
    }
}
