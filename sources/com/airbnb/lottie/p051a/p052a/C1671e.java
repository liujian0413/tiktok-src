package com.airbnb.lottie.p051a.p052a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.C1782k;
import com.airbnb.lottie.model.C1817e;
import com.airbnb.lottie.model.content.C1805a;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import com.airbnb.lottie.p056d.C1750e;
import com.airbnb.lottie.p056d.C1751f;
import com.airbnb.lottie.p057e.C1755c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.e */
public final class C1671e implements C1676j, C1679l, C1688a {

    /* renamed from: a */
    private final Path f6134a = new Path();

    /* renamed from: b */
    private final String f6135b;

    /* renamed from: c */
    private final C1767h f6136c;

    /* renamed from: d */
    private final C1687a<?, PointF> f6137d;

    /* renamed from: e */
    private final C1687a<?, PointF> f6138e;

    /* renamed from: f */
    private final C1805a f6139f;

    /* renamed from: g */
    private C1686r f6140g;

    /* renamed from: h */
    private boolean f6141h;

    /* renamed from: a */
    public final void mo7131a() {
        m8119c();
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6135b;
    }

    /* renamed from: c */
    private void m8119c() {
        this.f6141h = false;
        this.f6136c.invalidateSelf();
    }

    /* renamed from: e */
    public final Path mo7140e() {
        if (this.f6141h) {
            return this.f6134a;
        }
        this.f6134a.reset();
        PointF pointF = (PointF) this.f6137d.mo7151e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f6134a.reset();
        if (this.f6139f.f6502d) {
            float f5 = -f2;
            this.f6134a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f6134a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f6134a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f6134a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f6134a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f6134a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f6134a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f6134a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f6134a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f6134a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF pointF2 = (PointF) this.f6138e.mo7151e();
        this.f6134a.offset(pointF2.x, pointF2.y);
        this.f6134a.close();
        C1751f.m8372a(this.f6134a, this.f6140g);
        this.f6141h = true;
        return this.f6134a;
    }

    /* renamed from: a */
    public final <T> void mo7135a(T t, C1755c<T> cVar) {
        if (t == C1782k.f6406g) {
            this.f6137d.mo7147a(cVar);
            return;
        }
        if (t == C1782k.f6407h) {
            this.f6138e.mo7147a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1668b bVar = (C1668b) list.get(i);
            if (bVar instanceof C1686r) {
                C1686r rVar = (C1686r) bVar;
                if (rVar.f6226a == Type.Simultaneously) {
                    this.f6140g = rVar;
                    this.f6140g.mo7142a(this);
                }
            }
        }
    }

    public C1671e(C1767h hVar, C1821a aVar, C1805a aVar2) {
        this.f6135b = aVar2.f6499a;
        this.f6136c = hVar;
        this.f6137d = aVar2.f6501c.mo7288a();
        this.f6138e = aVar2.f6500b.mo7288a();
        this.f6139f = aVar2;
        aVar.mo7326a(this.f6137d);
        aVar.mo7326a(this.f6138e);
        this.f6137d.mo7146a((C1688a) this);
        this.f6138e.mo7146a((C1688a) this);
    }

    /* renamed from: a */
    public final void mo7134a(C1817e eVar, int i, List<C1817e> list, C1817e eVar2) {
        C1750e.m8363a(eVar, i, list, eVar2, this);
    }
}
