package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.C26382a;
import com.p280ss.android.ugc.aweme.discover.adapter.DiscoverExpandViewHolder.C26383b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.DiscoverExpandAdapter */
public final class DiscoverExpandAdapter extends C1262a<DiscoverExpandViewHolder> implements C26383b {

    /* renamed from: a */
    public int f69476a;

    /* renamed from: b */
    public int f69477b;

    /* renamed from: c */
    public List<? extends Aweme> f69478c;

    /* renamed from: d */
    public C26383b f69479d;

    /* renamed from: e */
    private RecyclerView f69480e;

    public final int getItemCount() {
        List<? extends Aweme> list = this.f69478c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo67954a(List<? extends Aweme> list) {
        this.f69478c = list;
        this.f69476a = 0;
        notifyDataSetChanged();
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f69480e = recyclerView;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public DiscoverExpandViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        return new DiscoverExpandViewHolder(C26382a.m86805a(viewGroup, i), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(DiscoverExpandViewHolder discoverExpandViewHolder, int i) {
        Aweme aweme;
        boolean z;
        C7573i.m23587b(discoverExpandViewHolder, "discoverExpandViewHolder");
        List<? extends Aweme> list = this.f69478c;
        if (list != null) {
            aweme = (Aweme) C7525m.m23504c(list, i);
        } else {
            aweme = null;
        }
        if (this.f69476a == i) {
            z = true;
        } else {
            z = false;
        }
        discoverExpandViewHolder.mo67955a(aweme, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m86798a(int i, boolean z) {
        C1293v vVar;
        C1273i iVar;
        C1293v vVar2 = null;
        if (!z) {
            RecyclerView recyclerView = this.f69480e;
            if (recyclerView != null) {
                iVar = recyclerView.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar instanceof LinearLayoutManager) {
                ((LinearLayoutManager) iVar).mo5417a(i, this.f69477b);
            }
        }
        if (this.f69476a != i) {
            if (this.f69476a < getItemCount()) {
                RecyclerView recyclerView2 = this.f69480e;
                if (recyclerView2 != null) {
                    vVar = recyclerView2.mo5575f(this.f69476a);
                } else {
                    vVar = null;
                }
                if (vVar instanceof DiscoverExpandViewHolder) {
                    ((DiscoverExpandViewHolder) vVar).mo67956a(false);
                }
            }
            this.f69476a = i;
            if (this.f69476a < getItemCount()) {
                RecyclerView recyclerView3 = this.f69480e;
                if (recyclerView3 != null) {
                    vVar2 = recyclerView3.mo5575f(this.f69476a);
                }
                if (vVar2 instanceof DiscoverExpandViewHolder) {
                    ((DiscoverExpandViewHolder) vVar2).mo67956a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67953a(View view, int i) {
        C26383b bVar = this.f69479d;
        if (bVar != null) {
            bVar.mo67953a(view, i);
        }
        if (this.f69476a != i) {
            m86798a(i, true);
        }
    }
}
