package com.p280ss.android.ugc.aweme.music;

import com.p280ss.android.ugc.aweme.music.api.MusicApi;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.services.music.IMusicService;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;

/* renamed from: com.ss.android.ugc.aweme.music.c */
public final class C33774c implements IMusicService {
    public final Music getDefaultMusic() {
        return null;
    }

    public final MusicList getStickPointMusicList(int i, int i2, int i3, String str) throws Exception {
        return MusicApi.m108888a(i, i2, i3, str);
    }
}
