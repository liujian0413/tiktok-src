package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
public final class C14959d implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 2:
                        z2 = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 3:
                        z3 = SafeParcelReader.m44415b(parcel, a);
                        break;
                    case 4:
                        i2 = SafeParcelReader.m44419d(parcel, a);
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
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(i, z, z2, z3, i2);
        return credentialPickerConfig;
    }
}
