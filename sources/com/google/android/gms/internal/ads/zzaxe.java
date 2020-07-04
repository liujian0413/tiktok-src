package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@C6505uv
public final class zzaxe extends AbstractSafeParcelable {
    public static final Creator<zzaxe> CREATOR = new C16124vv();

    /* renamed from: A */
    public final long f45538A;

    /* renamed from: B */
    public final String f45539B;

    /* renamed from: C */
    public final float f45540C;

    /* renamed from: D */
    public final int f45541D;

    /* renamed from: E */
    public final int f45542E;

    /* renamed from: F */
    public final boolean f45543F;

    /* renamed from: G */
    public final boolean f45544G;

    /* renamed from: H */
    public final String f45545H;

    /* renamed from: I */
    public final boolean f45546I;

    /* renamed from: J */
    public final String f45547J;

    /* renamed from: K */
    public final boolean f45548K;

    /* renamed from: L */
    public final int f45549L;

    /* renamed from: M */
    public final Bundle f45550M;

    /* renamed from: N */
    public final String f45551N;

    /* renamed from: O */
    public final zzabp f45552O;

    /* renamed from: P */
    public final boolean f45553P;

    /* renamed from: Q */
    public final Bundle f45554Q;

    /* renamed from: R */
    public final String f45555R;

    /* renamed from: S */
    public final String f45556S;

    /* renamed from: T */
    public final String f45557T;

    /* renamed from: U */
    public final boolean f45558U;

    /* renamed from: V */
    public final List<Integer> f45559V;

    /* renamed from: W */
    public final String f45560W;

    /* renamed from: X */
    public final List<String> f45561X;

    /* renamed from: Y */
    public final int f45562Y;

    /* renamed from: Z */
    public final boolean f45563Z;

    /* renamed from: a */
    public final int f45564a;

    /* renamed from: aa */
    public final boolean f45565aa;

    /* renamed from: ab */
    public final boolean f45566ab;

    /* renamed from: ac */
    public final ArrayList<String> f45567ac;

    /* renamed from: ad */
    public final String f45568ad;

    /* renamed from: ae */
    public final zzaks f45569ae;

    /* renamed from: af */
    public final String f45570af;

    /* renamed from: ag */
    public final Bundle f45571ag;

    /* renamed from: b */
    public final Bundle f45572b;

    /* renamed from: c */
    public final zzyv f45573c;

    /* renamed from: d */
    public final zzyz f45574d;

    /* renamed from: e */
    public final String f45575e;

    /* renamed from: f */
    public final ApplicationInfo f45576f;

    /* renamed from: g */
    public final PackageInfo f45577g;

    /* renamed from: h */
    public final String f45578h;

    /* renamed from: i */
    public final String f45579i;

    /* renamed from: j */
    public final String f45580j;

    /* renamed from: k */
    public final zzbgz f45581k;

    /* renamed from: l */
    public final Bundle f45582l;

    /* renamed from: m */
    public final int f45583m;

    /* renamed from: n */
    public final List<String> f45584n;

    /* renamed from: o */
    public final Bundle f45585o;

    /* renamed from: p */
    public final boolean f45586p;

    /* renamed from: q */
    public final int f45587q;

    /* renamed from: r */
    public final int f45588r;

    /* renamed from: s */
    public final float f45589s;

    /* renamed from: t */
    public final String f45590t;

    /* renamed from: u */
    public final long f45591u;

    /* renamed from: v */
    public final String f45592v;

    /* renamed from: w */
    public final List<String> f45593w;

    /* renamed from: x */
    public final String f45594x;

    /* renamed from: y */
    public final zzafl f45595y;

    /* renamed from: z */
    public final List<String> f45596z;

    private zzaxe(Bundle bundle, zzyv zzyv, zzyz zzyz, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbgz zzbgz, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzafl zzafl, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzabp zzabp, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzaks zzaks, String str17, Bundle bundle6) {
        this(24, bundle, zzyv, zzyz, str, applicationInfo, packageInfo, str2, str3, str4, zzbgz, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzafl, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzabp, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzaks, str17, bundle6);
    }

