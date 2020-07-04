package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1814j;
import com.airbnb.lottie.p051a.p052a.C1669c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.layer.e */
public final class C1828e extends C1821a {

    /* renamed from: g */
    private final C1669c f6615g;

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        super.mo7133a(rectF, matrix);
        this.f6615g.mo7133a(rectF, this.f6580a);
    }

    C1828e(C1767h hVar, Layer layer) {
        super(hVar, layer);
        this.f6615g = new C1669c(hVar, this, new C1814j("__container", layer.f6559a));
        this.f6615g.mo7136a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7328b(Canvas canvas, Matrix matrix, int i) {
        this.f6615g.mo7132a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7329b(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        this.f6615g.mo7134a(eVar, i, list, eVar2);
    }
}
