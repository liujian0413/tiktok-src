package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.e */
final /* synthetic */ class C37915e implements OnClickListener {

    /* renamed from: a */
    private final BlackListActivity f98770a;

    C37915e(BlackListActivity blackListActivity) {
        this.f98770a = blackListActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98770a.mo95118a(view);
    }
}
