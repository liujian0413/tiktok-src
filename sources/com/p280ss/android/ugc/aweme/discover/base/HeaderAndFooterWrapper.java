package com.p280ss.android.ugc.aweme.discover.base;

import android.support.p022v4.util.C0905l;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper */
public class HeaderAndFooterWrapper extends C1262a<C1293v> {

    /* renamed from: a */
    public RecyclerView f70111a;

    /* renamed from: b */
    public C1262a<C1293v> f70112b;

    /* renamed from: c */
    private final ArrayList<C26605i> f70113c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C26605i> f70114d = new ArrayList<>();

    /* renamed from: e */
    private final C0905l<C26605i> f70115e = new C0905l<>();

    /* renamed from: f */
    private final C0905l<C26605i> f70116f = new C0905l<>();

    /* renamed from: g */
    private final C26606j f70117g = new C26606j();

    /* renamed from: h */
    private final HeaderAndFooterWrapper$mInnerObserver$1 f70118h = new HeaderAndFooterWrapper$mInnerObserver$1(this);

    /* renamed from: c */
    private int mo68264c() {
        return this.f70112b.getItemCount();
    }

    /* renamed from: d */
    private final int mo68265d() {
        return this.f70114d.size();
    }

    /* renamed from: a */
    public final int mo68256a() {
        return this.f70113c.size();
    }

    public int getItemCount() {
        return mo68256a() + mo68265d() + mo68264c();
    }

    /* renamed from: b */
    public final List<View> mo68260b() {
        Iterable<C26605i> iterable = this.f70113c;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C26605i iVar : iterable) {
            arrayList.add(iVar.itemView);
        }
        return (List) arrayList;
    }

    /* renamed from: b */
    private final boolean mo68263b(int i) {
        if (i < mo68256a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m87335c(int i) {
        if (i >= mo68256a() + mo68264c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo68258a(View view) {
        mo68257a(this.f70113c.size(), view);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f70111a = null;
        this.f70112b.onDetachedFromRecyclerView(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo68259a(int i) {
        return C26606j.m87385a(i);
    }

    /* renamed from: b */
    public final void mo68261b(View view) {
        m87332b(this.f70114d.size(), view);
    }

    public boolean onFailedToRecycleView(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (mo68259a(vVar.mItemViewType)) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f70112b.onFailedToRecycleView(vVar);
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (mo68259a(vVar.mItemViewType)) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f70112b.onViewDetachedFromWindow(vVar);
        }
    }

    public void onViewRecycled(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (mo68259a(vVar.mItemViewType)) {
            super.onViewRecycled(vVar);
        } else {
            this.f70112b.onViewRecycled(vVar);
        }
    }

    public void registerAdapterDataObserver(C1264c cVar) {
        C7573i.m23587b(cVar, "observer");
        super.registerAdapterDataObserver(cVar);
        this.f70112b.registerAdapterDataObserver(this.f70118h);
    }

    public void unregisterAdapterDataObserver(C1264c cVar) {
        C7573i.m23587b(cVar, "observer");
        super.unregisterAdapterDataObserver(cVar);
        this.f70112b.unregisterAdapterDataObserver(this.f70118h);
    }

    public HeaderAndFooterWrapper(C1262a<C1293v> aVar) {
        C7573i.m23587b(aVar, "innerAdapter");
        this.f70112b = aVar;
        setHasStableIds(this.f70112b.mHasStableIds);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f70111a = recyclerView;
        this.f70112b.onAttachedToRecyclerView(recyclerView);
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new HeaderAndFooterWrapper$onAttachedToRecyclerView$1(this, gridLayoutManager, gridLayoutManager.f4721g);
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        if (mo68259a(vVar.mItemViewType)) {
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
            }
        } else {
            this.f70112b.onViewAttachedToWindow(vVar);
        }
    }

    public int getItemViewType(int i) {
        if (mo68263b(i)) {
            return ((C26605i) this.f70113c.get(i)).f70163a;
        }
        if (m87335c(i)) {
            return ((C26605i) this.f70114d.get((i - mo68256a()) - mo68264c())).f70163a;
        }
        int itemViewType = this.f70112b.getItemViewType(i - mo68256a());
        if (!mo68259a(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (!mo68263b(i) && !m87335c(i)) {
            this.f70112b.onBindViewHolder(vVar, i - mo68256a());
        }
    }

    /* renamed from: b */
    private void m87332b(int i, View view) {
        if (i >= 0 && i <= this.f70114d.size() && view != null) {
            int a = this.f70117g.mo68290a();
            C26605i iVar = new C26605i(a, view);
            this.f70114d.add(iVar);
            this.f70116f.mo3437b(a, iVar);
            notifyItemInserted((getItemCount() - mo68265d()) + i);
        }
    }

    /* renamed from: a */
    public final void mo68257a(int i, View view) {
        if (i >= 0 && i <= this.f70113c.size() && view != null) {
            int a = this.f70117g.mo68290a();
            C26605i iVar = new C26605i(a, view);
            this.f70113c.add(iVar);
            this.f70115e.mo3437b(a, iVar);
            notifyItemInserted(i);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        C26605i iVar = (C26605i) this.f70115e.mo3433a(i);
        if (iVar == null) {
            iVar = (C26605i) this.f70116f.mo3433a(i);
        }
        if (iVar != null) {
            return iVar;
        }
        C1293v onCreateViewHolder = this.f70112b.onCreateViewHolder(viewGroup, i);
        C7573i.m23582a((Object) onCreateViewHolder, "innerAdapter.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        if (!mo68263b(i) && !m87335c(i)) {
            this.f70112b.onBindViewHolder(vVar, i - mo68256a(), list);
        }
    }
}
