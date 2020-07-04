package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.c */
final /* synthetic */ class C33328c implements OnClickListener {

    /* renamed from: a */
    private final GameElementsAdapter f87060a;

    /* renamed from: b */
    private final GameInfo f87061b;

    C33328c(GameElementsAdapter gameElementsAdapter, GameInfo gameInfo) {
        this.f87060a = gameElementsAdapter;
        this.f87061b = gameInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87060a.mo85452a(this.f87061b, view);
    }
}
