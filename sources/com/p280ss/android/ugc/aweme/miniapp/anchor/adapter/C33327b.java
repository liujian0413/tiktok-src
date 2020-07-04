package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.b */
final /* synthetic */ class C33327b implements OnClickListener {

    /* renamed from: a */
    private final GameElementsAdapter f87058a;

    /* renamed from: b */
    private final GameInfo f87059b;

    C33327b(GameElementsAdapter gameElementsAdapter, GameInfo gameInfo) {
        this.f87058a = gameElementsAdapter;
        this.f87059b = gameInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87058a.mo85453b(this.f87059b, view);
    }
}
