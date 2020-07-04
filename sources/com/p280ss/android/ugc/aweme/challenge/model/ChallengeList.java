package com.p280ss.android.ugc.aweme.challenge.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeList */
public class ChallengeList extends BaseResponse {
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "is_match")
    public boolean isMatch;
    @C6593c(mo15949a = "challenge_list")
    public List<Challenge> items;
    @C6593c(mo15949a = "max_cursor")
    public long maxCursor;
    @C6593c(mo15949a = "min_cursor")
    public long minCursor;
}
