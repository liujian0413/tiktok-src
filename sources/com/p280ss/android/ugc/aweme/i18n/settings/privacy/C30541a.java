package com.p280ss.android.ugc.aweme.i18n.settings.privacy;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.privacy.a */
final /* synthetic */ class C30541a implements OnClickListener {

    /* renamed from: a */
    private final MusPrivacyActivity f80242a;

    C30541a(MusPrivacyActivity musPrivacyActivity) {
        this.f80242a = musPrivacyActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f80242a.mo80277b(view);
    }
}
