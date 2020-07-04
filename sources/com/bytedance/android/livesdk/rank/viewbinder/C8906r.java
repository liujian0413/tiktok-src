package com.bytedance.android.livesdk.rank.viewbinder;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.rank.viewbinder.r */
final /* synthetic */ class C8906r implements C7326g {

    /* renamed from: a */
    private final C8902a f24278a;

    /* renamed from: b */
    private final User f24279b;

    C8906r(C8902a aVar, User user) {
        this.f24278a = aVar;
        this.f24279b = user;
    }

    public final void accept(Object obj) {
        this.f24278a.mo21992a(this.f24279b, (FollowPair) obj);
    }
}
