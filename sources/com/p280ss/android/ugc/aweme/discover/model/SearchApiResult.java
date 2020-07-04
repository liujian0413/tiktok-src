package com.p280ss.android.ugc.aweme.discover.model;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.app.api.C22833h;
import com.p280ss.android.ugc.aweme.app.api.C22834i;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchApiResult */
public class SearchApiResult extends BaseResponse implements C6866d, C22832g {
    @C6593c(mo15949a = "ad_info")
    public SearchAdInfo adInfo;
    @C6593c(mo15949a = "guide_search_words")
    public List<GuideSearchWord> guideSearchWordList;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    @C6593c(mo15949a = "query_correct_info")
    public QueryCorrectInfo queryCorrectInfo;
    String requestId = "";
    C10104a requestInfo;
    @C6593c(mo15949a = "search_nil_info")
    public SearchNilInfo searchNilInfo;
    @C6593c(mo15949a = "search_nil_text")
    public SearchNilText searchNilText;
    @C6593c(mo15949a = "suicide_prevent")
    public SearchPreventSuicide suicidePrevent;

    public String getRequestId() {
        return this.requestId;
    }

    public C10104a getRequestInfo() {
        return this.requestInfo;
    }

    public C22834i getRequestLog() {
        return C22833h.m75273a(this);
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setRequestInfo(C10104a aVar) {
        this.requestInfo = aVar;
    }
}
