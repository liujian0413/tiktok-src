package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.common.LogPbBean;
import com.p280ss.android.ugc.aweme.shortvideo.C39321d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList */
public class AVSearchChallengeList {
    @C6593c(mo15949a = "cursor")
    public long cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "keyword_disabled")
    public boolean isDisabled;
    @C6593c(mo15949a = "is_match")
    public boolean isMatch;
    @C6593c(mo15949a = "challenge_list")
    public List<C39321d> items;
    public String keyword;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
}
