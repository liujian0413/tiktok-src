package com.facebook.keyframes.model;

import com.facebook.keyframes.p733b.C14011c;
import com.facebook.keyframes.p733b.C14013e;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.i */
public final class C14050i {

    /* renamed from: a */
    public final List<C14037d> f37112a;

    /* renamed from: b */
    public final float[][][] f37113b;

    /* renamed from: com.facebook.keyframes.model.i$a */
    public static class C14051a {

        /* renamed from: a */
        public List<C14037d> f37114a;

        /* renamed from: b */
        public float[][][] f37115b;

        /* renamed from: a */
        public final C14050i mo33701a() {
            return new C14050i(this.f37114a, this.f37115b);
        }
    }

    public C14050i(List<C14037d> list, float[][][] fArr) {
        this.f37112a = C14013e.m41371a(list);
        this.f37113b = (float[][][]) C14011c.m41368a(fArr, C14011c.m41370a(fArr, this.f37112a.size()), "timing_curves");
    }
}
