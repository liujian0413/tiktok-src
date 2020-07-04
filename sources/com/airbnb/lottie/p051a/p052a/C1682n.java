package com.airbnb.lottie.p051a.p052a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1810f;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.n */
public final class C1682n implements C1676j, C1679l, C1688a {

    /* renamed from: a */
    private final Path f6198a = new Path();

    /* renamed from: b */
    private final RectF f6199b = new RectF();

    /* renamed from: c */
    private final String f6200c;

    /* renamed from: d */
    private final C1767h f6201d;

    /* renamed from: e */
    private final C1687a<?, PointF> f6202e;

    /* renamed from: f */
    private final C1687a<?, PointF> f6203f;

    /* renamed from: g */
    private final C1687a<?, Float> f6204g;

    /* renamed from: h */
    private C1686r f6205h;

    /* renamed from: i */
    private boolean f6206i;

    /* renamed from: a */
    public final void mo7131a() {
        m8165c();
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6200c;
    }

    /* renamed from: c */
    private void m8165c() {
        this.f6206i = false;
        this.f6201d.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo7140e() {
        float f;
        if (this.f6206i) {
            return this.f6198a;
        }
        this.f6198a.reset();
        PointF pointF = (PointF) this.f6203f.mo7151e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        if (this.f6204g == null) {
            f = 0.0f;
        } else {
            f = ((Float) this.f6204g.mo7151e()).floatValue();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF pointF2 = (PointF) this.f6202e.mo7151e();
        this.f6198a.moveTo(pointF2.x + f2, (pointF2.y - f3) + f);
        this.f6198a.lineTo(pointF2.x + f2, (pointF2.y + f3) - f);
        if (f > 0.0f) {
            float f4 = f * 2.0f;
            this.f6199b.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
            this.f6198a.arcTo(this.f6199b, 0.0f, 90.0f, false);
        }
        this.f6198a.lineTo((pointF2.x - f2) + f, pointF2.y + f3);
        if (f > 0.0f) {
            float f5 = f * 2.0f;
            this.f6199b.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
            this.f6198a.arcTo(this.f6199b, 90.0f, 90.0f, false);
        }
        this.f6198a.lineTo(pointF2.x - f2, (pointF2.y - f3) + f);
        if (f > 0.0f) {
            float f6 = f * 2.0f;
            this.f6199b.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
            this.f6198a.arcTo(this.f6199b, 180.0f, 90.0f, false);
        }
        this.f6198a.lineTo((pointF2.x + f2) - f, pointF2.y - f3);
        if (f > 0.0f) {
            float f7 = f * 2.0f;
            this.f6199b.set((pointF2.x + f2) - f7, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f7);
            this.f6198a.arcTo(this.f6199b, 270.0f, 90.0f, false);
        }
        this.f6198a.close();
        C1751f.m8372a(this.f6198a, this.f6205h);
        this.f6206i = true;
        return this.f6198a;
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1668b bVar = (C1668b) list.get(i);
            if (bVar instanceof C1686r) {
                C1686r rVar = (C1686r) bVar;
                if (rVar.f6226a == Type.Simultaneously) {
                    this.f6205h = rVar;
                    this.f6205h.mo7142a(this);
                }
            }
        }
    }

    public C1682n(C1767h hVar, C1821a aVar, C1810f fVar) {
        this.f6200c = fVar.f6526a;
        this.f6201d = hVar;
        this.f6202e = fVar.f6527b.mo7288a();
        this.f6203f = fVar.f6528c.mo7288a();
        this.f6204g = fVar.f6529d.mo7288a();
        aVar.mo7326a(this.f6202e);
        aVar.mo7326a(this.f6203f);
        aVar.mo7326a(this.f6204g);
        this.f6202e.mo7146a((C1688a) this);
        this.f6203f.mo7146a((C1688a) this);
        this.f6204g.mo7146a((C1688a) this);
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
