package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.al */
final /* synthetic */ class C32876al implements OnClickListener {

    /* renamed from: a */
    private final MainActivity f85814a;

    C32876al(MainActivity mainActivity) {
        this.f85814a = mainActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85814a.lambda$showGradientPunishWarningDialog$3$MainActivity(view);
    }
}
