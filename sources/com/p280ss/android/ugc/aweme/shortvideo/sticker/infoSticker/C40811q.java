package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.q */
final /* synthetic */ class C40811q implements OnClickListener {

    /* renamed from: a */
    private final InfoStickerPagerAdapter f106134a;

    /* renamed from: b */
    private final int f106135b;

    C40811q(InfoStickerPagerAdapter infoStickerPagerAdapter, int i) {
        this.f106134a = infoStickerPagerAdapter;
        this.f106135b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f106134a.mo100779a(this.f106135b, view);
    }
}
