package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.a */
final /* synthetic */ class C23835a implements OnPreparedListener {

    /* renamed from: a */
    private final MusicItemViewHolder f62945a;

    C23835a(MusicItemViewHolder musicItemViewHolder) {
        this.f62945a = musicItemViewHolder;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        MusicAdapter.m78066a(this.f62945a, mediaPlayer);
    }
}
