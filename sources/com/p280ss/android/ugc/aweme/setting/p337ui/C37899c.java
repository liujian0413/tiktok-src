package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.c */
final /* synthetic */ class C37899c implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f98743a;

    C37899c(AdSettingsActivity adSettingsActivity) {
        this.f98743a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98743a.mo95100b(view);
    }
}
