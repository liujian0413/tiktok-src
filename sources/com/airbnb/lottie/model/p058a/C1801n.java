package com.airbnb.lottie.model.p058a;

import com.airbnb.lottie.p057e.C1753a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.a.n */
abstract class C1801n<V, O> implements C1800m<V, O> {

    /* renamed from: a */
    final List<C1753a<V>> f6453a;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f6453a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f6453a.toArray()));
        }
        return sb.toString();
    }

    C1801n(List<C1753a<V>> list) {
        this.f6453a = list;
    }

    C1801n(V v) {
        this(Collections.singletonList(new C1753a(v)));
    }
}
