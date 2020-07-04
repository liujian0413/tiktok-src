package com.p280ss.android.ugc.aweme.mix;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixListAdapter */
public final class MixListAdapter extends JediBaseSingleTypeAdapter<Aweme> {

    /* renamed from: c */
    public long f87554c;

    /* renamed from: d */
    public long f87555d;

    /* renamed from: e */
    public boolean f87556e;

    /* renamed from: f */
    public final C0043i f87557f;

    /* renamed from: g */
    public final C23685d f87558g;

    /* renamed from: h */
    public final C33537c f87559h;

    /* renamed from: i */
    public final C11569b f87560i;

    /* renamed from: e */
    public final int mo60563e() {
        if (!this.f87556e) {
            return 0;
        }
        return super.mo60563e();
    }

    /* renamed from: a */
    public final void mo85864a(boolean z) {
        this.f61299a.mo29317a(z);
    }

    /* renamed from: b */
    public final void mo85865b(boolean z) {
        this.f61299a.mo29317a(!z);
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, Aweme> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return MixCellStyleExperiment.INSTANCE.createViewHolder(viewGroup, this.f87558g);
    }

    /* renamed from: b_ */
    public final void mo60562b_(View view) {
        boolean z;
        super.mo60562b_(view);
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        this.f87556e = z;
        notifyItemRemoved(0);
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        boolean z;
        C7573i.m23587b(vVar, "holder");
        super.onViewAttachedToWindow(vVar);
        View view = vVar.itemView;
        C7573i.m23582a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (getItemViewType(vVar.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            layoutParams2.f5145b = z;
            layoutParams.height = -2;
        }
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && getItemViewType(vVar.getLayoutPosition()) == Integer.MAX_VALUE) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        super.onBindViewHolder(vVar, i, list);
        if (vVar instanceof CommonLogicViewHolder) {
            ((CommonLogicViewHolder) vVar).mo85802a((Aweme) mo60556b(i, true), this.f87554c);
        }
        if (vVar instanceof MixDoubleRowListViewHolder) {
            ((MixDoubleRowListViewHolder) vVar).mo85863b((Aweme) mo60556b(i, true), this.f87555d);
        }
    }

    private MixListAdapter(C0043i iVar, C23685d dVar, C33537c cVar, C11569b bVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(dVar, "onItemClickListener");
        C7573i.m23587b(cVar, "listener");
        super(iVar, (C1147c<T>) new AwemeDiff<T>(), bVar);
        this.f87557f = iVar;
        this.f87558g = dVar;
        this.f87559h = cVar;
        this.f87560i = bVar;
    }

    public /* synthetic */ MixListAdapter(C0043i iVar, C23685d dVar, C33537c cVar, C11569b bVar, int i, C7571f fVar) {
        this(iVar, dVar, cVar, null);
    }
}
