package com.p280ss.android.ugc.aweme.sticker.prop.p1636a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.a.a */
public final class C41855a extends BaseResponse {
    @C6891b
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: a */
    public List<Aweme> f108869a;
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public long f108870b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public int f108871c;
    @C6593c(mo15949a = "rid")

    /* renamed from: d */
    public String f108872d;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: e */
    public LogPbBean f108873e;
    @C6593c(mo15949a = "is_top")

    /* renamed from: f */
    public boolean f108874f;

    /* renamed from: a */
    public final boolean mo102888a() {
        if (this.f108871c == 1) {
            return true;
        }
        return false;
    }
}
