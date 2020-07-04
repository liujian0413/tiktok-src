package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class blf implements Creator<zzlg> {
    blf() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzlg(parcel);
    }
}
