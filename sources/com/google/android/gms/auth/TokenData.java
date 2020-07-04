package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<TokenData> CREATOR = new C15007d();

    /* renamed from: a */
    public final String f38640a;

    /* renamed from: b */
    private final int f38641b;

    /* renamed from: c */
    private final Long f38642c;

    /* renamed from: d */
    private final boolean f38643d;

    /* renamed from: e */
    private final boolean f38644e;

    /* renamed from: f */
    private final List<String> f38645f;

    /* renamed from: g */
    private final String f38646g;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f38641b = i;
        this.f38640a = C15267r.m44386a(str);
        this.f38642c = l;
        this.f38643d = z;
        this.f38644e = z2;
        this.f38645f = list;
        this.f38646g = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f38640a, tokenData.f38640a) || !C15265q.m44381a(this.f38642c, tokenData.f38642c) || this.f38643d != tokenData.f38643d || this.f38644e != tokenData.f38644e || !C15265q.m44381a(this.f38645f, tokenData.f38645f) || !C15265q.m44381a(this.f38646g, tokenData.f38646g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C15265q.m44379a(this.f38640a, this.f38642c, Boolean.valueOf(this.f38643d), Boolean.valueOf(this.f38644e), this.f38645f, this.f38646g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38641b);
        C15269a.m44457a(parcel, 2, this.f38640a, false);
        C15269a.m44456a(parcel, 3, this.f38642c, false);
        C15269a.m44459a(parcel, 4, this.f38643d);
        C15269a.m44459a(parcel, 5, this.f38644e);
        C15269a.m44466b(parcel, 6, this.f38645f, false);
        C15269a.m44457a(parcel, 7, this.f38646g, false);
        C15269a.m44443a(parcel, a);
    }
}
