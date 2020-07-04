package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.C1818f;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.layer.Layer.MatteType;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1670d;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1690c;
import com.airbnb.lottie.p051a.p053b.C1694g;
import com.airbnb.lottie.p051a.p053b.C1702o;
import com.airbnb.lottie.p057e.C1755c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.a */
public abstract class C1821a implements C1670d, C1688a, C1818f {

    /* renamed from: a */
    final Matrix f6580a = new Matrix();

    /* renamed from: b */
    final C1767h f6581b;

    /* renamed from: c */
    public final Layer f6582c;

    /* renamed from: d */
    public C1821a f6583d;

    /* renamed from: e */
    public C1821a f6584e;

    /* renamed from: f */
    final C1702o f6585f;

    /* renamed from: g */
    private final Path f6586g = new Path();

    /* renamed from: h */
    private final Matrix f6587h = new Matrix();

    /* renamed from: i */
    private final Paint f6588i = new Paint(1);

    /* renamed from: j */
    private final Paint f6589j = new Paint(1);

    /* renamed from: k */
    private final Paint f6590k = new Paint(1);

    /* renamed from: l */
    private final Paint f6591l = new Paint(1);

    /* renamed from: m */
    private final Paint f6592m = new Paint();

    /* renamed from: n */
    private final RectF f6593n = new RectF();

    /* renamed from: o */
    private final RectF f6594o = new RectF();

    /* renamed from: p */
    private final RectF f6595p = new RectF();

    /* renamed from: q */
    private final RectF f6596q = new RectF();

    /* renamed from: r */
    private final String f6597r;

    /* renamed from: s */
    private C1694g f6598s;

    /* renamed from: t */
    private List<C1821a> f6599t;

    /* renamed from: u */
    private final List<C1687a<?, ?>> f6600u = new ArrayList();

    /* renamed from: v */
    private boolean f6601v = true;

