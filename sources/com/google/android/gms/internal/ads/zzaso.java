package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.mediation.C14910t;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.taobao.android.dexposed.ClassUtils;

@C6505uv
public final class zzaso extends AbstractSafeParcelable {
    public static final Creator<zzaso> CREATOR = new C15996ra();

    /* renamed from: a */
    private final int f45532a;

    /* renamed from: b */
    private final int f45533b;

    /* renamed from: c */
    private final int f45534c;

    /* renamed from: a */
    public static zzaso m52663a(C14910t tVar) {
        throw new NoSuchMethodError();
    }

    zzaso(int i, int i2, int i3) {
        this.f45532a = i;
        this.f45533b = i2;
        this.f45534c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45532a);
        C15269a.m44447a(parcel, 2, this.f45533b);
        C15269a.m44447a(parcel, 3, this.f45534c);
        C15269a.m44443a(parcel, a);
    }

    public final String toString() {
        int i = this.f45532a;
        int i2 = this.f45533b;
        int i3 = this.f45534c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i2);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(i3);
        return sb.toString();
    }
}
