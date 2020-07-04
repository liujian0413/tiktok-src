package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.C14745e;
import com.google.android.gms.ads.C14913o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

@C6505uv
public class zzyz extends AbstractSafeParcelable {
    public static final Creator<zzyz> CREATOR = new byc();

    /* renamed from: a */
    public final String f45798a;

    /* renamed from: b */
    public final int f45799b;

    /* renamed from: c */
    public final int f45800c;

    /* renamed from: d */
    public final boolean f45801d;

    /* renamed from: e */
    public final int f45802e;

    /* renamed from: f */
    public final int f45803f;

    /* renamed from: g */
    public final zzyz[] f45804g;

    /* renamed from: h */
    public final boolean f45805h;

    /* renamed from: i */
    public final boolean f45806i;

    /* renamed from: j */
    public boolean f45807j;

    /* renamed from: a */
    public static int m53262a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static int m53265b(DisplayMetrics displayMetrics) {
        return (int) (((float) m53266c(displayMetrics)) * displayMetrics.density);
    }

    /* renamed from: c */
    private static int m53266c(DisplayMetrics displayMetrics) {
        int i = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    /* renamed from: a */
    public static zzyz m53264a(Context context) {
        zzyz zzyz = new zzyz("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
        return zzyz;
    }

    /* renamed from: a */
    public static zzyz m53263a() {
        zzyz zzyz = new zzyz("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
        return zzyz;
    }

    public zzyz() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public zzyz(Context context, C14745e eVar) {
        this(context, new C14745e[]{eVar});
    }

    public zzyz(Context context, C14745e[] eVarArr) {
        int i;
        int i2;
        C14745e eVar = eVarArr[0];
        this.f45806i = eVar.mo37449a();
        if (this.f45806i) {
            this.f45802e = C14745e.f38096a.f38106k;
            this.f45799b = C14745e.f38096a.f38107l;
        } else {
            this.f45802e = eVar.f38106k;
            this.f45799b = eVar.f38107l;
        }
        boolean z = this.f45802e == -1;
        boolean z2 = this.f45799b == -2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (z) {
            if (!afb.m45739d(context) || !afb.m45740e(context)) {
                this.f45803f = displayMetrics.widthPixels;
            } else {
                this.f45803f = displayMetrics.widthPixels - afb.m45741f(context);
            }
            double d = (double) (((float) this.f45803f) / displayMetrics.density);
            i = (int) d;
            double d2 = (double) i;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d - d2 >= 0.01d) {
                i++;
            }
        } else {
            i = this.f45802e;
            this.f45803f = afb.m45722a(displayMetrics, this.f45802e);
        }
        if (z2) {
            i2 = m53266c(displayMetrics);
        } else {
            i2 = this.f45799b;
        }
        this.f45800c = afb.m45722a(displayMetrics, i2);
        if (z || z2) {
            StringBuilder sb = new StringBuilder(26);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("_as");
            this.f45798a = sb.toString();
        } else if (this.f45806i) {
            this.f45798a = "320x50_mb";
        } else {
            this.f45798a = eVar.toString();
        }
        if (eVarArr.length > 1) {
            this.f45804g = new zzyz[eVarArr.length];
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                this.f45804g[i3] = new zzyz(context, eVarArr[i3]);
            }
        } else {
            this.f45804g = null;
        }
        this.f45805h = false;
        this.f45807j = false;
    }

    public zzyz(zzyz zzyz, zzyz[] zzyzArr) {
        this(zzyz.f45798a, zzyz.f45799b, zzyz.f45800c, zzyz.f45801d, zzyz.f45802e, zzyz.f45803f, zzyzArr, zzyz.f45805h, zzyz.f45806i, zzyz.f45807j);
    }

    zzyz(String str, int i, int i2, boolean z, int i3, int i4, zzyz[] zzyzArr, boolean z2, boolean z3, boolean z4) {
        this.f45798a = str;
        this.f45799b = i;
        this.f45800c = i2;
        this.f45801d = z;
        this.f45802e = i3;
        this.f45803f = i4;
        this.f45804g = zzyzArr;
        this.f45805h = z2;
        this.f45806i = z3;
        this.f45807j = z4;
    }

    /* renamed from: b */
    public final C14745e mo42401b() {
        return C14913o.m43303a(this.f45802e, this.f45799b, this.f45798a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f45798a, false);
        C15269a.m44447a(parcel, 3, this.f45799b);
        C15269a.m44447a(parcel, 4, this.f45800c);
        C15269a.m44459a(parcel, 5, this.f45801d);
        C15269a.m44447a(parcel, 6, this.f45802e);
        C15269a.m44447a(parcel, 7, this.f45803f);
        C15269a.m44461a(parcel, 8, (T[]) this.f45804g, i, false);
        C15269a.m44459a(parcel, 9, this.f45805h);
        C15269a.m44459a(parcel, 10, this.f45806i);
        C15269a.m44459a(parcel, 11, this.f45807j);
        C15269a.m44443a(parcel, a);
    }
}
