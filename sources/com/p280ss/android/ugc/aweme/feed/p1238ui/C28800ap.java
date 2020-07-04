package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ap */
public final class C28800ap extends C28894e implements C0053p<C23083a> {

    /* renamed from: a */
    private View f75946a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$a */
    static final class C28801a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28800ap f75947a;

        C28801a(C28800ap apVar) {
            this.f75947a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Aweme aweme = this.f75947a.f76169g;
            C7573i.m23582a((Object) aweme, "aweme");
            Aweme aweme2 = this.f75947a.f76169g;
            C7573i.m23582a((Object) aweme2, "aweme");
            C6907h.m21524a("opt_out_click", (Map) C22984d.m75611a().mo59973a("enter_from", this.f75947a.f76170h).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme2.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107206a(this.f75947a.f76169g, this.f75947a.f76173k))).f60753a);
            Context context = this.f75947a.f76175m;
            C7573i.m23582a((Object) context, "mContext");
            new C28806aq(context, new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C28801a f75948a;

                {
                    this.f75948a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m94810a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m94810a() {
                    C6903bc.m21478S().mo57883a(new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C288021 f75949a;

                        {
                            this.f75949a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m94811a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m94811a() {
                            C42961az.m136380a(new C28809ar());
                            C28275c.m93009m();
                            C10761a.m31409e(this.f75949a.f75948a.f75947a.f76175m, (int) R.string.b64).mo25750a();
                        }
                    }, new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C288021 f75950a;

                        {
                            this.f75950a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m94812a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m94812a() {
                            C10761a.m31409e(this.f75950a.f75948a.f75947a.f76175m, (int) R.string.b63).mo25750a();
                        }
                    });
                }
            }).show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$b */
    static final class C28805b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28800ap f75951a;

        C28805b(C28800ap apVar) {
            this.f75951a = apVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SmartRouter.buildRoute(this.f75951a.f76175m, C6903bc.m21478S().mo57881a()).open();
            Aweme aweme = this.f75951a.f76169g;
            C7573i.m23582a((Object) aweme, "aweme");
            Aweme aweme2 = this.f75951a.f76169g;
            C7573i.m23582a((Object) aweme2, "aweme");
            C6907h.m21524a("enter_vpa_notify", (Map) C22984d.m75611a().mo59973a("enter_from", this.f75951a.f76170h).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme2.getAuthorUid()).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo72018a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0.mo59240a() != false) goto L_0x001d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m94804i() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76169g
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1234j.C28478a.m93588c(r0)
            if (r0 == 0) goto L_0x00e9
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r0 != 0) goto L_0x001d
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            java.lang.String r1 = "LegacyServiceUtils.getTimeLockRulerService()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.mo59240a()
            if (r0 == 0) goto L_0x0025
        L_0x001d:
            java.lang.String r0 = "vpa_show_in_child_mode"
            java.lang.String r1 = ""
            r2 = 0
            com.p280ss.android.ugc.aweme.app.C6877n.m21407a(r0, r1, r2)
        L_0x0025:
            android.view.View r0 = r6.f75946a
            if (r0 == 0) goto L_0x003e
            r1 = 2131303298(0x7f091b82, float:1.8224706E38)
            android.view.View r0 = r0.findViewById(r1)
            android.support.constraint.ConstraintLayout r0 = (android.support.constraint.ConstraintLayout) r0
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.ui.ap$b r1 = new com.ss.android.ugc.aweme.feed.ui.ap$b
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x003e:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f76169g
            java.lang.String r3 = "aweme"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct r2 = r2.getUploadMiscInfoStruct()
            com.ss.android.ugc.aweme.feed.model.VPAInfo r2 = r2.vpaInfo
            int r2 = r2.getInfoBarType()
            r3 = 1
            if (r2 != r3) goto L_0x0063
            android.content.Context r2 = r6.f76175m
            r4 = 2131823116(0x7f110a0c, float:1.9279023E38)
            java.lang.String r2 = r2.getString(r4)
            goto L_0x006c
        L_0x0063:
            android.content.Context r2 = r6.f76175m
            r4 = 2131823117(0x7f110a0d, float:1.9279025E38)
            java.lang.String r2 = r2.getString(r4)
        L_0x006c:
            r1.append(r2)
            java.lang.String r2 = "  "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            com.ss.android.ugc.aweme.feed.ui.ab r1 = new com.ss.android.ugc.aweme.feed.ui.ab
            android.content.Context r2 = r6.f76175m
            java.lang.String r4 = "mContext"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            r4 = 2131232104(0x7f080568, float:1.8080308E38)
            r1.<init>(r2, r4)
            int r2 = r0.length()
            int r2 = r2 - r3
            int r4 = r0.length()
            r5 = 18
            r0.setSpan(r1, r2, r4, r5)
            android.view.View r1 = r6.f75946a
            if (r1 == 0) goto L_0x00ae
            r2 = 2131298653(0x7f09095d, float:1.8215285E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r1
            if (r1 == 0) goto L_0x00ae
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
        L_0x00ae:
            com.ss.android.ugc.aweme.ai r0 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            int r0 = r0.mo57884b()
            r1 = 2
            if (r0 == r1) goto L_0x00e9
            java.lang.String r0 = "homepage_hot"
            java.lang.String r1 = r6.f76170h
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x00e9
            int r0 = r6.f76173k
            if (r0 != 0) goto L_0x00e9
            int r0 = r6.f76179q
            if (r0 != r3) goto L_0x00e9
            android.view.View r0 = r6.f75946a
            if (r0 == 0) goto L_0x00e9
            r1 = 2131300322(0x7f090fe2, float:1.821867E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            if (r0 == 0) goto L_0x00e9
            java.lang.String r1 = com.bytedance.ies.dmt.p262ui.widget.util.C10834d.f29337g
            r0.setFontType(r1)
            com.ss.android.ugc.aweme.feed.ui.ap$a r1 = new com.ss.android.ugc.aweme.feed.ui.ap$a
            r1.<init>(r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x00e9:
            r6.m94805j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28800ap.m94804i():void");
    }

    /* renamed from: j */
    private final void m94805j() {
        if (C28478a.m93588c(this.f76169g)) {
            View view = this.f75946a;
            if (view != null) {
                view.setVisibility(0);
            }
            Aweme aweme = this.f76169g;
            C7573i.m23582a((Object) aweme, "aweme");
            Aweme aweme2 = this.f76169g;
            C7573i.m23582a((Object) aweme2, "aweme");
            C6907h.m21524a("vpa_notify_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", aweme.getAid()).mo59973a("author_id", aweme2.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107206a(this.f76169g, this.f76173k))).f60753a);
            if (C6903bc.m21478S().mo57884b() == 2 || !C7573i.m23585a((Object) "homepage_hot", (Object) this.f76170h) || this.f76173k != 0 || this.f76179q != 1) {
                View view2 = this.f75946a;
                if (view2 != null) {
                    DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.c98);
                    if (dmtTextView != null) {
                        dmtTextView.setVisibility(8);
                    }
                }
                return;
            }
            View view3 = this.f75946a;
            if (view3 != null) {
                DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.c98);
                if (dmtTextView2 != null) {
                    dmtTextView2.setVisibility(0);
                }
            }
            Aweme aweme3 = this.f76169g;
            C7573i.m23582a((Object) aweme3, "aweme");
            Aweme aweme4 = this.f76169g;
            C7573i.m23582a((Object) aweme4, "aweme");
            C6907h.m21524a("opt_out_show", (Map) C22984d.m75611a().mo59973a("enter_from", this.f76170h).mo59973a("group_id", aweme3.getAid()).mo59973a("author_id", aweme4.getAuthorUid()).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107206a(this.f76169g, this.f76173k))).f60753a);
            return;
        }
        View view4 = this.f75946a;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    public C28800ap(View view) {
        super(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        m94805j();
    }

    /* renamed from: a */
    public final void mo72021a(VideoItemParams videoItemParams) {
        super.mo72021a(videoItemParams);
        if (videoItemParams != null) {
            m94804i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo72022b(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60132a("on_page_selected", (C0053p<C23083a>) this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72019a(View view) {
        View view2 = ((X2CItemFeed) C7121a.m22249b(X2CItemFeed.class)).getView(this.f76175m, R.layout.b54);
        C7573i.m23582a((Object) view2, "x2CItemFeed.getView(mCon…layout.view_vpa_info_bar)");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        this.f75946a = view2;
        View view3 = this.f75946a;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f75946a;
        if (view4 != null) {
            DmtTextView dmtTextView = (DmtTextView) view4.findViewById(R.id.c98);
            if (dmtTextView != null) {
                dmtTextView.setVisibility(8);
            }
        }
    }
}
