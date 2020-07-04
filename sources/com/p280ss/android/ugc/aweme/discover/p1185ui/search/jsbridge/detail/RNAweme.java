package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.detail.RNAweme */
public class RNAweme extends Aweme {
    @C6593c(mo15949a = "log_pb")
    LogPbBean logPbBean;
    @C6593c(mo15949a = "request_id")
    String requestIdFromRN;

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public String getRequestIdFromRN() {
        return this.requestIdFromRN;
    }

    public void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public void setRequestIdFromRN(String str) {
        this.requestIdFromRN = str;
    }
}
