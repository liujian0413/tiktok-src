package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.a */
final /* synthetic */ class C40621a implements OnClickListener {

    /* renamed from: a */
    private final CategoryStickerFragment f105610a;

    C40621a(CategoryStickerFragment categoryStickerFragment) {
        this.f105610a = categoryStickerFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105610a.mo100654a(view);
    }
}
