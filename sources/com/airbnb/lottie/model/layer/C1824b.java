package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.p022v4.util.C0893e;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p057e.C1755c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.b */
public final class C1824b extends C1821a {

    /* renamed from: g */
    private C1687a<Float, Float> f6606g;

    /* renamed from: h */
    private final List<C1821a> f6607h = new ArrayList();

    /* renamed from: i */
    private final RectF f6608i = new RectF();

    /* renamed from: j */
    private final RectF f6609j = new RectF();

    /* renamed from: a */
    public final void mo7325a(float f) {
        super.mo7325a(f);
        if (this.f6606g != null) {
            f = ((float) ((long) (((Float) this.f6606g.mo7151e()).floatValue() * 1000.0f))) / this.f6581b.f6356a.mo7208a();
        }
        if (this.f6582c.f6571m != 0.0f) {
            f /= this.f6582c.f6571m;
        }
        float a = f - this.f6582c.mo7322a();
        for (int size = this.f6607h.size() - 1; size >= 0; size--) {
            ((C1821a) this.f6607h.get(size)).mo7325a(a);
        }
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        super.mo7135a(t, cVar);
        if (t == C1782k.f6422w) {
            if (cVar == null) {
                this.f6606g = null;
            } else {
                this.f6606g = new C1703p(cVar);
                mo7326a(this.f6606g);
            }
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        super.mo7133a(rectF, matrix);
        this.f6608i.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f6607h.size() - 1; size >= 0; size--) {
            ((C1821a) this.f6607h.get(size)).mo7133a(this.f6608i, this.f6580a);
            if (rectF.isEmpty()) {
                rectF.set(this.f6608i);
            } else {
                rectF.set(Math.min(rectF.left, this.f6608i.left), Math.min(rectF.top, this.f6608i.top), Math.max(rectF.right, this.f6608i.right), Math.max(rectF.bottom, this.f6608i.bottom));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7328b(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        C1745d.m8324b("CompositionLayer#draw");
        canvas.save();
        this.f6609j.set(0.0f, 0.0f, (float) this.f6582c.f6572n, (float) this.f6582c.f6573o);
        matrix.mapRect(this.f6609j);
        for (int size = this.f6607h.size() - 1; size >= 0; size--) {
            if (!this.f6609j.isEmpty()) {
                z = canvas.clipRect(this.f6609j);
            } else {
                z = true;
            }
            if (z) {
                ((C1821a) this.f6607h.get(size)).mo7132a(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1745d.m8325c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7329b(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        for (int i2 = 0; i2 < this.f6607h.size(); i2++) {
            ((C1821a) this.f6607h.get(i2)).mo7134a(eVar, i, list, eVar2);
        }
    }

    public C1824b(C1767h hVar, Layer layer, List<Layer> list, C1757f fVar) {
        Layer layer2;
        super(hVar, layer);
        C1789b bVar = layer.f6576r;
        if (bVar != null) {
            this.f6606g = bVar.mo7288a();
            mo7326a(this.f6606g);
            this.f6606g.mo7146a((C1688a) this);
        } else {
            this.f6606g = null;
        }
        C0893e eVar = new C0893e(fVar.f6336e.size());
        int size = list.size() - 1;
        C1821a aVar = null;
        while (true) {
            if (size >= 0) {
                C1821a a = C1821a.m8538a((Layer) list.get(size), hVar, fVar);
                if (a != null) {
                    eVar.mo3333b(a.f6582c.f6562d, a);
                    if (aVar == null) {
                        this.f6607h.add(0, a);
                        switch (layer2.f6578t) {
                            case Add:
                            case Invert:
                                aVar = a;
                                break;
                        }
                    } else {
                        aVar.f6583d = a;
                        aVar = null;
                    }
                }
                size--;
            } else {
                for (int i = 0; i < eVar.mo3330b(); i++) {
                    C1821a aVar2 = (C1821a) eVar.mo3327a(eVar.mo3331b(i));
                    if (aVar2 != null) {
                        C1821a aVar3 = (C1821a) eVar.mo3327a(aVar2.f6582c.f6564f);
                        if (aVar3 != null) {
                            aVar2.f6584e = aVar3;
                        }
                    }
                }
                return;
            }
        }
    }
}
