package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.mix.MixDetailActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.by */
public final class C28861by extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    public View f76100a;

    /* renamed from: b */
    private DmtTextView f76101b;

    /* renamed from: a */
    public final void mo72018a() {
    }

    public C28861by(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74133b(View view) {
        if (this.f76169g != null && this.f76169g.getMixInfo() != null) {
            MixDetailActivity.m108253a(this.f76175m, this.f76169g, this.f76169g.getMixInfo().mixId, this.f76170h, "video");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        dataCenter.mo60132a("need_hide_mix_enter", (C0053p<C23083a>) this).mo60132a("on_page_selected", (C0053p<C23083a>) this).mo60132a("need_show_mix_enter", (C0053p<C23083a>) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f76100a = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.view_video_mix_bar);
            this.f76101b = (DmtTextView) this.f76100a.findViewById(R.id.bz2);
            frameLayout.addView(this.f76100a, new LayoutParams(-1, C23486n.m77122a(40.0d)));
            this.f76100a.setOnClickListener(new C28863bz(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -185811140) {
                if (hashCode != 350216171) {
                    if (hashCode == 1647406913 && str.equals("need_hide_mix_enter")) {
                        c = 0;
                    }
                } else if (str.equals("on_page_selected")) {
                    c = 2;
                }
            } else if (str.equals("need_show_mix_enter")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    C25384x.m83527a(this.f76100a, -this.f76100a.getHeight(), 360, false);
                    this.f76100a.postDelayed(new Runnable() {
                        public final void run() {
                            C23487o.m77140a(C28861by.this.f76100a, 8);
                            C28861by.this.f76174l.mo60134a("already_hide_mix_enter", (Object) Integer.valueOf(1));
                        }
                    }, 360);
                    return;
                case 1:
                    C23487o.m77140a(this.f76100a, 0);
                    C25384x.m83527a(this.f76100a, 0, 360, true);
                    return;
                case 2:
                    if (this.f76169g != null && !FeedParamProvider.m94273a(this.f76175m).isHotSpot() && C28504t.m93692a(this.f76169g, this.f76179q, this.f76170h)) {
                        C28506u.m93698a(this.f76169g, this.f76170h);
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (this.f76169g == null) {
            C23487o.m77140a(this.f76100a, 8);
        } else if (this.f76169g.shouldShowReviewStatus()) {
            C23487o.m77140a(this.f76100a, 8);
        } else if (FeedParamProvider.m94273a(this.f76175m).isHotSpot()) {
            C23487o.m77140a(this.f76100a, 8);
        } else if (C28478a.m93584a(this.f76170h, this.f76169g)) {
            C23487o.m77140a(this.f76100a, 8);
        } else if (!C28504t.m93692a(this.f76169g, this.f76179q, this.f76170h)) {
            C23487o.m77140a(this.f76100a, 8);
        } else {
            C23487o.m77140a(this.f76100a, 0);
            MixStruct mixInfo = this.f76169g.getMixInfo();
            if (mixInfo != null && !TextUtils.isEmpty(mixInfo.mixName)) {
                this.f76101b.setText(mixInfo.mixName);
            }
        }
    }
}
