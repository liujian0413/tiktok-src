package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.c */
final /* synthetic */ class C24006c implements Runnable {

    /* renamed from: a */
    private final MusicModel f63454a;

    /* renamed from: b */
    private final SmartImageView f63455b;

    C24006c(MusicModel musicModel, SmartImageView smartImageView) {
        this.f63454a = musicModel;
        this.f63455b = smartImageView;
    }

    public final void run() {
        MusicItemViewHolder.m78698a(this.f63454a, this.f63455b);
    }
}
