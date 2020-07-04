package com.p280ss.android.ugc.aweme.profile.util;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.util.l */
final /* synthetic */ class C36741l implements OnClickListener {

    /* renamed from: a */
    private final ImageView f96424a;

    C36741l(ImageView imageView) {
        this.f96424a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f96424a.performClick();
    }
}
