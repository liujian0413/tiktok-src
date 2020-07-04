package com.p280ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.effect.at */
final /* synthetic */ class C27392at implements OnClickListener {

    /* renamed from: a */
    private final C27354b f72277a;

    C27392at(C27354b bVar) {
        this.f72277a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f72277a.mo70446a(view);
    }
}
