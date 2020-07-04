package android.support.p022v4.view.animation;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.animation.c */
public final class C0957c {
    /* renamed from: a */
    public static Interpolator m4073a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C0956b(f, f2, f3, f4);
    }
}
