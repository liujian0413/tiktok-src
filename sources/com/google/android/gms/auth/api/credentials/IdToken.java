package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<IdToken> CREATOR = new C14963h();

    /* renamed from: a */
    public final String f38739a;

    /* renamed from: b */
    public final String f38740b;

    public IdToken(String str, String str2) {
        C15267r.m44395b(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        C15267r.m44395b(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.f38739a = str;
        this.f38740b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f38739a, false);
        C15269a.m44457a(parcel, 2, this.f38740b, false);
        C15269a.m44443a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return C15265q.m44381a(this.f38739a, idToken.f38739a) && C15265q.m44381a(this.f38740b, idToken.f38740b);
    }
}
