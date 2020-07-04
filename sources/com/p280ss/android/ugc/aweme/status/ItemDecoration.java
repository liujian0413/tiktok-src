package com.p280ss.android.ugc.aweme.status;

import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import com.bytedance.common.utility.C9738o;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.ItemDecoration */
public final class ItemDecoration extends C1272h {

    /* renamed from: a */
    public final int f108648a = ((int) C9738o.m28708b((Context) this.f108652e, 5.0f));

    /* renamed from: b */
    public final int f108649b = ((int) C9738o.m28708b((Context) this.f108652e, 16.0f));

    /* renamed from: c */
    public final int f108650c = ((int) C9738o.m28708b((Context) this.f108652e, 25.0f));

    /* renamed from: d */
    public StatusRecyclerViewAdapter f108651d;

    /* renamed from: e */
    public FragmentActivity f108652e;

    /* renamed from: f */
    public RecyclerView f108653f;

    public ItemDecoration(FragmentActivity fragmentActivity, RecyclerView recyclerView) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(recyclerView, "recyclerview");
        this.f108652e = fragmentActivity;
        this.f108653f = recyclerView;
        C1262a adapter = this.f108653f.getAdapter();
        if (adapter != null) {
            this.f108651d = (StatusRecyclerViewAdapter) adapter;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.status.StatusRecyclerViewAdapter");
    }

    public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(recyclerView, "parent");
        super.getItemOffsets(rect, i, recyclerView);
        int size = this.f108651d.f108691b.size();
        if (i <= 1) {
            rect.set(this.f108648a, this.f108649b, this.f108648a, this.f108648a);
            return;
        }
        if (i < size - 2) {
            rect.set(this.f108648a, this.f108648a, this.f108648a, this.f108648a);
        } else if (size % 2 == 0) {
            rect.set(this.f108648a, this.f108648a, this.f108648a, this.f108650c);
        } else if (i == size - 1) {
            rect.set(this.f108648a, this.f108648a, this.f108648a, this.f108650c);
        } else {
            rect.set(this.f108648a, this.f108648a, this.f108648a, this.f108648a);
        }
    }
}
