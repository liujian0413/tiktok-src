package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cf */
public final class C28875cf extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    private DmtTextView f76131a;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    /* renamed from: j */
    private boolean m95025j() {
        int a = C28344a.m93109a();
        if ((a != 2 || TextUtils.equals(this.f76170h, "homepage_hot")) && a != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m95024i() {
        if (C6399b.m19944t()) {
            return false;
        }
        if ((!C6903bc.m21482a().mo84630a() || !TextUtils.equals(this.f76170h, "homepage_follow")) && !FeedParamProvider.m94273a(this.f76175m).isHotSpot() && (!TextUtils.equals(this.f76170h, "homepage_hot") || !this.f76169g.isHotSearchAweme())) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m95026k() {
        if (this.f76169g == null || this.f76169g.getCreateTime() <= 0) {
            C23487o.m77140a((View) this.f76131a, 8);
        } else {
            String d = C43110ev.m136735d(this.f76175m, this.f76169g.getCreateTime() * 1000);
            if (!TextUtils.isEmpty(d)) {
                DmtTextView dmtTextView = this.f76131a;
                StringBuilder sb = new StringBuilder("· ");
                sb.append(d);
                dmtTextView.setText(sb.toString());
                C23487o.m77140a((View) this.f76131a, 0);
            } else {
                C23487o.m77140a((View) this.f76131a, 8);
            }
        }
    }

    public C28875cf(View view) {
        super(view);
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (m95024i() || m95025j()) {
            m95026k();
        } else {
            C23487o.m77140a((View) this.f76131a, 8);
        }
    }

    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.layout_video_post_time);
        if (view instanceof FrameLayout) {
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.leftMargin = C23486n.m77122a(4.0d);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(C23486n.m77122a(4.0d));
            }
            ((FrameLayout) view).addView(view2, layoutParams);
        }
        this.f76131a = (DmtTextView) view2.findViewById(R.id.dzt);
    }
}
