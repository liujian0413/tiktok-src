package com.p280ss.android.ugc.aweme.imported;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.imported.a */
final /* synthetic */ class C32065a implements OnClickListener {

    /* renamed from: a */
    private final AVHashTagListAdapter f83866a;

    /* renamed from: b */
    private final int f83867b;

    C32065a(AVHashTagListAdapter aVHashTagListAdapter, int i) {
        this.f83866a = aVHashTagListAdapter;
        this.f83867b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f83866a.mo83028a(this.f83867b, view);
    }
}
