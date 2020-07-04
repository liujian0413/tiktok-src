package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.profile.model.User;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.f */
final /* synthetic */ class C29753f implements C7326g {

    /* renamed from: a */
    private final ViewHolder f78285a;

    /* renamed from: b */
    private final User f78286b;

    C29753f(ViewHolder viewHolder, User user) {
        this.f78285a = viewHolder;
        this.f78286b = user;
    }

    public final void accept(Object obj) {
        this.f78285a.mo75725a(this.f78286b, (BaseResponse) obj);
    }
}
