package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ab */
final /* synthetic */ class C37875ab implements OnClickListener {

    /* renamed from: a */
    private final PrivacySettingActivity f98720a;

    C37875ab(PrivacySettingActivity privacySettingActivity) {
        this.f98720a = privacySettingActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f98720a.mo95221a(view);
    }
}
