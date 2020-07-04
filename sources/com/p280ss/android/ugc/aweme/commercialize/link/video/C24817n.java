package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.n */
final /* synthetic */ class C24817n implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65370a;

    /* renamed from: b */
    private final C24815l f65371b;

    C24817n(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65370a = commerceTagLayout;
        this.f65371b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65370a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24818o(this.f65370a, this.f65371b));
    }
}
