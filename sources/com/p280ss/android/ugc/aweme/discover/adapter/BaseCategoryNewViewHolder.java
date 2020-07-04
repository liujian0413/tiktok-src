package com.p280ss.android.ugc.aweme.discover.adapter;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.discover.model.Category;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.BaseCategoryNewViewHolder */
public class BaseCategoryNewViewHolder extends C1293v {

    /* renamed from: a */
    private RecyclerView f69424a;

    /* renamed from: b */
    private int f69425b;

    /* renamed from: c */
    private int f69426c = ((int) (((float) this.f69425b) * 1.4718101f));

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo67910a(int i) {
        int a = ((GridLayoutManager) this.f69424a.getLayoutManager()).f4721g.mo5387a(i, 2);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.itemView.getLayoutParams();
        marginLayoutParams.width = this.f69425b;
        marginLayoutParams.height = this.f69426c;
        marginLayoutParams.topMargin = (int) C9738o.m28708b(this.itemView.getContext(), 6.0f);
        if (a % 2 == 0) {
            marginLayoutParams.leftMargin = (int) C9738o.m28708b(this.itemView.getContext(), 16.0f);
            marginLayoutParams.rightMargin = (int) C9738o.m28708b(this.itemView.getContext(), 3.0f);
        } else {
            marginLayoutParams.leftMargin = (int) C9738o.m28708b(this.itemView.getContext(), 3.0f);
            marginLayoutParams.rightMargin = (int) C9738o.m28708b(this.itemView.getContext(), 16.0f);
        }
        this.itemView.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public void mo67911a(Category category, int i) {
        mo67910a(i);
    }

    public BaseCategoryNewViewHolder(View view, RecyclerView recyclerView) {
        super(view);
        this.f69424a = recyclerView;
        this.f69425b = (int) (((((float) C9738o.m28691a(view.getContext())) - (C9738o.m28708b(view.getContext(), 16.0f) * 2.0f)) - C9738o.m28708b(view.getContext(), 6.0f)) / 2.0f);
    }
}
