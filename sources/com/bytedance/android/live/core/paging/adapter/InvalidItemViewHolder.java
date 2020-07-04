package com.bytedance.android.live.core.paging.adapter;

import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;

public class InvalidItemViewHolder extends BaseViewHolder<Object> {

    /* renamed from: b */
    private ViewGroup f9798b;

    public InvalidItemViewHolder(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        this.f9798b = viewGroup;
    }

    /* renamed from: a */
    public final void mo10072a(Object obj, int i) {
        this.itemView.setLayoutParams(new LayoutParams(this.f9798b.getMeasuredWidth(), 1));
    }
}
