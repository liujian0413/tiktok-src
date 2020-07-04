package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

@C6505uv
public final class zzyv extends AbstractSafeParcelable {
    public static final Creator<zzyv> CREATOR = new bxz();

    /* renamed from: a */
    public final int f45777a;

    /* renamed from: b */
    public final long f45778b;

    /* renamed from: c */
    public final Bundle f45779c;

    /* renamed from: d */
    public final int f45780d;

    /* renamed from: e */
    public final List<String> f45781e;

    /* renamed from: f */
    public final boolean f45782f;

    /* renamed from: g */
    public final int f45783g;

    /* renamed from: h */
    public final boolean f45784h;

    /* renamed from: i */
    public final String f45785i;

    /* renamed from: j */
    public final zzacm f45786j;

    /* renamed from: k */
    public final Location f45787k;

    /* renamed from: l */
    public final String f45788l;

    /* renamed from: m */
    public final Bundle f45789m;

    /* renamed from: n */
    public final Bundle f45790n;

    /* renamed from: o */
    public final List<String> f45791o;

    /* renamed from: p */
    public final String f45792p;

    /* renamed from: q */
    public final String f45793q;

    /* renamed from: r */
    public final boolean f45794r;

    /* renamed from: s */
    public final zzyp f45795s;

    /* renamed from: t */
    public final int f45796t;

    /* renamed from: u */
    public final String f45797u;

    public zzyv(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzacm zzacm, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzyp zzyp, int i4, String str5) {
        this.f45777a = i;
        this.f45778b = j;
        this.f45779c = bundle == null ? new Bundle() : bundle;
        this.f45780d = i2;
        this.f45781e = list;
        this.f45782f = z;
        this.f45783g = i3;
        this.f45784h = z2;
        this.f45785i = str;
        this.f45786j = zzacm;
        this.f45787k = location;
        this.f45788l = str2;
        this.f45789m = bundle2 == null ? new Bundle() : bundle2;
        this.f45790n = bundle3;
        this.f45791o = list2;
        this.f45792p = str3;
        this.f45793q = str4;
        this.f45794r = z3;
        this.f45795s = zzyp;
        this.f45796t = i4;
        this.f45797u = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45777a);
        C15269a.m44448a(parcel, 2, this.f45778b);
        C15269a.m44449a(parcel, 3, this.f45779c, false);
        C15269a.m44447a(parcel, 4, this.f45780d);
        C15269a.m44466b(parcel, 5, this.f45781e, false);
        C15269a.m44459a(parcel, 6, this.f45782f);
        C15269a.m44447a(parcel, 7, this.f45783g);
        C15269a.m44459a(parcel, 8, this.f45784h);
        C15269a.m44457a(parcel, 9, this.f45785i, false);
        C15269a.m44452a(parcel, 10, (Parcelable) this.f45786j, i, false);
        C15269a.m44452a(parcel, 11, (Parcelable) this.f45787k, i, false);
        C15269a.m44457a(parcel, 12, this.f45788l, false);
        C15269a.m44449a(parcel, 13, this.f45789m, false);
        C15269a.m44449a(parcel, 14, this.f45790n, false);
        C15269a.m44466b(parcel, 15, this.f45791o, false);
        C15269a.m44457a(parcel, 16, this.f45792p, false);
        C15269a.m44457a(parcel, 17, this.f45793q, false);
        C15269a.m44459a(parcel, 18, this.f45794r);
        C15269a.m44452a(parcel, 19, (Parcelable) this.f45795s, i, false);
        C15269a.m44447a(parcel, 20, this.f45796t);
        C15269a.m44457a(parcel, 21, this.f45797u, false);
        C15269a.m44443a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyv)) {
            return false;
        }
        zzyv zzyv = (zzyv) obj;
        if (this.f45777a != zzyv.f45777a || this.f45778b != zzyv.f45778b || !C15265q.m44381a(this.f45779c, zzyv.f45779c) || this.f45780d != zzyv.f45780d || !C15265q.m44381a(this.f45781e, zzyv.f45781e) || this.f45782f != zzyv.f45782f || this.f45783g != zzyv.f45783g || this.f45784h != zzyv.f45784h || !C15265q.m44381a(this.f45785i, zzyv.f45785i) || !C15265q.m44381a(this.f45786j, zzyv.f45786j) || !C15265q.m44381a(this.f45787k, zzyv.f45787k) || !C15265q.m44381a(this.f45788l, zzyv.f45788l) || !C15265q.m44381a(this.f45789m, zzyv.f45789m) || !C15265q.m44381a(this.f45790n, zzyv.f45790n) || !C15265q.m44381a(this.f45791o, zzyv.f45791o) || !C15265q.m44381a(this.f45792p, zzyv.f45792p) || !C15265q.m44381a(this.f45793q, zzyv.f45793q) || this.f45794r != zzyv.f45794r || this.f45796t != zzyv.f45796t || !C15265q.m44381a(this.f45797u, zzyv.f45797u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f45777a), Long.valueOf(this.f45778b), this.f45779c, Integer.valueOf(this.f45780d), this.f45781e, Boolean.valueOf(this.f45782f), Integer.valueOf(this.f45783g), Boolean.valueOf(this.f45784h), this.f45785i, this.f45786j, this.f45787k, this.f45788l, this.f45789m, this.f45790n, this.f45791o, this.f45792p, this.f45793q, Boolean.valueOf(this.f45794r), Integer.valueOf(this.f45796t), this.f45797u);
    }

    /* renamed from: a */
    public final zzyv mo42397a() {
        Bundle bundle = this.f45789m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f45779c;
            this.f45789m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.f45779c);
        }
        zzyv zzyv = new zzyv(this.f45777a, this.f45778b, bundle, this.f45780d, this.f45781e, this.f45782f, this.f45783g, this.f45784h, this.f45785i, this.f45786j, this.f45787k, this.f45788l, this.f45789m, this.f45790n, this.f45791o, this.f45792p, this.f45793q, this.f45794r, this.f45795s, this.f45796t, this.f45797u);
        return zzyv;
    }
}
