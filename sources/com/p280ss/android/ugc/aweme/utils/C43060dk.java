package com.p280ss.android.ugc.aweme.utils;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;

/* renamed from: com.ss.android.ugc.aweme.utils.dk */
public final class C43060dk {
    /* renamed from: a */
    public static RecyclerView m136608a(RecyclerView recyclerView, C28532n nVar) {
        recyclerView.mo5528a((C1281m) new FrescoRecycleViewScrollListener(C6399b.m19921a()));
        recyclerView.setOnFlingListener(new OnRecyclerViewFlingListener(recyclerView, nVar));
        return recyclerView;
    }
}
