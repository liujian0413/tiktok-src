package com.p280ss.android.ugc.aweme.friends.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendList */
public class SummonFriendList extends BaseResponse {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "user_list")
    public List<SummonFriendItem> items;
    @C6593c(mo15949a = "input_keyword")
    public String keyword;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPbBean;
    @C6593c(mo15949a = "rid")
    public String requestId;

    public SummonFriendList(List<SummonFriendItem> list, long j, boolean z, String str) {
        this.items = list;
        this.cursor = j;
        this.hasMore = z;
        this.keyword = str;
    }
}
