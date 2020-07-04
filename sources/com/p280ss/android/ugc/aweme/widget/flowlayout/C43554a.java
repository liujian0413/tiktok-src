package com.p280ss.android.ugc.aweme.widget.flowlayout;

import android.util.SparseArray;
import android.view.View;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.a */
public abstract class C43554a<T> {

    /* renamed from: a */
    private List<T> f112778a;

    /* renamed from: b */
    private SparseArray<C43557c> f112779b = new SparseArray<>();

    /* renamed from: c */
    public C43555a f112780c;

    /* renamed from: d */
    public HashSet<Integer> f112781d = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.a$a */
    interface C43555a {
    }

    /* renamed from: a */
    public abstract View mo67958a(FlowLayout flowLayout, int i, T t);

    /* renamed from: a */
    public final int mo105479a() {
        if (this.f112778a == null) {
            return 0;
        }
        return this.f112778a.size();
    }

    /* renamed from: a */
    public final T mo105480a(int i) {
        return this.f112778a.get(i);
    }

    public C43554a(List<T> list) {
        this.f112778a = list;
    }

    /* renamed from: a */
    public final void mo105481a(int i, C43557c cVar) {
        this.f112779b.append(i, cVar);
    }
}
