package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public final class zam extends AbstractSafeParcelable {
    public static final Creator<zam> CREATOR = new C15303j();

    /* renamed from: a */
    final String f39544a;

    /* renamed from: b */
    final Field<?, ?> f39545b;

    /* renamed from: c */
    private final int f39546c;

    zam(int i, String str, Field<?, ?> field) {
        this.f39546c = i;
        this.f39544a = str;
        this.f39545b = field;
    }

    zam(String str, Field<?, ?> field) {
        this.f39546c = 1;
        this.f39544a = str;
        this.f39545b = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39546c);
        C15269a.m44457a(parcel, 2, this.f39544a, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f39545b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
