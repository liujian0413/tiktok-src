package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.a */
public abstract class C1665a implements C1670d, C1676j, C1688a {

    /* renamed from: a */
    final Paint f6110a = new Paint(1);

    /* renamed from: b */
    private final PathMeasure f6111b = new PathMeasure();

    /* renamed from: c */
    private final Path f6112c = new Path();

    /* renamed from: d */
    private final Path f6113d = new Path();

    /* renamed from: e */
    private final RectF f6114e = new RectF();

    /* renamed from: f */
    private final C1767h f6115f;

    /* renamed from: g */
    private final C1821a f6116g;

    /* renamed from: h */
    private final List<C1667a> f6117h = new ArrayList();

    /* renamed from: i */
    private final float[] f6118i;

    /* renamed from: j */
    private final C1687a<?, Float> f6119j;

    /* renamed from: k */
    private final C1687a<?, Integer> f6120k;

    /* renamed from: l */
    private final List<C1687a<?, Float>> f6121l;

    /* renamed from: m */
    private final C1687a<?, Float> f6122m;

    /* renamed from: n */
    private C1687a<ColorFilter, ColorFilter> f6123n;

    /* renamed from: com.airbnb.lottie.a.a.a$a */
    static final class C1667a {

        /* renamed from: a */
        public final List<C1679l> f6124a;

        /* renamed from: b */
        public final C1686r f6125b;

        private C1667a(C1686r rVar) {
            this.f6124a = new ArrayList();
            this.f6125b = rVar;
        }
    }

    /* renamed from: a */
    public final void mo7131a() {
        this.f6115f.invalidateSelf();
    }

    /* renamed from: a */
    private void m8096a(Matrix matrix) {
        float f;
        C1745d.m8324b("StrokeContent#applyDashPattern");
        if (this.f6121l.isEmpty()) {
            C1745d.m8325c("StrokeContent#applyDashPattern");
            return;
        }
        float a = C1751f.m8368a(matrix);
        for (int i = 0; i < this.f6121l.size(); i++) {
            this.f6118i[i] = ((Float) ((C1687a) this.f6121l.get(i)).mo7151e()).floatValue();
            if (i % 2 == 0) {
                if (this.f6118i[i] < 1.0f) {
                    this.f6118i[i] = 1.0f;
                }
            } else if (this.f6118i[i] < 0.1f) {
                this.f6118i[i] = 0.1f;
            }
            float[] fArr = this.f6118i;
            fArr[i] = fArr[i] * a;
        }
        if (this.f6122m == null) {
            f = 0.0f;
        } else {
            f = ((Float) this.f6122m.mo7151e()).floatValue();
        }
        this.f6110a.setPathEffect(new DashPathEffect(this.f6118i, f));
        C1745d.m8325c("StrokeContent#applyDashPattern");
    }

