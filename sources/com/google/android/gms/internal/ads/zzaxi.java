package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@C6505uv
public final class zzaxi extends AbstractSafeParcelable {
    public static final Creator<zzaxi> CREATOR = new C16126vx();

    /* renamed from: A */
    public final zzbaz f45597A;

    /* renamed from: B */
    public final List<String> f45598B;

    /* renamed from: C */
    public final List<String> f45599C;

    /* renamed from: D */
    public final boolean f45600D;

    /* renamed from: E */
    public final zzaxk f45601E;

    /* renamed from: F */
    public final boolean f45602F;

    /* renamed from: G */
    public String f45603G;

    /* renamed from: H */
    public final List<String> f45604H;

    /* renamed from: I */
    public final boolean f45605I;

    /* renamed from: J */
    public final String f45606J;

    /* renamed from: K */
    public final zzbbq f45607K;

    /* renamed from: L */
    public final String f45608L;

    /* renamed from: M */
    public final boolean f45609M;

    /* renamed from: N */
    public final boolean f45610N;

    /* renamed from: O */
    public final boolean f45611O;

    /* renamed from: P */
    public final int f45612P;

    /* renamed from: Q */
    public final boolean f45613Q;

    /* renamed from: R */
    public final List<String> f45614R;

    /* renamed from: S */
    public final boolean f45615S;

    /* renamed from: T */
    public final String f45616T;

    /* renamed from: U */
    public String f45617U;

    /* renamed from: V */
    public boolean f45618V;

    /* renamed from: W */
    public boolean f45619W;

    /* renamed from: X */
    private zzaxe f45620X;

    /* renamed from: Y */
    private final int f45621Y;

    /* renamed from: Z */
    private zzaxu f45622Z;

    /* renamed from: a */
    public final String f45623a;

    /* renamed from: aa */
    private Bundle f45624aa;

    /* renamed from: b */
    public String f45625b;

    /* renamed from: c */
    public final List<String> f45626c;

    /* renamed from: d */
    public final int f45627d;

    /* renamed from: e */
    public final List<String> f45628e;

    /* renamed from: f */
    public final long f45629f;

    /* renamed from: g */
    public final boolean f45630g;

    /* renamed from: h */
    public final long f45631h;

    /* renamed from: i */
    public final List<String> f45632i;

    /* renamed from: j */
    public final long f45633j;

    /* renamed from: k */
    public final int f45634k;

    /* renamed from: l */
    public final String f45635l;

    /* renamed from: m */
    public final long f45636m;

    /* renamed from: n */
    public final String f45637n;

    /* renamed from: o */
    public final boolean f45638o;

    /* renamed from: p */
    public final String f45639p;

    /* renamed from: q */
    public final String f45640q;

    /* renamed from: r */
    public final boolean f45641r;

    /* renamed from: s */
    public final boolean f45642s;

    /* renamed from: t */
    public final boolean f45643t;

    /* renamed from: u */
    public final boolean f45644u;

    /* renamed from: v */
    public final boolean f45645v;

    /* renamed from: w */
    public String f45646w;

    /* renamed from: x */
    public final String f45647x;

    /* renamed from: y */
    public final boolean f45648y;

    /* renamed from: z */
    public final boolean f45649z;

    public zzaxi(zzaxe zzaxe, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str7, boolean z8, boolean z9, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z10, zzaxk zzaxk, boolean z11, String str8, List<String> list6, boolean z12, String str9, zzbbq zzbbq, String str10, boolean z13, boolean z14, boolean z15, int i2, boolean z16, List<String> list7, boolean z17, String str11, String str12, boolean z18, boolean z19) {
        this(19, str, str2, list, -2, list2, j, z, j2, list3, j3, i, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, null, null, str7, z8, z9, zzbaz, list4, list5, z10, zzaxk, z11, str8, list6, z12, str9, zzbbq, str10, z13, z14, null, z15, 0, z16, list7, z17, str11, str12, z18, z19);
        this.f45620X = zzaxe;
    }

    public zzaxi(zzaxe zzaxe, String str, String str2, List<String> list, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i, String str3, long j4, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z9, zzaxk zzaxk, boolean z10, String str7, List<String> list6, boolean z11, String str8, zzbbq zzbbq, String str9, boolean z12, boolean z13, boolean z14, int i2, boolean z15, List<String> list7, boolean z16, String str10, String str11, boolean z17, boolean z18) {
        this(19, str, str2, list, -2, list2, j, z, -1, list3, j3, i, str3, j4, str4, false, null, str5, z2, z3, z4, z5, false, null, null, str6, z7, z8, zzbaz, list4, list5, z9, zzaxk, z10, str7, list6, z11, str8, zzbbq, str9, z12, z13, null, z14, i2, z15, list7, z16, str10, str11, z17, z18);
        this.f45620X = zzaxe;
    }

    public zzaxi(int i) {
        this(19, null, null, null, i, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false, false);
    }

    public zzaxi(int i, long j) {
        this(19, null, null, null, i, null, -1, false, -1, null, j, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null, null, false, false);
    }

