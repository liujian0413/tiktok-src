package com.p280ss.android.ugc.aweme.feed.p1238ui;

import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.j */
final /* synthetic */ class C28900j implements Runnable {

    /* renamed from: a */
    private final FeedAvatarView f76184a;

    /* renamed from: b */
    private final FollowStatus f76185b;

    C28900j(FeedAvatarView feedAvatarView, FollowStatus followStatus) {
        this.f76184a = feedAvatarView;
        this.f76185b = followStatus;
    }

    public final void run() {
        this.f76184a.mo73801a(this.f76185b);
    }
}
