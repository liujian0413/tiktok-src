package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.e */
final /* synthetic */ class C33330e implements OnClickListener {

    /* renamed from: a */
    private final MicroAppElementsAdapter f87064a;

    C33330e(MicroAppElementsAdapter microAppElementsAdapter) {
        this.f87064a = microAppElementsAdapter;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87064a.mo85468a(view);
    }
}
