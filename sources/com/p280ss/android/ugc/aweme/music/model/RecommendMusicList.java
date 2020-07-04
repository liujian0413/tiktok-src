package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.RecommendMusicList */
public class RecommendMusicList {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "music_list")
    public List<RecommendMusic> musicList;

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
