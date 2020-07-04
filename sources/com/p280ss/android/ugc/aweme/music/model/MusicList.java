package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicList */
public class MusicList extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public int cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "music_list")
    public List<Music> items;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "music_type")
    public int mMusicType;
    @C6593c(mo15949a = "mc_info")
    public MusicCollectionItem mcInfo;
    @C6593c(mo15949a = "radio_cursor")
    public int radioCursor;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public int getCursor() {
        if (this.radioCursor > 0) {
            return this.radioCursor;
        }
        return this.cursor;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z ? 1 : 0;
    }
}
