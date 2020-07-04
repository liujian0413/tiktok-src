package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzah extends AbstractSafeParcelable {
    public static final Creator<zzah> CREATOR = new C16334e();

    /* renamed from: a */
    private final int f45827a = 1;

    /* renamed from: b */
    private final String f45828b;

    /* renamed from: c */
    private final PendingIntent f45829c;

    zzah(int i, String str, PendingIntent pendingIntent) {
        this.f45828b = (String) C15267r.m44384a(str);
        this.f45829c = (PendingIntent) C15267r.m44384a(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45827a);
        C15269a.m44457a(parcel, 2, this.f45828b, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f45829c, i, false);
        C15269a.m44443a(parcel, a);
    }
}
