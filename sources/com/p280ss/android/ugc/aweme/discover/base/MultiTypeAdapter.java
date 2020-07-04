package com.p280ss.android.ugc.aweme.discover.base;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.common.adapter.C25648b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.base.MultiTypeAdapter */
public class MultiTypeAdapter<T> extends C1262a<C1293v> {

    /* renamed from: a */
    private final C25648b<List<T>> f70133a = new C25648b<>();

    /* renamed from: h */
    public final List<T> f70134h = new ArrayList();

    public int getItemCount() {
        return this.f70134h.size();
    }

    /* renamed from: b */
    public final void mo68273b(C25647a<List<T>> aVar) {
        this.f70133a.mo66529b(aVar);
    }

    public int getItemViewType(int i) {
        return this.f70133a.mo66521a(this.f70134h, i);
    }

    public boolean onFailedToRecycleView(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        return this.f70133a.mo66531b(vVar);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        this.f70133a.mo66532c(vVar);
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        this.f70133a.mo66533d(vVar);
    }

    public void onViewRecycled(C1293v vVar) {
        C7573i.m23587b(vVar, "holder");
        this.f70133a.mo66525a(vVar);
    }

    /* renamed from: a */
    public final MultiTypeAdapter<?> mo68272a(C25647a<List<T>> aVar) {
        C7573i.m23587b(aVar, "delegate");
        this.f70133a.mo66524a(aVar);
        return this;
    }

    /* renamed from: a */
    public final MultiTypeAdapter<?> mo68271a(int i, C25647a<List<T>> aVar) {
        C7573i.m23587b(aVar, "delegate");
        this.f70133a.mo66523a(i, false, aVar);
        return this;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        this.f70133a.mo66527a(this.f70134h, i, vVar);
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        C1293v a = this.f70133a.mo66522a(viewGroup, i);
        C7573i.m23582a((Object) a, "mDelegateManager.onCreat…wHolder(parent, viewType)");
        return a;
    }

    public void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        this.f70133a.mo66528a(this.f70134h, i, vVar, list);
    }
}
