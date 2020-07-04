package com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21902b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.a.g */
public final class C21922g extends C21902b {

    /* renamed from: b */
    private final BaseAccountFlowFragment f58649b;

    /* renamed from: c */
    private final String f58650c;

    /* renamed from: a */
    public final boolean mo58351a() {
        C21931e.m73158a(this.f58649b, C21903c.f58624a.mo58353b((Fragment) this.f58649b), this.f58650c, Scene.SIGN_UP, this.f58649b.mo58339d()).mo19273b();
        return true;
    }

    public C21922g(BaseAccountFlowFragment baseAccountFlowFragment, String str) {
        C7573i.m23587b(baseAccountFlowFragment, "frag");
        C7573i.m23587b(str, "smsCodeKey");
        super(baseAccountFlowFragment);
        this.f58649b = baseAccountFlowFragment;
        this.f58650c = str;
    }
}
