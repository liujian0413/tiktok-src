package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.challenge.C23685d;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ak */
final /* synthetic */ class C28139ak implements OnClickListener {

    /* renamed from: a */
    private final PoiDetailViewHolder f74211a;

    /* renamed from: b */
    private final View f74212b;

    /* renamed from: c */
    private final C23685d f74213c;

    C28139ak(PoiDetailViewHolder poiDetailViewHolder, View view, C23685d dVar) {
        this.f74211a = poiDetailViewHolder;
        this.f74212b = view;
        this.f74213c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74211a.mo71602a(this.f74212b, this.f74213c, view);
    }
}
