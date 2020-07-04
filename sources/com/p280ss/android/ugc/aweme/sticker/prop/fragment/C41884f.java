package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.sticker.model.CommerceSticker;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.f */
final /* synthetic */ class C41884f implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f108961a;

    /* renamed from: b */
    private final CommerceSticker f108962b;

    C41884f(StickerPropDetailFragment stickerPropDetailFragment, CommerceSticker commerceSticker) {
        this.f108961a = stickerPropDetailFragment;
        this.f108962b = commerceSticker;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108961a.mo102908b(this.f108962b, view);
    }
}
