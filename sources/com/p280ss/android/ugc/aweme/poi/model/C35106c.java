package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.c */
public final class C35106c extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: a */
    public List<Aweme> f91790a;
    @C6593c(mo15949a = "has_more")

    /* renamed from: b */
    public int f91791b;
    @C6593c(mo15949a = "cursor")

    /* renamed from: c */
    public int f91792c;
    @C6593c(mo15949a = "rid")

    /* renamed from: d */
    String f91793d;

    /* renamed from: e */
    public long f91794e;

    public final String getRequestId() {
        return this.f91793d;
    }

    /* renamed from: a */
    public final List<Aweme> mo89326a() {
        if (this.f91790a == null) {
            return new ArrayList();
        }
        return this.f91790a;
    }

    public final void setRequestId(String str) {
        this.f91793d = str;
    }
}