    zzaxi(int i, String str, String str2, List<String> list, int i2, List<String> list2, long j, boolean z, long j2, List<String> list3, long j3, int i3, String str3, long j4, String str4, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, zzaxu zzaxu, String str7, String str8, boolean z8, boolean z9, zzbaz zzbaz, List<String> list4, List<String> list5, boolean z10, zzaxk zzaxk, boolean z11, String str9, List<String> list6, boolean z12, String str10, zzbbq zzbbq, String str11, boolean z13, boolean z14, Bundle bundle, boolean z15, int i4, boolean z16, List<String> list7, boolean z17, String str12, String str13, boolean z18, boolean z19) {
        this.f45621Y = i;
        this.f45623a = str;
        this.f45625b = str2;
        List<String> list8 = null;
        this.f45626c = list != null ? Collections.unmodifiableList(list) : null;
        this.f45627d = i2;
        this.f45628e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f45629f = j;
        this.f45630g = z;
        this.f45631h = j2;
        this.f45632i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f45633j = j3;
        this.f45634k = i3;
        this.f45635l = str3;
        this.f45636m = j4;
        this.f45637n = str4;
        this.f45638o = z2;
        this.f45639p = str5;
        this.f45640q = str6;
        this.f45641r = z3;
        this.f45642s = z4;
        this.f45643t = z5;
        this.f45644u = z6;
        this.f45609M = z13;
        this.f45645v = z7;
        this.f45622Z = zzaxu;
        this.f45646w = str7;
        this.f45647x = str8;
        if (this.f45625b == null && this.f45622Z != null) {
            zzayi zzayi = (zzayi) this.f45622Z.mo42176a(zzayi.CREATOR);
            if (zzayi != null && !TextUtils.isEmpty(zzayi.f45664a)) {
                this.f45625b = zzayi.f45664a;
            }
        }
        this.f45648y = z8;
        this.f45649z = z9;
        this.f45597A = zzbaz;
        this.f45598B = list4;
        this.f45599C = list5;
        this.f45600D = z10;
        this.f45601E = zzaxk;
        this.f45602F = z11;
        this.f45603G = str9;
        this.f45604H = list6;
        this.f45605I = z12;
        this.f45606J = str10;
        this.f45607K = zzbbq;
        this.f45608L = str11;
        this.f45610N = z14;
        this.f45624aa = bundle;
        this.f45611O = z15;
        this.f45612P = i4;
        this.f45613Q = z16;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        this.f45614R = list8;
        this.f45615S = z17;
        this.f45616T = str12;
        this.f45617U = str13;
        this.f45618V = z18;
        this.f45619W = z19;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f45620X != null && this.f45620X.f45564a >= 9 && !TextUtils.isEmpty(this.f45625b)) {
            this.f45622Z = new zzaxu((SafeParcelable) new zzayi(this.f45625b));
            this.f45625b = null;
        }
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f45621Y);
        C15269a.m44457a(parcel, 2, this.f45623a, false);
        C15269a.m44457a(parcel, 3, this.f45625b, false);
        C15269a.m44466b(parcel, 4, this.f45626c, false);
        C15269a.m44447a(parcel, 5, this.f45627d);
        C15269a.m44466b(parcel, 6, this.f45628e, false);
        C15269a.m44448a(parcel, 7, this.f45629f);
        C15269a.m44459a(parcel, 8, this.f45630g);
        C15269a.m44448a(parcel, 9, this.f45631h);
        C15269a.m44466b(parcel, 10, this.f45632i, false);
        C15269a.m44448a(parcel, 11, this.f45633j);
        C15269a.m44447a(parcel, 12, this.f45634k);
        C15269a.m44457a(parcel, 13, this.f45635l, false);
        C15269a.m44448a(parcel, 14, this.f45636m);
        C15269a.m44457a(parcel, 15, this.f45637n, false);
        C15269a.m44459a(parcel, 18, this.f45638o);
        C15269a.m44457a(parcel, 19, this.f45639p, false);
        C15269a.m44457a(parcel, 21, this.f45640q, false);
        C15269a.m44459a(parcel, 22, this.f45641r);
        C15269a.m44459a(parcel, 23, this.f45642s);
        C15269a.m44459a(parcel, 24, this.f45643t);
        C15269a.m44459a(parcel, 25, this.f45644u);
        C15269a.m44459a(parcel, 26, this.f45645v);
        C15269a.m44452a(parcel, 28, (Parcelable) this.f45622Z, i, false);
        C15269a.m44457a(parcel, 29, this.f45646w, false);
        C15269a.m44457a(parcel, 30, this.f45647x, false);
        C15269a.m44459a(parcel, 31, this.f45648y);
        C15269a.m44459a(parcel, 32, this.f45649z);
        C15269a.m44452a(parcel, 33, (Parcelable) this.f45597A, i, false);
        C15269a.m44466b(parcel, 34, this.f45598B, false);
        C15269a.m44466b(parcel, 35, this.f45599C, false);
        C15269a.m44459a(parcel, 36, this.f45600D);
        C15269a.m44452a(parcel, 37, (Parcelable) this.f45601E, i, false);
        C15269a.m44459a(parcel, 38, this.f45602F);
        C15269a.m44457a(parcel, 39, this.f45603G, false);
        C15269a.m44466b(parcel, 40, this.f45604H, false);
        C15269a.m44459a(parcel, 42, this.f45605I);
        C15269a.m44457a(parcel, 43, this.f45606J, false);
        C15269a.m44452a(parcel, 44, (Parcelable) this.f45607K, i, false);
        C15269a.m44457a(parcel, 45, this.f45608L, false);
        C15269a.m44459a(parcel, 46, this.f45609M);
        C15269a.m44459a(parcel, 47, this.f45610N);
        C15269a.m44449a(parcel, 48, this.f45624aa, false);
        C15269a.m44459a(parcel, 49, this.f45611O);
        C15269a.m44447a(parcel, 50, this.f45612P);
        C15269a.m44459a(parcel, 51, this.f45613Q);
        C15269a.m44466b(parcel, 52, this.f45614R, false);
        C15269a.m44459a(parcel, 53, this.f45615S);
        C15269a.m44457a(parcel, 54, this.f45616T, false);
        C15269a.m44457a(parcel, 55, this.f45617U, false);
        C15269a.m44459a(parcel, 56, this.f45618V);
        C15269a.m44459a(parcel, 57, this.f45619W);
        C15269a.m44443a(parcel, a);
    }
}
