package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1767h;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.model.p058a.C1795h;
import com.airbnb.lottie.p051a.p052a.C1668b;
import com.airbnb.lottie.p051a.p052a.C1684p;

/* renamed from: com.airbnb.lottie.model.content.k */
public final class C1815k implements C1806b {

    /* renamed from: a */
    public final String f6544a;

    /* renamed from: b */
    public final C1795h f6545b;

    /* renamed from: c */
    private final int f6546c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.f6544a);
        sb.append(", index=");
        sb.append(this.f6546c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final C1668b mo7291a(C1767h hVar, C1821a aVar) {
        return new C1684p(hVar, aVar, this);
    }

    public C1815k(String str, int i, C1795h hVar) {
        this.f6544a = str;
        this.f6546c = i;
        this.f6545b = hVar;
    }
}
