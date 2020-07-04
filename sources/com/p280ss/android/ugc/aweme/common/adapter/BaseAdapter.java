package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p029v7.widget.RecyclerView.C1264c;
import com.bytedance.common.utility.collection.C6307b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.BaseAdapter */
public abstract class BaseAdapter<T> extends LoadMoreRecyclerViewAdapter {

    /* renamed from: n */
    static final String f67538n = "BaseAdapter";

    /* renamed from: l */
    public List<T> f67539l;

    /* renamed from: m */
    protected int f67540m;

    /* renamed from: a */
    public List<T> mo62312a() {
        return this.f67539l;
    }

    public BaseAdapter() {
        registerAdapterDataObserver(new C1264c() {
            /* renamed from: a */
            public final void mo5721a() {
                BaseAdapter.this.f67540m = BaseAdapter.this.getItemCount();
            }

            /* renamed from: b */
            public final void mo5725b(int i, int i2) {
                BaseAdapter.this.f67540m = BaseAdapter.this.getItemCount();
            }

            /* renamed from: c */
            public final void mo5726c(int i, int i2) {
                BaseAdapter.this.f67540m = BaseAdapter.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo5722a(int i, int i2) {
                BaseAdapter.this.f67540m = BaseAdapter.this.getItemCount();
            }

            /* renamed from: a */
            public final void mo5723a(int i, int i2, int i3) {
                BaseAdapter.this.f67540m = BaseAdapter.this.getItemCount();
            }
        });
    }

    /* renamed from: c */
    public int mo60557c() {
        if (this.f67539l == null) {
            return 0;
        }
        return this.f67539l.size();
    }

    /* renamed from: g */
    public void mo66502g() {
        if (this.f67539l != null) {
            this.f67539l.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo58045a(List<T> list) {
        this.f67539l = list;
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public void mo66501d(List<T> list) {
        this.f67539l = list;
        notifyItemRangeInserted(0, getItemCount() - this.f67540m);
    }

    /* renamed from: c */
    public void mo62323c(List<T> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            if (this.f67539l == null) {
                this.f67539l = new ArrayList();
            }
            this.f67539l.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo61577b(List<T> list) {
        this.f67539l = list;
        if (this.f67566v) {
            notifyItemRangeInserted(this.f67540m - 1, getItemCount() - this.f67540m);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f67540m, getItemCount() - this.f67540m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo66500c(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f67540m = getItemCount();
    }

    /* renamed from: a */
    public void mo62316a(T t, int i) {
        if (this.f67539l == null) {
            this.f67539l = new ArrayList();
        }
        this.f67539l.add(i, t);
        notifyItemInserted(i);
    }
}
