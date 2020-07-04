package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1669c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.j */
public final class C1814j implements C1806b {

    /* renamed from: a */
    public final String f6542a;

    /* renamed from: b */
    public final List<C1806b> f6543b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeGroup{name='");
        sb.append(this.f6542a);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.f6543b.toArray()));
        sb.append('}');
        return sb.toString();
    }

    public C1814j(String str, List<C1806b> list) {
        this.f6542a = str;
        this.f6543b = list;
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1669c(hVar, aVar, this);
    }
}
