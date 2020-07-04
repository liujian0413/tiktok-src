package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.b */
public final class C14957b implements Creator<Credential> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    str = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 2:
                    str2 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m44409a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = SafeParcelReader.m44418c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 6:
                    str4 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 9:
                    str5 = SafeParcelReader.m44429n(parcel, a);
                    break;
                case 10:
                    str6 = SafeParcelReader.m44429n(parcel, a);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }
}
