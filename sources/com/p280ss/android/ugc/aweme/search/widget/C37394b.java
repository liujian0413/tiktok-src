package com.p280ss.android.ugc.aweme.search.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.search.widget.b */
final /* synthetic */ class C37394b implements OnClickListener {

    /* renamed from: a */
    private final C37390b f97648a;

    /* renamed from: b */
    private final C37393a f97649b;

    /* renamed from: c */
    private final int f97650c;

    C37394b(C37390b bVar, C37393a aVar, int i) {
        this.f97648a = bVar;
        this.f97649b = aVar;
        this.f97650c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f97648a.mo94136a(this.f97649b, this.f97650c, view);
    }
}
