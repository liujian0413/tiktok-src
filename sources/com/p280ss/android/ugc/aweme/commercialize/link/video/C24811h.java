package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.h */
final /* synthetic */ class C24811h implements OnClickListener {

    /* renamed from: a */
    private final I18nWeakLinkContent f65357a;

    C24811h(I18nWeakLinkContent i18nWeakLinkContent) {
        this.f65357a = i18nWeakLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65357a.mo64861a(view);
    }
}
