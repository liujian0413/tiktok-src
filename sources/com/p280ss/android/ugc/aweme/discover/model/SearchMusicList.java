package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusicList */
public class SearchMusicList extends SearchApiResult {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "music", mo15950b = {"music_list"})
    public List<Music> musicList;
    @C6593c(mo15949a = "music_info_list")
    public List<SearchMusic> searchMusicList;
}
