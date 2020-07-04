package com.p280ss.android.ugc.aweme.discover.mixfeed;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.e */
public final class C26755e extends SearchApiResult {
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public int f70553b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public boolean f70554c;
    @C6593c(mo15949a = "data")

    /* renamed from: d */
    public List<C26754d> f70555d;
    @C6593c(mo15949a = "tab_hide")

    /* renamed from: e */
    public long f70556e;

    public final void setRequestId(String str) {
        super.setRequestId(str);
        for (C26754d requestId : this.f70555d) {
            requestId.setRequestId(str);
        }
    }
}
