package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.m */
final /* synthetic */ class C40633m implements OnClickListener {

    /* renamed from: a */
    private final EffectStickerViewImpl f105625a;

    C40633m(EffectStickerViewImpl effectStickerViewImpl) {
        this.f105625a = effectStickerViewImpl;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105625a.mo100694b(view);
    }
}
