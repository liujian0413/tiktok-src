package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.f */
final /* synthetic */ class C24809f implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65353a;

    /* renamed from: b */
    private final C24815l f65354b;

    C24809f(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65353a = commerceTagLayout;
        this.f65354b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65353a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24810g(this.f65353a, this.f65354b));
    }
}
