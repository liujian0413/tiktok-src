package android.support.design.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.shape.c */
public final class C0300c {

    /* renamed from: a */
    public float f1212a;

    /* renamed from: b */
    public float f1213b;

    /* renamed from: c */
    public float f1214c;

    /* renamed from: d */
    public float f1215d;

    /* renamed from: e */
    private final List<C0303c> f1216e = new ArrayList();

    /* renamed from: android.support.design.shape.c$a */
    public static class C0301a extends C0303c {

        /* renamed from: h */
        private static final RectF f1217h = new RectF();

        /* renamed from: a */
        public float f1218a;

        /* renamed from: b */
        public float f1219b;

        /* renamed from: c */
        public float f1220c;

        /* renamed from: d */
        public float f1221d;

        /* renamed from: e */
        public float f1222e;

        /* renamed from: f */
        public float f1223f;

        /* renamed from: a */
        public final void mo1199a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1226g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f1217h.set(this.f1218a, this.f1219b, this.f1220c, this.f1221d);
            path.arcTo(f1217h, this.f1222e, this.f1223f, false);
            path.transform(matrix);
        }

        public C0301a(float f, float f2, float f3, float f4) {
            this.f1218a = f;
            this.f1219b = f2;
            this.f1220c = f3;
            this.f1221d = f4;
        }
    }

    /* renamed from: android.support.design.shape.c$b */
    public static class C0302b extends C0303c {

        /* renamed from: a */
        public float f1224a;

        /* renamed from: b */
        public float f1225b;

        /* renamed from: a */
        public final void mo1199a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f1226g;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f1224a, this.f1225b);
            path.transform(matrix);
        }
    }

    /* renamed from: android.support.design.shape.c$c */
    public static abstract class C0303c {

        /* renamed from: g */
        protected final Matrix f1226g = new Matrix();

        /* renamed from: a */
        public abstract void mo1199a(Matrix matrix, Path path);
    }

    public C0300c() {
        mo1195a(0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo1195a(float f, float f2) {
        this.f1212a = 0.0f;
        this.f1213b = 0.0f;
        this.f1214c = 0.0f;
        this.f1215d = 0.0f;
        this.f1216e.clear();
    }

    /* renamed from: a */
    public final void mo1197a(Matrix matrix, Path path) {
        int size = this.f1216e.size();
        for (int i = 0; i < size; i++) {
            ((C0303c) this.f1216e.get(i)).mo1199a(matrix, path);
        }
    }

    /* renamed from: b */
    public final void mo1198b(float f, float f2) {
        C0302b bVar = new C0302b();
        bVar.f1224a = f;
        bVar.f1225b = 0.0f;
        this.f1216e.add(bVar);
        this.f1214c = f;
        this.f1215d = 0.0f;
    }

    /* renamed from: a */
    public final void mo1196a(float f, float f2, float f3, float f4, float f5, float f6) {
        C0301a aVar = new C0301a(f, f2, f3, f4);
        aVar.f1222e = f5;
        aVar.f1223f = f6;
        this.f1216e.add(aVar);
        double d = (double) (f5 + f6);
        this.f1214c = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.f1215d = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }
}
