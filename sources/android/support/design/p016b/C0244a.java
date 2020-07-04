package android.support.design.p016b;

import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: android.support.design.b.a */
public final class C0244a {
    /* renamed from: a */
    public static int m853a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
