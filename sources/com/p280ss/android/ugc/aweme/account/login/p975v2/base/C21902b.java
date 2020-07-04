package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.b */
public abstract class C21902b {

    /* renamed from: a */
    public final BaseAccountFlowFragment f58623a;

    /* renamed from: a */
    public abstract boolean mo58351a();

    public C21902b(BaseAccountFlowFragment baseAccountFlowFragment) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        this.f58623a = baseAccountFlowFragment;
    }

    /* renamed from: a */
    protected static void m73111a(C10741a aVar) {
        C7573i.m23587b(aVar, "builder");
        aVar.mo25656a().mo25637a().setCanceledOnTouchOutside(false);
    }
}
