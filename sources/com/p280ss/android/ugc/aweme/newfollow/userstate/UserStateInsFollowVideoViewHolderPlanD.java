package com.p280ss.android.ugc.aweme.newfollow.userstate;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsFollowVideoViewHolderPlanD;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateInsFollowVideoViewHolderPlanD */
public final class UserStateInsFollowVideoViewHolderPlanD extends InsFollowVideoViewHolderPlanD {

    /* renamed from: a */
    public final boolean f89130a;

    /* renamed from: h */
    public final String mo68523h() {
        return "from_user_state_tab";
    }

    /* renamed from: i */
    public final int mo68524i() {
        return 5;
    }

    /* renamed from: r */
    public final String mo75290r() {
        if (this.f89130a) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: am */
    public final String mo75315am() {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateInsFollowVideoViewHolderPlanD(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89130a = z;
    }
}
