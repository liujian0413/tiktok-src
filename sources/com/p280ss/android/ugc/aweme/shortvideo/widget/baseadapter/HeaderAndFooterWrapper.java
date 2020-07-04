package com.p280ss.android.ugc.aweme.shortvideo.widget.baseadapter;

import android.support.p022v4.util.C0905l;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper */
public class HeaderAndFooterWrapper extends C1262a<C1293v> {

    /* renamed from: a */
    public C0905l<View> f108503a = new C0905l<>();

    /* renamed from: b */
    public C0905l<View> f108504b = new C0905l<>();

    /* renamed from: c */
    private C1262a f108505c;

    /* renamed from: d */
    private C1264c f108506d = new C1264c() {
        /* renamed from: a */
        public final void mo5721a() {
            HeaderAndFooterWrapper.this.notifyDataSetChanged();
        }

        /* renamed from: a */
        public final void mo5722a(int i, int i2) {
            HeaderAndFooterWrapper.this.notifyItemRangeChanged(HeaderAndFooterWrapper.this.mo102456a() + i, i2);
        }

        /* renamed from: b */
        public final void mo5725b(int i, int i2) {
            HeaderAndFooterWrapper.this.notifyItemRangeInserted(HeaderAndFooterWrapper.this.mo102456a() + i, i2);
        }

        /* renamed from: c */
        public final void mo5726c(int i, int i2) {
            HeaderAndFooterWrapper.this.notifyItemRangeRemoved(HeaderAndFooterWrapper.this.mo102456a() + i, i2);
        }

        /* renamed from: a */
        public final void mo5723a(int i, int i2, int i3) {
            HeaderAndFooterWrapper.this.notifyItemMoved(HeaderAndFooterWrapper.this.mo102456a() + i, HeaderAndFooterWrapper.this.mo102456a() + i2);
        }

        /* renamed from: a */
        public final void mo5724a(int i, int i2, Object obj) {
            HeaderAndFooterWrapper.this.notifyItemRangeChanged(HeaderAndFooterWrapper.this.mo102456a() + i, i2, obj);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.HeaderAndFooterWrapper$a */
    public interface C41689a {
        /* renamed from: a */
        int mo102458a(GridLayoutManager gridLayoutManager, C1241a aVar, int i);
    }

    /* renamed from: b */
    private int m132774b() {
        return this.f108505c.getItemCount();
    }

    /* renamed from: c */
    private int m132776c() {
        return this.f108504b.mo3435b();
    }

    /* renamed from: a */
    public final int mo102456a() {
        return this.f108503a.mo3435b();
    }

    public int getItemCount() {
        return mo102456a() + m132776c() + m132774b();
    }

    /* renamed from: a */
    private boolean m132773a(int i) {
        if (i < mo102456a()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m132775b(int i) {
        if (i >= mo102456a() + m132774b()) {
            return true;
        }
        return false;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f108505c.onAttachedToRecyclerView(recyclerView);
        m132772a(recyclerView, new C41689a() {
            /* renamed from: a */
            public final int mo102458a(GridLayoutManager gridLayoutManager, C1241a aVar, int i) {
                int itemViewType = HeaderAndFooterWrapper.this.getItemViewType(i);
                if (HeaderAndFooterWrapper.this.f108503a.mo3433a(itemViewType) != null) {
                    return gridLayoutManager.f4716b;
                }
                if (HeaderAndFooterWrapper.this.f108504b.mo3433a(itemViewType) != null) {
                    return gridLayoutManager.f4716b;
                }
                if (aVar != null) {
                    return aVar.mo5386a(i - HeaderAndFooterWrapper.this.mo102456a());
                }
                return 1;
            }
        });
    }

    public void registerAdapterDataObserver(C1264c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f108505c.registerAdapterDataObserver(this.f108506d);
    }

    public void unregisterAdapterDataObserver(C1264c cVar) {
        super.unregisterAdapterDataObserver(cVar);
        this.f108505c.unregisterAdapterDataObserver(this.f108506d);
    }

    public HeaderAndFooterWrapper(C1262a aVar) {
        this.f108505c = aVar;
    }

    /* renamed from: a */
    private static void m132771a(C1293v vVar) {
        LayoutParams layoutParams = vVar.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        this.f108505c.onViewAttachedToWindow(vVar);
        int layoutPosition = vVar.getLayoutPosition();
        if (m132773a(layoutPosition) || m132775b(layoutPosition)) {
            m132771a(vVar);
        }
    }

    public int getItemViewType(int i) {
        if (m132773a(i)) {
            return this.f108503a.mo3442d(i);
        }
        if (m132775b(i)) {
            return this.f108504b.mo3442d((i - mo102456a()) - m132774b());
        }
        return this.f108505c.getItemViewType(i - mo102456a());
    }

    /* renamed from: a */
    public final void mo102457a(View view) {
        this.f108504b.mo3437b(this.f108504b.mo3435b() + 200000, view);
        notifyItemRangeChanged(getItemCount() - m132776c(), m132776c());
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (!m132773a(i) && !m132775b(i)) {
            this.f108505c.onBindViewHolder(vVar, i - mo102456a());
        }
    }

    /* renamed from: a */
    private void m132772a(RecyclerView recyclerView, final C41689a aVar) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            final C1241a aVar2 = gridLayoutManager.f4721g;
            gridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    return aVar.mo102458a(gridLayoutManager, aVar2, i);
                }
            };
            gridLayoutManager.mo5368a(gridLayoutManager.f4716b);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f108503a.mo3433a(i) != null) {
            ViewHolder a = ViewHolder.m132788a(viewGroup.getContext(), (View) this.f108503a.mo3433a(i));
            a.setIsRecyclable(false);
            return a;
        } else if (this.f108504b.mo3433a(i) == null) {
            return this.f108505c.onCreateViewHolder(viewGroup, i);
        } else {
            ViewHolder a2 = ViewHolder.m132788a(viewGroup.getContext(), (View) this.f108504b.mo3433a(i));
            a2.setIsRecyclable(false);
            return a2;
        }
    }
}
