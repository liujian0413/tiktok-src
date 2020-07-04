package com.p280ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.t */
final /* synthetic */ class C24823t implements OnClickListener {

    /* renamed from: a */
    private final CommerceTagLayout f65380a;

    /* renamed from: b */
    private final C24815l f65381b;

    C24823t(CommerceTagLayout commerceTagLayout, C24815l lVar) {
        this.f65380a = commerceTagLayout;
        this.f65381b = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65380a.animate().alpha(0.0f).setDuration(200).withEndAction(new C24824u(this.f65380a, this.f65381b));
    }
}
