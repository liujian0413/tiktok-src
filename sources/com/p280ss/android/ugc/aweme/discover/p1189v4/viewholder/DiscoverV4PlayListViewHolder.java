package com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p280ss.android.ugc.aweme.discover.p1189v4.p1190ui.C27190b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.newfollow.util.C34204g;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder */
public class DiscoverV4PlayListViewHolder extends JediSimpleViewHolder<DiscoverPlayListStructV4> implements OnClickListener, C27190b {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71668f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mIvCover", "getMIvCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mSurfaceView", "getMSurfaceView()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mFrameLayout", "getMFrameLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoverV4PlayListViewHolder.class), "mBgGray", "getMBgGray()Landroid/view/View;"))};

    /* renamed from: n */
    public static final C27196a f71669n = new C27196a(null);

    /* renamed from: g */
    public boolean f71670g;

    /* renamed from: j */
    public long f71671j = -1;

    /* renamed from: k */
    public float f71672k;

    /* renamed from: l */
    public final String f71673l;

    /* renamed from: m */
    public final String f71674m;

    /* renamed from: o */
    private final C7541d f71675o = C7546e.m23569a(new C27202g(this));

    /* renamed from: p */
    private final C7541d f71676p = C7546e.m23569a(new C27206k(this));

    /* renamed from: q */
    private final C7541d f71677q = C7546e.m23569a(new C27205j(this));

    /* renamed from: r */
    private final C7541d f71678r = C7546e.m23569a(new C27203h(this));

    /* renamed from: s */
    private final C7541d f71679s = C7546e.m23569a(new C27201f(this));

    /* renamed from: t */
    private final C7541d f71680t = C7546e.m23569a(new C27200e(this));

    /* renamed from: u */
    private VideoViewComponent f71681u;

    /* renamed from: v */
    private final C28228a f71682v = new C28228a();

    /* renamed from: w */
    private boolean f71683w;

    /* renamed from: x */
    private boolean f71684x;

    /* renamed from: y */
    private C27204i f71685y = new C27204i(this);

    /* renamed from: z */
    private final int f71686z;

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$a */
    public static final class C27196a {
        private C27196a() {
        }

        public /* synthetic */ C27196a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$b */
    public static final class C27197b extends C12105c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71687a;

        /* renamed from: a */
        public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
        }

        C27197b(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71687a = discoverV4PlayListViewHolder;
        }

        /* renamed from: a */
        public final void mo29812a(Uri uri, View view, Throwable th) {
            this.f71687a.mo69905q().setImageResource(R.drawable.a6c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$c */
    static final class C27198c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71688a;

        /* renamed from: b */
        final /* synthetic */ float f71689b;

        /* renamed from: c */
        final /* synthetic */ float f71690c;

        C27198c(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder, float f, float f2) {
            this.f71688a = discoverV4PlayListViewHolder;
            this.f71689b = f;
            this.f71690c = f2;
        }

        public final void run() {
            KeepSurfaceTextureView p = this.f71688a.mo62390p();
            C7573i.m23582a((Object) p, "mSurfaceView");
            int width = p.getWidth();
            KeepSurfaceTextureView p2 = this.f71688a.mo62390p();
            C7573i.m23582a((Object) p2, "mSurfaceView");
            C34204g.m110444a(width, p2.getHeight(), this.f71688a.mo62390p(), this.f71689b / this.f71690c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$d */
    public static final class C27199d implements C44963i {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71691a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C27199d(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71691a = discoverV4PlayListViewHolder;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f71691a.f71670g) {
                this.f71691a.f71670g = false;
                this.f71691a.mo69909u();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$e */
    static final class C27200e extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71692a;

        C27200e(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71692a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View view = this.f71692a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return view.findViewById(R.id.lt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$f */
    static final class C27201f extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71693a;

        C27201f(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71693a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            View view = this.f71693a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.am3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$g */
    static final class C27202g extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71694a;

        C27202g(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71694a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            View view = this.f71694a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (SmartImageView) view.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$h */
    static final class C27203h extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71695a;

        C27203h(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71695a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            View view = this.f71695a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.ba3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$i */
    public static final class C27204i extends C43200c {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71696a;

        C27204i(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71696a = discoverV4PlayListViewHolder;
        }

        /* renamed from: b */
        public final void mo64944b(float f) {
            super.mo64944b(f);
            this.f71696a.f71672k = f;
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
            this.f71696a.mo69907s();
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            String str;
            super.mo63045a(eVar);
            this.f71696a.mo69905q().setImageResource(R.drawable.a6c);
            this.f71696a.mo69908t();
            View r = this.f71696a.mo69906r();
            C7573i.m23582a((Object) r, "mBgGray");
            r.setVisibility(8);
            this.f71696a.f71671j = System.currentTimeMillis();
            String str2 = "discovery";
            String str3 = this.f71696a.f71673l;
            String playListType = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).playListType();
            String str4 = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).cellID;
            List<Aweme> list = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C26781b.m87983b(str2, str3, playListType, str4, str, this.f71696a.f31526i, ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87983b(str2, str3, playListType, str4, str, this.f71696a.f31526i, ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).logPb);
        }

        /* renamed from: e */
        public final void mo64953e(String str) {
            String str2;
            super.mo64953e(str);
            String str3 = "discovery";
            String str4 = this.f71696a.f71673l;
            String playListType = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).playListType();
            String str5 = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).cellID;
            List<Aweme> list = ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str2 = aweme.getAid();
                    C26781b.m87987c(str3, str4, playListType, str5, str2, this.f71696a.f31526i, ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).logPb);
                }
            }
            str2 = null;
            C26781b.m87987c(str3, str4, playListType, str5, str2, this.f71696a.f31526i, ((DiscoverPlayListStructV4) this.f71696a.mo29309o()).logPb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$j */
    static final class C27205j extends Lambda implements C7561a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71697a;

        C27205j(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71697a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public KeepSurfaceTextureView invoke() {
            View view = this.f71697a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (KeepSurfaceTextureView) view.findViewById(R.id.dij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4PlayListViewHolder$k */
    static final class C27206k extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoverV4PlayListViewHolder f71698a;

        C27206k(DiscoverV4PlayListViewHolder discoverV4PlayListViewHolder) {
            this.f71698a = discoverV4PlayListViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f71698a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.e3f);
            dmtTextView.setFontType(C10834d.f29332b);
            return dmtTextView;
        }
    }

    /* renamed from: v */
    private final SmartImageView m89154v() {
        return (SmartImageView) this.f71675o.getValue();
    }

    /* renamed from: w */
    private final DmtTextView m89155w() {
        return (DmtTextView) this.f71676p.getValue();
    }

    /* renamed from: x */
    private final FrameLayout m89156x() {
        return (FrameLayout) this.f71679s.getValue();
    }

    public final void aK_() {
        m89151E();
    }

    public final void aL_() {
        m89148B();
    }

    /* renamed from: p */
    public final KeepSurfaceTextureView mo62390p() {
        return (KeepSurfaceTextureView) this.f71677q.getValue();
    }

    /* renamed from: q */
    public final ImageView mo69905q() {
        return (ImageView) this.f71678r.getValue();
    }

    /* renamed from: r */
    public final View mo69906r() {
        return (View) this.f71680t.getValue();
    }

    /* renamed from: l */
    public final void mo29225l() {
        super.mo29225l();
        m89149C();
    }

    /* renamed from: G */
    private final boolean m89153G() {
        return DiscoverV4PlayListDataCenter.Companion.getINSTANCE().isPageShow(this.f71673l);
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        this.itemView.setOnClickListener(this);
        m89157y();
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
        this.f71684x = false;
        m89149C();
    }

    /* renamed from: k */
    public final void mo29224k() {
        super.mo29224k();
        if (m89152F()) {
            m89148B();
        }
    }

    /* renamed from: s */
    public final void mo69907s() {
        SmartImageView v = m89154v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.setVisibility(0);
    }

    /* renamed from: t */
    public final void mo69908t() {
        SmartImageView v = m89154v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.setVisibility(8);
    }

    /* renamed from: F */
    private final boolean m89152F() {
        if (this.f71683w && m89153G()) {
            VideoViewComponent videoViewComponent = this.f71681u;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            if (!videoViewComponent.mo107438d()) {
                return true;
            }
        }
        return false;
    }

    public final void aM_() {
        VideoViewComponent videoViewComponent = this.f71681u;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        if (videoViewComponent.mo107438d()) {
            m89151E();
        }
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        this.f71684x = true;
        m89150D();
        if (m89152F()) {
            mo69909u();
        }
    }

    /* renamed from: A */
    private final void m89147A() {
        Aweme aweme;
        List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
        Video video = null;
        if (list != null) {
            aweme = (Aweme) C7525m.m23513g(list);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            video = aweme.getVideo();
        }
        if (video != null) {
            float width = (float) video.getWidth();
            mo62390p().post(new C27198c(this, (float) video.getHeight(), width));
        }
    }

    /* renamed from: E */
    private final void m89151E() {
        VideoViewComponent videoViewComponent = this.f71681u;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        if (videoViewComponent.mo107438d()) {
            VideoViewComponent videoViewComponent2 = this.f71681u;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo71672ad();
            this.f71682v.f74354a = 3;
        }
    }

    /* renamed from: y */
    private final void m89157y() {
        this.f71681u = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f71681u;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent.mo107433a(mo62390p());
        VideoViewComponent videoViewComponent2 = this.f71681u;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent2.mo107434a((C44963i) new C27199d(this));
    }

    public void bA_() {
        this.f71683w = false;
        this.f71684x = false;
        SmartImageView v = m89154v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.getLayoutParams().height = this.f71686z;
        KeepSurfaceTextureView p = mo62390p();
        C7573i.m23582a((Object) p, "mSurfaceView");
        p.getLayoutParams().height = this.f71686z;
        FrameLayout x = m89156x();
        C7573i.m23582a((Object) x, "mFrameLayout");
        x.getLayoutParams().height = this.f71686z;
        super.bA_();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m89148B() {
        /*
            r2 = this;
            r0 = 0
            r2.f71670g = r0
            com.ss.android.ugc.aweme.feed.b.a r0 = r2.f71682v
            int r0 = r0.f74354a
            if (r0 == 0) goto L_0x0043
            r1 = 3
            if (r0 == r1) goto L_0x000d
            goto L_0x0046
        L_0x000d:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f71681u
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0016:
            java.lang.Object r1 = r2.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4) r1
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.awemes
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = kotlin.collections.C7525m.m23513g(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r1
            if (r1 == 0) goto L_0x002d
            com.ss.android.ugc.aweme.feed.model.Video r1 = r1.getVideo()
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            r0.mo71660a(r1)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f71681u
            if (r0 != 0) goto L_0x003a
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x003a:
            r0.mo107431a()
            com.ss.android.ugc.aweme.feed.b.a r0 = r2.f71682v
            r1 = 4
            r0.f74354a = r1
            return
        L_0x0043:
            r2.mo69909u()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder.DiscoverV4PlayListViewHolder.m89148B():void");
    }

    /* renamed from: C */
    private final void m89149C() {
        String str;
        this.f71670g = false;
        if (this.f71682v.f74354a != 0) {
            VideoViewComponent videoViewComponent = this.f71681u;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent.mo71673ae();
            VideoViewComponent videoViewComponent2 = this.f71681u;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107435b();
            VideoViewComponent videoViewComponent3 = this.f71681u;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent3.mo71692b((C34976f) this.f71685y);
            this.f71682v.f74354a = 0;
            if (this.f71671j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f71671j;
                this.f71671j = -1;
                String str2 = "discovery_tab";
                String str3 = this.f71673l;
                String playListType = ((DiscoverPlayListStructV4) mo29309o()).playListType();
                String str4 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
                List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C7525m.m23513g(list);
                    if (aweme != null) {
                        str = aweme.getAid();
                        C26781b.m87974a(str2, str3, playListType, str4, str, currentTimeMillis, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                    }
                }
                str = null;
                C26781b.m87974a(str2, str3, playListType, str4, str, currentTimeMillis, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
            }
            mo69907s();
        }
    }

    /* renamed from: D */
    private final void m89150D() {
        if (this.f71683w && this.f71684x && m89153G()) {
            String str = null;
            if (TextUtils.equals(this.f71673l, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
                String str2 = "discovery_tab";
                String str3 = this.f71673l;
                int i = this.f31526i;
                List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C7525m.m23513g(list);
                    if (aweme != null) {
                        str = aweme.getAid();
                    }
                }
                C26781b.m87967a(str2, str3, i, str, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                return;
            }
            String str4 = "discovery_tab";
            String str5 = this.f71673l;
            String playListType = ((DiscoverPlayListStructV4) mo29309o()).playListType();
            String str6 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
            int i2 = this.f31526i;
            List<Aweme> list2 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list2 != null) {
                Aweme aweme2 = (Aweme) C7525m.m23513g(list2);
                if (aweme2 != null) {
                    str = aweme2.getAid();
                }
            }
            C26781b.m87971a(str4, str5, playListType, str6, i2, str, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        }
    }

    /* renamed from: u */
    public final void mo69909u() {
        Boolean bool;
        Boolean bool2;
        if (m89152F()) {
            KeepSurfaceTextureView p = mo62390p();
            C7573i.m23582a((Object) p, "mSurfaceView");
            p.setVisibility(0);
            VideoViewComponent videoViewComponent = this.f71681u;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            C44962h hVar = videoViewComponent.f115582b;
            Video video = null;
            if (hVar != null) {
                bool = Boolean.valueOf(hVar.mo107459c());
            } else {
                bool = null;
            }
            if (bool != null) {
                VideoViewComponent videoViewComponent2 = this.f71681u;
                if (videoViewComponent2 == null) {
                    C7573i.m23583a("mVideoView");
                }
                C44962h hVar2 = videoViewComponent2.f115582b;
                if (hVar2 != null) {
                    bool2 = Boolean.valueOf(hVar2.mo107459c());
                } else {
                    bool2 = null;
                }
                if (bool2 == null) {
                    C7573i.m23580a();
                }
                if (!bool2.booleanValue()) {
                    this.f71670g = true;
                    return;
                }
            }
            int i = this.f71682v.f74354a;
            if (i == 0) {
                View r = mo69906r();
                C7573i.m23582a((Object) r, "mBgGray");
                r.setVisibility(0);
                VideoViewComponent videoViewComponent3 = this.f71681u;
                if (videoViewComponent3 == null) {
                    C7573i.m23583a("mVideoView");
                }
                videoViewComponent3.mo71663a((C34976f) this.f71685y);
                VideoViewComponent videoViewComponent4 = this.f71681u;
                if (videoViewComponent4 == null) {
                    C7573i.m23583a("mVideoView");
                }
                List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C7525m.m23513g(list);
                    if (aweme != null) {
                        video = aweme.getVideo();
                    }
                }
                videoViewComponent4.mo71661a(video, true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
                VideoViewComponent videoViewComponent5 = this.f71681u;
                if (videoViewComponent5 == null) {
                    C7573i.m23583a("mVideoView");
                }
                videoViewComponent5.mo107431a();
                this.f71670g = false;
                this.f71682v.f74354a = 2;
            } else if (i == 3) {
                m89148B();
                return;
            }
            return;
        }
        KeepSurfaceTextureView p2 = mo62390p();
        C7573i.m23582a((Object) p2, "mSurfaceView");
        p2.setVisibility(8);
    }

    /* renamed from: z */
    private final void m89158z() {
        Aweme aweme;
        Video video;
        int i;
        FrameLayout x = m89156x();
        C7573i.m23582a((Object) x, "mFrameLayout");
        x.getLayoutParams().height = this.f71686z;
        SmartImageView v = m89154v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.getLayoutParams().height = this.f71686z;
        KeepSurfaceTextureView p = mo62390p();
        C7573i.m23582a((Object) p, "mSurfaceView");
        p.getLayoutParams().height = this.f71686z;
        m89147A();
        mo69907s();
        List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
        if (list != null) {
            aweme = (Aweme) C7525m.m23513g(list);
        } else {
            aweme = null;
        }
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            Video video2 = aweme.getVideo();
            C7573i.m23582a((Object) video2, "aweme.video");
            C12133n.m35299a(C23400r.m76741a(video2.getOriginCover())).mo29853b(C43012cg.m136513a(201)).mo29846a(true).mo29845a("DiscoverV4").mo29844a((C12128i) m89154v()).mo29849a((C12112j) new C27197b(this));
        }
        mo69905q().setImageResource(R.drawable.a6d);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        if (C43127fh.m136806a(view.getContext())) {
            DmtTextView w = m89155w();
            C7573i.m23582a((Object) w, "mTvTitle");
            w.setGravity(5);
        }
        DmtTextView w2 = m89155w();
        C7573i.m23582a((Object) w2, "mTvTitle");
        w2.setText(((DiscoverPlayListStructV4) mo29309o()).title);
        DmtTextView w3 = m89155w();
        C7573i.m23582a((Object) w3, "mTvTitle");
        if (!TextUtils.isEmpty(((DiscoverPlayListStructV4) mo29309o()).title)) {
            i = 0;
        } else {
            i = 8;
        }
        w3.setVisibility(i);
        if (((DiscoverPlayListStructV4) mo29309o()).type == 2) {
            m89155w().setTextSize(1, 15.0f);
            DmtTextView w4 = m89155w();
            C7573i.m23582a((Object) w4, "mTvTitle");
            w4.setEllipsize(null);
        } else {
            m89155w().setTextSize(1, 20.0f);
            DmtTextView w5 = m89155w();
            C7573i.m23582a((Object) w5, "mTvTitle");
            w5.setEllipsize(TruncateAt.END);
        }
        if (!TextUtils.equals(this.f71673l, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST()) || this.f31526i >= 3) {
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.awr);
            C7573i.m23582a((Object) dmtTextView, "itemView.htv_tag");
            dmtTextView.setVisibility(8);
            return;
        }
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        DmtTextView dmtTextView2 = (DmtTextView) view3.findViewById(R.id.awr);
        C7573i.m23582a((Object) dmtTextView2, "itemView.htv_tag");
        dmtTextView2.setVisibility(0);
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        DmtTextView dmtTextView3 = (DmtTextView) view4.findViewById(R.id.awr);
        C7573i.m23582a((Object) dmtTextView3, "itemView.htv_tag");
        View view5 = this.itemView;
        C7573i.m23582a((Object) view5, "itemView");
        String string = view5.getContext().getString(R.string.asg);
        C7573i.m23582a((Object) string, "itemView.context.getString(R.string.discover_top)");
        String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f31526i + 1)}, 1));
        C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
        dmtTextView3.setText(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29209a(DiscoverPlayListStructV4 discoverPlayListStructV4) {
        C7573i.m23587b(discoverPlayListStructV4, "item");
        this.f71683w = true;
        m89158z();
    }

    public void onClick(View view) {
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        String str3 = null;
        if (TextUtils.equals(this.f71673l, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            String str4 = "discovery_tab";
            String str5 = this.f71673l;
            List<Aweme> list = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str2 = aweme.getAid();
                    C26781b.m87968a(str4, str5, str2, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                }
            }
            str2 = null;
            C26781b.m87968a(str4, str5, str2, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        } else {
            String str6 = "discovery_tab";
            String str7 = this.f71673l;
            String playListType = ((DiscoverPlayListStructV4) mo29309o()).playListType();
            String str8 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
            List<Aweme> list2 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
            if (list2 != null) {
                Aweme aweme2 = (Aweme) C7525m.m23513g(list2);
                if (aweme2 != null) {
                    str = aweme2.getAid();
                    C26781b.m87973a(str6, str7, playListType, str8, str, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87973a(str6, str7, playListType, str8, str, this.f31526i, ((DiscoverPlayListStructV4) mo29309o()).logPb);
        }
        if (C23764b.m77913a(((DiscoverPlayListStructV4) mo29309o()).refUrl)) {
            C7195s a = C7195s.m22438a();
            C7573i.m23582a((Object) a, "RouterManager.getInstance()");
            a.f20133a.mo93887c("use_webview_title");
            C7195s.m22438a().mo18683a(((DiscoverPlayListStructV4) mo29309o()).refUrl, C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("use_webview_title", "true"), C7579l.m23633a("title", " ")}));
            return;
        }
        String str9 = this.f71674m;
        if (TextUtils.equals(this.f71673l, DiscoverV4PlayListDataCenter.Companion.getDISCOVER_PLAYLIST()) && ((DiscoverPlayListStructV4) mo29309o()).type != 2) {
            str9 = ((DiscoverPlayListStructV4) mo29309o()).title;
            if (str9 == null) {
                str9 = this.f71674m;
            }
        }
        String str10 = str9;
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context = view2.getContext();
        int i = ((DiscoverPlayListStructV4) mo29309o()).type;
        String str11 = ((DiscoverPlayListStructV4) mo29309o()).cellID;
        List<Aweme> list3 = ((DiscoverPlayListStructV4) mo29309o()).awemes;
        if (list3 != null) {
            Aweme aweme3 = (Aweme) C7525m.m23513g(list3);
            if (aweme3 != null) {
                str3 = aweme3.getAid();
            }
        }
        DiscoverDetailActivity.m86687a(context, i, str11, str3, this.f31526i, this.f71673l, str10);
    }

    /* renamed from: a */
    public final void mo69947a(boolean z, boolean z2) {
        if (!z) {
            m89150D();
            if (z2) {
                mo69909u();
            }
        } else {
            m89149C();
        }
    }

    public DiscoverV4PlayListViewHolder(ViewGroup viewGroup, int i, String str, String str2) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "tabText");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.um, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_v4_video, parent, false)");
        super(inflate);
        this.f71686z = i;
        this.f71673l = str;
        this.f71674m = str2;
    }
}
