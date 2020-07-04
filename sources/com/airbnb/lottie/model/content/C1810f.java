package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1789b;
import com.airbnb.lottie.model.p058a.C1793f;
import com.airbnb.lottie.model.p058a.C1800m;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1682n;

/* renamed from: com.airbnb.lottie.model.content.f */
public final class C1810f implements C1806b {

    /* renamed from: a */
    public final String f6526a;

    /* renamed from: b */
    public final C1800m<PointF, PointF> f6527b;

    /* renamed from: c */
    public final C1793f f6528c;

    /* renamed from: d */
    public final C1789b f6529d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RectangleShape{position=");
        sb.append(this.f6527b);
        sb.append(", size=");
        sb.append(this.f6528c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1682n(hVar, aVar, this);
    }

    public C1810f(String str, C1800m<PointF, PointF> mVar, C1793f fVar, C1789b bVar) {
        this.f6526a = str;
        this.f6527b = mVar;
        this.f6528c = fVar;
        this.f6529d = bVar;
    }
}
