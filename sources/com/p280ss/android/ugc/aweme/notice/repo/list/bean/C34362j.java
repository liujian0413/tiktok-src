package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.j */
public final class C34362j extends BaseResponse implements C6866d {
    @C6593c(mo15949a = "avatar_list")

    /* renamed from: a */
    public final List<UrlModel> f89551a;
    @C6593c(mo15949a = "enable")

    /* renamed from: b */
    public final boolean f89552b;

    /* renamed from: c */
    private String f89553c;

    public C34362j() {
        this(null, false, 3, null);
    }

    public final String getRequestId() {
        return this.f89553c;
    }

    public final void setRequestId(String str) {
        this.f89553c = str;
    }

    private C34362j(List<? extends UrlModel> list, boolean z) {
        this.f89551a = list;
        this.f89552b = z;
    }

    private /* synthetic */ C34362j(List list, boolean z, int i, C7571f fVar) {
        this(null, false);
    }
}
