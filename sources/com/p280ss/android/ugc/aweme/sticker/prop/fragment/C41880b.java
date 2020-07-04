package com.p280ss.android.ugc.aweme.sticker.prop.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.fragment.b */
final /* synthetic */ class C41880b implements OnClickListener {

    /* renamed from: a */
    private final StickerPropDetailFragment f108957a;

    C41880b(StickerPropDetailFragment stickerPropDetailFragment) {
        this.f108957a = stickerPropDetailFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f108957a.mo102912d(view);
    }
}
