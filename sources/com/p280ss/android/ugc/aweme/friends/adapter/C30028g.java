package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.g */
final /* synthetic */ class C30028g implements OnClickListener {

    /* renamed from: a */
    private final RecommendAwemeViewHolder f78996a;

    /* renamed from: b */
    private final int f78997b;

    C30028g(RecommendAwemeViewHolder recommendAwemeViewHolder, int i) {
        this.f78996a = recommendAwemeViewHolder;
        this.f78997b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78996a.mo76226a(this.f78997b, view);
    }
}
