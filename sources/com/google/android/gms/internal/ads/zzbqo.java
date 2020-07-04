package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzbqo extends AbstractSafeParcelable {
    public static final Creator<zzbqo> CREATOR = new apj();

    /* renamed from: a */
    private final int f45684a;

    /* renamed from: b */
    private final String f45685b;

    /* renamed from: c */
    private final String f45686c;

    zzbqo(int i, String str, String str2) {
        this.f45684a = i;
        this.f45685b = str;
        this.f45686c = str2;
    }

    public zzbqo(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45684a);
        C15269a.m44457a(parcel, 2, this.f45685b, false);
        C15269a.m44457a(parcel, 3, this.f45686c, false);
        C15269a.m44443a(parcel, a);
    }
}
