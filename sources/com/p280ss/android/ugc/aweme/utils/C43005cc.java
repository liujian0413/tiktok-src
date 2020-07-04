package com.p280ss.android.ugc.aweme.utils;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: com.ss.android.ugc.aweme.utils.cc */
public final class C43005cc {

    /* renamed from: com.ss.android.ugc.aweme.utils.cc$a */
    static class C43007a implements TimeInterpolator {

        /* renamed from: a */
        private final PathMeasure f111571a;

        /* renamed from: b */
        private final float[] f111572b = new float[2];

        /* renamed from: c */
        private final float f111573c = this.f111571a.getLength();

        public final float getInterpolation(float f) {
            this.f111571a.getPosTan(f * this.f111573c, this.f111572b, null);
            return this.f111572b[1];
        }

        public C43007a(C43008b bVar) {
            Path path = new Path();
            path.reset();
            bVar.mo104696a(path);
            this.f111571a = new PathMeasure(path, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.cc$b */
    interface C43008b {
        /* renamed from: a */
        void mo104696a(Path path);
    }

    /* renamed from: a */
    public static TimeInterpolator m136505a(int i, final float... fArr) {
        return new C43007a(new C43008b() {
            /* renamed from: a */
            public final void mo104696a(Path path) {
                if (fArr == null || fArr.length != 4) {
                    path.quadTo(0.6f, 0.8f, 1.0f, 1.0f);
                } else {
                    path.quadTo(fArr[0], fArr[1], fArr[2], fArr[3]);
                }
            }
        });
    }
}
