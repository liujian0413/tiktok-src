package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusicAladdin */
public final class SearchMusicAladdin implements Serializable {
    @C6593c(mo15949a = "music_list")
    private List<MusicList> musicList;
    @C6593c(mo15949a = "title")
    private String title;

    public final List<MusicList> getMusicList() {
        return this.musicList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setMusicList(List<MusicList> list) {
        this.musicList = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
