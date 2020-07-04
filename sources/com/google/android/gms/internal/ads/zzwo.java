package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.io.InputStream;

@C6505uv
public final class zzwo extends AbstractSafeParcelable {
    public static final Creator<zzwo> CREATOR = new bvv();

    /* renamed from: a */
    private ParcelFileDescriptor f45766a;

    public zzwo() {
        this(null);
    }

    public zzwo(ParcelFileDescriptor parcelFileDescriptor) {
        this.f45766a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final synchronized boolean mo42392a() {
        return this.f45766a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream mo42393b() {
        if (this.f45766a == null) {
            return null;
        }
        AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(this.f45766a);
        this.f45766a = null;
        return autoCloseInputStream;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m53210c() {
        return this.f45766a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) m53210c(), i, false);
        C15269a.m44443a(parcel, a);
    }
}
