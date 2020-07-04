package com.p280ss.android.ugc.aweme.services.music;

import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicList;

/* renamed from: com.ss.android.ugc.aweme.services.music.IMusicService */
public interface IMusicService {

    /* renamed from: com.ss.android.ugc.aweme.services.music.IMusicService$MusicCallback */
    public interface MusicCallback<T1, T2> {
        void run(T1 t1, T2 t2);
    }

    Music getDefaultMusic();

    MusicList getStickPointMusicList(int i, int i2, int i3, String str) throws Exception;
}
