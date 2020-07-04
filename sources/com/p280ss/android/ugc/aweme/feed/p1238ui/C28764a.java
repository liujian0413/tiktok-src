package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.AlgoFreeInfo;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.helper.C28424l;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44920d;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.a */
public final class C28764a {

    /* renamed from: a */
    public VideoViewComponent f75872a;

    /* renamed from: b */
    public boolean f75873b;

    /* renamed from: c */
    public boolean f75874c;

    /* renamed from: d */
    public final ViewGroup f75875d;

    /* renamed from: e */
    private C28424l f75876e;

    /* renamed from: f */
    private final C28228a f75877f = new C28228a();

    /* renamed from: g */
    private C28767c f75878g = new C28767c(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$a */
    static final class C28765a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DmtTextView f75879a;

        C28765a(DmtTextView dmtTextView) {
            this.f75879a = dmtTextView;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            View rootView = this.f75879a.getRootView();
            C7573i.m23582a((Object) rootView, "rootView");
            Context context = rootView.getContext();
            AlgoFreeInfo c = C6903bc.m21478S().mo57885c();
            if (c != null) {
                str = c.getLearnMoreLink();
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$b */
    public static final class C28766b implements C44963i {

        /* renamed from: a */
        final /* synthetic */ C28764a f75880a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C28766b(C28764a aVar) {
            this.f75880a = aVar;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f75880a.f75874c) {
                this.f75880a.f75874c = false;
                this.f75880a.mo73983c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$c */
    public static final class C28767c extends C43200c {

        /* renamed from: a */
        final /* synthetic */ C28764a f75881a;

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
        }

        C28767c(C28764a aVar) {
            this.f75881a = aVar;
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            super.mo63045a(eVar);
        }

        /* renamed from: a */
        public final void mo63046a(String str) {
            super.mo63046a(str);
        }

        /* renamed from: a */
        public final void mo63044a(C44920d dVar) {
            super.mo63044a(dVar);
            C44962h hVar = C28764a.m94722a(this.f75881a).f115582b;
            C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
            View a = hVar.mo107454a();
            C7573i.m23582a((Object) a, "mVideoView.surfaceHolder.view");
            a.setVisibility(0);
        }

        /* renamed from: c */
        public final void mo64949c(String str) {
            super.mo64949c(str);
            C44962h hVar = C28764a.m94722a(this.f75881a).f115582b;
            C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
            View a = hVar.mo107454a();
            C7573i.m23582a((Object) a, "mVideoView.surfaceHolder.view");
            a.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo73981a() {
        m94725h();
        this.f75873b = true;
        mo73983c();
        this.f75875d.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo73982b() {
        this.f75873b = false;
        m94726i();
        this.f75875d.setVisibility(8);
        C6903bc.m21478S().mo57887e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r2 == null) goto L_0x0033;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m94724g() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.b.a r0 = r3.f75877f
            int r0 = r0.f74354a
            r1 = 2
            if (r0 != r1) goto L_0x0013
            com.ss.android.ugc.aweme.feed.helper.l r0 = r3.f75876e
            if (r0 != 0) goto L_0x0010
            java.lang.String r1 = "mPlayVideoHelper"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0010:
            r0.mo72161b()
        L_0x0013:
            com.ss.android.ugc.aweme.feed.b.a r0 = r3.f75877f
            r1 = 0
            r0.f74354a = r1
            com.ss.android.ugc.aweme.feed.helper.l r0 = r3.f75876e
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = "mPlayVideoHelper"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0021:
            com.ss.android.ugc.aweme.video.c.b r1 = com.p280ss.android.ugc.aweme.video.p1699c.C43202b.f111848a
            com.ss.android.ugc.aweme.ai r2 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            com.ss.android.ugc.aweme.AlgoFreeInfo r2 = r2.mo57885c()
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.getBackgroundVideoUrl()
            if (r2 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r2 = ""
        L_0x0035:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo104869a(r2)
            r0.mo72160a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28764a.m94724g():void");
    }

    /* renamed from: i */
    private void m94726i() {
        this.f75874c = false;
        int i = this.f75877f.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C28424l lVar = this.f75876e;
        if (lVar == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        lVar.mo72163d();
        this.f75877f.f74354a = 0;
    }

    /* renamed from: c */
    public final void mo73983c() {
        VideoViewComponent videoViewComponent = this.f75872a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        C44962h hVar = videoViewComponent.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
        if (!hVar.mo107459c()) {
            this.f75874c = true;
            return;
        }
        int i = this.f75877f.f74354a;
        if (i == 0) {
            C28424l lVar = this.f75876e;
            if (lVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            lVar.mo72159a();
            this.f75874c = false;
            this.f75877f.f74354a = 2;
        } else if (i == 3) {
            mo73984d();
        }
    }

    /* renamed from: d */
    public final void mo73984d() {
        this.f75874c = false;
        int i = this.f75877f.f74354a;
        if (i == 0) {
            mo73983c();
        } else if (i == 3) {
            C28424l lVar = this.f75876e;
            if (lVar == null) {
                C7573i.m23583a("mPlayVideoHelper");
            }
            lVar.mo72162c();
            this.f75877f.f74354a = 4;
        }
    }

    /* renamed from: e */
    public final void mo73985e() {
        this.f75874c = false;
        int i = this.f75877f.f74354a;
        if (i != 4) {
            switch (i) {
                case 1:
                case 2:
                    break;
                default:
                    return;
            }
        }
        C28424l lVar = this.f75876e;
        if (lVar == null) {
            C7573i.m23583a("mPlayVideoHelper");
        }
        lVar.mo72161b();
        this.f75877f.f74354a = 3;
    }

    /* renamed from: f */
    private final void m94723f() {
        this.f75872a = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f75872a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent.mo107432a((ViewGroup) (FrameLayout) this.f75875d.findViewById(R.id.eac));
        ((DmtTextView) this.f75875d.findViewById(R.id.title)).setFontType(C10834d.f29337g);
        ((DmtTextView) this.f75875d.findViewById(R.id.bkr)).setFontType(C10834d.f29337g);
        VideoViewComponent videoViewComponent2 = this.f75872a;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent2.mo107434a((C44963i) new C28766b(this));
        VideoViewComponent videoViewComponent3 = this.f75872a;
        if (videoViewComponent3 == null) {
            C7573i.m23583a("mVideoView");
        }
        this.f75876e = new C28424l(videoViewComponent3, this.f75878g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab A[LOOP:0: B:20:0x00a5->B:22:0x00ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m94725h() {
        /*
            r9 = this;
            android.view.ViewGroup r0 = r9.f75875d
            android.view.View r0 = (android.view.View) r0
            r1 = 2131299417(0x7f090c59, float:1.8216835E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.ai r1 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo57885c()
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.getLearnMoreText()
            if (r1 == 0) goto L_0x0020
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L_0x0024
        L_0x0020:
            java.lang.String r1 = "Learn More"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0024:
            r0.setText(r1)
            com.ss.android.ugc.aweme.feed.ui.a$a r1 = new com.ss.android.ugc.aweme.feed.ui.a$a
            r1.<init>(r0)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r9.f75875d
            android.view.View r0 = (android.view.View) r0
            r1 = 2131298510(0x7f0908ce, float:1.8214995E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.ai r1 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo57885c()
            r2 = 0
            if (r1 == 0) goto L_0x004e
            java.lang.String r1 = r1.getIconUrl()
            goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r0, r1)
            android.view.ViewGroup r0 = r9.f75875d
            android.view.View r0 = (android.view.View) r0
            r1 = 2131302118(0x7f0916e6, float:1.8222313E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            java.lang.String r1 = "rootView.title"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.ai r1 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r1.mo57885c()
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.getTitle()
            goto L_0x0074
        L_0x0073:
            r1 = r2
        L_0x0074:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.ai r0 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            com.ss.android.ugc.aweme.AlgoFreeInfo r0 = r0.mo57885c()
            if (r0 == 0) goto L_0x0094
            java.lang.String r3 = r0.getBody()
            if (r3 == 0) goto L_0x0094
            java.lang.String r4 = "\n"
            java.lang.String r5 = "\n\n"
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r2 = kotlin.text.C7634n.m23711a(r3, r4, r5, false)
        L_0x0094:
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.<init>(r2)
            java.lang.String r1 = "\n\n"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r1 = r1.matcher(r2)
        L_0x00a5:
            boolean r2 = r1.find()
            if (r2 == 0) goto L_0x00c1
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r3 = 7
            r4 = 1
            r2.<init>(r3, r4)
            int r3 = r1.start()
            int r3 = r3 + r4
            int r4 = r1.end()
            r5 = 33
            r0.setSpan(r2, r3, r4, r5)
            goto L_0x00a5
        L_0x00c1:
            android.view.ViewGroup r1 = r9.f75875d
            android.view.View r1 = (android.view.View) r1
            r2 = 2131297518(0x7f0904ee, float:1.8212983E38)
            android.view.View r1 = r1.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r1
            java.lang.String r2 = "rootView.desc"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C28764a.m94725h():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoViewComponent m94722a(C28764a aVar) {
        VideoViewComponent videoViewComponent = aVar.f75872a;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        return videoViewComponent;
    }

    public C28764a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "rootView");
        this.f75875d = viewGroup;
        m94723f();
        m94724g();
    }
}
