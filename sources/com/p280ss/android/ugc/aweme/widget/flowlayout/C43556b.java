package com.p280ss.android.ugc.aweme.widget.flowlayout;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.b */
final /* synthetic */ class C43556b implements OnClickListener {

    /* renamed from: a */
    private final TagFlowLayout f112782a;

    /* renamed from: b */
    private final C43557c f112783b;

    /* renamed from: c */
    private final int f112784c;

    C43556b(TagFlowLayout tagFlowLayout, C43557c cVar, int i) {
        this.f112782a = tagFlowLayout;
        this.f112783b = cVar;
        this.f112784c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f112782a.mo105469a(this.f112783b, this.f112784c, view);
    }
}
