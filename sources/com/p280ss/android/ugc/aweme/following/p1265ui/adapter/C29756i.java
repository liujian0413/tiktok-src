package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import com.p280ss.android.ugc.aweme.follow.widet.C29548a.C29552a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.i */
final /* synthetic */ class C29756i implements C29552a {

    /* renamed from: a */
    private final ViewHolder f78291a;

    /* renamed from: b */
    private final IMUser f78292b;

    C29756i(ViewHolder viewHolder, IMUser iMUser) {
        this.f78291a = viewHolder;
        this.f78292b = iMUser;
    }

    /* renamed from: a */
    public final void mo68102a(FollowStatus followStatus) {
        this.f78291a.mo75734a(this.f78292b, followStatus);
    }
}
