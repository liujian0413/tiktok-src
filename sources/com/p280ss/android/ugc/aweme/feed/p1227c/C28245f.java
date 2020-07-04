package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.FloatingCardInfo;

/* renamed from: com.ss.android.ugc.aweme.feed.c.f */
final /* synthetic */ class C28245f implements OnClickListener {

    /* renamed from: a */
    private final C28242c f74410a;

    /* renamed from: b */
    private final FloatingCardInfo f74411b;

    C28245f(C28242c cVar, FloatingCardInfo floatingCardInfo) {
        this.f74410a = cVar;
        this.f74411b = floatingCardInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74410a.mo71863a(this.f74411b, view);
    }
}
