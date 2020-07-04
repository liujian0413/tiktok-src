package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioImageForwardFeedViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFixRatioForwardImageViewHolder */
public final class UserStateFixRatioForwardImageViewHolder extends FixRatioImageForwardFeedViewHolder {

    /* renamed from: Y */
    public boolean f89102Y;

    /* renamed from: N */
    public final String mo76052N() {
        return "from_user_state_tab";
    }

    /* renamed from: q */
    public final int mo76060q() {
        return 5;
    }

    /* renamed from: t */
    public final String mo76044t() {
        if (this.f89102Y) {
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

    /* renamed from: p */
    public final String mo76059p() {
        Aweme aweme = this.f78552F;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateFixRatioForwardImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        C7573i.m23587b(eVar, "itemViewInteractListener");
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f89102Y = z;
    }
}
