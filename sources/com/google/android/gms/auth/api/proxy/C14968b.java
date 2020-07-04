package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.b */
public final class C14968b implements Creator<ProxyRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            int a2 = SafeParcelReader.m44407a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        str = SafeParcelReader.m44429n(parcel, a);
                        break;
                    case 2:
                        i2 = SafeParcelReader.m44419d(parcel, a);
                        break;
                    case 3:
                        j = SafeParcelReader.m44421f(parcel, a);
                        break;
                    case 4:
                        bArr = SafeParcelReader.m44432q(parcel, a);
                        break;
                    case 5:
                        bundle = SafeParcelReader.m44431p(parcel, a);
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
        ProxyRequest proxyRequest = new ProxyRequest(i, str, i2, j, bArr, bundle);
        return proxyRequest;
    }
}
