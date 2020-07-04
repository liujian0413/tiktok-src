package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.b */
final /* synthetic */ class C24856b implements OnClickListener {

    /* renamed from: a */
    private final LoftActivity f65545a;

    C24856b(LoftActivity loftActivity) {
        this.f65545a = loftActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65545a.mo64888a(view);
    }
}
