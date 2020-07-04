package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.view.View;
import android.view.ViewStub;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29889i;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardVideoViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemVideoForwardViewHolder */
public class FollowFlowItemVideoForwardViewHolder extends ForwardVideoViewHolder {
    /* renamed from: a */
    public final C29889i mo76068a(C29376j jVar) {
        return new C34117b(this, jVar, mo76065R());
    }

    /* renamed from: c */
    public void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a6t);
        mo76017a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76017a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a6w);
        mo76017a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6d);
        mo76017a(viewStub4.inflate(), 12.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        mo76017a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub6.setLayoutResource(R.layout.a6p);
        mo76017a(viewStub6.inflate(), 12.0f);
    }

    public FollowFlowItemVideoForwardViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        this(followFeedLayout, bVar, jVar, eVar, aVar, false);
    }

    public FollowFlowItemVideoForwardViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, eVar, aVar, z);
    }
}
