package com.p280ss.android.ugc.aweme.common.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.LoadMoreViewHolder;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.e */
final /* synthetic */ class C25651e implements OnClickListener {

    /* renamed from: a */
    private final LoadMoreViewHolder f67570a;

    C25651e(LoadMoreViewHolder loadMoreViewHolder) {
        this.f67570a = loadMoreViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f67570a.mo66511a(view);
    }
}
