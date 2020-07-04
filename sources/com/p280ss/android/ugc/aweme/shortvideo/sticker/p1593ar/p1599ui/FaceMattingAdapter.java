package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1264c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingAdapter */
public class FaceMattingAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    private FaceMattingLoadAdapter f105183a;

    /* renamed from: b */
    private FaceMattingNormalAdapter f105184b;

    public int getItemCount() {
        return this.f105184b.getItemCount() + this.f105183a.getItemCount();
    }

    public void setHasStableIds(boolean z) {
        this.f105184b.setHasStableIds(z);
    }

    public int getItemViewType(int i) {
        if (i < this.f105184b.getItemCount()) {
            return 0;
        }
        return 1;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f105184b.onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f105184b.onDetachedFromRecyclerView(recyclerView);
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        if (vVar instanceof FaceMattingLoadingViewHolder) {
            super.onViewAttachedToWindow(vVar);
        } else {
            this.f105184b.onViewAttachedToWindow((FaceMattingNormalViewHolder) vVar);
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        if (vVar instanceof FaceMattingLoadingViewHolder) {
            super.onViewDetachedFromWindow(vVar);
        } else {
            this.f105184b.onViewDetachedFromWindow((FaceMattingNormalViewHolder) vVar);
        }
    }

    public void onViewRecycled(C1293v vVar) {
        if (vVar instanceof FaceMattingLoadingViewHolder) {
            super.onViewRecycled(vVar);
        } else {
            this.f105184b.onViewRecycled((FaceMattingNormalViewHolder) vVar);
        }
    }

    public void registerAdapterDataObserver(C1264c cVar) {
        super.registerAdapterDataObserver(cVar);
        this.f105184b.registerAdapterDataObserver(cVar);
    }

    public long getItemId(int i) {
        if (i < this.f105184b.getItemCount()) {
            return this.f105184b.getItemId(i);
        }
        return super.getItemId(i);
    }

    public boolean onFailedToRecycleView(C1293v vVar) {
        if (vVar instanceof FaceMattingLoadingViewHolder) {
            return super.onFailedToRecycleView(vVar);
        }
        return this.f105184b.onFailedToRecycleView((FaceMattingNormalViewHolder) vVar);
    }

    public FaceMattingAdapter(FaceMattingLoadAdapter faceMattingLoadAdapter, FaceMattingNormalAdapter faceMattingNormalAdapter) {
        this.f105183a = faceMattingLoadAdapter;
        this.f105184b = faceMattingNormalAdapter;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return FaceMattingLoadAdapter.m129385a(viewGroup, i);
        }
        return this.f105184b.onCreateViewHolder(viewGroup, i);
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (vVar instanceof FaceMattingNormalViewHolder) {
            this.f105184b.onBindViewHolder((FaceMattingNormalViewHolder) vVar, i);
            return;
        }
        if (vVar instanceof FaceMattingLoadingViewHolder) {
            FaceMattingLoadingViewHolder faceMattingLoadingViewHolder = (FaceMattingLoadingViewHolder) vVar;
            faceMattingLoadingViewHolder.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                }
            });
            FaceMattingLoadAdapter.m129386a(faceMattingLoadingViewHolder, i);
        }
    }
}
