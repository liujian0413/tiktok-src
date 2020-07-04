package com.facebook.keyframes;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import com.facebook.keyframes.C14022c.C14025b;
import com.facebook.keyframes.KeyframesDirectionallyScalingDrawable.ScaleDirection;
import com.facebook.keyframes.model.C14035c;
import com.facebook.keyframes.model.C14040e;
import com.facebook.keyframes.model.C14048h;
import com.facebook.keyframes.model.C14052j;
import com.facebook.keyframes.model.keyframedmodels.C14061e;
import com.facebook.keyframes.model.keyframedmodels.C14062f.C14063a;
import com.facebook.keyframes.model.keyframedmodels.KeyFramedGradient.C14055a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.keyframes.b */
public class C14005b extends Drawable implements KeyframesDirectionallyScalingDrawable, C14025b {

    /* renamed from: a */
    public final C14052j f36982a;

    /* renamed from: b */
    public final SparseArray<Matrix> f36983b;

    /* renamed from: c */
    public final Matrix f36984c;

    /* renamed from: d */
    public final Map<String, C14006a> f36985d;

    /* renamed from: e */
    private final Paint f36986e = new Paint(1);

    /* renamed from: f */
    private final List<C14007b> f36987f;

    /* renamed from: g */
    private final C14022c f36988g;

    /* renamed from: h */
    private final Matrix f36989h;

    /* renamed from: i */
    private final Matrix f36990i;

    /* renamed from: j */
    private int f36991j;

    /* renamed from: k */
    private int f36992k;

    /* renamed from: l */
    private float f36993l;

    /* renamed from: m */
    private float f36994m;

    /* renamed from: n */
    private float f36995n;

    /* renamed from: o */
    private boolean f36996o;

    /* renamed from: p */
    private WeakReference<C14008c> f36997p;

    /* renamed from: com.facebook.keyframes.b$a */
    public static class C14006a {

        /* renamed from: a */
        final Drawable f36998a;

        /* renamed from: b */
        final Matrix f36999b;

        public C14006a(Drawable drawable, Matrix matrix) {
            this.f36999b = matrix;
            this.f36998a = drawable;
        }
    }

    /* renamed from: com.facebook.keyframes.b$b */
    class C14007b {

        /* renamed from: d */
        static final /* synthetic */ boolean f37000d = (!C14005b.class.desiredAssertionStatus());

        /* renamed from: a */
        public final C13981a f37001a;

        /* renamed from: b */
        public boolean f37002b;

        /* renamed from: c */
        public Shader f37003c;

        /* renamed from: f */
        private final C14040e f37005f;

        /* renamed from: g */
        private final C14063a f37006g;

        /* renamed from: h */
        private final Matrix f37007h;

        /* renamed from: i */
        private final float[] f37008i = new float[9];

        /* renamed from: j */
        private Shader[] f37009j;

        /* renamed from: c */
        public final int mo33664c() {
            return this.f37005f.f37073c;
        }

        /* renamed from: d */
        public final int mo33665d() {
            return this.f37005f.f37072b;
        }

        /* renamed from: e */
        public final Cap mo33666e() {
            return this.f37005f.f37079i;
        }

