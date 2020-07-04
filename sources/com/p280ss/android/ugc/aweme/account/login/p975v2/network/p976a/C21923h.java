package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.h */
public final class C21923h extends C21902b {

    /* renamed from: b */
    private final BaseAccountFlowFragment f58651b;

    /* renamed from: c */
    private final int f58652c;

    /* renamed from: d */
    private final String f58653d;

    /* renamed from: a */
    public final boolean mo58351a() {
        if (this.f58651b.isViewValid()) {
            this.f58651b.mo58335a(this.f58652c, C22338o.m73946a(Integer.valueOf(this.f58652c), this.f58653d));
        }
        return true;
    }

    public C21923h(BaseAccountFlowFragment baseAccountFlowFragment, int i, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "baseFragment");
        C7573i.m23587b(str, "errorMessage");
        super(baseAccountFlowFragment);
        this.f58651b = baseAccountFlowFragment;
        this.f58652c = i;
        this.f58653d = str;
    }
}
