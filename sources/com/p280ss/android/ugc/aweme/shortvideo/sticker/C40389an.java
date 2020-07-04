package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.an */
final /* synthetic */ class C40389an implements Runnable {

    /* renamed from: a */
    private final StickerModule f104981a;

    /* renamed from: b */
    private final FaceStickerBean f104982b;

    C40389an(StickerModule stickerModule, FaceStickerBean faceStickerBean) {
        this.f104981a = stickerModule;
        this.f104982b = faceStickerBean;
    }

    public final void run() {
        this.f104981a.mo100306c(this.f104982b);
    }
}
