package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Creator<DeviceMetaData> CREATOR = new C14951e();

    /* renamed from: a */
    public boolean f38663a;

    /* renamed from: b */
    public long f38664b;

    /* renamed from: c */
    public final boolean f38665c;

    /* renamed from: d */
    private final int f38666d;

    DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.f38666d = i;
        this.f38663a = z;
        this.f38664b = j;
        this.f38665c = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38666d);
        C15269a.m44459a(parcel, 2, this.f38663a);
        C15269a.m44448a(parcel, 3, this.f38664b);
        C15269a.m44459a(parcel, 4, this.f38665c);
        C15269a.m44443a(parcel, a);
    }
}
