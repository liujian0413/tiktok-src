package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40949u.C40951b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.h */
final /* synthetic */ class C40583h implements C0053p {

    /* renamed from: a */
    private final EffectStickerManager f105443a;

    /* renamed from: b */
    private final C40951b f105444b;

    /* renamed from: c */
    private final StickerWrapper f105445c;

    C40583h(EffectStickerManager effectStickerManager, C40951b bVar, StickerWrapper stickerWrapper) {
        this.f105443a = effectStickerManager;
        this.f105444b = bVar;
        this.f105445c = stickerWrapper;
    }

    public final void onChanged(Object obj) {
        this.f105443a.mo100214a(this.f105444b, this.f105445c, (C40949u) obj);
    }
}
