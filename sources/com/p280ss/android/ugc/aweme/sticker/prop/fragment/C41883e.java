package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.e */
final /* synthetic */ class C41883e implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f108960a;

    C41883e(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f108960a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108960a.mo86485b(view);
    }
}
