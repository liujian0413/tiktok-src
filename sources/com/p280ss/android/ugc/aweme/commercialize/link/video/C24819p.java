package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.p */
final /* synthetic */ class C24819p implements OnClickListener {

    /* renamed from: a */
    private final StrongLinkContent f65374a;

    C24819p(StrongLinkContent strongLinkContent) {
        this.f65374a = strongLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65374a.mo64866a(view);
    }
}
