package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.imageformat.C13508b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.k.q */
public final class C13763q {
    /* renamed from: a */
    private static int m40619a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            double pow = Math.pow(d, 2.0d);
            Double.isNaN(d);
            double d2 = 1.0d / (pow - d);
            Double.isNaN(d);
            if ((1.0d / d) + (d2 * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: b */
    private static int m40622b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = (double) i2;
            Double.isNaN(d);
            double d2 = 1.0d / d;
            if (d2 + (0.3333333432674408d * d2) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    private static int m40621a(C13597e eVar, C13647e eVar2) {
        boolean z = false;
        if (!eVar.mo33158d()) {
            return 0;
        }
        int e = eVar2.mo33277e();
        if (e == 0 || e == 90 || e == 180 || e == 270) {
            z = true;
        }
        C13307g.m38943a(z);
        return e;
    }

    /* renamed from: a */
    private static float m40618a(C13597e eVar, C13596d dVar, C13647e eVar2) {
        boolean z;
        int i;
        int i2;
        C13307g.m38943a(C13647e.m40236c(eVar2));
        if (dVar == null || dVar.f36025b <= 0 || dVar.f36024a <= 0 || eVar2.mo33279g() == 0 || eVar2.mo33280h() == 0) {
            return 1.0f;
        }
        int a = m40621a(eVar, eVar2);
        if (a == 90 || a == 270) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = eVar2.mo33280h();
        } else {
            i = eVar2.mo33279g();
        }
        if (z) {
            i2 = eVar2.mo33279g();
        } else {
            i2 = eVar2.mo33280h();
        }
        float f = ((float) dVar.f36024a) / ((float) i);
        float f2 = ((float) dVar.f36025b) / ((float) i2);
        float max = Math.max(f, f2);
        C13286a.m38844a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(dVar.f36024a), Integer.valueOf(dVar.f36025b), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(max));
        return max;
    }

    /* renamed from: a */
    public static int m40620a(C13597e eVar, C13596d dVar, C13647e eVar2, int i) {
        int i2;
        float f;
        int i3;
        if (!C13647e.m40236c(eVar2)) {
            return 1;
        }
        float a = m40618a(eVar, dVar, eVar2);
        if (eVar2.mo33276d() == C13508b.f35825a) {
            i2 = m40622b(a);
        } else {
            i2 = m40619a(a);
        }
        int max = Math.max(eVar2.mo33280h(), eVar2.mo33279g());
        if (dVar != null) {
            f = dVar.f36026c;
        } else {
            f = (float) i;
        }
        while (((float) (max / i2)) > f) {
            if (eVar2.mo33276d() == C13508b.f35825a) {
                i3 = i2 * 2;
            } else {
                i3 = i2 + 1;
            }
        }
        return i2;
    }
}
