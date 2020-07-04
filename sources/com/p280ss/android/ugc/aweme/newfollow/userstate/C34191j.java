package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29875f;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29889i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.j */
public final class C34191j extends C29889i {
    /* renamed from: a */
    public final void mo75923a(long j) {
        if (this.f78494b == null || this.f78494b.getAuthor() == null || !TextUtils.equals(this.f78494b.getAuthor().getUid(), C21115b.m71197a().getCurUserId())) {
            super.mo75923a(j);
        }
    }

    public C34191j(C29875f fVar, C29376j jVar, int i) {
        super(fVar, jVar, i);
    }
}
