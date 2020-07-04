package com.p280ss.android.ugc.aweme.similarvideo.p1628a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.a.b */
public final class C41715b extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "offset")

    /* renamed from: a */
    public int f108584a;
    @C6593c(mo15949a = "has_more")

    /* renamed from: b */
    public boolean f108585b;
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: c */
    public ArrayList<Aweme> f108586c;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: d */
    public LogPbBean f108587d;

    /* renamed from: e */
    String f108588e;

    public final String getRequestId() {
        return this.f108588e;
    }

    public final void setRequestId(String str) {
        this.f108588e = str;
    }
}
