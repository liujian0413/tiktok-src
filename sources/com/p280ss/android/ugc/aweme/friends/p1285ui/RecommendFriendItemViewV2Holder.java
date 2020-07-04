package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder */
public class RecommendFriendItemViewV2Holder extends C1293v {

    /* renamed from: a */
    private C30179z f79301a;

    /* renamed from: a */
    public final User mo76579a() {
        if (this.f79301a == null) {
            return null;
        }
        return this.f79301a.getData();
    }

    public RecommendFriendItemViewV2Holder(View view) {
        super(view);
        this.f79301a = (C30179z) view;
    }

    /* renamed from: a */
    public final void mo76580a(FollowFeed followFeed, int i, boolean z, int i2) {
        mo76581a(followFeed.getRecommendUser(), i, false, 2);
    }

    /* renamed from: a */
    public final void mo76581a(User user, int i, boolean z, int i2) {
        this.f79301a.setData(user);
        if (!z || i2 == 5 || i2 == 6) {
            this.f79301a.setNewFriendRecommendMask(false);
        } else {
            this.f79301a.setNewFriendRecommendMask(true);
        }
        this.f79301a.setPositionInApiList(i);
    }
}
