package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.i */
final /* synthetic */ class C24812i implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65358a;

    /* renamed from: b */
    private final C24815l f65359b;

    C24812i(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65358a = commerceTagLayout;
        this.f65359b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65358a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24813j(this.f65358a, this.f65359b));
    }
}
