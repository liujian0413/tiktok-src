package com.bytedance.android.live.core.paging.adapter;

import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.C3417a;
import java.util.Map;

public abstract class SimplePagingAdapter<T> extends PagingAdapter<T> {

    /* renamed from: j */
    public Map<Integer, C3417a> f9823j;

    /* renamed from: k */
    public Object[] f9824k;

    public static class ItemComparator extends C1147c {
        /* renamed from: a */
        public final boolean mo4549a(Object obj, Object obj2) {
            return obj == obj2;
        }

        /* renamed from: b */
        public final boolean mo4550b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10065a(int i, T t) {
        return -8888;
    }

    public SimplePagingAdapter(C1147c<T> cVar, Map<Integer, C3417a> map) {
        super(cVar);
        this.f9823j = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1293v mo10066a(ViewGroup viewGroup, int i) {
        C3417a aVar = (C3417a) this.f9823j.get(Integer.valueOf(i));
        if (aVar == null) {
            return new InvalidItemViewHolder(viewGroup);
        }
        return aVar.mo10322a(viewGroup, this.f9824k);
    }
}
