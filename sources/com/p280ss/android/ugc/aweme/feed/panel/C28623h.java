package com.p280ss.android.ugc.aweme.feed.panel;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.h */
final /* synthetic */ class C28623h implements OnClickListener {

    /* renamed from: a */
    private final C28598b f75434a;

    C28623h(C28598b bVar) {
        this.f75434a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f75434a.mo73398c(view);
    }
}
