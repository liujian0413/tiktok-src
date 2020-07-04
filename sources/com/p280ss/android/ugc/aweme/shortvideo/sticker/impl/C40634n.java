package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.n */
final /* synthetic */ class C40634n implements OnClickListener {

    /* renamed from: a */
    private final EffectStickerViewImpl f105626a;

    C40634n(EffectStickerViewImpl effectStickerViewImpl) {
        this.f105626a = effectStickerViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105626a.mo100679a(view);
    }
}
