package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.p */
public final class C13421p {

    /* renamed from: com.facebook.drawee.drawable.p$a */
    public static abstract class C13422a implements C13423b {
        /* renamed from: a */
        public abstract void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        /* renamed from: a */
        public final Matrix mo32864a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo32865a(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$b */
    public interface C13423b {

        /* renamed from: a */
        public static final C13423b f35593a = C13431j.f35609j;

        /* renamed from: b */
        public static final C13423b f35594b = C13430i.f35608j;

        /* renamed from: c */
        public static final C13423b f35595c = C13428g.f35606j;

        /* renamed from: d */
        public static final C13423b f35596d = C13429h.f35607j;

        /* renamed from: e */
        public static final C13423b f35597e = C13424c.f35602j;

        /* renamed from: f */
        public static final C13423b f35598f = C13426e.f35604j;

        /* renamed from: g */
        public static final C13423b f35599g = C13425d.f35603j;

        /* renamed from: h */
        public static final C13423b f35600h = C13432k.f35610j;

        /* renamed from: i */
        public static final C13423b f35601i = C13427f.f35605j;

        /* renamed from: a */
        Matrix mo32864a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    /* renamed from: com.facebook.drawee.drawable.p$c */
    static class C13424c extends C13422a {

        /* renamed from: j */
        public static final C13423b f35602j = new C13424c();

        private C13424c() {
        }

        public final String toString() {
            return "center";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$d */
    static class C13425d extends C13422a {

        /* renamed from: j */
        public static final C13423b f35603j = new C13425d();

        private C13425d() {
        }

        public final String toString() {
            return "center_crop";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f5 = width;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$e */
    static class C13426e extends C13422a {

        /* renamed from: j */
        public static final C13423b f35604j = new C13426e();

        private C13426e() {
        }

        public final String toString() {
            return "center_inside";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$f */
    static class C13427f extends C13422a {

        /* renamed from: j */
        public static final C13423b f35605j = new C13427f();

        private C13427f() {
        }

        public final String toString() {
            return "fit_bottom_start";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$g */
    static class C13428g extends C13422a {

        /* renamed from: j */
        public static final C13423b f35606j = new C13428g();

        private C13428g() {
        }

        public final String toString() {
            return "fit_center";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$h */
    static class C13429h extends C13422a {

        /* renamed from: j */
        public static final C13423b f35607j = new C13429h();

        private C13429h() {
        }

        public final String toString() {
            return "fit_end";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$i */
    static class C13430i extends C13422a {

        /* renamed from: j */
        public static final C13423b f35608j = new C13430i();

        private C13430i() {
        }

        public final String toString() {
            return "fit_start";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$j */
    static class C13431j extends C13422a {

        /* renamed from: j */
        public static final C13423b f35609j = new C13431j();

        private C13431j() {
        }

        public final String toString() {
            return "fit_xy";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$k */
    static class C13432k extends C13422a {

        /* renamed from: j */
        public static final C13423b f35610j = new C13432k();

        private C13432k() {
        }

        public final String toString() {
            return "focus_crop";
        }

        /* renamed from: a */
        public final void mo32865a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                float height = (((float) rect.height()) * 0.5f) - (f2 * f8);
                f6 = Math.max(Math.min(height, 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.drawable.p$l */
    public interface C13433l {
        /* renamed from: a */
        Object mo32875a();
    }

    /* renamed from: a */
    public static C13420o m39381a(Drawable drawable) {
        while (drawable != null) {
            if (drawable instanceof C13420o) {
                return (C13420o) drawable;
            }
            if (drawable instanceof C13408c) {
                drawable = ((C13408c) drawable).getDrawable();
            } else {
                if (drawable instanceof C13405a) {
                    C13405a aVar = (C13405a) drawable;
                    int a = aVar.mo32777a();
                    for (int i = 0; i < a; i++) {
                        C13420o a2 = m39381a(aVar.mo32778a(i));
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }
}