    /* renamed from: a */
    public final void mo7131a() {
        m8548e();
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo7328b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7329b(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
    }

    /* renamed from: a */
    public final void mo7327a(boolean z) {
        if (z != this.f6601v) {
            this.f6601v = z;
            m8548e();
        }
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        if (eVar.mo7309a(mo7137b(), i)) {
            if (!"__container".equals(mo7137b())) {
                eVar2 = eVar2.mo7308a(mo7137b());
                if (eVar.mo7311c(mo7137b(), i)) {
                    list.add(eVar2.mo7307a((C1818f) this));
                }
            }
            if (eVar.mo7312d(mo7137b(), i)) {
                mo7329b(eVar, i + eVar.mo7310b(mo7137b(), i), list, eVar2);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo7135a(T t, C1755c<T> cVar) {
        this.f6585f.mo7156a(t, cVar);
    }

    /* renamed from: c */
    private boolean m8546c() {
        if (this.f6583d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m8548e() {
        this.f6581b.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6582c.f6561c;
    }

    /* renamed from: f */
    private boolean m8549f() {
        if (this.f6598s == null || this.f6598s.f6239a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m8547d() {
        boolean z = true;
        if (!this.f6582c.f6577s.isEmpty()) {
            final C1690c cVar = new C1690c(this.f6582c.f6577s);
            cVar.mo7144a();
            cVar.mo7146a((C1688a) new C1688a() {
                /* renamed from: a */
                public final void mo7131a() {
                    boolean z;
                    C1821a aVar = C1821a.this;
                    if (((Float) cVar.mo7151e()).floatValue() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo7327a(z);
                }
            });
            if (((Float) cVar.mo7151e()).floatValue() != 1.0f) {
                z = false;
            }
            mo7327a(z);
            mo7326a((C1687a<?, ?>) cVar);
            return;
        }
        mo7327a(true);
    }

    /* renamed from: g */
    private void m8550g() {
        if (this.f6599t == null) {
            if (this.f6584e == null) {
                this.f6599t = Collections.emptyList();
                return;
            }
            this.f6599t = new ArrayList();
            for (C1821a aVar = this.f6584e; aVar != null; aVar = aVar.f6584e) {
                this.f6599t.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo7326a(C1687a<?, ?> aVar) {
        this.f6600u.add(aVar);
    }

    /* renamed from: b */
    private void m8543b(float f) {
        this.f6581b.f6356a.f6332a.mo7338a(this.f6582c.f6561c, f);
    }

    /* renamed from: a */
    private void m8539a(Canvas canvas) {
        C1745d.m8324b("Layer#clearLayer");
        canvas.drawRect(this.f6593n.left - 1.0f, this.f6593n.top - 1.0f, this.f6593n.right + 1.0f, this.f6593n.bottom + 1.0f, this.f6592m);
        C1745d.m8325c("Layer#clearLayer");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7325a(float f) {
        this.f6585f.mo7153a(f);
        if (this.f6598s != null) {
            for (int i = 0; i < this.f6598s.f6239a.size(); i++) {
                ((C1687a) this.f6598s.f6239a.get(i)).mo7145a(f);
            }
        }
        if (this.f6582c.f6571m != 0.0f) {
            f /= this.f6582c.f6571m;
        }
        if (this.f6583d != null) {
            this.f6583d.mo7325a(this.f6583d.f6582c.f6571m * f);
        }
        for (int i2 = 0; i2 < this.f6600u.size(); i2++) {
            ((C1687a) this.f6600u.get(i2)).mo7145a(f);
        }
    }

    /* renamed from: a */
    private void m8540a(Canvas canvas, Matrix matrix) {
        m8541a(canvas, matrix, MaskMode.MaskModeAdd);
        m8541a(canvas, matrix, MaskMode.MaskModeIntersect);
        m8541a(canvas, matrix, MaskMode.MaskModeSubtract);
    }

    /* renamed from: c */
    private void m8545c(RectF rectF, Matrix matrix) {
        if (m8546c() && this.f6582c.f6578t != MatteType.Invert) {
            this.f6583d.mo7133a(this.f6595p, matrix);
            rectF.set(Math.max(rectF.left, this.f6595p.left), Math.max(rectF.top, this.f6595p.top), Math.min(rectF.right, this.f6595p.right), Math.min(rectF.bottom, this.f6595p.bottom));
        }
    }

    /* renamed from: b */
    private void m8544b(RectF rectF, Matrix matrix) {
        this.f6594o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m8549f()) {
            int size = this.f6598s.f6241c.size();
            int i = 0;
            while (i < size) {
                Mask mask = (Mask) this.f6598s.f6241c.get(i);
                this.f6586g.set((Path) ((C1687a) this.f6598s.f6239a.get(i)).mo7151e());
                this.f6586g.transform(matrix);
                switch (mask.f6469a) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    default:
                        this.f6586g.computeBounds(this.f6596q, false);
                        if (i == 0) {
                            this.f6594o.set(this.f6596q);
                        } else {
                            this.f6594o.set(Math.min(this.f6594o.left, this.f6596q.left), Math.min(this.f6594o.top, this.f6596q.top), Math.max(this.f6594o.right, this.f6596q.right), Math.max(this.f6594o.bottom, this.f6596q.bottom));
                        }
                        i++;
                }
            }
            rectF.set(Math.max(rectF.left, this.f6594o.left), Math.max(rectF.top, this.f6594o.top), Math.min(rectF.right, this.f6594o.right), Math.min(rectF.bottom, this.f6594o.bottom));
        }
    }

    C1821a(C1767h hVar, Layer layer) {
        this.f6581b = hVar;
        this.f6582c = layer;
        StringBuilder sb = new StringBuilder();
        sb.append(layer.f6561c);
        sb.append("#draw");
        this.f6597r = sb.toString();
        this.f6592m.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f6589j.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f6590k.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        if (layer.f6578t == MatteType.Invert) {
            this.f6591l.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f6591l.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f6585f = layer.f6567i.mo7292a();
        this.f6585f.mo7154a((C1688a) this);
        if (layer.f6566h != null && !layer.f6566h.isEmpty()) {
            this.f6598s = new C1694g(layer.f6566h);
            for (C1687a a : this.f6598s.f6239a) {
                a.mo7146a((C1688a) this);
            }
            for (C1687a aVar : this.f6598s.f6240b) {
                mo7326a(aVar);
                aVar.mo7146a((C1688a) this);
            }
        }
        m8547d();
    }

    /* renamed from: a */
    public void mo7133a(RectF rectF, Matrix matrix) {
        this.f6580a.set(matrix);
        this.f6580a.preConcat(this.f6585f.mo7152a());
    }

    /* renamed from: a */
    static C1821a m8538a(Layer layer, C1767h hVar, C1757f fVar) {
        switch (layer.f6563e) {
            case Shape:
                return new C1828e(hVar, layer);
            case PreComp:
                return new C1824b(hVar, layer, fVar.mo7214b(layer.f6565g), fVar);
            case Solid:
                return new C1829f(hVar, layer);
            case Image:
                return new C1826c(hVar, layer);
            case Null:
                return new C1827d(hVar, layer);
            case Text:
                return new C1830g(hVar, layer);
            default:
                StringBuilder sb = new StringBuilder("Unknown layer type ");
                sb.append(layer.f6563e);
                C1745d.m8323a(sb.toString());
                return null;
        }
    }

    /* renamed from: a */
    private void m8541a(Canvas canvas, Matrix matrix, MaskMode maskMode) {
        Paint paint;
        boolean z = true;
        if (C18232.f6605b[maskMode.ordinal()] != 1) {
            paint = this.f6589j;
        } else {
            paint = this.f6590k;
        }
        int size = this.f6598s.f6241c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (((Mask) this.f6598s.f6241c.get(i)).f6469a == maskMode) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C1745d.m8324b("Layer#drawMask");
            C1745d.m8324b("Layer#saveLayer");
            m8542a(canvas, this.f6593n, paint, false);
            C1745d.m8325c("Layer#saveLayer");
            m8539a(canvas);
            for (int i2 = 0; i2 < size; i2++) {
                if (((Mask) this.f6598s.f6241c.get(i2)).f6469a == maskMode) {
                    this.f6586g.set((Path) ((C1687a) this.f6598s.f6239a.get(i2)).mo7151e());
                    this.f6586g.transform(matrix);
                    C1687a aVar = (C1687a) this.f6598s.f6240b.get(i2);
                    int alpha = this.f6588i.getAlpha();
                    this.f6588i.setAlpha((int) (((float) ((Integer) aVar.mo7151e()).intValue()) * 2.55f));
                    canvas.drawPath(this.f6586g, this.f6588i);
                    this.f6588i.setAlpha(alpha);
                }
            }
            C1745d.m8324b("Layer#restoreLayer");
            canvas.restore();
            C1745d.m8325c("Layer#restoreLayer");
            C1745d.m8325c("Layer#drawMask");
        }
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        C1745d.m8324b(this.f6597r);
        if (!this.f6601v) {
            C1745d.m8325c(this.f6597r);
            return;
        }
        m8550g();
        C1745d.m8324b("Layer#parentMatrix");
        this.f6587h.reset();
        this.f6587h.set(matrix);
        for (int size = this.f6599t.size() - 1; size >= 0; size--) {
            this.f6587h.preConcat(((C1821a) this.f6599t.get(size)).f6585f.mo7152a());
        }
        C1745d.m8325c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f6585f.f6253a.mo7151e()).intValue())) / 100.0f) * 255.0f);
        if (m8546c() || m8549f()) {
            C1745d.m8324b("Layer#computeBounds");
            this.f6593n.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo7133a(this.f6593n, this.f6587h);
            m8545c(this.f6593n, this.f6587h);
            this.f6587h.preConcat(this.f6585f.mo7152a());
            m8544b(this.f6593n, this.f6587h);
            this.f6593n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            C1745d.m8325c("Layer#computeBounds");
            C1745d.m8324b("Layer#saveLayer");
            m8542a(canvas, this.f6593n, this.f6588i, true);
            C1745d.m8325c("Layer#saveLayer");
            m8539a(canvas);
            C1745d.m8324b("Layer#drawLayer");
            mo7328b(canvas, this.f6587h, intValue);
            C1745d.m8325c("Layer#drawLayer");
            if (m8549f()) {
                m8540a(canvas, this.f6587h);
            }
            if (m8546c()) {
                C1745d.m8324b("Layer#drawMatte");
                C1745d.m8324b("Layer#saveLayer");
                m8542a(canvas, this.f6593n, this.f6591l, false);
                C1745d.m8325c("Layer#saveLayer");
                m8539a(canvas);
                this.f6583d.mo7132a(canvas, matrix, intValue);
                C1745d.m8324b("Layer#restoreLayer");
                canvas.restore();
                C1745d.m8325c("Layer#restoreLayer");
                C1745d.m8325c("Layer#drawMatte");
            }
            C1745d.m8324b("Layer#restoreLayer");
            canvas.restore();
            C1745d.m8325c("Layer#restoreLayer");
            m8543b(C1745d.m8325c(this.f6597r));
            return;
        }
        this.f6587h.preConcat(this.f6585f.mo7152a());
        C1745d.m8324b("Layer#drawLayer");
        mo7328b(canvas, this.f6587h, intValue);
        C1745d.m8325c("Layer#drawLayer");
        m8543b(C1745d.m8325c(this.f6597r));
    }

    /* renamed from: a */
    private static void m8542a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i;
        if (VERSION.SDK_INT < 23) {
            if (z) {
                i = 31;
            } else {
                i = 19;
            }
            canvas.saveLayer(rectF, paint, i);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }
}
