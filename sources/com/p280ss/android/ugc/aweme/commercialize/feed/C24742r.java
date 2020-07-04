package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.r */
final /* synthetic */ class C24742r implements OnClickListener {

    /* renamed from: a */
    private final CommerceVideoDelegate f65190a;

    /* renamed from: b */
    private final int f65191b;

    C24742r(CommerceVideoDelegate commerceVideoDelegate, int i) {
        this.f65190a = commerceVideoDelegate;
        this.f65191b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65190a.mo64551a(this.f65191b, view);
    }
}
