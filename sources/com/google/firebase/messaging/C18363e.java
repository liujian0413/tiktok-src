package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.messaging.e */
public final class C18363e implements Creator<RemoteMessage> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            if (SafeParcelReader.m44407a(a) != 2) {
                SafeParcelReader.m44410a(parcel, a);
            } else {
                bundle = SafeParcelReader.m44431p(parcel, a);
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        return new RemoteMessage(bundle);
    }
}
