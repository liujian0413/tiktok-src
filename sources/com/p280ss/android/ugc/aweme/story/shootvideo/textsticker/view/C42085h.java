package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.h */
final /* synthetic */ class C42085h implements OnClickListener {

    /* renamed from: a */
    private final TextStickerInputLayout f109441a;

    C42085h(TextStickerInputLayout textStickerInputLayout) {
        this.f109441a = textStickerInputLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f109441a.mo103339b(view);
    }
}
