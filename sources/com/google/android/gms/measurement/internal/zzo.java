package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C16929et();

    /* renamed from: a */
    public String f47548a;

    /* renamed from: b */
    public String f47549b;

    /* renamed from: c */
    public zzfv f47550c;

    /* renamed from: d */
    public long f47551d;

    /* renamed from: e */
    public boolean f47552e;

    /* renamed from: f */
    public String f47553f;

    /* renamed from: g */
    public zzag f47554g;

    /* renamed from: h */
    public long f47555h;

    /* renamed from: i */
    public zzag f47556i;

    /* renamed from: j */
    public long f47557j;

    /* renamed from: k */
    public zzag f47558k;

    zzo(zzo zzo) {
        C15267r.m44384a(zzo);
        this.f47548a = zzo.f47548a;
        this.f47549b = zzo.f47549b;
        this.f47550c = zzo.f47550c;
        this.f47551d = zzo.f47551d;
        this.f47552e = zzo.f47552e;
        this.f47553f = zzo.f47553f;
        this.f47554g = zzo.f47554g;
        this.f47555h = zzo.f47555h;
        this.f47556i = zzo.f47556i;
        this.f47557j = zzo.f47557j;
        this.f47558k = zzo.f47558k;
    }

    zzo(String str, String str2, zzfv zzfv, long j, boolean z, String str3, zzag zzag, long j2, zzag zzag2, long j3, zzag zzag3) {
        this.f47548a = str;
        this.f47549b = str2;
        this.f47550c = zzfv;
        this.f47551d = j;
        this.f47552e = z;
        this.f47553f = str3;
        this.f47554g = zzag;
        this.f47555h = j2;
        this.f47556i = zzag2;
        this.f47557j = j3;
        this.f47558k = zzag3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f47548a, false);
        C15269a.m44457a(parcel, 3, this.f47549b, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f47550c, i, false);
        C15269a.m44448a(parcel, 5, this.f47551d);
        C15269a.m44459a(parcel, 6, this.f47552e);
        C15269a.m44457a(parcel, 7, this.f47553f, false);
        C15269a.m44452a(parcel, 8, (Parcelable) this.f47554g, i, false);
        C15269a.m44448a(parcel, 9, this.f47555h);
        C15269a.m44452a(parcel, 10, (Parcelable) this.f47556i, i, false);
        C15269a.m44448a(parcel, 11, this.f47557j);
        C15269a.m44452a(parcel, 12, (Parcelable) this.f47558k, i, false);
        C15269a.m44443a(parcel, a);
    }
}
