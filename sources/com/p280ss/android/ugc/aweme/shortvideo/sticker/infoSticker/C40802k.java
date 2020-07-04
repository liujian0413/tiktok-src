package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.k */
final /* synthetic */ class C40802k implements OnClickListener {

    /* renamed from: a */
    private final InfoStickerFragment f106117a;

    C40802k(InfoStickerFragment infoStickerFragment) {
        this.f106117a = infoStickerFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f106117a.mo100769a(view);
    }
}
