package com.p280ss.android.ugc.aweme.miniapp.anchor.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.adapter.a */
final /* synthetic */ class C33326a implements OnClickListener {

    /* renamed from: a */
    private final ElementAdapter f87056a;

    /* renamed from: b */
    private final int f87057b;

    C33326a(ElementAdapter elementAdapter, int i) {
        this.f87056a = elementAdapter;
        this.f87057b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f87056a.mo85447a(this.f87057b, view);
    }
}
