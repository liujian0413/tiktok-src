package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.base.model.user.IUser.Status;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.o */
final /* synthetic */ class C7820o implements C7326g {

    /* renamed from: a */
    private final FeedTabViewModel f21115a;

    C7820o(FeedTabViewModel feedTabViewModel) {
        this.f21115a = feedTabViewModel;
    }

    public final void accept(Object obj) {
        this.f21115a.mo20500a((Status) obj);
    }
}
