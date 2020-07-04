package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29874e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29887g;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.a */
public final class C34116a extends C29887g {
    /* renamed from: a */
    public final void mo75923a(long j) {
        if (this.f78494b == null || this.f78494b.getAuthor() == null || !TextUtils.equals(this.f78494b.getAuthor().getUid(), C21115b.m71197a().getCurUserId())) {
            super.mo75923a(j);
        }
    }

    public C34116a(C29874e eVar, C29376j jVar) {
        super(eVar, jVar);
    }
}
