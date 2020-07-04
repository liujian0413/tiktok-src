package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.internal.ads.C6505uv;

@C6505uv
public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new C14835b();

    /* renamed from: a */
    public final String f38467a;

    /* renamed from: b */
    public final String f38468b;

    /* renamed from: c */
    public final String f38469c;

    /* renamed from: d */
    public final String f38470d;

    /* renamed from: e */
    public final String f38471e;

    /* renamed from: f */
    public final Intent f38472f;

    /* renamed from: g */
    private final String f38473g;

    /* renamed from: h */
    private final String f38474h;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    public zzc(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f38473g = str;
        this.f38467a = str2;
        this.f38468b = str3;
        this.f38469c = str4;
        this.f38470d = str5;
        this.f38471e = str6;
        this.f38474h = str7;
        this.f38472f = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f38473g, false);
        C15269a.m44457a(parcel, 3, this.f38467a, false);
        C15269a.m44457a(parcel, 4, this.f38468b, false);
        C15269a.m44457a(parcel, 5, this.f38469c, false);
        C15269a.m44457a(parcel, 6, this.f38470d, false);
        C15269a.m44457a(parcel, 7, this.f38471e, false);
        C15269a.m44457a(parcel, 8, this.f38474h, false);
        C15269a.m44452a(parcel, 9, (Parcelable) this.f38472f, i, false);
        C15269a.m44443a(parcel, a);
    }
}
