package com.p280ss.android.ugc.playerkit.videoview.p1755d;

import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.h */
public final class C44956h implements C44955a {

    /* renamed from: a */
    private List<C44953g> f115626a;

    /* renamed from: b */
    private C44950d f115627b;

    /* renamed from: c */
    private int f115628c;

    /* renamed from: a */
    public final C44950d mo107470a() {
        return this.f115627b;
    }

    /* renamed from: a */
    public final C44951e mo107471a(C44950d dVar) {
        if (this.f115628c < this.f115626a.size()) {
            return ((C44953g) this.f115626a.get(this.f115628c)).mo104868a(new C44956h(this.f115626a, dVar, this.f115628c + 1));
        }
        throw new AssertionError();
    }

    public C44956h(List<C44953g> list, C44950d dVar, int i) {
        this.f115626a = list;
        this.f115627b = dVar;
        this.f115628c = i;
    }
}
