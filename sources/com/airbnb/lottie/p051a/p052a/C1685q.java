package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p057e.C1755c;

/* renamed from: com.airbnb.lottie.a.a.q */
public final class C1685q extends C1665a {

    /* renamed from: b */
    private final C1821a f6222b;

    /* renamed from: c */
    private final String f6223c;

    /* renamed from: d */
    private final C1687a<Integer, Integer> f6224d;

    /* renamed from: e */
    private C1687a<ColorFilter, ColorFilter> f6225e;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6223c;
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        super.mo7135a(t, cVar);
        if (t == C1782k.f6401b) {
            this.f6224d.mo7147a(cVar);
            return;
        }
        if (t == C1782k.f6423x) {
            if (cVar == null) {
                this.f6225e = null;
                return;
            }
            this.f6225e = new C1703p(cVar);
            this.f6225e.mo7146a((C1688a) this);
            this.f6222b.mo7326a(this.f6224d);
        }
    }

    public C1685q(C1767h hVar, C1821a aVar, ShapeStroke shapeStroke) {
        super(hVar, aVar, shapeStroke.f6489g.toPaintCap(), shapeStroke.f6490h.toPaintJoin(), shapeStroke.f6491i, shapeStroke.f6487e, shapeStroke.f6488f, shapeStroke.f6485c, shapeStroke.f6484b);
        this.f6222b = aVar;
        this.f6223c = shapeStroke.f6483a;
        this.f6224d = shapeStroke.f6486d.mo7288a();
        this.f6224d.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6224d);
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        this.f6110a.setColor(((Integer) this.f6224d.mo7151e()).intValue());
        if (this.f6225e != null) {
            this.f6110a.setColorFilter((ColorFilter) this.f6225e.mo7151e());
        }
        super.mo7132a(canvas, matrix, i);
    }
}
