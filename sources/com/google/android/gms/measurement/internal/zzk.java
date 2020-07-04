package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C16926eq();

    /* renamed from: a */
    public final String f47530a;

    /* renamed from: b */
    public final String f47531b;

    /* renamed from: c */
    public final String f47532c;

    /* renamed from: d */
    public final String f47533d;

    /* renamed from: e */
    public final long f47534e;

    /* renamed from: f */
    public final long f47535f;

    /* renamed from: g */
    public final String f47536g;

    /* renamed from: h */
    public final boolean f47537h;

    /* renamed from: i */
    public final boolean f47538i;

    /* renamed from: j */
    public final long f47539j;

    /* renamed from: k */
    public final String f47540k;

    /* renamed from: l */
    public final long f47541l;

    /* renamed from: m */
    public final long f47542m;

    /* renamed from: n */
    public final int f47543n;

    /* renamed from: o */
    public final boolean f47544o;

    /* renamed from: p */
    public final boolean f47545p;

    /* renamed from: q */
    public final boolean f47546q;

    /* renamed from: r */
    public final String f47547r;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        C15267r.m44386a(str);
        this.f47530a = str;
        this.f47531b = TextUtils.isEmpty(str2) ? null : str2;
        this.f47532c = str3;
        this.f47539j = j;
        this.f47533d = str4;
        this.f47534e = j2;
        this.f47535f = j3;
        this.f47536g = str5;
        this.f47537h = z;
        this.f47538i = z2;
        this.f47540k = str6;
        this.f47541l = j4;
        this.f47542m = j5;
        this.f47543n = i;
        this.f47544o = z3;
        this.f47545p = z4;
        this.f47546q = z5;
        this.f47547r = str7;
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.f47530a = str;
        this.f47531b = str2;
        this.f47532c = str3;
        this.f47539j = j3;
        this.f47533d = str4;
        this.f47534e = j;
        this.f47535f = j2;
        this.f47536g = str5;
        this.f47537h = z;
        this.f47538i = z2;
        this.f47540k = str6;
        this.f47541l = j4;
        this.f47542m = j5;
        this.f47543n = i;
        this.f47544o = z3;
        this.f47545p = z4;
        this.f47546q = z5;
        this.f47547r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f47530a, false);
        C15269a.m44457a(parcel, 3, this.f47531b, false);
        C15269a.m44457a(parcel, 4, this.f47532c, false);
        C15269a.m44457a(parcel, 5, this.f47533d, false);
        C15269a.m44448a(parcel, 6, this.f47534e);
        C15269a.m44448a(parcel, 7, this.f47535f);
        C15269a.m44457a(parcel, 8, this.f47536g, false);
        C15269a.m44459a(parcel, 9, this.f47537h);
        C15269a.m44459a(parcel, 10, this.f47538i);
        C15269a.m44448a(parcel, 11, this.f47539j);
        C15269a.m44457a(parcel, 12, this.f47540k, false);
        C15269a.m44448a(parcel, 13, this.f47541l);
        C15269a.m44448a(parcel, 14, this.f47542m);
        C15269a.m44447a(parcel, 15, this.f47543n);
        C15269a.m44459a(parcel, 16, this.f47544o);
        C15269a.m44459a(parcel, 17, this.f47545p);
        C15269a.m44459a(parcel, 18, this.f47546q);
        C15269a.m44457a(parcel, 19, this.f47547r, false);
        C15269a.m44443a(parcel, a);
    }
}
