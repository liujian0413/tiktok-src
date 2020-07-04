package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowImageViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFlowItemImageViewHolder */
public class UserStateFlowItemImageViewHolder extends FollowImageViewHolder {
    /* renamed from: a */
    public final void mo68527a(long j) {
        if (this.f77546j == null || this.f77546j.getAuthor() == null || !TextUtils.equals(this.f77546j.getAuthor().getUid(), C21115b.m71197a().getCurUserId())) {
            super.mo68527a(j);
        }
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.b1b);
        mo75253a(viewStub.inflate(), 20.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6e);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub5.setLayoutResource(R.layout.a6d);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub6.setLayoutResource(R.layout.a6f);
        viewStub6.inflate();
    }

    public UserStateFlowItemImageViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
