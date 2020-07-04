package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ax */
final /* synthetic */ class C40470ax implements Runnable {

    /* renamed from: a */
    private final StickerModule f105206a;

    /* renamed from: b */
    private final FaceStickerBean f105207b;

    C40470ax(StickerModule stickerModule, FaceStickerBean faceStickerBean) {
        this.f105206a = stickerModule;
        this.f105207b = faceStickerBean;
    }

    public final void run() {
        this.f105206a.mo100310d(this.f105207b);
    }
}
