package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SearchMusicList */
public class SearchMusicList {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "has_more")
    int hasMore;
    @C6593c(mo15949a = "music_list")
    public List<SearchMusic> items;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
