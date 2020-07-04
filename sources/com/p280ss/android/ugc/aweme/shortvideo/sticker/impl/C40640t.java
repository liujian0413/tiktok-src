package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.t */
final /* synthetic */ class C40640t implements OnClickListener {

    /* renamed from: a */
    private final StoryStickerViewPagerAdapter f105632a;

    /* renamed from: b */
    private final int f105633b;

    C40640t(StoryStickerViewPagerAdapter storyStickerViewPagerAdapter, int i) {
        this.f105632a = storyStickerViewPagerAdapter;
        this.f105633b = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f105632a.mo100746a(this.f105633b, view);
    }
}
