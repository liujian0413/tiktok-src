package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FixRatioFollowVideoViewHolder;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFixRatioFollowVideoViewHolder */
public final class UserStateFixRatioFollowVideoViewHolder extends FixRatioFollowVideoViewHolder {

    /* renamed from: a */
    public boolean f89101a;

    /* renamed from: h */
    public final String mo68523h() {
        return "from_user_state_tab";
    }

    /* renamed from: i */
    public final int mo68524i() {
        return 5;
    }

    /* renamed from: am */
    public final String mo75315am() {
        Aweme aweme = this.f77546j;
        if (aweme != null) {
            String authorUid = aweme.getAuthorUid();
            if (authorUid != null) {
                return authorUid;
            }
        }
        return "";
    }

    /* renamed from: r */
    public final String mo75290r() {
        if (this.f89101a) {
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

    public UserStateFixRatioFollowVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, aVar);
        this.f89101a = z;
    }
}
