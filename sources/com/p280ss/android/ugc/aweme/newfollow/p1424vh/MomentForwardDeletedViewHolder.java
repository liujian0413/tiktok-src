package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedDisplayTypeAB;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowForwardAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.p1269c.C29888h;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.MomentForwardDeletedViewHolder */
public class MomentForwardDeletedViewHolder extends BaseForwardViewHolder {

    /* renamed from: S */
    DmtTextView f89348S;

    /* renamed from: T */
    ViewStub f89349T;

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* renamed from: s */
    public final boolean mo76041s() {
        return true;
    }

    /* renamed from: u */
    public final void mo76045u() {
        super.mo76045u();
    }

    /* renamed from: E */
    public final void mo76008E() {
        if (!C28482e.m93615h(this.f78552F) || !C6384b.m19835a().mo15292a(FollowFeedShowForwardAB.class, true, "aweme_follow_show_forward", C6384b.m19835a().mo15295d().aweme_follow_show_forward, false)) {
            C23487o.m77140a((View) this.f78592r, 8);
        } else {
            C23487o.m77140a((View) this.f78592r, 0);
        }
    }

    /* renamed from: J */
    public final void mo76011J() {
        if (VERSION.SDK_INT >= 21) {
            this.f89348S.setOutlineProvider(new C43070ds((int) C9738o.m28708b(mo75888b(), 2.0f)));
            this.f89348S.setClipToOutline(true);
        }
    }

    /* renamed from: a */
    public final void mo76016a(View view) {
        super.mo76016a(view);
        this.f89348S = (DmtTextView) view.findViewById(R.id.dsf);
        this.f89349T = (ViewStub) view.findViewById(R.id.dc3);
    }

    /* renamed from: b */
    public final void mo76026b(View view) {
        View findViewById = view.findViewById(R.id.bqy);
        LayoutParams layoutParams = (LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = (int) (((float) layoutParams.leftMargin) + C9738o.m28708b(mo75888b(), 50.0f));
        layoutParams.topMargin = -((int) C9738o.m28708b(mo75888b(), 20.0f));
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void mo76029c(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        viewStub.setLayoutResource(R.layout.a8q);
        mo76018a(viewStub.inflate(), 4.0f, 3.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        viewStub2.setLayoutResource(R.layout.a6s);
        mo76018a(viewStub2.inflate(), 0.0f, 8.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        viewStub3.setLayoutResource(R.layout.a8n);
        mo76017a(viewStub3.inflate(), 4.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dc6);
        viewStub4.setLayoutResource(R.layout.a6q);
        mo76017a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc0);
        viewStub5.setLayoutResource(R.layout.a6f);
        mo76017a(viewStub5.inflate(), 16.0f);
    }

    public MomentForwardDeletedViewHolder(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21747e eVar, C21743a aVar) {
        super(followFeedLayout, bVar, eVar, aVar);
        this.f78560N = new C29888h(this, jVar) {
        };
        ((LinearLayout) this.f78573a).setGravity(48);
        this.f78597w.setDisplayType(C6384b.m19835a().mo15287a(FollowFeedDisplayTypeAB.class, true, "second_tab_display_type", C6384b.m19835a().mo15295d().second_tab_display_type, 8));
    }
}
