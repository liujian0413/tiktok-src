package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.f */
final /* synthetic */ class C33331f implements OnClickListener {

    /* renamed from: a */
    private final MicroAppElementsAdapter f87065a;

    /* renamed from: b */
    private final MicroAppInfo f87066b;

    C33331f(MicroAppElementsAdapter microAppElementsAdapter, MicroAppInfo microAppInfo) {
        this.f87065a = microAppElementsAdapter;
        this.f87066b = microAppInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87065a.mo85469a(this.f87066b, view);
    }
}
