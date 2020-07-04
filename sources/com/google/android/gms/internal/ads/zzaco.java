package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public final class zzaco extends zzyz {
    public zzaco(zzyz zzyz) {
        super(zzyz.f45798a, zzyz.f45799b, zzyz.f45800c, zzyz.f45801d, zzyz.f45802e, zzyz.f45803f, zzyz.f45804g, zzyz.f45805h, zzyz.f45806i, zzyz.f45807j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45798a, false);
        C15269a.m44447a(parcel, 3, this.f45799b);
        C15269a.m44447a(parcel, 6, this.f45802e);
        C15269a.m44443a(parcel, a);
    }
}
