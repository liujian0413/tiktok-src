package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicAwemeList */
public class MusicAwemeList extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public int hasMore;
    @C6593c(mo15949a = "aweme_list")
    public List<Aweme> items;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "rid")
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
