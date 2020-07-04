package com.p280ss.android.ugc.aweme.movie.p1402a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.movie.a.b */
public final class C33644b extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: a */
    public ArrayList<Aweme> f87804a;
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public long f87805b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public Boolean f87806c;
    @C6593c(mo15949a = "rid")

    /* renamed from: d */
    public String f87807d;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: e */
    public LogPbBean f87808e;

    public final String getRequestId() {
        return this.f87807d;
    }

    public final void setRequestId(String str) {
        this.f87807d = str;
    }
}
