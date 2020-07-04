package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioVideoForwardFeedViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFixRatioForwardVideoViewHolder */
public final class UserStateFixRatioForwardVideoViewHolder extends FixRatioVideoForwardFeedViewHolder {

    /* renamed from: al */
    public boolean f89103al;

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
        if (this.f89103al) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: v */
    public final void mo76046v() {
        ImageView imageView = this.f78548B;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: Q */
    public final String mo76064Q() {
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateFixRatioForwardVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        C7573i.m23587b(eVar, "itemViewInteractListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f89103al = z;
    }
}
