package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter */
public final class LoadMoreAdapter<VH extends C1293v> extends C1262a<C1293v> {

    /* renamed from: a */
    public int f69540a = 1;

    /* renamed from: b */
    public final C1262a<VH> f69541b;

    /* renamed from: c */
    final C26500q f69542c;

    /* renamed from: d */
    final C26402e f69543d;

    /* renamed from: e */
    RecyclerView f69544e;

    /* renamed from: f */
    C26401d f69545f;

    /* renamed from: g */
    C1281m f69546g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter$a */
    static class C26398a extends C1281m {

        /* renamed from: a */
        C26402e f69547a;

        C26398a(C26402e eVar) {
            this.f69547a = eVar;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            recyclerView.canScrollVertically(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter$b */
    static class C26399b implements C26500q {
        private C26399b() {
        }

        /* renamed from: a */
        public final LoadMoreViewHolder mo67987a(ViewGroup viewGroup) {
            return new C26400c(new LoadMoreLoadingLayout(viewGroup.getContext()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter$c */
    static class C26400c extends LoadMoreViewHolder {

        /* renamed from: a */
        LoadMoreLoadingLayout f69548a;

        C26400c(View view) {
            super(view);
            this.f69548a = (LoadMoreLoadingLayout) view;
        }

        /* renamed from: a */
        public final void mo67988a(int i) {
            this.f69548a.setState(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter$d */
    static class C26401d extends C1241a {

        /* renamed from: c */
        RecyclerView f69549c;

        /* renamed from: d */
        GridLayoutManager f69550d;

        /* renamed from: e */
        C1241a f69551e;

        C26401d() {
        }

        /* renamed from: a */
        public final int mo5386a(int i) {
            if (i < this.f69549c.getAdapter().getItemCount() - 1) {
                return this.f69551e.mo5386a(i);
            }
            return this.f69550d.f4716b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo67989a(RecyclerView recyclerView) {
            this.f69549c = recyclerView;
            this.f69550d = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f69551e = this.f69550d.f4721g;
            this.f69550d.f4721g = this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter$e */
    public interface C26402e {
    }

    public final int getItemCount() {
        return this.f69541b.getItemCount() + 1;
    }

    /* renamed from: a */
    public static <VH extends C1293v> LoadMoreAdapter<VH> m86888a(C1262a<VH> aVar) {
        return m86889a(aVar, (C26500q) null);
    }

    public final void setHasStableIds(boolean z) {
        this.f69541b.setHasStableIds(z);
    }

    public final boolean onFailedToRecycleView(C1293v vVar) {
        if (vVar instanceof LoadMoreViewHolder) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f69541b.onFailedToRecycleView(vVar);
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        if (vVar instanceof LoadMoreViewHolder) {
            super.onViewAttachedToWindow(vVar);
        } else {
            this.f69541b.onViewAttachedToWindow(vVar);
        }
    }

    public final void onViewDetachedFromWindow(C1293v vVar) {
        if (vVar instanceof LoadMoreViewHolder) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f69541b.onViewDetachedFromWindow(vVar);
        }
    }

    public final void onViewRecycled(C1293v vVar) {
        if (vVar instanceof LoadMoreViewHolder) {
            super.onViewRecycled(vVar);
        } else {
            this.f69541b.onViewRecycled(vVar);
        }
    }

    public final void registerAdapterDataObserver(C1264c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f69541b.registerAdapterDataObserver(cVar);
    }

    public final void unregisterAdapterDataObserver(C1264c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f69541b.unregisterAdapterDataObserver(cVar);
    }

    public final long getItemId(int i) {
        if (i < this.f69541b.getItemCount()) {
            return this.f69541b.getItemId(i);
        }
        return super.getItemId(i);
    }

    public final int getItemViewType(int i) {
        if (i < this.f69541b.getItemCount()) {
            return this.f69541b.getItemViewType(i);
        }
        return 65298;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f69541b.onDetachedFromRecyclerView(recyclerView);
        if (this.f69545f != null) {
            this.f69545f = null;
        }
        if (this.f69546g != null) {
            this.f69544e.mo5545b(this.f69546g);
        }
        this.f69544e = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f69544e = recyclerView;
        if (this.f69545f == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f69545f = new C26401d();
            this.f69545f.mo67989a(recyclerView);
        }
        if (this.f69546g == null && this.f69543d != null) {
            this.f69546g = new C26398a(this.f69543d);
        }
        if (this.f69546g != null) {
            this.f69544e.mo5528a(this.f69546g);
        }
        this.f69541b.onAttachedToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public final void mo67986a(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f69540a;
            if (i2 != i) {
                this.f69540a = i;
                m86891a(i2, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    /* renamed from: a */
    private static <VH extends C1293v> LoadMoreAdapter<VH> m86889a(C1262a<VH> aVar, C26500q qVar) {
        return m86890a(aVar, null, null);
    }

    /* renamed from: a */
    private void m86891a(int i, int i2) {
        notifyItemChanged(getItemCount() - 1);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        if (i < this.f69541b.getItemCount()) {
            this.f69541b.onBindViewHolder(vVar, i);
        } else {
            ((LoadMoreViewHolder) vVar).mo67988a(this.f69540a);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 65298) {
            return this.f69542c.mo67987a(viewGroup);
        }
        return this.f69541b.onCreateViewHolder(viewGroup, i);
    }

    private LoadMoreAdapter(C1262a<VH> aVar, C26500q qVar, C26402e eVar) {
        this.f69541b = aVar;
        this.f69542c = qVar;
        this.f69543d = eVar;
    }

    /* renamed from: a */
    private static <VH extends C1293v> LoadMoreAdapter<VH> m86890a(C1262a<VH> aVar, C26500q qVar, C26402e eVar) {
        if (aVar == null) {
            throw new NullPointerException();
        } else if (!(aVar instanceof LoadMoreAdapter)) {
            if (qVar == null) {
                qVar = new C26399b();
            }
            return new LoadMoreAdapter<>(aVar, qVar, null);
        } else {
            throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        if (i < this.f69541b.getItemCount()) {
            this.f69541b.onBindViewHolder(vVar, i, list);
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }
}
