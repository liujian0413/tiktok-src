package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ad */
final /* synthetic */ class C37877ad implements OnClickListener {

    /* renamed from: a */
    private final RadioSettingItem f98721a;

    C37877ad(RadioSettingItem radioSettingItem) {
        this.f98721a = radioSettingItem;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98721a.mo95228a(view);
    }
}
