package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioFollowImageViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFixRatioFollowImageViewHolder */
public final class UserStateFixRatioFollowImageViewHolder extends FixRatioFollowImageViewHolder {

    /* renamed from: d */
    public boolean f89100d;

    /* renamed from: h */
    public final int mo68523h() {
        return 5;
    }

    /* renamed from: i */
    public final String mo68524i() {
        return "from_user_state_tab";
    }

    /* renamed from: r */
    public final String mo75290r() {
        if (this.f89100d) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: y */
    public final void mo75297y() {
        ImageView imageView = this.f77509Y;
        C7573i.m23582a((Object) imageView, "mIvExtraBtn");
        imageView.setVisibility(8);
    }

    /* renamed from: g */
    public final String mo68522g() {
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        C7573i.m23582a((Object) authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateFixRatioFollowImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89100d = z;
    }
}
