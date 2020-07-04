package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.FloatingCardInfo;

/* renamed from: com.ss.android.ugc.aweme.feed.c.d */
final /* synthetic */ class C28243d implements OnClickListener {

    /* renamed from: a */
    private final C28242c f74407a;

    /* renamed from: b */
    private final FloatingCardInfo f74408b;

    C28243d(C28242c cVar, FloatingCardInfo floatingCardInfo) {
        this.f74407a = cVar;
        this.f74408b = floatingCardInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74407a.mo71866b(this.f74408b, view);
    }
}
