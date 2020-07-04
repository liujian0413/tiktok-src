package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ae */
final /* synthetic */ class C28773ae implements OnClickListener {

    /* renamed from: a */
    private final LongPressLayout f75889a;

    C28773ae(LongPressLayout longPressLayout) {
        this.f75889a = longPressLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f75889a.mo73900a(view);
    }
}
