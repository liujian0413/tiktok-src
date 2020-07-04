package com.p280ss.android.ugc.aweme.main.story.live;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.d */
public final class C33104d extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "avatar_list")

    /* renamed from: a */
    public List<UrlModel> f86120a;
    @C6593c(mo15949a = "enable")

    /* renamed from: b */
    public boolean f86121b;

    /* renamed from: c */
    public String f86122c;

    public final String getRequestId() {
        return this.f86122c;
    }

    public final void setRequestId(String str) {
        this.f86122c = str;
    }
}
