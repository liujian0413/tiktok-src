package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1745d;
import com.airbnb.lottie.model.C1787a;
import com.airbnb.lottie.p056d.C1750e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.h */
public final class C1812h {

    /* renamed from: a */
    public final List<C1787a> f6534a = new ArrayList();

    /* renamed from: b */
    public PointF f6535b;

    /* renamed from: c */
    public boolean f6536c;

    public C1812h() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f6534a.size());
        sb.append("closed=");
        sb.append(this.f6536c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m8513a(float f, float f2) {
        if (this.f6535b == null) {
            this.f6535b = new PointF();
        }
        this.f6535b.set(f, f2);
    }

    public C1812h(PointF pointF, boolean z, List<C1787a> list) {
        this.f6535b = pointF;
        this.f6536c = z;
        this.f6534a.addAll(list);
    }

    /* renamed from: a */
    public final void mo7301a(C1812h hVar, C1812h hVar2, float f) {
        boolean z;
        if (this.f6535b == null) {
            this.f6535b = new PointF();
        }
        if (hVar.f6536c || hVar2.f6536c) {
            z = true;
        } else {
            z = false;
        }
        this.f6536c = z;
        if (hVar.f6534a.size() != hVar2.f6534a.size()) {
            StringBuilder sb = new StringBuilder("Curves must have the same number of control points. Shape 1: ");
            sb.append(hVar.f6534a.size());
            sb.append("\tShape 2: ");
            sb.append(hVar2.f6534a.size());
            C1745d.m8323a(sb.toString());
        }
        if (this.f6534a.isEmpty()) {
            int min = Math.min(hVar.f6534a.size(), hVar2.f6534a.size());
            for (int i = 0; i < min; i++) {
                this.f6534a.add(new C1787a());
            }
        }
        PointF pointF = hVar.f6535b;
        PointF pointF2 = hVar2.f6535b;
        m8513a(C1750e.m8356a(pointF.x, pointF2.x, f), C1750e.m8356a(pointF.y, pointF2.y, f));
        for (int size = this.f6534a.size() - 1; size >= 0; size--) {
            C1787a aVar = (C1787a) hVar.f6534a.get(size);
            C1787a aVar2 = (C1787a) hVar2.f6534a.get(size);
            PointF pointF3 = aVar.f6436a;
            PointF pointF4 = aVar.f6437b;
            PointF pointF5 = aVar.f6438c;
            PointF pointF6 = aVar2.f6436a;
            PointF pointF7 = aVar2.f6437b;
            PointF pointF8 = aVar2.f6438c;
            ((C1787a) this.f6534a.get(size)).mo7285a(C1750e.m8356a(pointF3.x, pointF6.x, f), C1750e.m8356a(pointF3.y, pointF6.y, f));
            ((C1787a) this.f6534a.get(size)).mo7286b(C1750e.m8356a(pointF4.x, pointF7.x, f), C1750e.m8356a(pointF4.y, pointF7.y, f));
            ((C1787a) this.f6534a.get(size)).mo7287c(C1750e.m8356a(pointF5.x, pointF8.x, f), C1750e.m8356a(pointF5.y, pointF8.y, f));
        }
    }
}
