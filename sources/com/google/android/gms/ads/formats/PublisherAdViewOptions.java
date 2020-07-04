package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.internal.ads.C15914o;
import com.google.android.gms.internal.ads.C15941p;
import com.google.android.gms.internal.ads.C6505uv;

@C6505uv
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Creator<PublisherAdViewOptions> CREATOR = new C14764j();

    /* renamed from: a */
    public final boolean f38109a;

    /* renamed from: b */
    public final C15914o f38110b;

    /* renamed from: c */
    private final IBinder f38111c;

    PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f38109a = z;
        this.f38110b = iBinder != null ? C15941p.m51620a(iBinder) : null;
        this.f38111c = iBinder2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 1, this.f38109a);
        C15269a.m44450a(parcel, 2, this.f38110b == null ? null : this.f38110b.asBinder(), false);
        C15269a.m44450a(parcel, 3, this.f38111c, false);
        C15269a.m44443a(parcel, a);
    }
}
