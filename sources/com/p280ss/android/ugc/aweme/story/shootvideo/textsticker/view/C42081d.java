package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.d */
final /* synthetic */ class C42081d implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f109437a;

    C42081d(TextStickerInputLayout textStickerInputLayout) {
        this.f109437a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f109437a.mo103345d(view);
    }
}
