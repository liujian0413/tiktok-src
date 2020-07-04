package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.e */
final /* synthetic */ class C24808e implements OnClickListener {

    /* renamed from: a */
    private final I18nStrongLinkContent f65352a;

    C24808e(I18nStrongLinkContent i18nStrongLinkContent) {
        this.f65352a = i18nStrongLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65352a.mo64856a(view);
    }
}
