package com.p280ss.android.ugc.aweme.comment.share;

import android.view.SurfaceView;
import android.widget.FrameLayout.LayoutParams;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.comment.share.f */
public final class C24252f {

    /* renamed from: a */
    public static final C24253a f63989a = new C24253a(null);

    /* renamed from: com.ss.android.ugc.aweme.comment.share.f$a */
    public static final class C24253a {
        private C24253a() {
        }

        public /* synthetic */ C24253a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m79648a(int i, int i2, SurfaceView surfaceView, float f) {
            float f2;
            if (i2 > 0 && i > 0 && f > 0.0f) {
                float f3 = (float) i2;
                float f4 = (float) i;
                float f5 = f3 / f4;
                float f6 = 1.0f;
                if (f5 > f) {
                    f2 = f5 / f;
                } else {
                    f6 = f / f5;
                    f2 = 1.0f;
                }
                if (surfaceView != null) {
                    LayoutParams layoutParams = new LayoutParams((int) (f4 * f2), (int) (f3 * f6));
                    layoutParams.gravity = 17;
                    surfaceView.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
