package com.google.android.gms.internal.ads;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.lb */
final class C15835lb {

    /* renamed from: a */
    private static final C15831ky f44587a = C15831ky.m51208a();

    /* renamed from: b */
    private static final float f44588b = ((Float) bym.m50299d().mo41272a(C15585bw.f43778aY)).floatValue();

    /* renamed from: c */
    private static final long f44589c = ((Long) bym.m50299d().mo41272a(C15585bw.f43776aW)).longValue();

    /* renamed from: d */
    private static final float f44590d = ((Float) bym.m50299d().mo41272a(C15585bw.f43779aZ)).floatValue();

    /* renamed from: e */
    private static final long f44591e = ((Long) bym.m50299d().mo41272a(C15585bw.f43777aX)).longValue();

    /* renamed from: a */
    static boolean m51254a() {
        int i = f44587a.f44576c;
        int i2 = f44587a.f44577d;
        int i3 = f44587a.f44575b + f44587a.f44574a;
        int i4 = Integer.MAX_VALUE;
        int i5 = (i >= 16 || f44591e == 0) ? f44590d != 0.0f ? ((int) (f44590d * ((float) i))) + 1 : Integer.MAX_VALUE : m51253a(f44591e, i);
        if (i2 <= i5) {
            if (i < 16 && f44589c != 0) {
                i4 = m51253a(f44589c, i);
            } else if (f44588b != 0.0f) {
                i4 = (int) (f44588b * ((float) i));
            }
            if (i3 <= i4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static int m51253a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }
}
