package com.p280ss.android.ugc.aweme.familiar.p965a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.familiar.a.b */
public final class C21711b extends BaseResponse {
    @C6593c(mo15949a = "cursor")

    /* renamed from: a */
    public long f58137a;
    @C6593c(mo15949a = "level")

    /* renamed from: b */
    public int f58138b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public int f58139c;
    @C6593c(mo15949a = "data")

    /* renamed from: d */
    public List<C21709a> f58140d;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: e */
    public LogPbBean f58141e;
    @C6593c(mo15949a = "feed_type")

    /* renamed from: f */
    public int f58142f;
    @C6593c(mo15949a = "recommend_user_cursor")

    /* renamed from: g */
    public int f58143g;

    /* renamed from: a */
    public final boolean mo57984a() {
        if (this.f58139c == 1) {
            return true;
        }
        return false;
    }
}
