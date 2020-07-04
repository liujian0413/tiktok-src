package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
public final class C14969c implements Creator<ProxyResponse> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        i2 = SafeParcelReader.m44419d(parcel, a);
                        break;
                    case 2:
                        pendingIntent = (PendingIntent) SafeParcelReader.m44409a(parcel, a, PendingIntent.CREATOR);
                        break;
                    case 3:
                        i3 = SafeParcelReader.m44419d(parcel, a);
                        break;
                    case 4:
                        bundle = SafeParcelReader.m44431p(parcel, a);
                        break;
                    case 5:
                        bArr = SafeParcelReader.m44432q(parcel, a);
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
        ProxyResponse proxyResponse = new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
        return proxyResponse;
    }
}
