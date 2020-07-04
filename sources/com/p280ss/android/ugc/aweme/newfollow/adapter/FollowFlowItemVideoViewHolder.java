package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoViewHolder */
public class FollowFlowItemVideoViewHolder extends FollowVideoViewHolder {
    /* renamed from: C */
    public void mo75227C() {
        this.f77508X.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo68527a(long j) {
        if (this.f77546j == null || this.f77546j.getAuthor() == null || !TextUtils.equals(this.f77546j.getAuthor().getUid(), C21115b.m71197a().getCurUserId())) {
            super.mo68527a(j);
        }
    }

    public FollowFlowItemVideoViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
