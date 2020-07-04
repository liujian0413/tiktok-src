package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.b */
final /* synthetic */ class C24005b implements Runnable {

    /* renamed from: a */
    private final MusicModel f63452a;

    /* renamed from: b */
    private final SmartImageView f63453b;

    C24005b(MusicModel musicModel, SmartImageView smartImageView) {
        this.f63452a = musicModel;
        this.f63453b = smartImageView;
    }

    public final void run() {
        MusicItemNoLyricViewHolder.m78691a(this.f63452a, this.f63453b);
    }
}
