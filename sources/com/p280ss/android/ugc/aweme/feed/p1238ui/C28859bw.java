package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30357c;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bw */
public final class C28859bw extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    private View f76090a;

    /* renamed from: b */
    private DmtTextView f76091b;

    /* renamed from: c */
    private DmtTextView f76092c;

    /* renamed from: d */
    private DmtTextView f76093d;

    /* renamed from: e */
    private ImageView f76094e;

    /* renamed from: f */
    private RemoteImageView f76095f;

    /* renamed from: r */
    private HotSpotBarViewHolder f76096r;

    /* renamed from: s */
    private HotListBarViewHolder f76097s;

    /* renamed from: t */
    private int f76098t;

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    /* renamed from: i */
    private void m94964i() {
        m94965j();
        m94966k();
        m94967l();
    }

    /* renamed from: h */
    public final void mo74131h() {
        if (this.f76096r != null) {
            this.f76096r.mo73891a(this.f76169g);
        }
    }

    /* renamed from: k */
    private void m94966k() {
        int i;
        if (3 != this.f76098t || (!TextUtils.equals(this.f76170h, "discovery_hot_search_video") && !TextUtils.equals(this.f76170h, "hot_search_video_board"))) {
            i = R.drawable.a35;
        } else {
            i = R.drawable.a33;
        }
        this.f76094e.setImageResource(i);
    }

    /* renamed from: j */
    private void m94965j() {
        if (!(4 == this.f76098t || 2 == this.f76098t)) {
            if (TextUtils.equals(this.f76170h, "homepage_hot") || TextUtils.equals(this.f76170h, "others_homepage") || TextUtils.equals(this.f76170h, "personal_homepage")) {
                C23487o.m77140a((View) this.f76095f, 0);
                C23323e.m76503a(this.f76095f, (int) R.drawable.av8);
                return;
            } else if (TextUtils.equals(this.f76170h, "discovery_hot_search_video") || TextUtils.equals(this.f76170h, "hot_search_video_board")) {
                C23487o.m77140a((View) this.f76095f, 8);
                C30357c.m99189a(this.f76093d, this.f76169g.getHotSearchInfo().getVideoRank(), 4);
                return;
            }
        }
        C23487o.m77140a((View) this.f76095f, 0);
    }

    /* renamed from: l */
    private void m94967l() {
        int i;
        if (this.f76091b != null && this.f76092c != null) {
            if (3 != this.f76098t || (!TextUtils.equals(this.f76170h, "discovery_hot_search_video") && !TextUtils.equals(this.f76170h, "hot_search_video_board"))) {
                i = R.color.w4;
            } else {
                i = R.color.a5l;
            }
            if (VERSION.SDK_INT >= 23) {
                this.f76091b.setTextColor(this.f76175m.getColor(i));
                this.f76092c.setTextColor(this.f76175m.getColor(i));
            }
        }
    }

    public C28859bw(View view) {
        super(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74130b(View view) {
        m94963a(false);
    }

    /* renamed from: a */
    private void m94963a(boolean z) {
        String str;
        String str2 = "enter_hot_search_video_board";
        C22984d a = C22984d.m75611a();
        String str3 = "enter_from";
        if (TextUtils.equals(this.f76170h, "discovery_hot_search_video")) {
            str = "hot_search_video";
        } else {
            str = this.f76170h;
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f76090a = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.view_video_hot_search_bar);
            this.f76091b = (DmtTextView) this.f76090a.findViewById(R.id.dsf);
            this.f76092c = (DmtTextView) this.f76090a.findViewById(R.id.dvw);
            this.f76093d = (DmtTextView) this.f76090a.findViewById(R.id.dw3);
            this.f76095f = (RemoteImageView) this.f76090a.findViewById(R.id.ax9);
            this.f76094e = (ImageView) this.f76090a.findViewById(R.id.b8y);
            frameLayout.addView(this.f76090a, new LayoutParams(-1, C23486n.m77122a(40.0d)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x015c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72021a(com.p280ss.android.ugc.aweme.feed.model.VideoItemParams r9) {
        /*
            r8 = this;
            super.mo72021a(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            r0 = 8
            if (r9 != 0) goto L_0x000f
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x000f:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            boolean r9 = r9.shouldShowReviewStatus()
            if (r9 == 0) goto L_0x001d
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x001d:
            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r9 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            boolean r9 = com.p280ss.android.ugc.aweme.feed.p1234j.C28482e.m93617j(r9)
            if (r9 == 0) goto L_0x0031
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x0031:
            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r9 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            boolean r9 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93588c(r9)
            if (r9 == 0) goto L_0x0045
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x0045:
            android.content.Context r9 = r8.f76175m
            com.ss.android.ugc.aweme.feed.param.FeedParam r9 = com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.m94273a(r9)
            boolean r9 = r9.isHotSpot()
            if (r9 == 0) goto L_0x0057
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x0057:
            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r1 = 2
            if (r9 != 0) goto L_0x0070
            int r9 = r8.f76179q
            if (r9 != r1) goto L_0x0070
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            boolean r9 = r9.isMixAweme()
            if (r9 == 0) goto L_0x0070
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x0070:
            java.lang.String r9 = r8.f76170h
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r8.f76169g
            boolean r9 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93584a(r9, r2)
            if (r9 == 0) goto L_0x0080
            android.view.View r9 = r8.f76090a
            com.p280ss.android.ugc.aweme.base.utils.C23487o.m77140a(r9, r0)
            return
        L_0x0080:
            java.lang.String r9 = r8.f76170h
            java.lang.String r2 = "discovery_hot_search_video"
            boolean r9 = android.text.TextUtils.equals(r9, r2)
            r2 = 0
            r3 = 1
            if (r9 != 0) goto L_0x0099
            java.lang.String r9 = r8.f76170h
            java.lang.String r4 = "hot_search_video_board"
            boolean r9 = android.text.TextUtils.equals(r9, r4)
            if (r9 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r9 = 0
            goto L_0x009a
        L_0x0099:
            r9 = 1
        L_0x009a:
            boolean r4 = com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r4 != 0) goto L_0x0151
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f76169g
            boolean r4 = r4.isHotListAweme()
            if (r4 == 0) goto L_0x00c3
            r9 = 4
            r8.f76098t = r9
            com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder r9 = r8.f76097s
            if (r9 != 0) goto L_0x00ba
            com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder r9 = new com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder
            android.view.View r0 = r8.f76090a
            java.lang.String r1 = r8.f76170h
            r9.<init>(r0, r1)
            r8.f76097s = r9
        L_0x00ba:
            com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder r9 = r8.f76097s
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76169g
            r9.mo73888a(r0)
            goto L_0x0158
        L_0x00c3:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f76169g
            boolean r4 = r4.isHotSearchAweme()
            if (r4 == 0) goto L_0x00e6
            if (r9 != 0) goto L_0x00e6
            r8.f76098t = r1
            com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder r9 = r8.f76096r
            if (r9 != 0) goto L_0x00de
            com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder r9 = new com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder
            android.view.View r0 = r8.f76090a
            java.lang.String r1 = r8.f76170h
            r9.<init>(r0, r1)
            r8.f76096r = r9
        L_0x00de:
            com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder r9 = r8.f76096r
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f76169g
            r9.mo73893b(r0)
            goto L_0x0158
        L_0x00e6:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            boolean r9 = r9.isHotVideoAweme()
            if (r9 == 0) goto L_0x0151
            r9 = 3
            r8.f76098t = r9
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f76169g
            com.ss.android.ugc.aweme.feed.model.HotSearchInfo r9 = r9.getHotSearchInfo()
            android.view.View r0 = r8.f76090a
            r0.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.f76091b
            android.content.Context r1 = r8.f76175m
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131827415(0x7f111ad7, float:1.9287742E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            int r6 = r9.getVideoRank()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r2] = r6
            java.lang.String r1 = r1.getString(r4, r5)
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " | "
            r0.<init>(r1)
            android.content.Context r1 = r8.f76175m
            android.content.res.Resources r1 = r1.getResources()
            r4 = 2131827416(0x7f111ad8, float:1.9287744E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            long r6 = r9.getVideoRankVV()
            java.lang.String r9 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r6)
            r5[r2] = r9
            java.lang.String r9 = r1.getString(r4, r5)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.f76092c
            r0.setText(r9)
            android.view.View r9 = r8.f76090a
            com.ss.android.ugc.aweme.feed.ui.bx r0 = new com.ss.android.ugc.aweme.feed.ui.bx
            r0.<init>(r8)
            r9.setOnClickListener(r0)
            goto L_0x0158
        L_0x0151:
            r8.f76098t = r3
            android.view.View r9 = r8.f76090a
            r9.setVisibility(r0)
        L_0x0158:
            int r9 = r8.f76098t
            if (r9 == r3) goto L_0x0164
            r8.m94964i()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r8.f76091b
            r9.requestLayout()
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28859bw.mo72021a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }
}
