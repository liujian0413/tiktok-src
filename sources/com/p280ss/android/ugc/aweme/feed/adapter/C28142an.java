package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.C23685d;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.an */
final /* synthetic */ class C28142an implements OnClickListener {

    /* renamed from: a */
    private final RecommendCellCViewHolder f74221a;

    /* renamed from: b */
    private final View f74222b;

    /* renamed from: c */
    private final C23685d f74223c;

    C28142an(RecommendCellCViewHolder recommendCellCViewHolder, View view, C23685d dVar) {
        this.f74221a = recommendCellCViewHolder;
        this.f74222b = view;
        this.f74223c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74221a.mo71608a(this.f74222b, this.f74223c, view);
    }
}
