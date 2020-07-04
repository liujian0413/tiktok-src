package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BannerList */
public class BannerList extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "banner")
    public List<Banner> items;
    @C6593c(mo15949a = "log_pb")
    public LogPbBean logPb;
    String requestId;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
