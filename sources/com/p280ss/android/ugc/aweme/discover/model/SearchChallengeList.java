package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallengeList */
public class SearchChallengeList extends SearchApiResult {
    @C6593c(mo15949a = "challenge_list")
    public List<SearchChallenge> challengeList;
    @C6593c(mo15949a = "cursor", mo15950b = {"min_cursor"})
    public int cursor;
    @C6593c(mo15949a = "has_more")
    public boolean hasMore;
    @C6593c(mo15949a = "is_match")
    public boolean isMatch;
}
