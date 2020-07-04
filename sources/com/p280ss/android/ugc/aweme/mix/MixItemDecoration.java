package com.p280ss.android.ugc.aweme.mix;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixItemDecoration */
public final class MixItemDecoration extends C1272h {

    /* renamed from: a */
    public final int f87549a = ((int) C9738o.m28708b(this.f87553e, 16.0f));

    /* renamed from: b */
    public final int f87550b = ((int) C9738o.m28708b(this.f87553e, 20.0f));

    /* renamed from: c */
    public final int f87551c = ((int) C9738o.m28708b(this.f87553e, 8.0f));

    /* renamed from: d */
    public final int f87552d = ((int) C9738o.m28708b(this.f87553e, 4.5f));

    /* renamed from: e */
    public final Context f87553e;

    public MixItemDecoration(Context context) {
        C7573i.m23587b(context, "context");
        this.f87553e = context;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int e = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo6015e();
            LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).f5145b) {
                    C1293v b = recyclerView.mo5539b(view);
                    C7573i.m23582a((Object) b, "parent.getChildViewHolder(view)");
                    if (b.getAdapterPosition() != 0) {
                        rect.top = this.f87550b;
                        rect.bottom = this.f87549a;
                        return;
                    }
                } else {
                    rect.top = this.f87551c;
                    if (e == 0) {
                        rect.left = this.f87549a;
                        rect.right = this.f87552d;
                        return;
                    }
                    rect.left = this.f87552d;
                    rect.right = this.f87549a;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
    }
}
