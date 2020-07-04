package com.airbnb.lottie.p051a.p053b;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C1812h;
import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.g */
public final class C1694g {

    /* renamed from: a */
    public final List<C1687a<C1812h, Path>> f6239a;

    /* renamed from: b */
    public final List<C1687a<Integer, Integer>> f6240b;

    /* renamed from: c */
    public final List<Mask> f6241c;

    public C1694g(List<Mask> list) {
        this.f6241c = list;
        this.f6239a = new ArrayList(list.size());
        this.f6240b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f6239a.add(((Mask) list.get(i)).f6470b.mo7288a());
            this.f6240b.add(((Mask) list.get(i)).f6471c.mo7288a());
        }
    }
}
