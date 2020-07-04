package com.facebook.imagepipeline.p726m;

import android.graphics.Matrix;
import com.facebook.common.internal.ImmutableList;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.m.d */
public final class C13791d {

    /* renamed from: a */
    public static final ImmutableList<Integer> f36581a = ImmutableList.m38915of(Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5));

    /* renamed from: a */
    private static int m40669a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    /* renamed from: b */
    public static boolean m40676b(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static boolean m40674a(int i) {
        if (i < 0 || i > 270 || i % 90 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m40677c(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: d */
    private static Matrix m40678d(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i != 7) {
            switch (i) {
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                default:
                    return null;
            }
        } else {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: a */
    private static int m40672a(C13647e eVar) {
        int e = eVar.mo33277e();
        if (e == 90 || e == 180 || e == 270) {
            return eVar.mo33277e();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m40671a(C13597e eVar, C13647e eVar2) {
        if (!eVar.mo33159e()) {
            return 0;
        }
        int a = m40672a(eVar2);
        if (eVar.mo33158d()) {
            return a;
        }
        return (a + eVar.mo33161f()) % 360;
    }

    /* renamed from: b */
    public static int m40675b(C13597e eVar, C13647e eVar2) {
        int indexOf = f36581a.indexOf(Integer.valueOf(eVar2.mo33278f()));
        if (indexOf >= 0) {
            int i = 0;
            if (!eVar.mo33158d()) {
                i = eVar.mo33161f();
            }
            return ((Integer) f36581a.get((indexOf + (i / 90)) % f36581a.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: a */
    public static Matrix m40673a(C13647e eVar, C13597e eVar2) {
        if (f36581a.contains(Integer.valueOf(eVar.mo33278f()))) {
            return m40678d(m40675b(eVar2, eVar));
        }
        int a = m40671a(eVar2, eVar);
        if (a == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) a);
        return matrix;
    }

    /* renamed from: a */
    private static float m40668a(C13596d dVar, int i, int i2) {
        if (dVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) dVar.f36024a) / f, ((float) dVar.f36025b) / f2);
        if (f * max > dVar.f36026c) {
            max = dVar.f36026c / f;
        }
        if (f2 * max > dVar.f36026c) {
            max = dVar.f36026c / f2;
        }
        return max;
    }

    /* renamed from: a */
    public static int m40670a(C13597e eVar, C13596d dVar, C13647e eVar2, boolean z) {
        int i;
        int i2;
        int i3;
        if (!z || dVar == null) {
            return 8;
        }
        int a = m40671a(eVar, eVar2);
        boolean z2 = false;
        if (f36581a.contains(Integer.valueOf(eVar2.mo33278f()))) {
            i = m40675b(eVar, eVar2);
        } else {
            i = 0;
        }
        if (a == 90 || a == 270 || i == 5 || i == 7) {
            z2 = true;
        }
        if (z2) {
            i2 = eVar2.mo33280h();
        } else {
            i2 = eVar2.mo33279g();
        }
        if (z2) {
            i3 = eVar2.mo33279g();
        } else {
            i3 = eVar2.mo33280h();
        }
        int a2 = m40669a(m40668a(dVar, i2, i3), dVar.f36027d);
        if (a2 > 8) {
            return 8;
        }
        if (a2 <= 0) {
            return 1;
        }
        return a2;
    }
}
