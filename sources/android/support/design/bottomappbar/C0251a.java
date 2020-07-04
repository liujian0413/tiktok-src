package android.support.design.bottomappbar;

import android.support.design.shape.C0299b;
import android.support.design.shape.C0300c;

/* renamed from: android.support.design.bottomappbar.a */
public final class C0251a extends C0299b {

    /* renamed from: a */
    public float f919a;

    /* renamed from: b */
    public float f920b;

    /* renamed from: c */
    public float f921c;

    /* renamed from: d */
    public float f922d;

    /* renamed from: e */
    public float f923e;

    /* renamed from: a */
    public final void mo723a(float f, float f2, C0300c cVar) {
        float f3 = f;
        C0300c cVar2 = cVar;
        if (this.f921c == 0.0f) {
            cVar2.mo1198b(f3, 0.0f);
            return;
        }
        float f4 = ((this.f920b * 2.0f) + this.f921c) / 2.0f;
        float f5 = f2 * this.f919a;
        float f6 = (f3 / 2.0f) + this.f923e;
        float f7 = (this.f922d * f2) + ((1.0f - f2) * f4);
        if (f7 / f4 >= 1.0f) {
            cVar2.mo1198b(f3, 0.0f);
            return;
        }
        float f8 = f4 + f5;
        float f9 = f7 + f5;
        float sqrt = (float) Math.sqrt((double) ((f8 * f8) - (f9 * f9)));
        float f10 = f6 - sqrt;
        float f11 = f6 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f9)));
        float f12 = 90.0f - degrees;
        float f13 = f10 - f5;
        cVar2.mo1198b(f13, 0.0f);
        float f14 = f5 * 2.0f;
        float f15 = degrees;
        cVar.mo1196a(f13, 0.0f, f10 + f5, f14, 270.0f, degrees);
        cVar.mo1196a(f6 - f4, (-f4) - f7, f6 + f4, f4 - f7, 180.0f - f12, (f12 * 2.0f) - 180.0f);
        cVar.mo1196a(f11 - f5, 0.0f, f11 + f5, f14, 270.0f - f15, f15);
        cVar2.mo1198b(f3, 0.0f);
    }
}
