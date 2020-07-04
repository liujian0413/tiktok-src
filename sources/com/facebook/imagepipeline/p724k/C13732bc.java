package com.facebook.imagepipeline.p724k;

import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.k.bc */
public final class C13732bc {
    /* renamed from: a */
    private static int m40512a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: a */
    public static boolean m40514a(C13647e eVar, C13596d dVar) {
        if (eVar == null) {
            return false;
        }
        int e = eVar.mo33277e();
        if (e == 90 || e == 270) {
            return m40513a(eVar.mo33280h(), eVar.mo33279g(), dVar);
        }
        return m40513a(eVar.mo33279g(), eVar.mo33280h(), dVar);
    }

    /* renamed from: a */
    public static boolean m40513a(int i, int i2, C13596d dVar) {
        if (dVar == null) {
            if (((float) m40512a(i)) < 2048.0f || m40512a(i2) < 2048) {
                return false;
            }
            return true;
        } else if (m40512a(i) < dVar.f36024a || m40512a(i2) < dVar.f36025b) {
            return false;
        } else {
            return true;
        }
    }
}
