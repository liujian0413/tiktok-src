package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.recommend;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.newstyle.recommend.d */
public final class C31505d extends BaseResponse {
    @C6593c(mo15949a = "user_list")

    /* renamed from: a */
    public List<User> f82495a;
    @C6593c(mo15949a = "rid")

    /* renamed from: b */
    public String f82496b;
    @C6593c(mo15949a = "cursor")

    /* renamed from: c */
    public int f82497c;
    @C6593c(mo15949a = "has_more")

    /* renamed from: d */
    public boolean f82498d;
    @C6593c(mo15949a = "new_user_count")

    /* renamed from: e */
    public int f82499e;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: f */
    public LogPbBean f82500f;

    /* renamed from: a */
    public final List<User> mo82213a() {
        if (this.f82495a == null) {
            this.f82495a = new ArrayList(0);
        }
        return this.f82495a;
    }
}
