package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1813i;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1703p;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1755c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.f */
public final class C1672f implements C1670d, C1676j, C1688a {

    /* renamed from: a */
    private final Path f6142a = new Path();

    /* renamed from: b */
    private final Paint f6143b = new Paint(1);

    /* renamed from: c */
    private final C1821a f6144c;

    /* renamed from: d */
    private final String f6145d;

    /* renamed from: e */
    private final List<C1679l> f6146e = new ArrayList();

    /* renamed from: f */
    private final C1687a<Integer, Integer> f6147f;

    /* renamed from: g */
    private final C1687a<Integer, Integer> f6148g;

    /* renamed from: h */
    private C1687a<ColorFilter, ColorFilter> f6149h;

    /* renamed from: i */
    private final C1767h f6150i;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6145d;
    }

    /* renamed from: a */
    public final void mo7131a() {
        this.f6150i.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1668b bVar = (C1668b) list2.get(i);
            if (bVar instanceof C1679l) {
                this.f6146e.add((C1679l) bVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        this.f6142a.reset();
        for (int i = 0; i < this.f6146e.size(); i++) {
            this.f6142a.addPath(((C1679l) this.f6146e.get(i)).mo7140e(), matrix);
        }
        this.f6142a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6400a) {
            this.f6147f.mo7147a(cVar);
        } else if (t == C1782k.f6403d) {
            this.f6148g.mo7147a(cVar);
        } else {
            if (t == C1782k.f6423x) {
                if (cVar == null) {
                    this.f6149h = null;
                    return;
                }
                this.f6149h = new C1703p(cVar);
                this.f6149h.mo7146a((C1688a) this);
                this.f6144c.mo7326a(this.f6149h);
            }
        }
    }

    public C1672f(C1767h hVar, C1821a aVar, C1813i iVar) {
        this.f6144c = aVar;
        this.f6145d = iVar.f6538b;
        this.f6150i = hVar;
        if (iVar.f6539c == null || iVar.f6540d == null) {
            this.f6147f = null;
            this.f6148g = null;
            return;
        }
        this.f6142a.setFillType(iVar.f6537a);
        this.f6147f = iVar.f6539c.mo7288a();
        this.f6147f.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6147f);
        this.f6148g = iVar.f6540d.mo7288a();
        this.f6148g.mo7146a((C1688a) this);
        aVar.mo7326a(this.f6148g);
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        C1745d.m8324b("FillContent#draw");
        this.f6143b.setColor(((Integer) this.f6147f.mo7151e()).intValue());
        this.f6143b.setAlpha(C1750e.m8360a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f6148g.mo7151e()).intValue())) / 100.0f) * 255.0f), 0, (int) NormalGiftView.ALPHA_255));
        if (this.f6149h != null) {
            this.f6143b.setColorFilter((ColorFilter) this.f6149h.mo7151e());
        }
        this.f6142a.reset();
        for (int i2 = 0; i2 < this.f6146e.size(); i2++) {
            this.f6142a.addPath(((C1679l) this.f6146e.get(i2)).mo7140e(), matrix);
        }
        canvas.drawPath(this.f6142a, this.f6143b);
        C1745d.m8325c("FillContent#draw");
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
