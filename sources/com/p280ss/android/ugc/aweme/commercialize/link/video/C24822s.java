package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.s */
final /* synthetic */ class C24822s implements OnClickListener {

    /* renamed from: a */
    private final WeakLinkContent f65379a;

    C24822s(WeakLinkContent weakLinkContent) {
        this.f65379a = weakLinkContent;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65379a.mo64867a(view);
    }
}
