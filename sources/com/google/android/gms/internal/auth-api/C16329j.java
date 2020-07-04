package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth-api.j */
public final class C16329j implements Creator<zzy> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            if (SafeParcelReader.m44407a(a) != 1) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                credential = (Credential) SafeParcelReader.m44409a(parcel, a, Credential.CREATOR);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new zzy(credential);
    }
}
