package com.p280ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.app.api.C22833h;
import com.p280ss.android.ugc.aweme.app.api.C22834i;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse */
public final class SuggestWordResponse implements C6866d, C22832g {
    @C6593c(mo15949a = "data")
    public final List<TypeWords> data;
    @C6593c(mo15949a = "errno")
    public final int errno;
    @C6593c(mo15949a = "msg")
    public final String msg;
    private String requestId = "";
    private C10104a<?> requestInfo;

    public final String getRequestId() {
        return this.requestId;
    }

    public final C10104a<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final C22834i getRequestLog() {
        return C22833h.m75273a(this);
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setRequestInfo(C10104a<?> aVar) {
        this.requestInfo = aVar;
    }
}
