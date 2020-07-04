package com.p280ss.android.ugc.aweme.commercialize.anchor.adapter;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.common.adapter.C25647a;
import com.p280ss.android.ugc.aweme.common.adapter.C25648b;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.adapter.AnchorListAdapter */
public final class AnchorListAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public List<C24536e> f64732a;

    /* renamed from: b */
    public final C0043i f64733b;

    /* renamed from: c */
    private final C25648b<List<C24536e>> f64734c = new C25648b<>();

    public final int getItemCount() {
        return this.f64732a.size();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f64734c.mo66526a(recyclerView);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f64734c.mo66530b(recyclerView);
    }

    public final int getItemViewType(int i) {
        if (i < this.f64732a.size()) {
            return this.f64734c.mo66521a(this.f64732a, i);
        }
        return super.getItemViewType(i);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        this.f64734c.mo66527a(this.f64732a, i, vVar);
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        C1293v a = this.f64734c.mo66522a(viewGroup, i);
        C7573i.m23582a((Object) a, "delegatesManager.onCreat…wHolder(parent, viewType)");
        return a;
    }

    public AnchorListAdapter(List<C24536e> list, C0043i iVar) {
        C7573i.m23587b(list, "data");
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f64732a = list;
        this.f64733b = iVar;
        this.f64734c.mo66524a((C25647a<T>) new C24529a<T>(this.f64733b));
    }
}
