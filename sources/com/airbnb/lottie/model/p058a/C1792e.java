package com.airbnb.lottie.model.p058a;

import android.graphics.PointF;
import com.airbnb.lottie.p051a.p053b.C1687a;
import com.airbnb.lottie.p051a.p053b.C1696i;
import com.airbnb.lottie.p051a.p053b.C1697j;
import com.airbnb.lottie.p057e.C1753a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.e */
public final class C1792e implements C1800m<PointF, PointF> {

    /* renamed from: a */
    private final List<C1753a<PointF>> f6439a;

    public C1792e() {
        this.f6439a = Collections.singletonList(new C1753a(new PointF(0.0f, 0.0f)));
    }

    /* renamed from: a */
    public final C1687a<PointF, PointF> mo7288a() {
        if (((C1753a) this.f6439a.get(0)).mo7203c()) {
            return new C1697j(this.f6439a);
        }
        return new C1696i(this.f6439a);
    }

    public C1792e(List<C1753a<PointF>> list) {
        this.f6439a = list;
    }
}
