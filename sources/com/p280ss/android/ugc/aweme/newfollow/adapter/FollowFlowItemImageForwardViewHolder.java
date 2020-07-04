package com.p280ss.android.ugc.aweme.newfollow.adapter;

import android.view.View;
import android.view.ViewStub;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29887g;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardImageViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.adapter.FollowFlowItemImageForwardViewHolder */
public class FollowFlowItemImageForwardViewHolder extends ForwardImageViewHolder {

    /* renamed from: Y */
    private boolean f88916Y;

    /* renamed from: s */
    public boolean mo76041s() {
        return this.f88916Y;
    }

    /* renamed from: a */
    public final C29887g mo76054a(C29376j jVar) {
        return new C34116a(this, jVar);
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
        viewStub3.setLayoutResource(R.layout.a6v);
        mo76017a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6d);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc8);
        viewStub6.setLayoutResource(R.layout.a6p);
        mo76017a(viewStub6.inflate(), 12.0f);
    }

    public FollowFlowItemImageForwardViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar, boolean z) {
        super(followFeedLayout, bVar, jVar, eVar, aVar);
        this.f88916Y = z;
    }
}
