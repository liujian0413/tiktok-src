package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.d */
public final class C14950d implements Creator<zzt> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = SafeParcelReader.m44429n(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = SafeParcelReader.m44419d(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    bArr = SafeParcelReader.m44432q(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.m44409a(parcel, a, PendingIntent.CREATOR);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.m44409a(parcel, a, DeviceMetaData.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzt zzt = new zzt(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
            return zzt;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }
}
