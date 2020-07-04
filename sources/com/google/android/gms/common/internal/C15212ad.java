package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.common.internal.ad */
final class C15212ad implements Creator<BinderWrapper> {
    C15212ad() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, null);
    }
}
