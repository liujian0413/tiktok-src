package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.c */
final /* synthetic */ class C24806c implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65348a;

    /* renamed from: b */
    private final C24815l f65349b;

    C24806c(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65348a = commerceTagLayout;
        this.f65349b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65348a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24807d(this.f65348a, this.f65349b));
    }
}
