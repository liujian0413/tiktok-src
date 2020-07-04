package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.ax */
final /* synthetic */ class C32888ax implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f85827a;

    C32888ax(MainFragment mainFragment) {
        this.f85827a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85827a.mo84449b(view);
    }
}
