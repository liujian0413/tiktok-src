package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSugResponse */
public class SearchSugResponse extends BaseResponse {
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "words_query_record")
    public RecommendWordMob recommendWordMob;
    @C6593c(mo15949a = "rid")
    public String requestId = "";
    @C6593c(mo15949a = "sug_list")
    public List<SearchSugEntity> sugList;
}
