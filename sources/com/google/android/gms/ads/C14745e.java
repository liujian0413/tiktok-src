package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.afb;
import com.google.android.gms.internal.ads.zzyz;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.google.android.gms.ads.e */
public final class C14745e {

    /* renamed from: a */
    public static final C14745e f38096a = new C14745e(320, 50, "320x50_mb");

    /* renamed from: b */
    public static final C14745e f38097b = new C14745e(468, 60, "468x60_as");

    /* renamed from: c */
    public static final C14745e f38098c = new C14745e(320, 100, "320x100_as");

    /* renamed from: d */
    public static final C14745e f38099d = new C14745e(728, 90, "728x90_as");

    /* renamed from: e */
    public static final C14745e f38100e = new C14745e(C34943c.f91128x, 250, "300x250_as");

    /* renamed from: f */
    public static final C14745e f38101f = new C14745e(160, 600, "160x600_as");

    /* renamed from: g */
    public static final C14745e f38102g = new C14745e(-1, -2, "smart_banner");

    /* renamed from: h */
    public static final C14745e f38103h = new C14745e(-3, -4, "fluid");

    /* renamed from: i */
    public static final C14745e f38104i = new C14745e(50, 50, "50x50_mb");

    /* renamed from: j */
    public static final C14745e f38105j = new C14745e(-3, 0, "search_v2");

    /* renamed from: k */
    public final int f38106k;

    /* renamed from: l */
    public final int f38107l;

    /* renamed from: m */
    private final String f38108m;

    public C14745e(int i, int i2) {
        String str;
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        if (i2 == -2) {
            str = "AUTO";
        } else {
            str = String.valueOf(i2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(str);
        sb.append("_as");
        this(i, i2, sb.toString());
    }

    C14745e(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f38106k = i;
            this.f38107l = i2;
            this.f38108m = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14745e)) {
            return false;
        }
        C14745e eVar = (C14745e) obj;
        return this.f38106k == eVar.f38106k && this.f38107l == eVar.f38107l && this.f38108m.equals(eVar.f38108m);
    }

    /* renamed from: a */
    public final int mo37448a(Context context) {
        switch (this.f38107l) {
            case -4:
            case ImageFrame.NV21 /*-3*/:
                return -1;
            case -2:
                return zzyz.m53265b(context.getResources().getDisplayMetrics());
            default:
                return afb.m45721a(context, this.f38107l);
        }
    }

    /* renamed from: b */
    public final int mo37450b(Context context) {
        int i = this.f38106k;
        if (i == -1) {
            return zzyz.m53262a(context.getResources().getDisplayMetrics());
        }
        switch (i) {
            case -4:
            case ImageFrame.NV21 /*-3*/:
                return -1;
            default:
                return afb.m45721a(context, this.f38106k);
        }
    }

    public final int hashCode() {
        return this.f38108m.hashCode();
    }

    /* renamed from: a */
    public final boolean mo37449a() {
        return this.f38106k == -3 && this.f38107l == -4;
    }

    public final String toString() {
        return this.f38108m;
    }
}