    public zzaxe(C16123vu vuVar, long j, String str, String str2, String str3, String str4) {
        C16123vu vuVar2 = vuVar;
        long j2 = j;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Bundle bundle = vuVar2.f45202a;
        zzyv zzyv = vuVar2.f45204b;
        zzyz zzyz = vuVar2.f45205c;
        this(bundle, zzyv, zzyz, vuVar2.f45206d, vuVar2.f45207e, vuVar2.f45208f, (String) afy.m45822a(vuVar2.f45192Q, ""), vuVar2.f45209g, vuVar2.f45210h, vuVar2.f45212j, vuVar2.f45211i, vuVar2.f45213k, vuVar2.f45214l, vuVar2.f45215m, vuVar2.f45217o, vuVar2.f45218p, vuVar2.f45219q, vuVar2.f45220r, vuVar2.f45221s, vuVar2.f45222t, vuVar2.f45223u, vuVar2.f45224v, vuVar2.f45225w, vuVar2.f45226x, vuVar2.f45227y, j2, vuVar2.f45228z, vuVar2.f45176A, vuVar2.f45177B, vuVar2.f45178C, vuVar2.f45179D, vuVar2.f45180E, vuVar2.f45181F, (String) afy.m45823a(vuVar2.f45182G, "", 1, TimeUnit.SECONDS), vuVar2.f45183H, vuVar2.f45184I, vuVar2.f45185J, vuVar2.f45186K, vuVar2.f45187L, vuVar2.f45188M, vuVar2.f45189N, vuVar2.f45190O, str5, str6, str7, vuVar2.f45191P, vuVar2.f45193R, vuVar2.f45194S, vuVar2.f45216n, vuVar2.f45195T, vuVar2.f45196U, vuVar2.f45197V, vuVar2.f45198W, vuVar2.f45199X, vuVar2.f45200Y, vuVar2.f45201Z, str8, vuVar2.f45203aa);
    }

