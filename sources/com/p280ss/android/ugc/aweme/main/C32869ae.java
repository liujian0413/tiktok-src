package com.p280ss.android.ugc.aweme.main;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.main.ae */
final /* synthetic */ class C32869ae implements OnClickListener {

    /* renamed from: a */
    private final MainActivity f85807a;

    C32869ae(MainActivity mainActivity) {
        this.f85807a = mainActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f85807a.lambda$onAwesomeSplashEvent$16$MainActivity(view);
    }
}
