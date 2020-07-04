package com.airbnb.lottie.p051a.p052a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1811g;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p051a.p053b.C1702o;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p057e.C1755c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.a.a.o */
public final class C1683o implements C1670d, C1675i, C1676j, C1679l, C1688a {

    /* renamed from: a */
    private final Matrix f6207a = new Matrix();

    /* renamed from: b */
    private final Path f6208b = new Path();

    /* renamed from: c */
    private final C1767h f6209c;

    /* renamed from: d */
    private final C1821a f6210d;

    /* renamed from: e */
    private final String f6211e;

    /* renamed from: f */
    private final C1687a<Float, Float> f6212f;

    /* renamed from: g */
    private final C1687a<Float, Float> f6213g;

    /* renamed from: h */
    private final C1702o f6214h;

    /* renamed from: i */
    private C1669c f6215i;

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6211e;
    }

    /* renamed from: a */
    public final void mo7131a() {
        this.f6209c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo7140e() {
        Path e = this.f6215i.mo7140e();
        this.f6208b.reset();
        float floatValue = ((Float) this.f6212f.mo7151e()).floatValue();
        float floatValue2 = ((Float) this.f6213g.mo7151e()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f6207a.set(this.f6214h.mo7157b(((float) i) + floatValue2));
            this.f6208b.addPath(e, this.f6207a);
        }
        return this.f6208b;
    }

    /* renamed from: a */
    public final void mo7141a(ListIterator<C1668b> listIterator) {
        if (this.f6215i == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            C1669c cVar = new C1669c(this.f6209c, this.f6210d, "Repeater", arrayList, null);
            this.f6215i = cVar;
        }
    }

    /* renamed from: a */
    public final void mo7133a(RectF rectF, Matrix matrix) {
        this.f6215i.mo7133a(rectF, matrix);
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (!this.f6214h.mo7156a(t, cVar)) {
            if (t == C1782k.f6412m) {
                this.f6212f.mo7147a(cVar);
                return;
            }
            if (t == C1782k.f6413n) {
                this.f6213g.mo7147a(cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        this.f6215i.mo7136a(list, list2);
    }

    public C1683o(C1767h hVar, C1821a aVar, C1811g gVar) {
        this.f6209c = hVar;
        this.f6210d = aVar;
        this.f6211e = gVar.f6530a;
        this.f6212f = gVar.f6531b.mo7288a();
        aVar.mo7326a(this.f6212f);
        this.f6212f.mo7146a((C1688a) this);
        this.f6213g = gVar.f6532c.mo7288a();
        aVar.mo7326a(this.f6213g);
        this.f6213g.mo7146a((C1688a) this);
        this.f6214h = gVar.f6533d.mo7292a();
        this.f6214h.mo7155a(aVar);
        this.f6214h.mo7154a((C1688a) this);
    }

    /* renamed from: a */
    public final void mo7132a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f6212f.mo7151e()).floatValue();
        float floatValue2 = ((Float) this.f6213g.mo7151e()).floatValue();
        float floatValue3 = ((Float) this.f6214h.f6254b.mo7151e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f6214h.f6255c.mo7151e()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f6207a.set(matrix);
            float f = (float) i2;
            this.f6207a.preConcat(this.f6214h.mo7157b(f + floatValue2));
            this.f6215i.mo7132a(canvas, this.f6207a, (int) (((float) i) * C1750e.m8356a(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
