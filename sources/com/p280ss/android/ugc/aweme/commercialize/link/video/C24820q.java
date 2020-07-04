package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.q */
final /* synthetic */ class C24820q implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65375a;

    /* renamed from: b */
    private final C24815l f65376b;

    C24820q(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65375a = commerceTagLayout;
        this.f65376b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65375a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24821r(this.f65375a, this.f65376b));
    }
}
