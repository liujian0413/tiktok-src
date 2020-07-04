package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.c */
final /* synthetic */ class C39869c implements OnClickListener {

    /* renamed from: a */
    private final ImageView f103599a;

    C39869c(ImageView imageView) {
        this.f103599a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f103599a.performClick();
    }
}
