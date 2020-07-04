package com.airbnb.lottie.p056d;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.C1787a;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.C1818f;
import com.airbnb.lottie.model.content.C1812h;
import com.airbnb.lottie.p051a.p052a.C1676j;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.List;

/* renamed from: com.airbnb.lottie.d.e */
public final class C1750e {
    /* renamed from: a */
    public static double m8355a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: a */
    public static float m8356a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m8359a(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: c */
    public static boolean m8366c(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: a */
    static int m8357a(float f, float f2) {
        return m8358a((int) f, (int) f2);
    }

    /* renamed from: b */
    private static int m8365b(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    /* renamed from: a */
    private static int m8358a(int i, int i2) {
        return i - (i2 * m8365b(i, i2));
    }

    /* renamed from: a */
    public static PointF m8361a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: a */
    public static void m8362a(C1812h hVar, Path path) {
        path.reset();
        PointF pointF = hVar.f6535b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        for (int i = 0; i < hVar.f6534a.size(); i++) {
            C1787a aVar = (C1787a) hVar.f6534a.get(i);
            PointF pointF3 = aVar.f6436a;
            PointF pointF4 = aVar.f6437b;
            PointF pointF5 = aVar.f6438c;
            if (!pointF3.equals(pointF2) || !pointF4.equals(pointF5)) {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            } else {
                path.lineTo(pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        if (hVar.f6536c) {
            path.close();
        }
    }

    /* renamed from: b */
    public static float m8364b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: a */
    public static int m8360a(int i, int i2, int i3) {
        return Math.max(0, Math.min(NormalGiftView.ALPHA_255, i));
    }

    /* renamed from: a */
    public static void m8363a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2, C1676j jVar) {
        if (eVar.mo7311c(jVar.mo7137b(), i)) {
            list.add(eVar2.mo7308a(jVar.mo7137b()).mo7307a((C1818f) jVar));
        }
    }
}