    zzaxe(int i, Bundle bundle, zzyv zzyv, zzyz zzyz, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbgz zzbgz, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzafl zzafl, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzabp zzabp, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzaks zzaks, String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f45564a = i;
        this.f45572b = bundle;
        this.f45573c = zzyv;
        this.f45574d = zzyz;
        this.f45575e = str;
        this.f45576f = applicationInfo;
        this.f45577g = packageInfo;
        this.f45578h = str2;
        this.f45579i = str3;
        this.f45580j = str4;
        this.f45581k = zzbgz;
        this.f45582l = bundle2;
        this.f45583m = i2;
        this.f45584n = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f45596z = list6;
        this.f45585o = bundle3;
        this.f45586p = z;
        this.f45587q = i3;
        this.f45588r = i4;
        this.f45589s = f;
        this.f45590t = str5;
        this.f45591u = j;
        this.f45592v = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f45593w = list7;
        this.f45594x = str7;
        this.f45595y = zzafl;
        this.f45538A = j2;
        this.f45539B = str8;
        this.f45540C = f2;
        this.f45546I = z2;
        this.f45541D = i5;
        this.f45542E = i6;
        this.f45543F = z3;
        this.f45544G = z4;
        this.f45545H = str9;
        this.f45547J = str10;
        this.f45548K = z5;
        this.f45549L = i7;
        this.f45550M = bundle4;
        this.f45551N = str11;
        this.f45552O = zzabp;
        this.f45553P = z6;
        this.f45554Q = bundle5;
        this.f45555R = str12;
        this.f45556S = str13;
        this.f45557T = str14;
        this.f45558U = z7;
        this.f45559V = list4;
        this.f45560W = str15;
        this.f45561X = list5;
        this.f45562Y = i8;
        this.f45563Z = z8;
        this.f45565aa = z9;
        this.f45566ab = z10;
        this.f45567ac = arrayList;
        this.f45568ad = str16;
        this.f45569ae = zzaks;
        this.f45570af = str17;
        this.f45571ag = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45564a);
        C15269a.m44449a(parcel, 2, this.f45572b, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f45573c, i, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f45574d, i, false);
        C15269a.m44457a(parcel, 5, this.f45575e, false);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f45576f, i, false);
        C15269a.m44452a(parcel, 7, (Parcelable) this.f45577g, i, false);
        C15269a.m44457a(parcel, 8, this.f45578h, false);
        C15269a.m44457a(parcel, 9, this.f45579i, false);
        C15269a.m44457a(parcel, 10, this.f45580j, false);
        C15269a.m44452a(parcel, 11, (Parcelable) this.f45581k, i, false);
        C15269a.m44449a(parcel, 12, this.f45582l, false);
        C15269a.m44447a(parcel, 13, this.f45583m);
        C15269a.m44466b(parcel, 14, this.f45584n, false);
        C15269a.m44449a(parcel, 15, this.f45585o, false);
        C15269a.m44459a(parcel, 16, this.f45586p);
        C15269a.m44447a(parcel, 18, this.f45587q);
        C15269a.m44447a(parcel, 19, this.f45588r);
        C15269a.m44446a(parcel, 20, this.f45589s);
        C15269a.m44457a(parcel, 21, this.f45590t, false);
        C15269a.m44448a(parcel, 25, this.f45591u);
        C15269a.m44457a(parcel, 26, this.f45592v, false);
        C15269a.m44466b(parcel, 27, this.f45593w, false);
        C15269a.m44457a(parcel, 28, this.f45594x, false);
        C15269a.m44452a(parcel, 29, (Parcelable) this.f45595y, i, false);
        C15269a.m44466b(parcel, 30, this.f45596z, false);
        C15269a.m44448a(parcel, 31, this.f45538A);
        C15269a.m44457a(parcel, 33, this.f45539B, false);
        C15269a.m44446a(parcel, 34, this.f45540C);
        C15269a.m44447a(parcel, 35, this.f45541D);
        C15269a.m44447a(parcel, 36, this.f45542E);
        C15269a.m44459a(parcel, 37, this.f45543F);
        C15269a.m44459a(parcel, 38, this.f45544G);
        C15269a.m44457a(parcel, 39, this.f45545H, false);
        C15269a.m44459a(parcel, 40, this.f45546I);
        C15269a.m44457a(parcel, 41, this.f45547J, false);
        C15269a.m44459a(parcel, 42, this.f45548K);
        C15269a.m44447a(parcel, 43, this.f45549L);
        C15269a.m44449a(parcel, 44, this.f45550M, false);
        C15269a.m44457a(parcel, 45, this.f45551N, false);
        C15269a.m44452a(parcel, 46, (Parcelable) this.f45552O, i, false);
        C15269a.m44459a(parcel, 47, this.f45553P);
        C15269a.m44449a(parcel, 48, this.f45554Q, false);
        C15269a.m44457a(parcel, 49, this.f45555R, false);
        C15269a.m44457a(parcel, 50, this.f45556S, false);
        C15269a.m44457a(parcel, 51, this.f45557T, false);
        C15269a.m44459a(parcel, 52, this.f45558U);
        C15269a.m44458a(parcel, 53, this.f45559V, false);
        C15269a.m44457a(parcel, 54, this.f45560W, false);
        C15269a.m44466b(parcel, 55, this.f45561X, false);
        C15269a.m44447a(parcel, 56, this.f45562Y);
        C15269a.m44459a(parcel, 57, this.f45563Z);
        C15269a.m44459a(parcel, 58, this.f45565aa);
        C15269a.m44459a(parcel, 59, this.f45566ab);
        C15269a.m44466b(parcel, 60, this.f45567ac, false);
        C15269a.m44457a(parcel, 61, this.f45568ad, false);
        C15269a.m44452a(parcel, 63, (Parcelable) this.f45569ae, i, false);
        C15269a.m44457a(parcel, 64, this.f45570af, false);
        C15269a.m44449a(parcel, 65, this.f45571ag, false);
        C15269a.m44443a(parcel, a);
    }
}
