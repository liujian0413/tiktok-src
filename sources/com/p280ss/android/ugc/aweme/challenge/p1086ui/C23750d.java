package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.d */
final /* synthetic */ class C23750d implements OnClickListener {

    /* renamed from: a */
    private final ImageView f62649a;

    C23750d(ImageView imageView) {
        this.f62649a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62649a.performClick();
    }
}
