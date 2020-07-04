package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.c */
final /* synthetic */ class C41881c implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f108958a;

    C41881c(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f108958a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108958a.mo102910c(view);
    }
}
