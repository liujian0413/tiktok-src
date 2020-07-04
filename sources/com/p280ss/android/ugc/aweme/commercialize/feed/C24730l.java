package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.l */
final /* synthetic */ class C24730l implements OnClickListener {

    /* renamed from: a */
    private final CommerceVideoDelegate f65168a;

    C24730l(CommerceVideoDelegate commerceVideoDelegate) {
        this.f65168a = commerceVideoDelegate;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65168a.mo64557a(view);
    }
}
