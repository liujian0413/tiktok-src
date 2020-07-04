package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import com.p280ss.android.ugc.aweme.account.login.p974ui.BaseVerifyCodeFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.i */
public final class C21924i extends C21902b {

    /* renamed from: b */
    private final String f58654b;

    /* renamed from: a */
    public final boolean mo58351a() {
        BaseVerifyCodeFragment.m72903a(this.f58654b, this.f58623a.getContext());
        return true;
    }

    public C21924i(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(str, "errorMsg");
        super(baseAccountFlowFragment);
        this.f58654b = str;
    }
}
