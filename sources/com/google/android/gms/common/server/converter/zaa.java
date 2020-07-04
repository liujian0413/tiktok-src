package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.C15292a;

public final class zaa extends AbstractSafeParcelable {
    public static final Creator<zaa> CREATOR = new C15289a();

    /* renamed from: a */
    private final int f39504a;

    /* renamed from: b */
    private final StringToIntConverter f39505b;

    zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f39504a = i;
        this.f39505b = stringToIntConverter;
    }

    private zaa(StringToIntConverter stringToIntConverter) {
        this.f39504a = 1;
        this.f39505b = stringToIntConverter;
    }

    /* renamed from: a */
    public static zaa m44499a(C15292a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: a */
    public final C15292a<?, ?> mo38641a() {
        if (this.f39505b != null) {
            return this.f39505b;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39504a);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f39505b, i, false);
        C15269a.m44443a(parcel, a);
    }
}
