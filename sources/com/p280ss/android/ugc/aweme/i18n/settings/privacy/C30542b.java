package com.p280ss.android.ugc.aweme.i18n.settings.privacy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.privacy.b */
final /* synthetic */ class C30542b implements OnClickListener {

    /* renamed from: a */
    private final MusPrivacyActivity f80243a;

    C30542b(MusPrivacyActivity musPrivacyActivity) {
        this.f80243a = musPrivacyActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f80243a.mo80276a(view);
    }
}
