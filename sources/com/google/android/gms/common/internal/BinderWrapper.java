package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new C15212ad();

    /* renamed from: a */
    private IBinder f39317a;

    public BinderWrapper() {
    }

    public final int describeContents() {
        return 0;
    }

    private BinderWrapper(Parcel parcel) {
        this.f39317a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f39317a);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C15212ad adVar) {
        this(parcel);
    }
}
