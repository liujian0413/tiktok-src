package com.p280ss.android.ugc.aweme.feed.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageWithVerify;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.p1142c.C25664e;
import com.p280ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.p280ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.C28367c;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28228a;
import com.p280ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36675j;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RemarkEditDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.util.C36748p;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.p280ss.android.ugc.aweme.utils.UserVerify;
import com.p280ss.android.ugc.aweme.video.C43200c;
import com.p280ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p280ss.android.ugc.playerkit.model.C44919c;
import com.p280ss.android.ugc.playerkit.model.C44921e;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.C44963i;
import com.p280ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1878b.C47891a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder */
public final class SuperRecommendViewHolder extends C1293v implements OnClickListener, C28367c, C36040n {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f74037a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "realName", "getRealName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "avatar", "getAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageWithVerify;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "close", "getClose()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "follow", "getFollow()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "text", "getText()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "image", "getImage()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SuperRecommendViewHolder.class), "mSurface", "getMSurface()Lcom/ss/android/ugc/playerkit/videoview/KeepSurfaceTextureView;"))};

    /* renamed from: b */
    public C36630b f74038b;

    /* renamed from: c */
    public C25664e<SuperRecommendViewHolder> f74039c;

    /* renamed from: d */
    public VideoViewComponent f74040d;

    /* renamed from: e */
    public boolean f74041e;

    /* renamed from: f */
    public boolean f74042f;

    /* renamed from: g */
    public Video f74043g;

    /* renamed from: h */
    public UserWithAweme f74044h;

    /* renamed from: i */
    public final C28083a f74045i;

    /* renamed from: j */
    public final C28084b f74046j;

    /* renamed from: k */
    public GalleryLayoutManager f74047k;

    /* renamed from: l */
    private final int f74048l;

    /* renamed from: m */
    private final int f74049m;

    /* renamed from: n */
    private final C7541d f74050n;

    /* renamed from: o */
    private final C7541d f74051o;

    /* renamed from: p */
    private final C7541d f74052p;

    /* renamed from: q */
    private final C7541d f74053q;

    /* renamed from: r */
    private final C7541d f74054r;

    /* renamed from: s */
    private final C7541d f74055s;

    /* renamed from: t */
    private final C7541d f74056t;

    /* renamed from: u */
    private final C28228a f74057u = new C28228a();

    /* renamed from: v */
    private C36031j f74058v = new C36031j();

    /* renamed from: w */
    private final C28092j f74059w = new C28092j(this);

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$a */
    public interface C28083a {
        /* renamed from: a */
        void mo71611a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$b */
    public interface C28084b {
        /* renamed from: b */
        void mo71614b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$c */
    static final class C28085c extends Lambda implements C7561a<AvatarImageWithVerify> {

        /* renamed from: a */
        final /* synthetic */ View f74063a;

        C28085c(View view) {
            this.f74063a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AvatarImageWithVerify invoke() {
            return (AvatarImageWithVerify) this.f74063a.findViewById(R.id.ic);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$d */
    static final class C28086d extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ View f74064a;

        C28086d(View view) {
            this.f74064a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f74064a.findViewById(R.id.x_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$e */
    static final class C28087e extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f74065a;

        C28087e(View view) {
            this.f74065a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f74065a.findViewById(R.id.anj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$f */
    static final class C28088f implements C23305g {

        /* renamed from: a */
        final /* synthetic */ SuperRecommendViewHolder f74066a;

        C28088f(SuperRecommendViewHolder superRecommendViewHolder) {
            this.f74066a = superRecommendViewHolder;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            this.f74066a.mo71624g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$g */
    public static final class C28089g implements AnimationListener {

        /* renamed from: a */
        final /* synthetic */ SuperRecommendViewHolder f74067a;

        public final void onAnimationRepeat(Animation animation) {
            C7573i.m23587b(animation, "animation");
        }

        public final void onAnimationStart(Animation animation) {
            C7573i.m23587b(animation, "animation");
        }

        C28089g(SuperRecommendViewHolder superRecommendViewHolder) {
            this.f74067a = superRecommendViewHolder;
        }

        public final void onAnimationEnd(Animation animation) {
            C7573i.m23587b(animation, "animation");
            this.f74067a.mo71615a().setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$h */
    static final class C28090h extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ View f74068a;

        C28090h(View view) {
            this.f74068a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f74068a.findViewById(R.id.b7x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$i */
    public static final class C28091i implements C44963i {

        /* renamed from: a */
        final /* synthetic */ SuperRecommendViewHolder f74069a;

        public final void aA_() {
        }

        /* renamed from: b */
        public final void mo63039b(int i, int i2) {
        }

        C28091i(SuperRecommendViewHolder superRecommendViewHolder) {
            this.f74069a = superRecommendViewHolder;
        }

        /* renamed from: a */
        public final void mo63037a(int i, int i2) {
            if (this.f74069a.f74042f) {
                this.f74069a.f74042f = false;
                this.f74069a.mo71622e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$j */
    public static final class C28092j extends C43200c {

        /* renamed from: a */
        final /* synthetic */ SuperRecommendViewHolder f74070a;

        C28092j(SuperRecommendViewHolder superRecommendViewHolder) {
            this.f74070a = superRecommendViewHolder;
        }

        /* renamed from: a */
        public final void mo63043a(C44919c cVar) {
            super.mo63043a(cVar);
            this.f74070a.mo71615a().setVisibility(0);
        }

        /* renamed from: a */
        public final void mo63045a(C44921e eVar) {
            super.mo63045a(eVar);
            this.f74070a.f74041e = true;
            this.f74070a.mo71621d();
            if (this.f74070a.getAdapterPosition() != this.f74070a.f74047k.f74738a) {
                this.f74070a.mo71619b().mo71672ad();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$k */
    static final class C28093k extends Lambda implements C7561a<KeepSurfaceTextureView> {

        /* renamed from: a */
        final /* synthetic */ View f74071a;

        C28093k(View view) {
            this.f74071a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public KeepSurfaceTextureView invoke() {
            return (KeepSurfaceTextureView) this.f74071a.findViewById(R.id.dij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$l */
    static final class C28094l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SuperRecommendViewHolder f74072a;

        C28094l(SuperRecommendViewHolder superRecommendViewHolder) {
            this.f74072a = superRecommendViewHolder;
        }

        public final void run() {
            this.f74072a.mo71624g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$m */
    static final class C28095m implements C36675j {

        /* renamed from: a */
        final /* synthetic */ UserWithAweme f74073a;

        /* renamed from: b */
        final /* synthetic */ SuperRecommendViewHolder f74074b;

        /* renamed from: c */
        final /* synthetic */ FollowStatus f74075c;

        C28095m(UserWithAweme userWithAweme, SuperRecommendViewHolder superRecommendViewHolder, FollowStatus followStatus) {
            this.f74073a = userWithAweme;
            this.f74074b = superRecommendViewHolder;
            this.f74075c = followStatus;
        }

        /* renamed from: a */
        public final void mo71634a() {
            this.f74074b.mo71617a(this.f74073a.getUser());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$n */
    static final class C28096n extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f74076a;

        C28096n(View view) {
            this.f74076a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f74076a.findViewById(R.id.coj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$o */
    static final class C28097o extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ View f74077a;

        C28097o(View view) {
            this.f74077a = view;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f74077a.findViewById(R.id.e9m);
        }
    }

    /* renamed from: i */
    private DmtTextView m91969i() {
        return (DmtTextView) this.f74050n.getValue();
    }

    /* renamed from: j */
    private AvatarImageWithVerify m91970j() {
        return (AvatarImageWithVerify) this.f74051o.getValue();
    }

    /* renamed from: k */
    private ImageView m91971k() {
        return (ImageView) this.f74052p.getValue();
    }

    /* renamed from: l */
    private DmtTextView m91972l() {
        return (DmtTextView) this.f74053q.getValue();
    }

    /* renamed from: m */
    private DmtTextView m91973m() {
        return (DmtTextView) this.f74054r.getValue();
    }

    /* renamed from: n */
    private KeepSurfaceTextureView m91974n() {
        return (KeepSurfaceTextureView) this.f74056t.getValue();
    }

    /* renamed from: a */
    public final RemoteImageView mo71615a() {
        return (RemoteImageView) this.f74055s.getValue();
    }

    /* renamed from: h */
    public final void mo71625h() {
        m91978r();
    }

    /* renamed from: b */
    public final VideoViewComponent mo71619b() {
        VideoViewComponent videoViewComponent = this.f74040d;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        return videoViewComponent;
    }

    /* renamed from: c */
    public final void mo71620c() {
        mo71615a().setVisibility(0);
    }

    /* renamed from: p */
    private final void m91976p() {
        this.f74040d = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f74040d;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent.mo107433a(m91974n());
        VideoViewComponent videoViewComponent2 = this.f74040d;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoView");
        }
        videoViewComponent2.f115582b.mo107455a((C44963i) new C28091i(this));
    }

    /* renamed from: q */
    private final void m91977q() {
        int i = this.f74057u.f74354a;
        if (i == 0) {
            mo71622e();
        } else if (i == 3) {
            mo71621d();
            VideoViewComponent videoViewComponent = this.f74040d;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent.mo71660a(this.f74043g);
            this.f74057u.f74354a = 4;
        }
    }

    /* renamed from: d */
    public final void mo71621d() {
        if (this.f74041e && mo71615a().getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(500);
            alphaAnimation.setAnimationListener(new C28089g(this));
            mo71615a().startAnimation(alphaAnimation);
        }
    }

    /* renamed from: f */
    public final void mo71623f() {
        this.f74042f = false;
        if (this.f74057u.f74354a != 0) {
            VideoViewComponent videoViewComponent = this.f74040d;
            if (videoViewComponent == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent.mo71673ae();
            VideoViewComponent videoViewComponent2 = this.f74040d;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo107435b();
            VideoViewComponent videoViewComponent3 = this.f74040d;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent3.mo71692b((C34976f) this.f74059w);
            this.f74057u.f74354a = 0;
            mo71620c();
        }
    }

    /* renamed from: o */
    private final void m91975o() {
        int i = this.f74048l;
        int i2 = this.f74049m;
        Video video = this.f74043g;
        if (video != null) {
            i2 = C47891a.m148821a((((float) i) / ((float) video.getWidth())) * ((float) video.getHeight()));
        }
        mo71615a().getLayoutParams().width = i;
        mo71615a().getLayoutParams().height = i2;
        m91974n().getLayoutParams().width = i;
        m91974n().getLayoutParams().height = i2;
    }

    /* renamed from: r */
    private final void m91978r() {
        UserWithAweme userWithAweme = this.f74044h;
        if (userWithAweme != null) {
            m91968b(userWithAweme.getUser().getFollowStatus());
            UserVerify userVerify = new UserVerify(userWithAweme.getUser().getAvatarThumb(), userWithAweme.getUser().getCustomVerify(), userWithAweme.getUser().getEnterpriseVerifyReason(), Integer.valueOf(userWithAweme.getUser().getVerificationType()), userWithAweme.getUser().getWeiboVerify());
            m91970j().setUserData(userVerify);
            m91970j().mo60896b();
            mo71617a(userWithAweme.getUser());
        }
    }

    /* renamed from: e */
    public final void mo71622e() {
        VideoViewComponent videoViewComponent = this.f74040d;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoView");
        }
        C44962h hVar = videoViewComponent.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoView.surfaceHolder");
        if (!hVar.mo107459c() || this.f74043g == null) {
            this.f74042f = true;
            return;
        }
        int i = this.f74057u.f74354a;
        if (i == 0) {
            VideoViewComponent videoViewComponent2 = this.f74040d;
            if (videoViewComponent2 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent2.mo71663a((C34976f) this.f74059w);
            VideoViewComponent videoViewComponent3 = this.f74040d;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoView");
            }
            videoViewComponent3.mo71661a(this.f74043g, true, C6384b.m19835a().mo15287a(Get265DecodeTypeExperiment.class, true, "decoder_type", C6384b.m19835a().mo15295d().decoder_type, 0));
            this.f74042f = false;
            this.f74057u.f74354a = 2;
        } else if (i == 3) {
            m91977q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        if (r1 != null) goto L_0x00ab;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71624g() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x0023
            android.app.Activity r0 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$f r4 = new com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$f
            r4.<init>(r5)
            com.ss.android.ugc.aweme.base.component.g r4 = (com.p280ss.android.ugc.aweme.base.component.C23305g) r4
            com.p280ss.android.ugc.aweme.login.C32656f.m105744a(r0, r2, r3, r1, r4)
            return
        L_0x0023:
            com.ss.android.ugc.aweme.friends.model.UserWithAweme r0 = r5.f74044h
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            int r2 = r2.getFollowStatus()
            if (r2 != 0) goto L_0x003a
            com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder$b r2 = r5.f74046j
            int r3 = r5.getAdapterPosition()
            r2.mo71614b(r3)
        L_0x003a:
            android.view.View r2 = r5.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.Context r2 = r2.getContext()
            if (r2 == 0) goto L_0x006e
            android.view.View r2 = r5.itemView
            java.lang.String r3 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.content.Context r2 = r2.getContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L_0x006e
            android.view.View r1 = r5.itemView
            java.lang.String r2 = "itemView"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0066
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x006e
        L_0x0066:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x006e:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            int r2 = r2.getFollowStatus()
            r3 = 0
            r4 = 4
            if (r2 == r4) goto L_0x0097
            switch(r2) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0097;
                case 2: goto L_0x0097;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x0097
        L_0x007e:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            boolean r2 = r2.isSecret()
            r3 = 1
            if (r2 == 0) goto L_0x008b
            r3 = 4
            goto L_0x0097
        L_0x008b:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.getUser()
            int r2 = r2.getFollowerStatus()
            if (r2 != r3) goto L_0x0097
            r2 = 2
            r3 = 2
        L_0x0097:
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getUser()
            int r0 = r0.getFollowStatus()
            if (r0 != r4) goto L_0x00a4
            if (r1 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x00a4:
            if (r3 != r4) goto L_0x00ab
            if (r1 == 0) goto L_0x00ae
            m91967a(r1)
        L_0x00ab:
            r5.m91966a(r3)
        L_0x00ae:
            return
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder.mo71624g():void");
    }

    public final void onFollowFail(Exception exc) {
        if (!C23645b.m77551a(exc)) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            C22814a.m75245a(view.getContext(), exc, R.string.b82);
        }
        UserWithAweme userWithAweme = this.f74044h;
        if (userWithAweme != null) {
            m91968b(userWithAweme.getUser().getFollowStatus());
        }
    }

    /* renamed from: a */
    private final void m91966a(int i) {
        int i2;
        m91968b(i);
        UserWithAweme userWithAweme = this.f74044h;
        if (userWithAweme != null) {
            if (userWithAweme.getUser().getFollowStatus() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f74058v.mo91679a(new C36034a().mo91684a(userWithAweme.getUser().getUid()).mo91686b(userWithAweme.getUser().getSecUid()).mo91682a(i2).mo91688c("homepage_follow").mo91685b(12).mo91689d(userWithAweme.getUser().getFollowerStatus()).mo91681a());
        }
    }

    public final void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        C7573i.m23587b(view, "view");
        int id = view.getId();
        if (id == R.id.x_) {
            UserWithAweme userWithAweme = this.f74044h;
            if (userWithAweme != null) {
                C36630b bVar = this.f74038b;
                if (bVar != null) {
                    bVar.mo72050a(userWithAweme.getUser(), getAdapterPosition());
                }
                this.f74045i.mo71611a(userWithAweme.getUser(), getAdapterPosition());
            }
        } else if (id == R.id.anj) {
            UserWithAweme userWithAweme2 = this.f74044h;
            if (userWithAweme2 != null) {
                C36630b bVar2 = this.f74038b;
                if (bVar2 != null) {
                    bVar2.mo72052c(userWithAweme2.getUser(), getAdapterPosition());
                }
                IIMService g = C30553b.m99810g();
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                Context context = view2.getContext();
                if (userWithAweme2.getUser().getFollowStatus() == 2) {
                    z = true;
                } else {
                    z = false;
                }
                g.wrapperSyncXAlert(context, 2, z, new C28094l(this));
            }
        }
    }

    /* renamed from: a */
    private static void m91967a(Activity activity) {
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl privacyAccountFollowCount = inst.getPrivacyAccountFollowCount();
        C7573i.m23582a((Object) privacyAccountFollowCount, "prefCacheItem");
        Integer num = (Integer) privacyAccountFollowCount.mo59877d();
        if (num != null && num.intValue() == 0) {
            new C10741a(activity).mo25657b((int) R.string.d50).mo25650a((int) R.string.bfm, (DialogInterface.OnClickListener) null).mo25656a().mo25637a();
        } else {
            C7573i.m23582a((Object) num, "followCount");
            int intValue = num.intValue();
            if (1 <= intValue && 3 >= intValue) {
                C10761a.m31409e((Context) activity, (int) R.string.d51).mo25750a();
            }
        }
        privacyAccountFollowCount.mo59871a(Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: b */
    private final void m91968b(int i) {
        m91972l().setVisibility(0);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        Resources resources = context.getResources();
        if (i == 0) {
            m91972l().setText(resources.getText(R.string.b7r));
            m91972l().setBackgroundResource(R.drawable.lv);
            m91972l().setTextColor(resources.getColor(R.color.lt));
        } else if (i == 1 || i == 2) {
            int i2 = R.string.b92;
            if (i == 2) {
                i2 = R.string.aua;
            }
            m91972l().setText(i2);
            m91972l().setTextColor(resources.getColor(R.color.a50));
            m91972l().setBackgroundResource(R.drawable.m8);
        } else {
            if (i == 4) {
                m91972l().setTextColor(resources.getColor(R.color.a50));
                m91972l().setBackgroundResource(R.drawable.m8);
                DmtTextView l = m91972l();
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                l.setText(view2.getContext().getString(R.string.b8v));
            }
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C7573i.m23587b(followStatus, "followStatus");
        UserWithAweme userWithAweme = this.f74044h;
        if (userWithAweme != null && TextUtils.equals(followStatus.userId, userWithAweme.getUser().getUid())) {
            userWithAweme.getUser().setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            UserWithAweme userWithAweme2 = this.f74044h;
            if (userWithAweme2 == null) {
                C7573i.m23580a();
            }
            C42961az.m136380a(new C23661d(i, userWithAweme2));
            m91968b(followStatus.followStatus);
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            if (C36748p.m118458a(view.getContext(), userWithAweme.getUser(), followStatus)) {
                View view2 = this.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(view2.getContext());
                remarkEditDialog.f96236f = userWithAweme.getUser();
                remarkEditDialog.f96237g = followStatus.contactName;
                remarkEditDialog.f96238h = 1;
                remarkEditDialog.f96235e = new C28095m(userWithAweme, this, followStatus);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0 && !TextUtils.isEmpty(userWithAweme.getUser().getRemarkName())) {
                userWithAweme.getUser().setRemarkName("");
                mo71617a(userWithAweme.getUser());
            }
        }
    }

    /* renamed from: a */
    public final void mo71617a(User user) {
        C7573i.m23587b(user, "user");
        m91973m().setText(user.getNickname());
        DmtTextView i = m91969i();
        StringBuilder sb = new StringBuilder("@");
        sb.append(user.getUniqueId());
        i.setText(sb.toString());
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        C43126fg.m136801a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), m91973m());
    }

    /* renamed from: a */
    public final void mo71616a(RecyclerView recyclerView, View view, int i) {
        if (getAdapterPosition() != i) {
            mo71623f();
            return;
        }
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            C25664e<SuperRecommendViewHolder> eVar = this.f74039c;
            if (eVar != null) {
                eVar.mo66550b(this);
            }
            mo71622e();
        }
    }

    /* renamed from: a */
    public final void mo71618a(C36630b bVar, C25664e<SuperRecommendViewHolder> eVar, UserWithAweme userWithAweme, String str) {
        C7573i.m23587b(userWithAweme, "user");
        C7573i.m23587b(str, "requestId");
        this.f74044h = userWithAweme;
        this.f74038b = bVar;
        this.f74039c = eVar;
        this.f74043g = userWithAweme.getAweme().getVideo();
        m91975o();
        mo71615a().setVisibility(0);
        RemoteImageView a = mo71615a();
        Video video = this.f74043g;
        if (video == null) {
            C7573i.m23580a();
        }
        C23323e.m76524b(a, video.getOriginCover());
        m91978r();
    }

    public SuperRecommendViewHolder(final View view, C28083a aVar, C28084b bVar, GalleryLayoutManager galleryLayoutManager) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(aVar, "onItemCloseListener");
        C7573i.m23587b(bVar, "onItemFollowListener");
        C7573i.m23587b(galleryLayoutManager, "mGalleryLayoutManager");
        super(view);
        this.f74045i = aVar;
        this.f74046j = bVar;
        this.f74047k = galleryLayoutManager;
        this.f74048l = (int) C9738o.m28708b(view.getContext(), 279.0f);
        this.f74049m = (int) C9738o.m28708b(view.getContext(), 372.0f);
        this.f74050n = C7546e.m23569a(new C28096n(view));
        this.f74051o = C7546e.m23569a(new C28085c(view));
        this.f74052p = C7546e.m23569a(new C28086d(view));
        this.f74053q = C7546e.m23569a(new C28087e(view));
        this.f74054r = C7546e.m23569a(new C28097o(view));
        this.f74055s = C7546e.m23569a(new C28090h(view));
        this.f74056t = C7546e.m23569a(new C28093k(view));
        view.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ SuperRecommendViewHolder f74060a;

            {
                this.f74060a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                C7573i.m23587b(view, "view");
                this.f74060a.f74047k.mo72057a((C28367c) this.f74060a);
            }

            public final void onViewDetachedFromWindow(View view) {
                C7573i.m23587b(view, "view");
                this.f74060a.mo71623f();
                this.f74060a.f74047k.mo72058b((C28367c) this.f74060a);
            }
        });
        m91976p();
        view.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SuperRecommendViewHolder f74061a;

            {
                this.f74061a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                UserWithAweme userWithAweme = this.f74061a.f74044h;
                if (userWithAweme == null) {
                    C7573i.m23580a();
                }
                if (this.f74061a.getAdapterPosition() < this.f74061a.f74047k.f74738a) {
                    this.f74061a.f74047k.mo5427b(this.f74061a.f74047k.f74738a - 1);
                } else if (this.f74061a.getAdapterPosition() > this.f74061a.f74047k.f74738a) {
                    this.f74061a.f74047k.mo5427b(this.f74061a.f74047k.f74738a + 1);
                } else {
                    C36630b bVar = this.f74061a.f74038b;
                    if (bVar != null) {
                        bVar.mo72053d(userWithAweme.getUser(), this.f74061a.getAdapterPosition());
                    }
                    UserProfileActivity.m117386a(view.getContext(), C42914ab.m136242a().mo104633a("uid", userWithAweme.getUser().getUid()).mo104633a("sec_user_id", userWithAweme.getUser().getSecUid()).mo104633a("enter_from", "homepage_follow").mo104633a("enter_from_request_id", userWithAweme.getUser().getRequestId()).mo104633a("extra_previous_page_position", "card_head").mo104630a("need_track_compare_recommend_reason", 1).mo104633a("previous_recommend_reason", userWithAweme.getUser().getRecommendReason()).mo104633a("recommend_from_type", "card").f111445a);
                }
            }
        });
        OnClickListener onClickListener = this;
        m91972l().setOnClickListener(onClickListener);
        m91971k().setOnClickListener(onClickListener);
        this.f74058v.mo66537a(this);
    }
}
