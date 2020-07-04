package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Creator<ProxyResponse> CREATOR = new C14969c();

    /* renamed from: a */
    public final int f38756a;

    /* renamed from: b */
    public final PendingIntent f38757b;

    /* renamed from: c */
    public final int f38758c;

    /* renamed from: d */
    public final byte[] f38759d;

    /* renamed from: e */
    private final int f38760e;

    /* renamed from: f */
    private final Bundle f38761f;

    ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f38760e = i;
        this.f38756a = i2;
        this.f38758c = i3;
        this.f38761f = bundle;
        this.f38759d = bArr;
        this.f38757b = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38756a);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f38757b, i, false);
        C15269a.m44447a(parcel, 3, this.f38758c);
        C15269a.m44449a(parcel, 4, this.f38761f, false);
        C15269a.m44460a(parcel, 5, this.f38759d, false);
        C15269a.m44447a(parcel, 1000, this.f38760e);
        C15269a.m44443a(parcel, a);
    }
}
