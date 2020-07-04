package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ci */
public final class C28881ci extends C28894e {

    /* renamed from: a */
    private View f76148a;

    /* renamed from: b */
    private DmtTextView f76149b;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public C28881ci(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f76148a = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.b4y);
            this.f76149b = (DmtTextView) this.f76148a.findViewById(R.id.csk);
            frameLayout.addView(this.f76148a);
        }
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (this.f76169g == null) {
            C23487o.m77140a(this.f76148a, 8);
            return;
        }
        this.f76148a.setOnClickListener(new C28882cj(this, C6399b.m19921a()));
        if (C6399b.m19945u() && this.f76169g.isSelfSeeAndShouldTell()) {
            this.f76149b.setText(R.string.dlq);
            C23487o.m77140a(this.f76148a, 0);
        } else if (this.f76169g.isProhibitedAndShouldTell()) {
            if (C6399b.m19944t()) {
                this.f76149b.setText(R.string.fo5);
            } else {
                this.f76149b.setText(R.string.d8f);
            }
            C23487o.m77140a(this.f76148a, 0);
        } else {
            C23487o.m77140a(this.f76148a, 8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74155a(Context context, View view) {
        if (!C27326a.m89578a(view)) {
            C6907h.m21524a("enter_appeal", (Map) new C22984d().mo59973a("enter_from", "personal_homepage").mo59973a("group_id", this.f76169g.getFromGroupId()).f60753a);
            String reviewDetailUrl = this.f76169g.getReviewDetailUrl();
            if (!TextUtils.isEmpty(reviewDetailUrl)) {
                Intent buildIntent = SmartRouter.buildRoute(context, "aweme://webview/").buildIntent();
                buildIntent.setData(Uri.parse(reviewDetailUrl));
                Activity g = C6405d.m19984g();
                if (g != null) {
                    g.startActivity(buildIntent);
                }
            }
        }
    }
}
