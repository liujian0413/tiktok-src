package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.CollectedMusicList */
public class CollectedMusicList extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "mc_list")
    public List<Music> items;

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
