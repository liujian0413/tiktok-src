package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.model.content.C1807c;
import com.airbnb.lottie.p057e.C1753a;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
public final class C1691d extends C1693f<C1807c> {

    /* renamed from: d */
    private final C1807c f6238d;

    public C1691d(List<C1753a<C1807c>> list) {
        super(list);
        int i = 0;
        C1807c cVar = (C1807c) ((C1753a) list.get(0)).f6311b;
        if (cVar != null) {
            i = cVar.mo7298a();
        }
        this.f6238d = new C1807c(new float[i], new int[i]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C1807c mo7143a(C1753a<C1807c> aVar, float f) {
        this.f6238d.mo7299a((C1807c) aVar.f6311b, (C1807c) aVar.f6312c, f);
        return this.f6238d;
    }
}
