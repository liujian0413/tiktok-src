package com.p280ss.android.ugc.aweme.newfollow.util;

import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b.C41843a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.g */
public final class C34204g {
    /* renamed from: a */
    public static void m110444a(int i, int i2, TextureView textureView, float f) {
        m110445a(i, i2, textureView, f, (C41843a) null);
    }

    /* renamed from: a */
    private static void m110445a(int i, int i2, TextureView textureView, float f, C41843a aVar) {
        float f2;
        if (i2 > 0 && i > 0 && f > 0.0f) {
            float f3 = ((float) i2) / ((float) i);
            float f4 = 1.0f;
            if (f3 > f) {
                f2 = f3 / f;
            } else {
                f4 = f / f3;
                f2 = 1.0f;
            }
            int i3 = i / 2;
            int i4 = i2 / 2;
            if (textureView != null) {
                Matrix matrix = new Matrix();
                matrix.setScale(f2, f4, (float) i3, (float) i4);
                textureView.setTransform(matrix);
            }
        }
    }

    /* renamed from: a */
    public static void m110446a(int i, int i2, View view, int i3, int i4) {
        if (i2 > 0 && i > 0 && i3 > 0 && i4 > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            float f = (((float) i4) * 1.0f) / ((float) i3);
            float f2 = (float) i;
            if (f >= (((float) i2) * 1.0f) / f2) {
                layoutParams.width = i;
                layoutParams.height = i2;
            } else {
                layoutParams.width = i;
                layoutParams.height = (int) (f2 * f);
            }
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
        }
    }
}
