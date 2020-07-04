package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.a */
final /* synthetic */ class C24843a implements OnClickListener {

    /* renamed from: a */
    private final LoftActivity f65476a;

    C24843a(LoftActivity loftActivity) {
        this.f65476a = loftActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65476a.mo64890b(view);
    }
}
