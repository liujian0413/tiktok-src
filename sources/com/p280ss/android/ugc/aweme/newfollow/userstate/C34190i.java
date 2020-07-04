package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29874e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29887g;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.i */
public final class C34190i extends C29887g {
    /* renamed from: a */
    public final void mo75923a(long j) {
        if (this.f78494b == null || this.f78494b.getAuthor() == null || !TextUtils.equals(this.f78494b.getAuthor().getUid(), C21115b.m71197a().getCurUserId())) {
            super.mo75923a(j);
        }
    }

    public C34190i(C29874e eVar, C29376j jVar) {
        super(eVar, jVar);
    }
}
