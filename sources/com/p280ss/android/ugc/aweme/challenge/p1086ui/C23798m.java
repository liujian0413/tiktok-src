package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.m */
final /* synthetic */ class C23798m implements OnClickListener {

    /* renamed from: a */
    private final ImageView f62824a;

    C23798m(ImageView imageView) {
        this.f62824a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f62824a.performClick();
    }
}
