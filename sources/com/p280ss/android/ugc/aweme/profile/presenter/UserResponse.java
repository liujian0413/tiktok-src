package com.p280ss.android.ugc.aweme.profile.presenter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.UserResponse */
public final class UserResponse extends BaseResponse {
    @C6593c(mo15949a = "log_pb")
    private LogPbBean logPb;
    @C6593c(mo15949a = "user")
    private User user;

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }
}
