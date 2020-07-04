package com.p280ss.android.ugc.aweme.feed.listener;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;

/* renamed from: com.ss.android.ugc.aweme.feed.listener.OnGradualScrollListener */
public class OnGradualScrollListener extends C1281m {

    /* renamed from: a */
    private int f75137a;

    /* renamed from: b */
    private int f75138b;

    public OnGradualScrollListener() {
        Context a = C6399b.m19921a();
        this.f75137a = C9738o.m28717e(a) + ((int) C9738o.m28708b(a, 80.0f));
        this.f75138b = C9738o.m28717e(a) + ((int) C9738o.m28708b(a, 141.0f));
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                C1293v b = recyclerView.mo5539b(childAt);
                if (b != null && b.mItemViewType == 0) {
                    ((AbsCellViewHolder) b).mo67064a((((float) childAt.getBottom()) - ((float) this.f75137a)) / ((float) (this.f75138b - this.f75137a)));
                }
            }
        }
    }
}
