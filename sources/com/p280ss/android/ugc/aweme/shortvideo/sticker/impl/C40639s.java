package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.ScrollerEffectStickerViewImpl;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.s */
public final class C40639s {

    /* renamed from: a */
    public static final C40639s f105631a = new C40639s();

    private C40639s() {
    }

    /* renamed from: a */
    public static EffectStickerViewImpl m129925a(String str, FrameLayout frameLayout) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(frameLayout, "rootView");
        if (C40881d.m130626a(str)) {
            return new ScrollerEffectStickerViewImpl(frameLayout);
        }
        return new DefaultEffectStickerViewImpl(frameLayout);
    }
}
