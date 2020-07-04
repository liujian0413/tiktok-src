package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceSticker;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.g */
final /* synthetic */ class C41885g implements OnClickListener {

    /* renamed from: a */
    private final CommerceSticker f108963a;

    C41885g(CommerceSticker commerceSticker) {
        this.f108963a = commerceSticker;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        StickerPropDetailFragment.m133153a(this.f108963a, view);
    }
}
