package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.GameInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.d */
final /* synthetic */ class C33329d implements OnClickListener {

    /* renamed from: a */
    private final GameSearchAdapter f87062a;

    /* renamed from: b */
    private final GameInfo f87063b;

    C33329d(GameSearchAdapter gameSearchAdapter, GameInfo gameInfo) {
        this.f87062a = gameSearchAdapter;
        this.f87063b = gameInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87062a.mo85455a(this.f87063b, view);
    }
}
