package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzaf extends AbstractSafeParcelable {
    public static final Creator<zzaf> CREATOR = new C16333d();

    /* renamed from: a */
    private final int f45824a = 1;

    /* renamed from: b */
    private final String f45825b;

    /* renamed from: c */
    private final byte[] f45826c;

    zzaf(int i, String str, byte[] bArr) {
        this.f45825b = (String) C15267r.m44384a(str);
        this.f45826c = (byte[]) C15267r.m44384a(bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45824a);
        C15269a.m44457a(parcel, 2, this.f45825b, false);
        C15269a.m44460a(parcel, 3, this.f45826c, false);
        C15269a.m44443a(parcel, a);
    }
}