    /* renamed from: a */
    public <T> void mo7135a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6403d) {
            this.f6120k.mo7147a(cVar);
        } else if (t == C1782k.f6410k) {
            this.f6119j.mo7147a(cVar);
        } else {
            if (t == C1782k.f6423x) {
                if (cVar == null) {
                    this.f6123n = null;
                    return;
                }
                this.f6123n = new C1703p(cVar);
                this.f6123n.mo7146a((C1688a) this);
                this.f6116g.mo7326a(this.f6123n);
            }
        }
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        C1686r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C1668b bVar = (C1668b) list.get(size);
            if (bVar instanceof C1686r) {
                C1686r rVar2 = (C1686r) bVar;
                if (rVar2.f6226a == Type.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo7142a(this);
        }
        C1667a aVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C1668b bVar2 = (C1668b) list2.get(size2);
            if (bVar2 instanceof C1686r) {
                C1686r rVar3 = (C1686r) bVar2;
                if (rVar3.f6226a == Type.Individually) {
                    if (aVar != null) {
                        this.f6117h.add(aVar);
                    }
                    aVar = new C1667a(rVar3);
                    rVar3.mo7142a(this);
                }
            }
            if (bVar2 instanceof C1679l) {
                if (aVar == null) {
                    aVar = new C1667a(rVar);
                }
                aVar.f6124a.add((C1679l) bVar2);
            }
        }
        if (aVar != null) {
            this.f6117h.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        C1745d.m8324b("StrokeContent#getBounds");
        this.f6112c.reset();
        for (int i = 0; i < this.f6117h.size(); i++) {
            C1667a aVar = (C1667a) this.f6117h.get(i);
            for (int i2 = 0; i2 < aVar.f6124a.size(); i2++) {
                this.f6112c.addPath(((C1679l) aVar.f6124a.get(i2)).mo7140e(), matrix);
            }
        }
        this.f6112c.computeBounds(this.f6114e, false);
        float floatValue = ((Float) this.f6119j.mo7151e()).floatValue() / 2.0f;
        this.f6114e.set(this.f6114e.left - floatValue, this.f6114e.top - floatValue, this.f6114e.right + floatValue, this.f6114e.bottom + floatValue);
        rectF.set(this.f6114e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1745d.m8325c("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m8095a(Canvas canvas, C1667a aVar, Matrix matrix) {
        float f;
        float f2;
        C1745d.m8324b("StrokeContent#applyTrimPath");
        if (aVar.f6125b == null) {
            C1745d.m8325c("StrokeContent#applyTrimPath");
            return;
        }
        this.f6112c.reset();
        for (int size = aVar.f6124a.size() - 1; size >= 0; size--) {
            this.f6112c.addPath(((C1679l) aVar.f6124a.get(size)).mo7140e(), matrix);
        }
        this.f6111b.setPath(this.f6112c, false);
        float length = this.f6111b.getLength();
        while (this.f6111b.nextContour()) {
            length += this.f6111b.getLength();
        }
        float floatValue = (((Float) aVar.f6125b.f6229d.mo7151e()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) aVar.f6125b.f6227b.mo7151e()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) aVar.f6125b.f6228c.mo7151e()).floatValue() * length) / 100.0f) + floatValue;
        float f3 = 0.0f;
        for (int size2 = aVar.f6124a.size() - 1; size2 >= 0; size2--) {
            this.f6113d.set(((C1679l) aVar.f6124a.get(size2)).mo7140e());
            this.f6113d.transform(matrix);
            this.f6111b.setPath(this.f6113d, false);
            float length2 = this.f6111b.getLength();
            float f4 = 1.0f;
            if (floatValue3 > length) {
                float f5 = floatValue3 - length;
                if (f5 < f3 + length2 && f3 < f5) {
                    if (floatValue2 > length) {
                        f = (floatValue2 - length) / length2;
                    } else {
                        f = 0.0f;
                    }
                    f4 = Math.min(f5 / length2, 1.0f);
                    C1751f.m8371a(this.f6113d, f, f4, 0.0f);
                    canvas.drawPath(this.f6113d, this.f6110a);
                    f3 += length2;
                }
            }
            float f6 = f3 + length2;
            if (f6 >= floatValue2 && f3 <= floatValue3) {
                if (f6 > floatValue3 || floatValue2 >= f3) {
                    if (floatValue2 < f3) {
                        f2 = 0.0f;
                    } else {
                        f2 = (floatValue2 - f3) / length2;
                    }
                    if (floatValue3 <= f6) {
                        f4 = (floatValue3 - f3) / length2;
                    }
                    C1751f.m8371a(this.f6113d, f, f4, 0.0f);
                    canvas.drawPath(this.f6113d, this.f6110a);
                } else {
                    canvas.drawPath(this.f6113d, this.f6110a);
                }
            }
            f3 += length2;
        }
        C1745d.m8325c("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo7132a(Canvas canvas, Matrix matrix, int i) {
        C1745d.m8324b("StrokeContent#draw");
        this.f6110a.setAlpha(C1750e.m8360a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f6120k.mo7151e()).intValue())) / 100.0f) * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
        this.f6110a.setStrokeWidth(((Float) this.f6119j.mo7151e()).floatValue() * C1751f.m8368a(matrix));
        if (this.f6110a.getStrokeWidth() <= 0.0f) {
            C1745d.m8325c("StrokeContent#draw");
            return;
        }
        m8096a(matrix);
        if (this.f6123n != null) {
            this.f6110a.setColorFilter((ColorFilter) this.f6123n.mo7151e());
        }
        for (int i2 = 0; i2 < this.f6117h.size(); i2++) {
            C1667a aVar = (C1667a) this.f6117h.get(i2);
            if (aVar.f6125b != null) {
                m8095a(canvas, aVar, matrix);
            } else {
                C1745d.m8324b("StrokeContent#buildPath");
                this.f6112c.reset();
                for (int size = aVar.f6124a.size() - 1; size >= 0; size--) {
                    this.f6112c.addPath(((C1679l) aVar.f6124a.get(size)).mo7140e(), matrix);
                }
                C1745d.m8325c("StrokeContent#buildPath");
                C1745d.m8324b("StrokeContent#drawPath");
                canvas.drawPath(this.f6112c, this.f6110a);
                C1745d.m8325c("StrokeContent#drawPath");
            }
        }
        C1745d.m8325c("StrokeContent#draw");
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }

    C1665a(C1767h hVar, C1821a aVar, Cap cap, Join join, float f, C1791d dVar, C1789b bVar, List<C1789b> list, C1789b bVar2) {
        this.f6115f = hVar;
        this.f6116g = aVar;
        this.f6110a.setStyle(Style.STROKE);
        this.f6110a.setStrokeCap(cap);
        this.f6110a.setStrokeJoin(join);
        this.f6110a.setStrokeMiter(f);
        this.f6120k = dVar.mo7288a();
        this.f6119j = bVar.mo7288a();
        if (bVar2 == null) {
            this.f6122m = null;
        } else {
            this.f6122m = bVar2.mo7288a();
        }
        this.f6121l = new ArrayList(list.size());
        this.f6118i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f6121l.add(((C1789b) list.get(i)).mo7288a());
        }
        aVar.mo7326a(this.f6120k);
        aVar.mo7326a(this.f6119j);
        for (int i2 = 0; i2 < this.f6121l.size(); i2++) {
            aVar.mo7326a((C1687a) this.f6121l.get(i2));
        }
        if (this.f6122m != null) {
            aVar.mo7326a(this.f6122m);
        }
        this.f6120k.mo7146a((C1688a) this);
        this.f6119j.mo7146a((C1688a) this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C1687a) this.f6121l.get(i3)).mo7146a((C1688a) this);
        }
        if (this.f6122m != null) {
            this.f6122m.mo7146a((C1688a) this);
        }
    }
}
