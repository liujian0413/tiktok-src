package com.bytedance.android.live.core.paging.adapter;

import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;

public class DelegatePagingAdapter<T> extends PagingAdapter<T> {

    /* renamed from: j */
    private C3184a f9796j;

    /* renamed from: com.bytedance.android.live.core.paging.adapter.DelegatePagingAdapter$a */
    public interface C3184a<V> {
        /* renamed from: a */
        int mo10068a(int i, V v);

        /* renamed from: a */
        C1293v mo10069a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        boolean mo10070a(V v, V v2);

        /* renamed from: b */
        boolean mo10071b(V v, V v2);
    }

    /* renamed from: com.bytedance.android.live.core.paging.adapter.DelegatePagingAdapter$b */
    static class C3185b<T> extends C1147c<T> {

        /* renamed from: a */
        private C3184a<T> f9797a;

        C3185b(C3184a<T> aVar) {
            this.f9797a = aVar;
        }

        /* renamed from: a */
        public final boolean mo4549a(T t, T t2) {
            return this.f9797a.mo10070a(t, t2);
        }

        /* renamed from: b */
        public final boolean mo4550b(T t, T t2) {
            return this.f9797a.mo10071b(t, t2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10064a() {
        return super.mo10064a();
    }

    public DelegatePagingAdapter(C3184a<T> aVar) {
        super(new C3185b(aVar));
        this.f9796j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10067a(C1293v vVar, int i) {
        mo153a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo10065a(int i, T t) {
        return this.f9796j.mo10068a(i, t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1293v mo10066a(ViewGroup viewGroup, int i) {
        return this.f9796j.mo10069a(viewGroup, i);
    }
}
