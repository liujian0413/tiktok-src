package com.p280ss.android.ugc.aweme.newfollow.userstate;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.InsForwardVideoViewHolderPlanC;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateInsForwardVideoViewHolderPlanC */
public final class UserStateInsForwardVideoViewHolderPlanC extends InsForwardVideoViewHolderPlanC {

    /* renamed from: al */
    public final boolean f89139al;

    /* renamed from: R */
    public final int mo76065R() {
        return 5;
    }

    /* renamed from: S */
    public final String mo76066S() {
        return "from_user_state_tab";
    }

    /* renamed from: t */
    public final String mo76044t() {
        if (this.f89139al) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: Q */
    public final String mo76064Q() {
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateInsForwardVideoViewHolderPlanC(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(eVar, "itemViewInteractListener");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f89139al = z;
    }
}
