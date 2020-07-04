package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.aq */
final /* synthetic */ class C32881aq implements OnClickListener {

    /* renamed from: a */
    private final MainFragment f85818a;

    C32881aq(MainFragment mainFragment) {
        this.f85818a = mainFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85818a.mo84454d(view);
    }
}
