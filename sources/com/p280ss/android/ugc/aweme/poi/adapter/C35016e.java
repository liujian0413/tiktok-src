package com.p280ss.android.ugc.aweme.poi.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.e */
final /* synthetic */ class C35016e implements OnClickListener {

    /* renamed from: a */
    private final CoverViewHolder f91475a;

    /* renamed from: b */
    private final int f91476b;

    C35016e(CoverViewHolder coverViewHolder, int i) {
        this.f91475a = coverViewHolder;
        this.f91476b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f91475a.mo88774a(this.f91476b, view);
    }
}
