package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.ar */
final /* synthetic */ class C32882ar implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f85819a;

    C32882ar(MainFragment mainFragment) {
        this.f85819a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85819a.mo84440a(view);
    }
}
