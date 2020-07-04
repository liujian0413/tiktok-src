package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.q */
final /* synthetic */ class C40637q implements C0053p {

    /* renamed from: a */
    private final FavoriteStickerFragment f105629a;

    C40637q(FavoriteStickerFragment favoriteStickerFragment) {
        this.f105629a = favoriteStickerFragment;
    }

    public final void onChanged(Object obj) {
        this.f105629a.mo100725a((LiveDataWrapper) obj);
    }
}