        /* renamed from: g */
        private boolean m41357g() {
            C14006a f = mo33667f();
            if (f == null || f.f36998a == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Matrix mo33661a() {
            if (this.f37007h == C14005b.this.f36984c) {
                return null;
            }
            return this.f37007h;
        }

        /* renamed from: b */
        public final float mo33663b() {
            if (this.f37006g != null) {
                return this.f37006g.mo33707a();
            }
            return 0.0f;
        }

        /* renamed from: f */
        public final C14006a mo33667f() {
            if (C14005b.this.f36985d == null) {
                return null;
            }
            return (C14006a) C14005b.this.f36985d.get(this.f37005f.f37084n);
        }

        /* renamed from: a */
        private float m41354a(Matrix matrix) {
            matrix.getValues(this.f37008i);
            return (Math.abs(this.f37008i[0]) + Math.abs(this.f37008i[4])) / 2.0f;
        }

        /* renamed from: b */
        private Shader m41356b(float f) {
            if (this.f37009j == null) {
                return null;
            }
            return this.f37009j[(int) ((f / ((float) C14005b.this.f36982a.f37117b)) * ((float) (this.f37009j.length - 1)))];
        }

        /* renamed from: a */
        private void m41355a(C14040e eVar) {
            if (this.f37009j == null) {
                float f = (float) C14005b.this.f36982a.f37117b;
                int round = Math.round((30.0f * f) / ((float) C14005b.this.f36982a.f37116a));
                this.f37009j = new LinearGradient[(round + 1)];
                C14055a aVar = new C14055a();
                C14048h hVar = eVar.f37083m.f37101a;
                for (int i = 0; i < round; i++) {
                    float f2 = (((float) i) / ((float) round)) * f;
                    hVar.f37108a.mo33705a(f2, aVar);
                    hVar.f37109b.mo33705a(f2, aVar);
                    Shader[] shaderArr = this.f37009j;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, C14005b.this.f36982a.f37120e[1], aVar.f37129a, aVar.f37130b, TileMode.CLAMP);
                    shaderArr[i] = linearGradient;
                }
            }
        }

        /* renamed from: a */
        public final void mo33662a(float f) {
            if (f < this.f37005f.f37074d || f > this.f37005f.f37075e) {
                this.f37002b = false;
                return;
            }
            this.f37002b = true;
            this.f37005f.mo33694a(this.f37007h, f);
            Matrix matrix = (Matrix) C14005b.this.f36983b.get(this.f37005f.f37078h);
            if (matrix != null && !matrix.isIdentity()) {
                this.f37007h.postConcat(matrix);
            }
            C14061e eVar = this.f37005f.f37085o;
            if (!m41357g() && eVar != null) {
                this.f37001a.mo33637a();
                eVar.mo33705a(f, this.f37001a);
                this.f37001a.mo33641a(this.f37007h);
                this.f37005f.mo33695a(this.f37006g, f);
                this.f37006g.mo33708a(m41354a(this.f37007h));
                if (this.f37005f.f37083m != null) {
                    m41355a(this.f37005f);
                }
                this.f37003c = m41356b(f);
            }
        }

        public C14007b(C14040e eVar) {
            this.f37005f = eVar;
            if (m41357g()) {
                this.f37001a = null;
                this.f37006g = null;
                this.f37007h = new Matrix();
            } else {
                this.f37001a = new C13981a();
                this.f37006g = new C14063a();
                this.f37007h = C14005b.this.f36984c;
            }
            if (!f37000d && this.f37007h == null) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: com.facebook.keyframes.b$c */
    public interface C14008c {
        /* renamed from: a */
        void mo33668a();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: b */
    public final void mo33653b() {
        this.f36988g.mo33678d();
    }

    /* renamed from: c */
    public final void mo33654c() {
        this.f36988g.mo33679e();
    }

    /* renamed from: a */
    public final void mo33650a() {
        this.f36988g.mo33677c();
    }

    /* renamed from: d */
    public final void mo33655d() {
        if (this.f36997p != null) {
            C14008c cVar = (C14008c) this.f36997p.get();
            if (cVar != null) {
                cVar.mo33668a();
                this.f36997p.clear();
            }
        }
    }

    /* renamed from: a */
    private void m41346a(int i) {
        this.f36988g.mo33674a(i);
    }

    /* renamed from: a */
    public final void mo33651a(float f) {
        m41347b(f);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m41347b(float f) {
        this.f36996o = true;
        this.f36982a.mo33702a(this.f36983b, f);
        int size = this.f36987f.size();
        for (int i = 0; i < size; i++) {
            ((C14007b) this.f36987f.get(i)).mo33662a(f);
        }
    }

    /* renamed from: a */
    public final void mo33652a(C14008c cVar) {
        this.f36997p = new WeakReference<>(cVar);
    }

    C14005b(C14027d dVar) {
        Map<String, C14006a> map;
        this.f36996o = false;
        this.f36982a = dVar.f37041a;
        if (dVar.f37043c.f37044a == null) {
            map = null;
        } else {
            map = Collections.unmodifiableMap(dVar.f37043c.f37044a);
        }
        this.f36985d = map;
        this.f36984c = new Matrix();
        this.f36989h = new Matrix();
        this.f36990i = new Matrix();
        this.f36988g = C14022c.m41391a(this, this.f36982a);
        this.f36986e.setStrokeCap(Cap.ROUND);
        ArrayList arrayList = new ArrayList();
        int size = this.f36982a.f37118c.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C14007b((C14040e) this.f36982a.f37118c.get(i)));
        }
        this.f36987f = Collections.unmodifiableList(arrayList);
        this.f36983b = new SparseArray<>();
        List<C14035c> list = this.f36982a.f37119d;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f36983b.put(((C14035c) list.get(i2)).f37060a, new Matrix());
        }
        m41346a(dVar.f37042b);
    }

    public void draw(Canvas canvas) {
        boolean z;
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int size = this.f36987f.size();
        for (int i = 0; i < size; i++) {
            C14007b bVar = (C14007b) this.f36987f.get(i);
            if (bVar.f37002b) {
                C14006a f = bVar.mo33667f();
                Matrix a = bVar.mo33661a();
                if (f == null || f.f36998a == null || a == null) {
                    C13981a aVar = bVar.f37001a;
                    if (aVar != null && !aVar.mo33645b()) {
                        this.f36986e.setShader(null);
                        this.f36986e.setStrokeCap(bVar.mo33666e());
                        if (bVar.mo33665d() != 0) {
                            this.f36986e.setStyle(Style.FILL);
                            if (bVar.f37003c == null) {
                                this.f36986e.setColor(bVar.mo33665d());
                                aVar.mo33641a(this.f36989h);
                                canvas.drawPath(aVar.f36969a, this.f36986e);
                                aVar.mo33641a(this.f36990i);
                            } else {
                                this.f36986e.setShader(bVar.f37003c);
                                canvas.concat(this.f36989h);
                                canvas.drawPath(aVar.f36969a, this.f36986e);
                                canvas.concat(this.f36990i);
                            }
                        }
                        if (bVar.mo33664c() != 0 && bVar.mo33663b() > 0.0f) {
                            this.f36986e.setColor(bVar.mo33664c());
                            this.f36986e.setStyle(Style.STROKE);
                            this.f36986e.setStrokeWidth(bVar.mo33663b() * this.f36993l * this.f36994m * this.f36995n);
                            aVar.mo33641a(this.f36989h);
                            canvas.drawPath(aVar.f36969a, this.f36986e);
                            aVar.mo33641a(this.f36990i);
                        }
                    }
                } else {
                    canvas.save();
                    canvas.concat(this.f36989h);
                    canvas.concat(a);
                    if (f.f36999b == null || f.f36999b.isIdentity()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        canvas.save();
                        canvas.concat(f.f36999b);
                    }
                    f.f36998a.draw(canvas);
                    if (z) {
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
        canvas.translate((float) (-bounds.left), (float) (-bounds.top));
    }

    /* renamed from: a */
    private void m41345a(float f, float f2, ScaleDirection scaleDirection) {
        if (this.f36994m != 1.0f || this.f36995n != 1.0f) {
            this.f36989h.setScale(this.f36993l, this.f36993l);
            this.f36994m = 1.0f;
            this.f36995n = 1.0f;
            this.f36989h.invert(this.f36990i);
        }
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f36991j = i3 - i;
        this.f36992k = i4 - i2;
        this.f36993l = Math.min(((float) this.f36991j) / this.f36982a.f37120e[0], ((float) this.f36992k) / this.f36982a.f37120e[1]);
        m41345a(1.0f, 1.0f, ScaleDirection.UP);
        if (!this.f36996o) {
            m41347b(0.0f);
        }
    }
}
