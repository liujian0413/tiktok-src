package com.p280ss.android.ugc.aweme.miniapp.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.adapter.a */
final /* synthetic */ class C33293a implements OnClickListener {

    /* renamed from: a */
    private final MostUseMicroAppViewHolder f86962a;

    /* renamed from: b */
    private final MicroAppInfo f86963b;

    C33293a(MostUseMicroAppViewHolder mostUseMicroAppViewHolder, MicroAppInfo microAppInfo) {
        this.f86962a = mostUseMicroAppViewHolder;
        this.f86963b = microAppInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f86962a.mo85410a(this.f86963b, view);
    }
}
