package com.airbnb.lottie.p051a.p052a;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.content.ShapeTrimPath.Type;
import com.airbnb.lottie.model.layer.C1821a;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1687a.C1688a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.r */
public final class C1686r implements C1668b, C1688a {

    /* renamed from: a */
    public final Type f6226a;

    /* renamed from: b */
    public final C1687a<?, Float> f6227b;

    /* renamed from: c */
    public final C1687a<?, Float> f6228c;

    /* renamed from: d */
    public final C1687a<?, Float> f6229d;

    /* renamed from: e */
    private final String f6230e;

    /* renamed from: f */
    private final List<C1688a> f6231f = new ArrayList();

    /* renamed from: a */
    public final void mo7136a(List<C1668b> list, List<C1668b> list2) {
    }

    /* renamed from: b */
    public final String mo7137b() {
        return this.f6230e;
    }

    /* renamed from: a */
    public final void mo7131a() {
        for (int i = 0; i < this.f6231f.size(); i++) {
            ((C1688a) this.f6231f.get(i)).mo7131a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7142a(C1688a aVar) {
        this.f6231f.add(aVar);
    }

    public C1686r(C1821a aVar, ShapeTrimPath shapeTrimPath) {
        this.f6230e = shapeTrimPath.f6494a;
        this.f6226a = shapeTrimPath.f6495b;
        this.f6227b = shapeTrimPath.f6496c.mo7288a();
        this.f6228c = shapeTrimPath.f6497d.mo7288a();
        this.f6229d = shapeTrimPath.f6498e.mo7288a();
        aVar.mo7326a(this.f6227b);
        aVar.mo7326a(this.f6228c);
        aVar.mo7326a(this.f6229d);
        this.f6227b.mo7146a((C1688a) this);
        this.f6228c.mo7146a((C1688a) this);
        this.f6229d.mo7146a((C1688a) this);
    }
}
