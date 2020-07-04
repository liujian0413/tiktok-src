package com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder;

import android.graphics.drawable.Animatable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverHollowTextView;
import com.p280ss.android.ugc.aweme.discover.p1187v3.p1188ui.C27122a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1878b.C47891a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder */
public final class DiscoveryV3PlaylistViewHolder extends JediSimpleViewHolder<DiscoveryCellStructV3> implements OnClickListener, C27122a {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f71523f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mIvCover", "getMIvCover()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mTvTitle", "getMTvTitle()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mSurfaceView", "getMSurfaceView()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mBgView", "getMBgView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mIvMask", "getMIvMask()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mFrameLayout", "getMFrameLayout()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mHtvTag", "getMHtvTag()Lcom/ss/android/ugc/aweme/discover/ui/DiscoverHollowTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DiscoveryV3PlaylistViewHolder.class), "mBgGray", "getMBgGray()Landroid/view/View;"))};

    /* renamed from: l */
    public static final C27127a f71524l = new C27127a(null);

    /* renamed from: g */
    public boolean f71525g;

    /* renamed from: j */
    public long f71526j = -1;

    /* renamed from: k */
    public boolean f71527k;

    /* renamed from: m */
    private final C7541d f71528m = C7546e.m23569a(new C27134h(this));

    /* renamed from: n */
    private final C7541d f71529n = C7546e.m23569a(new C27138l(this));

    /* renamed from: o */
    private final C7541d f71530o = C7546e.m23569a(new C27137k(this));

    /* renamed from: p */
    private final C7541d f71531p = C7546e.m23569a(new C27131e(this));

    /* renamed from: q */
    private final C7541d f71532q = C7546e.m23569a(new C27135i(this));

    /* renamed from: r */
    private final C7541d f71533r = C7546e.m23569a(new C27132f(this));

    /* renamed from: s */
    private final C7541d f71534s = C7546e.m23569a(new C27133g(this));

    /* renamed from: t */
    private final C7541d f71535t = C7546e.m23569a(new C27130d(this));

    /* renamed from: u */
    private VideoViewComponent f71536u;

    /* renamed from: v */
    private final C28228a f71537v = new C28228a();

    /* renamed from: w */
    private boolean f71538w;

    /* renamed from: x */
    private boolean f71539x;

    /* renamed from: y */
    private C27136j f71540y = new C27136j(this);

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$a */
    public static final class C27127a {
        private C27127a() {
        }

        public /* synthetic */ C27127a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$b */
    public static final class C27128b extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71541a;

        C27128b(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71541a = discoveryV3PlaylistViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            this.f71541a.mo69905q().setImageResource(R.drawable.a6c);
            if (this.f71541a.f71527k) {
                View p = this.f71541a.mo62390p();
                C7573i.m23582a((Object) p, "mBgView");
                p.setVisibility(0);
                return;
            }
            View p2 = this.f71541a.mo62390p();
            C7573i.m23582a((Object) p2, "mBgView");
            p2.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$c */
    public static final class C27129c implements C44963i {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71542a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C27129c(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71542a = discoveryV3PlaylistViewHolder;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f71542a.f71525g) {
                this.f71542a.f71525g = false;
                this.f71542a.mo69909u();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$d */
    static final class C27130d extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71543a;

        C27130d(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71543a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View view = this.f71543a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return view.findViewById(R.id.lt);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$e */
    static final class C27131e extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71544a;

        C27131e(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71544a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            View view = this.f71544a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return view.findViewById(R.id.lm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$f */
    static final class C27132f extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71545a;

        C27132f(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71545a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            View view = this.f71545a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (FrameLayout) view.findViewById(R.id.am3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$g */
    static final class C27133g extends Lambda implements C7561a<DiscoverHollowTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71546a;

        C27133g(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71546a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DiscoverHollowTextView invoke() {
            View view = this.f71546a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (DiscoverHollowTextView) view.findViewById(R.id.awr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$h */
    static final class C27134h extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71547a;

        C27134h(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71547a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            View view = this.f71547a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (RemoteImageView) view.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$i */
    static final class C27135i extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71548a;

        C27135i(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71548a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            View view = this.f71548a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (ImageView) view.findViewById(R.id.ba3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$j */
    public static final class C27136j extends C43200c {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71549a;

        C27136j(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71549a = discoveryV3PlaylistViewHolder;
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
            this.f71549a.mo69907s();
        }

        /* renamed from: e */
        public final void mo64953e(String str) {
            String str2;
            super.mo64953e(str);
            String str3 = "discovery";
            String playListType = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).getPlayListType();
            String str4 = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).cellID;
            List<Aweme> list = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str2 = aweme.getAid();
                    C26781b.m87986c(str3, playListType, str4, str2, this.f71549a.f31526i + 1, ((DiscoveryCellStructV3) this.f71549a.mo29309o()).logPb);
                }
            }
            str2 = null;
            C26781b.m87986c(str3, playListType, str4, str2, this.f71549a.f31526i + 1, ((DiscoveryCellStructV3) this.f71549a.mo29309o()).logPb);
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            String str;
            super.mo63045a(eVar);
            this.f71549a.mo69905q().setImageResource(R.drawable.a6c);
            this.f71549a.mo69908t();
            View r = this.f71549a.mo69906r();
            C7573i.m23582a((Object) r, "mBgGray");
            r.setVisibility(8);
            this.f71549a.f71526j = System.currentTimeMillis();
            if (this.f71549a.f71527k) {
                View p = this.f71549a.mo62390p();
                C7573i.m23582a((Object) p, "mBgView");
                p.setVisibility(0);
            } else {
                View p2 = this.f71549a.mo62390p();
                C7573i.m23582a((Object) p2, "mBgView");
                p2.setVisibility(4);
            }
            String str2 = "discovery";
            String playListType = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).getPlayListType();
            String str3 = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).cellID;
            List<Aweme> list = ((DiscoveryCellStructV3) this.f71549a.mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C26781b.m87982b(str2, playListType, str3, str, this.f71549a.f31526i + 1, ((DiscoveryCellStructV3) this.f71549a.mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87982b(str2, playListType, str3, str, this.f71549a.f31526i + 1, ((DiscoveryCellStructV3) this.f71549a.mo29309o()).logPb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$k */
    static final class C27137k extends Lambda implements C7561a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71550a;

        C27137k(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71550a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public KeepSurfaceTextureView invoke() {
            View view = this.f71550a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            return (KeepSurfaceTextureView) view.findViewById(R.id.dij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$l */
    static final class C27138l extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryV3PlaylistViewHolder f71551a;

        C27138l(DiscoveryV3PlaylistViewHolder discoveryV3PlaylistViewHolder) {
            this.f71551a = discoveryV3PlaylistViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            View view = this.f71551a.itemView;
            C7573i.m23582a((Object) view, "itemView");
            DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.e3f);
            dmtTextView.setFontType(C10834d.f29332b);
            return dmtTextView;
        }
    }

    /* renamed from: v */
    private final RemoteImageView m88975v() {
        return (RemoteImageView) this.f71528m.getValue();
    }

    /* renamed from: w */
    private final DmtTextView m88976w() {
        return (DmtTextView) this.f71529n.getValue();
    }

    /* renamed from: x */
    private final KeepSurfaceTextureView m88977x() {
        return (KeepSurfaceTextureView) this.f71530o.getValue();
    }

    /* renamed from: y */
    private final FrameLayout m88978y() {
        return (FrameLayout) this.f71533r.getValue();
    }

    /* renamed from: z */
    private final DiscoverHollowTextView m88979z() {
        return (DiscoverHollowTextView) this.f71534s.getValue();
    }

    /* renamed from: k */
    public final void mo29224k() {
        super.mo29224k();
    }

    /* renamed from: p */
    public final View mo62390p() {
        return (View) this.f71531p.getValue();
    }

    /* renamed from: q */
    public final ImageView mo69905q() {
        return (ImageView) this.f71532q.getValue();
    }

    /* renamed from: r */
    public final View mo69906r() {
        return (View) this.f71535t.getValue();
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
        this.f71539x = false;
    }

    /* renamed from: l */
    public final void mo29225l() {
        super.mo29225l();
        m88972H();
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        this.itemView.setOnClickListener(this);
        m88965A();
    }

    /* renamed from: s */
    public final void mo69907s() {
        RemoteImageView v = m88975v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.setVisibility(0);
    }

    /* renamed from: t */
    public final void mo69908t() {
        RemoteImageView v = m88975v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        this.f71539x = true;
        m88973I();
        if (this.f71538w) {
            m88971G();
        }
    }

    /* renamed from: A */
    private final void m88965A() {
        this.f71536u = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f71536u;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent.mo107433a(m88977x());
        VideoViewComponent videoViewComponent2 = this.f71536u;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent2.mo107434a((C44963i) new C27129c(this));
    }

    /* renamed from: B */
    private final void m88966B() {
        Aweme aweme;
        View p = mo62390p();
        C7573i.m23582a((Object) p, "mBgView");
        p.setVisibility(4);
        C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
        if (C7213d.m22501aV() == 2) {
            m88967C();
            m88968D();
        }
        DmtTextView w = m88976w();
        C7573i.m23582a((Object) w, "mTvTitle");
        w.setText(((DiscoveryCellStructV3) mo29309o()).title);
        mo69907s();
        List<Aweme> list = ((DiscoveryCellStructV3) mo29309o()).awemes;
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
            RemoteImageView v = m88975v();
            Video video2 = aweme.getVideo();
            C7573i.m23582a((Object) video2, "aweme.video");
            C23323e.m76509a(v, video2.getOriginCover(), (C13401d<C13648f>) new C27128b<C13648f>(this));
        }
        mo69905q().setImageResource(R.drawable.a6d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88971G() {
        /*
            r2 = this;
            r0 = 0
            r2.f71525g = r0
            com.ss.android.ugc.aweme.feed.b.a r0 = r2.f71537v
            int r0 = r0.f74354a
            if (r0 == 0) goto L_0x0043
            r1 = 3
            if (r0 == r1) goto L_0x000d
            goto L_0x0046
        L_0x000d:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f71536u
            if (r0 != 0) goto L_0x0016
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0016:
            java.lang.Object r1 = r2.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
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
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r2.f71536u
            if (r0 != 0) goto L_0x003a
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x003a:
            r0.mo107431a()
            com.ss.android.ugc.aweme.feed.b.a r0 = r2.f71537v
            r1 = 4
            r0.f74354a = r1
            return
        L_0x0043:
            r2.mo69909u()
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3PlaylistViewHolder.m88971G():void");
    }

    /* renamed from: I */
    private final void m88973I() {
        String str;
        if (this.f71538w && this.f71539x) {
            String str2 = "discovery";
            String playListType = ((DiscoveryCellStructV3) mo29309o()).getPlayListType();
            String str3 = ((DiscoveryCellStructV3) mo29309o()).cellID;
            int i = this.f31526i + 1;
            List<Aweme> list = ((DiscoveryCellStructV3) mo29309o()).awemes;
            if (list != null) {
                Aweme aweme = (Aweme) C7525m.m23513g(list);
                if (aweme != null) {
                    str = aweme.getAid();
                    C26781b.m87969a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo29309o()).logPb);
                }
            }
            str = null;
            C26781b.m87969a(str2, playListType, str3, i, str, ((DiscoveryCellStructV3) mo29309o()).logPb);
        }
    }

    public final void bA_() {
        this.f71538w = false;
        this.f71539x = false;
        RemoteImageView v = m88975v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.getLayoutParams().height = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        KeepSurfaceTextureView x = m88977x();
        C7573i.m23582a((Object) x, "mSurfaceView");
        x.getLayoutParams().height = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        FrameLayout y = m88978y();
        C7573i.m23582a((Object) y, "mFrameLayout");
        y.getLayoutParams().height = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
        if (C7213d.m22501aV() == 2) {
            View p = mo62390p();
            C7573i.m23582a((Object) p, "mBgView");
            p.getLayoutParams().height = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        }
        super.bA_();
    }

    /* renamed from: u */
    public final void mo69909u() {
        C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
        if (C7213d.m22501aV() == 2) {
            if (this.f31526i % 4 == 1 || this.f31526i % 4 == 2) {
                KeepSurfaceTextureView x = m88977x();
                C7573i.m23582a((Object) x, "mSurfaceView");
                x.setVisibility(0);
                View r = mo69906r();
                C7573i.m23582a((Object) r, "mBgGray");
                r.setVisibility(0);
            } else {
                View r2 = mo69906r();
                C7573i.m23582a((Object) r2, "mBgGray");
                r2.setVisibility(8);
                KeepSurfaceTextureView x2 = m88977x();
                C7573i.m23582a((Object) x2, "mSurfaceView");
                x2.setVisibility(8);
                return;
            }
        }
        m88970F();
    }

    /* renamed from: C */
    private final void m88967C() {
        Aweme aweme;
        int i = ((DiscoveryCellStructV3) mo29309o()).displayWidth;
        int i2 = ((DiscoveryCellStructV3) mo29309o()).displayHeight;
        List<Aweme> list = ((DiscoveryCellStructV3) mo29309o()).awemes;
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
            float height = (float) video.getHeight();
            float f = width / height;
            if (f >= 0.75f || f <= 0.5625f) {
                i2 = C47891a.m148821a((((float) i) / width) * height);
            } else {
                i = C47891a.m148821a((((float) i2) / height) * width);
            }
        }
        RemoteImageView v = m88975v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.getLayoutParams().width = i;
        RemoteImageView v2 = m88975v();
        C7573i.m23582a((Object) v2, "mIvCover");
        v2.getLayoutParams().height = i2;
        KeepSurfaceTextureView x = m88977x();
        C7573i.m23582a((Object) x, "mSurfaceView");
        x.getLayoutParams().width = i;
        KeepSurfaceTextureView x2 = m88977x();
        C7573i.m23582a((Object) x2, "mSurfaceView");
        x2.getLayoutParams().height = i2;
        if (i2 < ((DiscoveryCellStructV3) mo29309o()).displayHeight) {
            this.f71527k = true;
            return;
        }
        this.f71527k = false;
        View p = mo62390p();
        C7573i.m23582a((Object) p, "mBgView");
        p.setVisibility(4);
    }

    /* renamed from: D */
    private final void m88968D() {
        DiscoverHollowTextView z = m88979z();
        C7573i.m23582a((Object) z, "mHtvTag");
        z.setVisibility(0);
        m88976w().setTextSize(2, 20.0f);
        if (((DiscoveryCellStructV3) mo29309o()).type == 0 || ((DiscoveryCellStructV3) mo29309o()).type == 3) {
            DiscoverHollowTextView z2 = m88979z();
            C7573i.m23582a((Object) z2, "mHtvTag");
            z2.setVisibility(4);
            m88969E();
        } else if (((DiscoveryCellStructV3) mo29309o()).type != 1) {
            if (((DiscoveryCellStructV3) mo29309o()).type == 4) {
                DiscoverHollowTextView z3 = m88979z();
                C7573i.m23582a((Object) z3, "mHtvTag");
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                z3.setText(view.getContext().getString(R.string.cum));
            } else if (((DiscoveryCellStructV3) mo29309o()).type == 5) {
                DiscoverHollowTextView z4 = m88979z();
                C7573i.m23582a((Object) z4, "mHtvTag");
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                z4.setText(view2.getContext().getString(R.string.dwm));
                m88969E();
            } else {
                DiscoverHollowTextView z5 = m88979z();
                C7573i.m23582a((Object) z5, "mHtvTag");
                View view3 = this.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                z5.setText(view3.getContext().getString(R.string.yd));
            }
        } else {
            return;
        }
        View view4 = this.itemView;
        C7573i.m23582a((Object) view4, "itemView");
        if (C43127fh.m136806a(view4.getContext())) {
            DmtTextView w = m88976w();
            C7573i.m23582a((Object) w, "mTvTitle");
            w.setGravity(5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88970F() {
        /*
            r9 = this;
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f71536u
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            com.ss.android.ugc.playerkit.videoview.h r0 = r0.f115582b
            java.lang.String r1 = "mVideoView.surfaceHolder"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.mo107459c()
            r1 = 1
            if (r0 != 0) goto L_0x001a
            r9.f71525g = r1
            return
        L_0x001a:
            com.ss.android.ugc.aweme.feed.b.a r0 = r9.f71537v
            int r0 = r0.f74354a
            if (r0 == 0) goto L_0x0028
            r1 = 3
            if (r0 == r1) goto L_0x0024
            goto L_0x0088
        L_0x0024:
            r9.m88971G()
            return
        L_0x0028:
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f71536u
            if (r0 != 0) goto L_0x0031
            java.lang.String r2 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0031:
            com.ss.android.ugc.aweme.discover.v3.viewholder.DiscoveryV3PlaylistViewHolder$j r2 = r9.f71540y
            com.ss.android.ugc.aweme.player.sdk.api.f r2 = (com.p280ss.android.ugc.aweme.player.sdk.api.C34976f) r2
            r0.mo71663a(r2)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f71536u
            if (r0 != 0) goto L_0x0041
            java.lang.String r2 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0041:
            java.lang.Object r2 = r9.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = kotlin.collections.C7525m.m23513g(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment> r4 = com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment.class
            r5 = 1
            java.lang.String r6 = "decoder_type"
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r7 = r7.mo15295d()
            int r7 = r7.decoder_type
            r8 = 0
            int r3 = r3.mo15287a(r4, r5, r6, r7, r8)
            r0.mo71661a(r2, r1, r3)
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = r9.f71536u
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "mVideoView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x007d:
            r0.mo107431a()
            r0 = 0
            r9.f71525g = r0
            com.ss.android.ugc.aweme.feed.b.a r0 = r9.f71537v
            r1 = 2
            r0.f74354a = r1
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3PlaylistViewHolder.m88970F():void");
    }

    /* renamed from: H */
    private final void m88972H() {
        String str;
        this.f71525g = false;
        if (this.f71537v.f74354a != 0) {
            VideoViewComponent videoViewComponent = this.f71536u;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent.mo71673ae();
            VideoViewComponent videoViewComponent2 = this.f71536u;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107435b();
            VideoViewComponent videoViewComponent3 = this.f71536u;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent3.mo71692b((C34976f) this.f71540y);
            this.f71537v.f74354a = 0;
            if (this.f71526j > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f71526j;
                this.f71526j = -1;
                String str2 = "discovery";
                String playListType = ((DiscoveryCellStructV3) mo29309o()).getPlayListType();
                String str3 = ((DiscoveryCellStructV3) mo29309o()).cellID;
                List<Aweme> list = ((DiscoveryCellStructV3) mo29309o()).awemes;
                if (list != null) {
                    Aweme aweme = (Aweme) C7525m.m23513g(list);
                    if (aweme != null) {
                        str = aweme.getAid();
                        C26781b.m87972a(str2, playListType, str3, str, currentTimeMillis, this.f31526i + 1, ((DiscoveryCellStructV3) mo29309o()).logPb);
                    }
                }
                str = null;
                C26781b.m87972a(str2, playListType, str3, str, currentTimeMillis, this.f31526i + 1, ((DiscoveryCellStructV3) mo29309o()).logPb);
            }
            mo69907s();
        }
    }

    /* renamed from: E */
    private final void m88969E() {
        if (C23764b.m77913a(((DiscoveryCellStructV3) mo29309o()).title)) {
            float f = (float) ((DiscoveryCellStructV3) mo29309o()).displayWidth;
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            float b = f - C9738o.m28708b(view.getContext(), 30.0f);
            DmtTextView w = m88976w();
            C7573i.m23582a((Object) w, "mTvTitle");
            TextPaint paint = w.getPaint();
            m88976w().setTextSize(2, 20.0f);
            C7573i.m23582a((Object) paint, "paint");
            View view2 = this.itemView;
            C7573i.m23582a((Object) view2, "itemView");
            paint.setTextSize(C9738o.m28690a(view2.getContext(), 20.0f));
            if (paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) <= b) {
                m88976w().setTextSize(2, 20.0f);
            } else if (paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) <= b || paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) > b * 2.0f) {
                float f2 = 2.0f * b;
                if (paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) <= f2 || paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) > b * 3.0f) {
                    m88976w().setTextSize(2, 17.0f);
                } else {
                    View view3 = this.itemView;
                    C7573i.m23582a((Object) view3, "itemView");
                    paint.setTextSize(C9738o.m28690a(view3.getContext(), 17.0f));
                    if (paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) > f2) {
                        m88976w().setTextSize(2, 20.0f);
                    } else {
                        m88976w().setTextSize(2, 17.0f);
                    }
                }
            } else {
                View view4 = this.itemView;
                C7573i.m23582a((Object) view4, "itemView");
                paint.setTextSize(C9738o.m28690a(view4.getContext(), 17.0f));
                if (paint.measureText(((DiscoveryCellStructV3) mo29309o()).title) > b) {
                    m88976w().setTextSize(2, 20.0f);
                } else {
                    m88976w().setTextSize(2, 17.0f);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo69902a(boolean z) {
        if (!z) {
            m88973I();
            if (this.f71538w) {
                m88971G();
            }
        } else if (this.f71538w) {
            m88972H();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(DiscoveryCellStructV3 discoveryCellStructV3) {
        C7573i.m23587b(discoveryCellStructV3, "item");
        this.f71538w = true;
        RemoteImageView v = m88975v();
        C7573i.m23582a((Object) v, "mIvCover");
        v.getLayoutParams().height = discoveryCellStructV3.displayHeight;
        FrameLayout y = m88978y();
        C7573i.m23582a((Object) y, "mFrameLayout");
        y.getLayoutParams().height = discoveryCellStructV3.displayHeight;
        m88966B();
        mo69909u();
        m88973I();
    }

    public DiscoveryV3PlaylistViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.us, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_v3_video, parent, false)");
        super(inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r9)
            java.lang.String r0 = "discovery"
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r1 = r9.getPlayListType()
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r2 = r9.cellID
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r9 = r9.awemes
            r6 = 0
            if (r9 == 0) goto L_0x0030
            java.lang.Object r9 = kotlin.collections.C7525m.m23513g(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r9
            if (r9 == 0) goto L_0x0030
            java.lang.String r9 = r9.getAid()
            r3 = r9
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            int r9 = r8.f31526i
            r7 = 1
            int r4 = r9 + 1
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            com.ss.android.ugc.aweme.feed.model.LogPbBean r5 = r9.logPb
            com.p280ss.android.ugc.aweme.discover.mob.C26781b.m87970a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.setting.d r9 = com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            int r9 = com.p280ss.android.ugc.aweme.setting.C7213d.m22501aV()
            r0 = 2
            if (r9 != r0) goto L_0x00a5
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            int r9 = r9.type
            r1 = 5
            if (r9 != r1) goto L_0x00a5
            java.lang.Object r9 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r9 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r9
            java.lang.String r9 = r9.refUrl
            boolean r9 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r9)
            if (r9 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.router.s r9 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r1 = "RouterManager.getInstance()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)
            com.ss.android.ugc.aweme.router.q r9 = r9.f20133a
            java.lang.String r1 = "use_webview_title"
            r9.mo93887c(r1)
            com.ss.android.ugc.aweme.router.s r9 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.Object r1 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.refUrl
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r2 = 0
            java.lang.String r3 = "use_webview_title"
            java.lang.String r4 = "true"
            kotlin.Pair r3 = kotlin.C7579l.m23633a(r3, r4)
            r0[r2] = r3
            java.lang.String r2 = "title"
            java.lang.String r3 = " "
            kotlin.Pair r2 = kotlin.C7579l.m23633a(r2, r3)
            r0[r7] = r2
            java.util.HashMap r0 = kotlin.collections.C7507ae.m23401c((kotlin.Pair<? extends K, ? extends V>[]) r0)
            r9.mo18683a(r1, r0)
            return
        L_0x00a5:
            android.view.View r9 = r8.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r9, r0)
            android.content.Context r9 = r9.getContext()
            java.lang.Object r0 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r0 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r0
            int r0 = r0.type
            java.lang.Object r1 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r1 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r1
            java.lang.String r1 = r1.cellID
            java.lang.Object r2 = r8.mo29309o()
            com.ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3 r2 = (com.p280ss.android.ugc.aweme.discover.model.DiscoveryCellStructV3) r2
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.awemes
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = kotlin.collections.C7525m.m23513g(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 == 0) goto L_0x00d6
            java.lang.String r6 = r2.getAid()
        L_0x00d6:
            int r2 = r8.f31526i
            com.p280ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity.m86686a(r9, r0, r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1187v3.viewholder.DiscoveryV3PlaylistViewHolder.onClick(android.view.View):void");
    }
}
