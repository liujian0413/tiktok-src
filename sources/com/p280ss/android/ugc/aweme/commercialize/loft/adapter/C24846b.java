package com.p280ss.android.ugc.aweme.commercialize.loft.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p022v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.C11007a;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.commercialize.loft.C24863e;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftVideoPlayView.C24840a;
import com.p280ss.android.ugc.aweme.commercialize.loft.half.LoftView;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftVideo;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1130a.C24844a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25384x;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.longvideo.C32715a;
import com.p280ss.android.ugc.aweme.longvideo.C32733d;
import com.p280ss.android.ugc.aweme.longvideo.C32748j;
import com.p280ss.android.ugc.aweme.longvideo.C32750k;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.longvideo.DiggView;
import com.p280ss.android.ugc.aweme.longvideo.DiggView.C32699a;
import com.p280ss.android.ugc.aweme.longvideo.feature.C32744a;
import com.p280ss.android.ugc.aweme.longvideo.feature.LoadingController;
import com.p280ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob;
import com.p280ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.p280ss.android.ugc.aweme.longvideo.feature.NoOperateModeController.C32736a;
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32724c.C32725a;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32726d;
import com.p280ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C32756a;
import com.p280ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.p280ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C32757a;
import com.p280ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView;
import com.p280ss.android.ugc.aweme.longvideo.view.VideoPlaySeekBar;
import com.p280ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33267i;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b */
public final class C24846b implements OnClickListener, C24845a, C32715a, C32736a {

    /* renamed from: A */
    public DmtTextView f65485A;

    /* renamed from: B */
    public View f65486B;

    /* renamed from: C */
    public View f65487C;

    /* renamed from: D */
    public View f65488D;

    /* renamed from: E */
    public View f65489E;

    /* renamed from: F */
    public View f65490F;

    /* renamed from: G */
    public LineProgressBar f65491G;

    /* renamed from: H */
    public AudioControlView f65492H;

    /* renamed from: I */
    public DiggView f65493I;

    /* renamed from: J */
    public String f65494J = "discovery_second_floor";

    /* renamed from: K */
    public int f65495K;

    /* renamed from: L */
    public LongVideoPlayMob f65496L;

    /* renamed from: M */
    public LongVideoMobViewModel f65497M;

    /* renamed from: N */
    public C32752l f65498N;

    /* renamed from: O */
    public NoOperateModeController f65499O;

    /* renamed from: P */
    public int f65500P;

    /* renamed from: Q */
    public final View f65501Q;

    /* renamed from: R */
    public final FragmentActivity f65502R;

    /* renamed from: S */
    public final C43316v f65503S;

    /* renamed from: T */
    public final C28297e f65504T;

    /* renamed from: U */
    public final boolean f65505U;

    /* renamed from: V */
    private String f65506V = "";

    /* renamed from: W */
    private int f65507W = -1;

    /* renamed from: X */
    private boolean f65508X;

    /* renamed from: Y */
    private C32726d f65509Y = new C32726d(0, 0);

    /* renamed from: a */
    public ImageView f65510a;

    /* renamed from: b */
    public ImageView f65511b;

    /* renamed from: c */
    public LoftVideo f65512c;

    /* renamed from: d */
    public Aweme f65513d;

    /* renamed from: e */
    public CustomBottomSheetBehavior<View> f65514e;

    /* renamed from: f */
    public VideoViewComponent f65515f;

    /* renamed from: g */
    public View f65516g;

    /* renamed from: h */
    public VideoPlaySeekBar f65517h;

    /* renamed from: i */
    public LoftVideoPlayView f65518i;

    /* renamed from: j */
    public C32750k f65519j;

    /* renamed from: k */
    public LoftView f65520k;

    /* renamed from: l */
    public LongVideoDiggAnimationView f65521l;

    /* renamed from: m */
    public ImageView f65522m;

    /* renamed from: n */
    public ImageView f65523n;

    /* renamed from: o */
    public ImageView f65524o;

    /* renamed from: p */
    public DoubleClickDiggFrameLayout f65525p;

    /* renamed from: q */
    public AnimatedImageView f65526q;

    /* renamed from: r */
    public FrameLayout f65527r;

    /* renamed from: s */
    public View f65528s;

    /* renamed from: t */
    public RelativeLayout f65529t;

    /* renamed from: u */
    public FrameLayout f65530u;

    /* renamed from: v */
    public C32748j f65531v;

    /* renamed from: w */
    public LinearLayout f65532w;

    /* renamed from: x */
    public AvatarImageView f65533x;

    /* renamed from: y */
    public DmtTextView f65534y;

    /* renamed from: z */
    public DmtTextView f65535z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$a */
    public static final class C24847a implements C24840a {

        /* renamed from: a */
        final /* synthetic */ C24846b f65536a;

        /* renamed from: a */
        public final View mo64958a() {
            return this.f65536a.mo64976i();
        }

        /* renamed from: b */
        public final void mo64959b() {
            this.f65536a.mo64976i().setSelected(false);
        }

        /* renamed from: c */
        public final void mo64960c() {
            this.f65536a.mo64976i().setSelected(true);
        }

        C24847a(C24846b bVar) {
            this.f65536a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$b */
    public static final class C24848b implements C32757a {

        /* renamed from: a */
        final /* synthetic */ C24846b f65537a;

        /* renamed from: a */
        public final void mo64984a() {
            DiggView diggView = this.f65537a.f65493I;
            if (diggView != null) {
                diggView.mo84147a();
            }
        }

        /* renamed from: b */
        public final void mo64985b() {
            if (C24846b.m81552a(this.f65537a).f85340c) {
                C24846b.m81559m();
            } else {
                C24846b.m81552a(this.f65537a).mo84216a(0);
            }
        }

        C24848b(C24846b bVar) {
            this.f65537a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$c */
    static final class C24849c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C24846b f65538a;

        C24849c(C24846b bVar) {
            this.f65538a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m81589a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m81589a() {
            this.f65538a.mo64981o();
            this.f65538a.mo64971e();
            C24846b.m81556b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$d */
    static final class C24850d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24846b f65539a;

        C24850d(C24846b bVar) {
            this.f65539a = bVar;
        }

        public final void run() {
            View view = this.f65539a.f65490F;
            if (view != null) {
                view.setAlpha(1.0f);
            }
            View view2 = this.f65539a.f65490F;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$e */
    public static final class C24851e extends C0343a {

        /* renamed from: a */
        final /* synthetic */ C24846b f65540a;

        C24851e(C24846b bVar) {
            this.f65540a = bVar;
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i == 1 || i == 5) {
                CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f65540a.f65514e;
                if (customBottomSheetBehavior != null) {
                    customBottomSheetBehavior.mo1357b(4);
                }
            }
        }

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                this.f65540a.mo64978k().setAlpha(1.0f);
                this.f65540a.mo64979l().setAlpha(1.0f);
                return;
            }
            float abs = Math.abs(f);
            if (abs > 0.0f && abs < 0.15f) {
                this.f65540a.mo64979l().setAlpha(1.0f - (abs / 0.15f));
            }
            if (abs > 0.15f) {
                this.f65540a.mo64978k().setAlpha(1.0f - ((abs - 0.15f) / 0.85f));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$f */
    public static final class C24852f implements C32756a {

        /* renamed from: a */
        final /* synthetic */ C24846b f65541a;

        C24852f(C24846b bVar) {
            this.f65541a = bVar;
        }

        /* renamed from: a */
        public final void mo64987a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C7573i.m23587b(coordinatorLayout, "parent");
            C7573i.m23587b(view, "child");
            C7573i.m23587b(motionEvent, "event");
            this.f65541a.mo64977j().mo84250a(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$g */
    static final class C24853g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24846b f65542a;

        C24853g(C24846b bVar) {
            this.f65542a = bVar;
        }

        public final void run() {
            this.f65542a.mo64975a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.adapter.b$h */
    public static final class C24854h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C24846b f65543a;

        /* renamed from: b */
        final /* synthetic */ boolean f65544b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f65544b) {
                FragmentActivity fragmentActivity = this.f65543a.f65502R;
                if (fragmentActivity != null) {
                    fragmentActivity.finish();
                }
            }
        }

        C24854h(C24846b bVar, boolean z) {
            this.f65543a = bVar;
            this.f65544b = z;
        }
    }

    /* renamed from: a */
    public final void mo64975a(boolean z) {
        float f = 0.0f;
        if (z) {
            View view = this.f65528s;
            if (view == null) {
                C7573i.m23583a("mBgContainer");
            }
            view.setAlpha(0.0f);
            FrameLayout frameLayout = this.f65530u;
            if (frameLayout == null) {
                C7573i.m23583a("mRootContainer");
            }
            frameLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.f65529t;
            if (relativeLayout == null) {
                C7573i.m23583a("mToolContainer");
            }
            relativeLayout.setAlpha(0.0f);
        }
        float f2 = 1.0f;
        if (!z) {
            f = 1.0f;
            f2 = 0.0f;
        }
        View view2 = this.f65528s;
        if (view2 == null) {
            C7573i.m23583a("mBgContainer");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f, f2}).setDuration(250);
        FrameLayout frameLayout2 = this.f65530u;
        if (frameLayout2 == null) {
            C7573i.m23583a("mRootContainer");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        RelativeLayout relativeLayout2 = this.f65529t;
        if (relativeLayout2 == null) {
            C7573i.m23583a("mToolContainer");
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2).with(duration3);
        animatorSet.start();
        animatorSet.addListener(new C24854h(this, z));
    }

    /* renamed from: c */
    public final int mo64969c() {
        return this.f65507W;
    }

    /* renamed from: n */
    public final void mo64980n() {
        m81558d(false);
    }

    /* renamed from: m */
    public static void m81559m() {
        C42961az.m136380a(new C32716a());
    }

    /* renamed from: d */
    public final Aweme mo64970d() {
        Aweme aweme = this.f65513d;
        if (aweme == null) {
            C7573i.m23583a("mAweme");
        }
        return aweme;
    }

    /* renamed from: g */
    public final void mo64973g() {
        View view = this.f65488D;
        if (view == null) {
            C7573i.m23583a("mLoftGuideLL");
        }
        view.setVisibility(8);
    }

    /* renamed from: i */
    public final ImageView mo64976i() {
        ImageView imageView = this.f65510a;
        if (imageView == null) {
            C7573i.m23583a("mIvPlay");
        }
        return imageView;
    }

    /* renamed from: j */
    public final DoubleClickDiggFrameLayout mo64977j() {
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f65525p;
        if (doubleClickDiggFrameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        return doubleClickDiggFrameLayout;
    }

    /* renamed from: k */
    public final View mo64978k() {
        View view = this.f65528s;
        if (view == null) {
            C7573i.m23583a("mBgContainer");
        }
        return view;
    }

    /* renamed from: l */
    public final RelativeLayout mo64979l() {
        RelativeLayout relativeLayout = this.f65529t;
        if (relativeLayout == null) {
            C7573i.m23583a("mToolContainer");
        }
        return relativeLayout;
    }

    /* renamed from: s */
    private final int m81562s() {
        Resources resources = this.f65502R.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: f */
    public final void mo64972f() {
        LoftVideoPlayView loftVideoPlayView = this.f65518i;
        if (loftVideoPlayView == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        loftVideoPlayView.mo64936a();
        NoOperateModeController noOperateModeController = this.f65499O;
        if (noOperateModeController == null) {
            C7573i.m23583a("noOperationModeController");
        }
        noOperateModeController.mo84215a();
    }

    /* renamed from: r */
    private final C32726d m81561r() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = this.f65502R.getWindowManager();
        C7573i.m23582a((Object) windowManager, "activity.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return C32725a.m105938b(displayMetrics.widthPixels, C23482j.m77105f(this.f65502R));
    }

    /* renamed from: t */
    private void m81563t() {
        if (!this.f65505U) {
            FragmentActivity fragmentActivity = this.f65502R;
            if (fragmentActivity != null) {
                fragmentActivity.finish();
            }
            FragmentActivity fragmentActivity2 = this.f65502R;
            if (fragmentActivity2 != null) {
                fragmentActivity2.overridePendingTransition(C11007a.f29793a, C11007a.f29794b);
                return;
            }
            return;
        }
        if (!this.f65508X) {
            mo64975a(false);
        }
    }

    /* renamed from: u */
    private final boolean m81564u() {
        LoftVideo loftVideo = this.f65512c;
        if (loftVideo == null) {
            C7573i.m23583a("mLoftVideo");
        }
        LoftVideoMore more = loftVideo.getMore();
        if (more == null || !more.getWithAutoMask()) {
            return false;
        }
        LoftView loftView = this.f65520k;
        if (loftView == null) {
            C7573i.m23583a("mLoftView");
        }
        if (!loftView.mo65024a() && !C25384x.m83528a(this.f65502R.getSupportFragmentManager()) && !this.f65504T.mo71989j()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final void m81566w() {
        DiggView diggView = this.f65493I;
        if (diggView != null) {
            LongVideoPlayMob longVideoPlayMob = this.f65496L;
            if (longVideoPlayMob == null) {
                C7573i.m23583a("mLongVideoPlayMob");
            }
            diggView.mo84152b(longVideoPlayMob);
        }
        LoftVideoPlayView loftVideoPlayView = this.f65518i;
        if (loftVideoPlayView == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        LongVideoPlayMob longVideoPlayMob2 = this.f65496L;
        if (longVideoPlayMob2 == null) {
            C7573i.m23583a("mLongVideoPlayMob");
        }
        loftVideoPlayView.mo64945b((C34976f) longVideoPlayMob2);
    }

    /* renamed from: b */
    public final void mo64968b() {
        LoftVideoPlayView loftVideoPlayView = this.f65518i;
        if (loftVideoPlayView == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        loftVideoPlayView.mo64948c();
        NoOperateModeController noOperateModeController = this.f65499O;
        if (noOperateModeController == null) {
            C7573i.m23583a("noOperationModeController");
        }
        noOperateModeController.mo84215a();
        View view = this.f65488D;
        if (view == null) {
            C7573i.m23583a("mLoftGuideLL");
        }
        view.setVisibility(8);
        mo64981o();
        m81566w();
    }

    /* renamed from: e */
    public final void mo64971e() {
        View view = this.f65488D;
        if (view == null) {
            C7573i.m23583a("mLoftGuideLL");
        }
        if (view.getVisibility() != 0) {
            LoftVideoPlayView loftVideoPlayView = this.f65518i;
            if (loftVideoPlayView == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            loftVideoPlayView.mo64943b();
            NoOperateModeController noOperateModeController = this.f65499O;
            if (noOperateModeController == null) {
                C7573i.m23583a("noOperationModeController");
            }
            noOperateModeController.mo84216a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: v */
    private final void m81565v() {
        FragmentActivity fragmentActivity = this.f65502R;
        Aweme aweme = this.f65513d;
        if (aweme == null) {
            C7573i.m23583a("mAweme");
        }
        this.f65497M = C32719a.m105913a(fragmentActivity, aweme, this.f65494J, this.f65495K, this.f65500P);
        this.f65496L = new LongVideoPlayMob(this.f65502R, this.f65503S);
        DiggView diggView = this.f65493I;
        if (diggView != null) {
            LongVideoPlayMob longVideoPlayMob = this.f65496L;
            if (longVideoPlayMob == null) {
                C7573i.m23583a("mLongVideoPlayMob");
            }
            diggView.mo84150a((C32699a) longVideoPlayMob);
        }
        LoftVideoPlayView loftVideoPlayView = this.f65518i;
        if (loftVideoPlayView == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        LongVideoPlayMob longVideoPlayMob2 = this.f65496L;
        if (longVideoPlayMob2 == null) {
            C7573i.m23583a("mLongVideoPlayMob");
        }
        loftVideoPlayView.mo64941a((C34976f) longVideoPlayMob2);
        C32750k kVar = this.f65519j;
        if (kVar == null) {
            C7573i.m23583a("mLongVideoSeekView");
        }
        LongVideoPlayMob longVideoPlayMob3 = this.f65496L;
        if (longVideoPlayMob3 == null) {
            C7573i.m23583a("mLongVideoPlayMob");
        }
        kVar.mo84243a((OnSeekBarChangeListener) longVideoPlayMob3);
    }

    /* renamed from: h */
    public final void mo64974h() {
        String str;
        String str2 = "close_video";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f65494J);
        String str3 = "group_id";
        Aweme aweme = this.f65513d;
        if (aweme == null) {
            C7573i.m23583a("mAweme");
        }
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f65513d;
        if (aweme2 == null) {
            C7573i.m23583a("mAweme");
        }
        if (aweme2 != null) {
            User author = aweme2.getAuthor();
            if (author != null) {
                str4 = author.getUid();
            }
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).mo59970a("is_long_item", this.f65500P).f60753a);
    }

    /* renamed from: p */
    public final void mo64983p() {
        if (!this.f65508X) {
            ImageView imageView = this.f65511b;
            if (imageView == null) {
                C7573i.m23583a("mIvClose");
            }
            imageView.setVisibility(0);
            NoOperateModeController noOperateModeController = this.f65499O;
            if (noOperateModeController == null) {
                C7573i.m23583a("noOperationModeController");
            }
            noOperateModeController.f85340c = false;
            if (m81564u()) {
                LoftView loftView = this.f65520k;
                if (loftView == null) {
                    C7573i.m23583a("mLoftView");
                }
                loftView.mo65023a(true, "auto");
                m81556b(true);
                m81558d(true);
            } else {
                LoftView loftView2 = this.f65520k;
                if (loftView2 == null) {
                    C7573i.m23583a("mLoftView");
                }
                if (!loftView2.mo65024a()) {
                    mo64981o();
                }
            }
            LoftView loftView3 = this.f65520k;
            if (loftView3 == null) {
                C7573i.m23583a("mLoftView");
            }
            if (loftView3.mo65024a()) {
                ImageView imageView2 = this.f65524o;
                if (imageView2 == null) {
                    C7573i.m23583a("mIvReplay");
                }
                imageView2.setVisibility(8);
            }
        }
    }

    /* renamed from: o */
    public final void mo64981o() {
        LoftView loftView = this.f65520k;
        if (loftView == null) {
            C7573i.m23583a("mLoftView");
        }
        if (!loftView.mo65024a()) {
            View view = this.f65487C;
            if (view == null) {
                C7573i.m23583a("mLoftMaskBottom");
            }
            view.setVisibility(0);
            View view2 = this.f65486B;
            if (view2 == null) {
                C7573i.m23583a("mLoftMaskTop");
            }
            view2.setVisibility(0);
            ImageView imageView = this.f65511b;
            if (imageView == null) {
                C7573i.m23583a("mIvClose");
            }
            ViewPropertyAnimator animate = imageView.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
            DmtTextView dmtTextView = this.f65535z;
            if (dmtTextView == null) {
                C7573i.m23583a("mLoftTitleTv");
            }
            ViewPropertyAnimator animate2 = dmtTextView.animate();
            if (animate2 != null) {
                ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
            DmtTextView dmtTextView2 = this.f65485A;
            if (dmtTextView2 == null) {
                C7573i.m23583a("mLoftNumTv");
            }
            ViewPropertyAnimator animate3 = dmtTextView2.animate();
            if (animate3 != null) {
                ViewPropertyAnimator alpha3 = animate3.alpha(1.0f);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        duration3.start();
                    }
                }
            }
            View view3 = this.f65489E;
            if (view3 != null) {
                ViewPropertyAnimator animate4 = view3.animate();
                if (animate4 != null) {
                    ViewPropertyAnimator alpha4 = animate4.alpha(1.0f);
                    if (alpha4 != null) {
                        ViewPropertyAnimator duration4 = alpha4.setDuration(200);
                        if (duration4 != null) {
                            duration4.start();
                        }
                    }
                }
            }
            View view4 = this.f65490F;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            View view5 = this.f65490F;
            if (view5 != null) {
                view5.setAlpha(0.0f);
            }
            View view6 = this.f65490F;
            if (view6 != null) {
                ViewPropertyAnimator animate5 = view6.animate();
                if (animate5 != null) {
                    ViewPropertyAnimator alpha5 = animate5.alpha(1.0f);
                    if (alpha5 != null) {
                        ViewPropertyAnimator duration5 = alpha5.setDuration(200);
                        if (duration5 != null) {
                            duration5.start();
                        }
                    }
                }
            }
            LoftVideo loftVideo = this.f65512c;
            if (loftVideo == null) {
                C7573i.m23583a("mLoftVideo");
            }
            if (loftVideo.getMore() != null) {
                LinearLayout linearLayout = this.f65532w;
                if (linearLayout == null) {
                    C7573i.m23583a("mMaskBtnContainer");
                }
                ViewPropertyAnimator animate6 = linearLayout.animate();
                if (animate6 != null) {
                    ViewPropertyAnimator alpha6 = animate6.alpha(1.0f);
                    if (alpha6 != null) {
                        ViewPropertyAnimator duration6 = alpha6.setDuration(200);
                        if (duration6 != null) {
                            duration6.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private void m81560q() {
        int i;
        this.f65501Q.setTag(this);
        View view = this.f65501Q;
        View findViewById = view.findViewById(R.id.cws);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root_view)");
        this.f65525p = (DoubleClickDiggFrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.eax);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.video_loft_view)");
        this.f65520k = (LoftView) findViewById2;
        this.f65515f = new VideoViewComponent();
        VideoViewComponent videoViewComponent = this.f65515f;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoViewComponent");
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f65525p;
        if (doubleClickDiggFrameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        videoViewComponent.mo107432a((ViewGroup) doubleClickDiggFrameLayout);
        VideoViewComponent videoViewComponent2 = this.f65515f;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoViewComponent");
        }
        C44962h hVar = videoViewComponent2.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoViewComponent.surfaceHolder");
        View a = hVar.mo107454a();
        C7573i.m23582a((Object) a, "mVideoViewComponent.surfaceHolder.view");
        this.f65516g = a;
        View findViewById3 = view.findViewById(R.id.b7g);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.iv_close)");
        this.f65511b = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ebh);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.video_seek_bar)");
        this.f65517h = (VideoPlaySeekBar) findViewById4;
        View findViewById5 = view.findViewById(R.id.bb4);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.iv_play)");
        this.f65510a = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.bbh);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.iv_replay)");
        this.f65524o = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b8j);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.iv_digg)");
        this.f65521l = (LongVideoDiggAnimationView) findViewById7;
        View findViewById8 = view.findViewById(R.id.b7p);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.iv_comment)");
        this.f65522m = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.bc7);
        C7573i.m23582a((Object) findViewById9, "findViewById(R.id.iv_share)");
        this.f65523n = (ImageView) findViewById9;
        this.f65490F = view.findViewById(R.id.c8y);
        this.f65489E = view.findViewById(R.id.ccf);
        this.f65491G = (LineProgressBar) view.findViewById(R.id.cce);
        this.f65492H = (AudioControlView) view.findViewById(R.id.hs);
        View findViewById10 = view.findViewById(R.id.a4g);
        C7573i.m23582a((Object) findViewById10, "findViewById(R.id.cover)");
        this.f65526q = (AnimatedImageView) findViewById10;
        View findViewById11 = view.findViewById(R.id.a4h);
        C7573i.m23582a((Object) findViewById11, "findViewById(R.id.cover_container)");
        this.f65527r = (FrameLayout) findViewById11;
        View findViewById12 = view.findViewById(R.id.lm);
        C7573i.m23582a((Object) findViewById12, "findViewById(R.id.bg_container)");
        this.f65528s = findViewById12;
        View findViewById13 = view.findViewById(R.id.dl5);
        C7573i.m23582a((Object) findViewById13, "findViewById(R.id.tool_container)");
        this.f65529t = (RelativeLayout) findViewById13;
        View findViewById14 = view.findViewById(R.id.amt);
        C7573i.m23582a((Object) findViewById14, "findViewById(R.id.fl_root_container)");
        this.f65530u = (FrameLayout) findViewById14;
        View findViewById15 = view.findViewById(R.id.bxa);
        C7573i.m23582a((Object) findViewById15, "findViewById(R.id.mask_btn_container)");
        this.f65532w = (LinearLayout) findViewById15;
        View findViewById16 = view.findViewById(R.id.bx_);
        C7573i.m23582a((Object) findViewById16, "findViewById(R.id.mask_author_avatar)");
        this.f65533x = (AvatarImageView) findViewById16;
        View findViewById17 = view.findViewById(R.id.bxb);
        C7573i.m23582a((Object) findViewById17, "findViewById(R.id.mask_desc_tv)");
        this.f65534y = (DmtTextView) findViewById17;
        View findViewById18 = view.findViewById(R.id.bvb);
        C7573i.m23582a((Object) findViewById18, "findViewById(R.id.loft_video_title)");
        this.f65535z = (DmtTextView) findViewById18;
        View findViewById19 = view.findViewById(R.id.bva);
        C7573i.m23582a((Object) findViewById19, "findViewById(R.id.loft_video_num)");
        this.f65485A = (DmtTextView) findViewById19;
        View findViewById20 = view.findViewById(R.id.eaz);
        C7573i.m23582a((Object) findViewById20, "findViewById(R.id.video_mask_top_view)");
        this.f65486B = findViewById20;
        View findViewById21 = view.findViewById(R.id.eay);
        C7573i.m23582a((Object) findViewById21, "findViewById(R.id.video_mask_bottom_view)");
        this.f65487C = findViewById21;
        View findViewById22 = view.findViewById(R.id.bv7);
        C7573i.m23582a((Object) findViewById22, "findViewById(R.id.loft_guide_ll)");
        this.f65488D = findViewById22;
        m81555a(view);
        Context context = this.f65502R;
        FrameLayout frameLayout = this.f65530u;
        if (frameLayout == null) {
            C7573i.m23583a("mRootContainer");
        }
        View view2 = frameLayout;
        View view3 = this.f65489E;
        if (view3 != null) {
            this.f65531v = new C32748j(context, view2, (LinearLayout) view3);
            C32748j jVar = this.f65531v;
            if (jVar == null) {
                C7573i.m23583a("mLongVideoScreenHelper");
            }
            jVar.mo84241a(this.f65508X);
            this.f65509Y = m81561r();
            FragmentActivity fragmentActivity = this.f65502R;
            VideoViewComponent videoViewComponent3 = this.f65515f;
            if (videoViewComponent3 == null) {
                C7573i.m23583a("mVideoViewComponent");
            }
            AnimatedImageView animatedImageView = this.f65526q;
            if (animatedImageView == null) {
                C7573i.m23583a("mCover");
            }
            ImageView imageView = this.f65524o;
            if (imageView == null) {
                C7573i.m23583a("mIvReplay");
            }
            LoftVideoPlayView loftVideoPlayView = new LoftVideoPlayView(fragmentActivity, videoViewComponent3, animatedImageView, imageView, this.f65503S, this);
            this.f65518i = loftVideoPlayView;
            LoftVideoPlayView loftVideoPlayView2 = this.f65518i;
            if (loftVideoPlayView2 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            loftVideoPlayView2.mo64938a((C24840a) new C24847a(this));
            VideoPlaySeekBar videoPlaySeekBar = this.f65517h;
            if (videoPlaySeekBar == null) {
                C7573i.m23583a("mVideoSeekBar");
            }
            LoftVideoPlayView loftVideoPlayView3 = this.f65518i;
            if (loftVideoPlayView3 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            this.f65519j = new C32750k(videoPlaySeekBar, loftVideoPlayView3);
            LoftVideoPlayView loftVideoPlayView4 = this.f65518i;
            if (loftVideoPlayView4 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            C32750k kVar = this.f65519j;
            if (kVar == null) {
                C7573i.m23583a("mLongVideoSeekView");
            }
            loftVideoPlayView4.f65452b = kVar;
            LongVideoDiggAnimationView longVideoDiggAnimationView = this.f65521l;
            if (longVideoDiggAnimationView == null) {
                C7573i.m23583a("mIvDigg");
            }
            this.f65493I = new DiggView(longVideoDiggAnimationView, null, this.f65494J);
            FragmentActivity fragmentActivity2 = this.f65502R;
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout2 = this.f65525p;
            if (doubleClickDiggFrameLayout2 == null) {
                C7573i.m23583a("mRootView");
            }
            this.f65499O = new NoOperateModeController(fragmentActivity2, doubleClickDiggFrameLayout2);
            NoOperateModeController noOperateModeController = this.f65499O;
            if (noOperateModeController == null) {
                C7573i.m23583a("noOperationModeController");
            }
            noOperateModeController.mo84217a((C32736a) this);
            ImageView imageView2 = this.f65511b;
            if (imageView2 == null) {
                C7573i.m23583a("mIvClose");
            }
            OnClickListener onClickListener = this;
            imageView2.setOnClickListener(onClickListener);
            ImageView imageView3 = this.f65511b;
            if (imageView3 == null) {
                C7573i.m23583a("mIvClose");
            }
            if (this.f65505U) {
                i = R.drawable.vx;
            } else {
                i = R.drawable.vw;
            }
            imageView3.setImageResource(i);
            ImageView imageView4 = this.f65522m;
            if (imageView4 == null) {
                C7573i.m23583a("mCommentView");
            }
            imageView4.setOnClickListener(onClickListener);
            ImageView imageView5 = this.f65523n;
            if (imageView5 == null) {
                C7573i.m23583a("mShareView");
            }
            imageView5.setOnClickListener(onClickListener);
            LinearLayout linearLayout = this.f65532w;
            if (linearLayout == null) {
                C7573i.m23583a("mMaskBtnContainer");
            }
            linearLayout.setOnClickListener(onClickListener);
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout3 = this.f65525p;
            if (doubleClickDiggFrameLayout3 == null) {
                C7573i.m23583a("mRootView");
            }
            doubleClickDiggFrameLayout3.setOnDiggListener(new C24848b(this));
            LoftVideoPlayView loftVideoPlayView5 = this.f65518i;
            if (loftVideoPlayView5 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            C28297e eVar = this.f65504T;
            LoftVideoPlayView loftVideoPlayView6 = this.f65518i;
            if (loftVideoPlayView6 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            loftVideoPlayView5.mo64940a((C32733d) new C32744a(eVar, loftVideoPlayView6, this.f65503S));
            LoadingController loadingController = new LoadingController(this.f65502R, this.f65491G);
            LoftVideoPlayView loftVideoPlayView7 = this.f65518i;
            if (loftVideoPlayView7 == null) {
                C7573i.m23583a("mLongVideoPlayView");
            }
            loftVideoPlayView7.mo64941a((C34976f) loadingController);
            LoftView loftView = this.f65520k;
            if (loftView == null) {
                C7573i.m23583a("mLoftView");
            }
            loftView.setDismissListener(new C24849c(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64966a() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.loft.half.LoftView r0 = r5.f65520k
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mLoftView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r0.mo65025b()
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r0 = r5.f65512c
            if (r0 != 0) goto L_0x0015
            java.lang.String r1 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0015:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore r0 = r0.getMore()
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r0.getSchema()
            if (r0 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.commercialize.loft.half.LoftView r1 = r5.f65520k
            if (r1 != 0) goto L_0x002a
            java.lang.String r2 = "mLoftView"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x002a:
            com.ss.android.ugc.aweme.music.c.f$a r0 = com.p280ss.android.ugc.aweme.music.p1409c.C33786f.m108941a(r0)
            java.lang.String r2 = "activity_id"
            java.lang.String r3 = r5.f65506V
            com.ss.android.ugc.aweme.music.c.f$a r0 = r0.mo86195a(r2, r3)
            java.lang.String r2 = "item_id"
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r3 = r5.f65512c
            if (r3 != 0) goto L_0x0041
            java.lang.String r4 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.getAweme()
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = r3.getAid()
            if (r3 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r3 = ""
        L_0x004f:
            com.ss.android.ugc.aweme.music.c.f$a r0 = r0.mo86195a(r2, r3)
            android.net.Uri r0 = r0.mo86194a()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RnSchemeHelper.parseRnSc…              .toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r2 = r5.f65512c
            if (r2 != 0) goto L_0x0069
            java.lang.String r3 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0069:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAweme()
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = r2.getAid()
            if (r2 != 0) goto L_0x0077
        L_0x0075:
            java.lang.String r2 = ""
        L_0x0077:
            r1.mo65022a(r0, r2)
        L_0x007a:
            r5.mo64971e()
            r5.mo64981o()
            r0 = 0
            m81556b(r0)
            r5.m81565v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.adapter.C24846b.mo64966a():void");
    }

    /* renamed from: c */
    private final String m81557c(boolean z) {
        return this.f65494J;
    }

    /* renamed from: a */
    private final Video m81551a(Aweme aweme) {
        C32752l lVar = this.f65498N;
        if (lVar != null) {
            return lVar.mo84248a(aweme);
        }
        return null;
    }

    /* renamed from: b */
    public static void m81556b(boolean z) {
        C24844a aVar = new C24844a();
        aVar.f65477a = z;
        C42961az.m136380a(aVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ NoOperateModeController m81552a(C24846b bVar) {
        NoOperateModeController noOperateModeController = bVar.f65499O;
        if (noOperateModeController == null) {
            C7573i.m23583a("noOperationModeController");
        }
        return noOperateModeController;
    }

    /* renamed from: a */
    private final void m81553a(int i) {
        if (i == 0) {
            C24863e eVar = (C24863e) C23336d.m76560a(C6399b.m19921a(), C24863e.class);
            if (!eVar.mo60425a(false)) {
                View view = this.f65488D;
                if (view == null) {
                    C7573i.m23583a("mLoftGuideLL");
                }
                view.setVisibility(0);
                View view2 = this.f65488D;
                if (view2 == null) {
                    C7573i.m23583a("mLoftGuideLL");
                }
                view2.setOnClickListener(this);
                eVar.mo60426b(true);
            }
        }
    }

    /* renamed from: a */
    private final void m81555a(View view) {
        BottomSheetBehavior a = BottomSheetBehavior.m1365a(view.findViewById(R.id.cws));
        if (a != null) {
            this.f65514e = (CustomBottomSheetBehavior) a;
            CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f65514e;
            if (customBottomSheetBehavior != null) {
                customBottomSheetBehavior.f1347m = new C24851e(this);
                customBottomSheetBehavior.f1340f = true;
                if (!C22911a.m75401a(this.f65502R)) {
                    customBottomSheetBehavior.mo1352a(C23482j.m77095a(this.f65502R) + m81562s() + C21085a.m71116a((Context) this.f65502R));
                } else {
                    customBottomSheetBehavior.mo1352a(C23482j.m77095a(this.f65502R) + m81562s());
                }
                customBottomSheetBehavior.f1341g = true;
                customBottomSheetBehavior.mo1357b(3);
            }
            CustomBottomSheetBehavior<View> customBottomSheetBehavior2 = this.f65514e;
            if (customBottomSheetBehavior2 != null) {
                customBottomSheetBehavior2.mo84249a(new C24852f(this));
            }
            FrameLayout frameLayout = this.f65530u;
            if (frameLayout == null) {
                C7573i.m23583a("mRootContainer");
            }
            frameLayout.postDelayed(new C24853g(this), 50);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View!>");
    }

    /* renamed from: d */
    private final void m81558d(boolean z) {
        float f;
        ImageView imageView = this.f65511b;
        if (imageView == null) {
            C7573i.m23583a("mIvClose");
        }
        float f2 = 0.0f;
        imageView.animate().alpha(0.0f).setDuration(200).start();
        DmtTextView dmtTextView = this.f65535z;
        if (dmtTextView == null) {
            C7573i.m23583a("mLoftTitleTv");
        }
        dmtTextView.animate().alpha(0.0f).setDuration(200).start();
        DmtTextView dmtTextView2 = this.f65485A;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mLoftNumTv");
        }
        dmtTextView2.animate().alpha(0.0f).setDuration(200).start();
        View view = this.f65490F;
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C24850d(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        View view2 = this.f65489E;
        if (view2 != null) {
            ViewPropertyAnimator animate2 = view2.animate();
            if (animate2 != null) {
                if (z) {
                    f = 0.0f;
                } else {
                    f = 0.34f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
        }
        LoftVideo loftVideo = this.f65512c;
        if (loftVideo == null) {
            C7573i.m23583a("mLoftVideo");
        }
        if (loftVideo.getMore() != null) {
            LinearLayout linearLayout = this.f65532w;
            if (linearLayout == null) {
                C7573i.m23583a("mMaskBtnContainer");
            }
            ViewPropertyAnimator animate3 = linearLayout.animate();
            if (animate3 != null) {
                if (!z) {
                    f2 = 0.34f;
                }
                ViewPropertyAnimator alpha3 = animate3.alpha(f2);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        duration3.start();
                    }
                }
            }
        }
        if (z) {
            View view3 = this.f65487C;
            if (view3 == null) {
                C7573i.m23583a("mLoftMaskBottom");
            }
            view3.setVisibility(8);
            View view4 = this.f65486B;
            if (view4 == null) {
                C7573i.m23583a("mLoftMaskTop");
            }
            view4.setVisibility(8);
            ImageView imageView2 = this.f65524o;
            if (imageView2 == null) {
                C7573i.m23583a("mIvReplay");
            }
            if (imageView2.getVisibility() == 0) {
                LoftVideo loftVideo2 = this.f65512c;
                if (loftVideo2 == null) {
                    C7573i.m23583a("mLoftVideo");
                }
                LoftVideoMore more = loftVideo2.getMore();
                if (more != null && !more.getWithAutoMask()) {
                    ImageView imageView3 = this.f65524o;
                    if (imageView3 == null) {
                        C7573i.m23583a("mIvReplay");
                    }
                    imageView3.setVisibility(8);
                }
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        String str;
        ClickInstrumentation.onClick(view);
        m81559m();
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b7g) {
            m81563t();
        } else if (num != null && num.intValue() == R.id.b7p) {
            C28297e eVar = this.f65504T;
            Aweme aweme = this.f65513d;
            if (aweme == null) {
                C7573i.m23583a("mAweme");
            }
            eVar.mo62620a(new C24202a(aweme).mo62904a());
        } else {
            if (num != null && num.intValue() == R.id.bc7) {
                C28297e eVar2 = this.f65504T;
                Aweme aweme2 = this.f65513d;
                if (aweme2 == null) {
                    C7573i.m23583a("mAweme");
                }
                eVar2.mo71983a((Activity) null, aweme2);
                Aweme aweme3 = this.f65513d;
                if (aweme3 == null) {
                    C7573i.m23583a("mAweme");
                }
                if (aweme3 != null) {
                    new C33267i().mo85268d(this.f65494J).mo85269e(this.f65494J).mo85071g(aweme3).mo85275k(C33230ac.m107205a(aweme3)).mo85263a(this.f65500P).mo85252e();
                }
            } else if (num == null || num.intValue() != R.id.bcx) {
                if (num != null && num.intValue() == R.id.bxa) {
                    m81558d(true);
                    LoftView loftView = this.f65520k;
                    if (loftView == null) {
                        C7573i.m23583a("mLoftView");
                    }
                    loftView.mo65023a(false, "click");
                    m81556b(true);
                    String str3 = "click_more_trans_entrance";
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f65494J);
                    String str4 = "group_id";
                    Aweme aweme4 = this.f65513d;
                    if (aweme4 == null) {
                        C7573i.m23583a("mAweme");
                    }
                    if (aweme4 != null) {
                        str = aweme4.getAid();
                    } else {
                        str = null;
                    }
                    C22984d a2 = a.mo59973a(str4, str);
                    String str5 = "author_id";
                    Aweme aweme5 = this.f65513d;
                    if (aweme5 == null) {
                        C7573i.m23583a("mAweme");
                    }
                    if (aweme5 != null) {
                        User author = aweme5.getAuthor();
                        if (author != null) {
                            str2 = author.getUid();
                        }
                    }
                    C6907h.m21524a(str3, (Map) a2.mo59973a(str5, str2).mo59970a("is_long_item", this.f65500P).f60753a);
                } else if (num != null && num.intValue() == R.id.bv7) {
                    View view2 = this.f65488D;
                    if (view2 == null) {
                        C7573i.m23583a("mLoftGuideLL");
                    }
                    view2.setVisibility(8);
                    mo64971e();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r0 != null) goto L_0x00b0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m81554a(int r6, int r7) {
        /*
            r5 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f65535z
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mLoftTitleTv"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r1 = r5.f65512c
            if (r1 != 0) goto L_0x0012
            java.lang.String r2 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0012:
            java.lang.String r1 = r1.getTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6 + 1
            r0.append(r1)
            r1 = 47
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f65485A
            if (r0 != 0) goto L_0x003a
            java.lang.String r1 = "mLoftNumTv"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x003a:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r7 = r5.f65512c
            if (r7 != 0) goto L_0x0048
            java.lang.String r0 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0048:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore r7 = r7.getMore()
            if (r7 != 0) goto L_0x005e
            android.widget.LinearLayout r7 = r5.f65532w
            if (r7 != 0) goto L_0x0057
            java.lang.String r0 = "mMaskBtnContainer"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0057:
            r0 = 8
            r7.setVisibility(r0)
            goto L_0x00fc
        L_0x005e:
            android.widget.LinearLayout r7 = r5.f65532w
            if (r7 != 0) goto L_0x0067
            java.lang.String r0 = "mMaskBtnContainer"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0067:
            r0 = 0
            r7.setVisibility(r0)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r7 = r5.f65533x
            if (r7 != 0) goto L_0x0074
            java.lang.String r0 = "mMaskAuthorAvatar"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0074:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r7 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r7
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r0 = r5.f65512c
            if (r0 != 0) goto L_0x007f
            java.lang.String r1 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x007f:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore r0 = r0.getMore()
            r1 = 0
            if (r0 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getImageUrl()
            goto L_0x008c
        L_0x008b:
            r0 = r1
        L_0x008c:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r7, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r5.f65534y
            if (r7 != 0) goto L_0x0098
            java.lang.String r0 = "mMaskDescTv"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0098:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo r0 = r5.f65512c
            if (r0 != 0) goto L_0x00a1
            java.lang.String r2 = "mLoftVideo"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00a1:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore r0 = r0.getMore()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = r0.getDesc()
            if (r0 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r0 = ""
        L_0x00b0:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.setText(r0)
            java.lang.String r7 = "show_more_button"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r5.f65494J
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f65513d
            if (r3 != 0) goto L_0x00ce
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00ce:
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.f65513d
            if (r3 != 0) goto L_0x00e1
            java.lang.String r4 = "mAweme"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00e1:
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getAuthor()
            if (r3 == 0) goto L_0x00eb
            java.lang.String r1 = r3.getUid()
        L_0x00eb:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r1)
            java.lang.String r1 = "is_long_item"
            int r2 = r5.f65500P
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59970a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r7, r0)
        L_0x00fc:
            r5.m81553a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.adapter.C24846b.m81554a(int, int):void");
    }

    /* renamed from: a */
    public final void mo64967a(String str, LoftVideo loftVideo, int i, int i2) {
        int i3;
        C32752l lVar;
        Video video;
        C7573i.m23587b(loftVideo, "loftVideo");
        if (str == null) {
            str = "";
        }
        this.f65506V = str;
        this.f65512c = loftVideo;
        Aweme aweme = loftVideo.getAweme();
        if (aweme == null) {
            C7573i.m23580a();
        }
        this.f65513d = aweme;
        this.f65507W = i;
        Aweme aweme2 = this.f65513d;
        if (aweme2 == null) {
            C7573i.m23583a("mAweme");
        }
        int i4 = 0;
        if (aweme2.getLongVideos() == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.f65500P = i3;
        Aweme aweme3 = this.f65513d;
        if (aweme3 == null) {
            C7573i.m23583a("mAweme");
        }
        if (aweme3.getLongVideos() == null) {
            lVar = C32752l.f85393a;
        } else {
            lVar = C32752l.f85394b;
        }
        this.f65498N = lVar;
        if (!C24855c.m81593a(this.f65502R)) {
            C10761a.m31399c((Context) this.f65502R, (int) R.string.cjt);
        }
        Activity activity = this.f65502R;
        View view = this.f65516g;
        if (view == null) {
            C7573i.m23583a("mVideoView");
        }
        FrameLayout frameLayout = this.f65527r;
        if (frameLayout == null) {
            C7573i.m23583a("coverContainer");
        }
        View view2 = frameLayout;
        C32752l lVar2 = this.f65498N;
        if (lVar2 != null) {
            Aweme aweme4 = this.f65513d;
            if (aweme4 == null) {
                C7573i.m23583a("mAweme");
            }
            video = lVar2.mo84248a(aweme4);
        } else {
            video = null;
        }
        C32725a.m105934a(activity, view, view2, video, this.f65509Y, this.f65508X);
        LoftVideoPlayView loftVideoPlayView = this.f65518i;
        if (loftVideoPlayView == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        Aweme aweme5 = this.f65513d;
        if (aweme5 == null) {
            C7573i.m23583a("mAweme");
        }
        loftVideoPlayView.mo64939a(aweme5, this.f65498N);
        C32750k kVar = this.f65519j;
        if (kVar == null) {
            C7573i.m23583a("mLongVideoSeekView");
        }
        Aweme aweme6 = this.f65513d;
        if (aweme6 == null) {
            C7573i.m23583a("mAweme");
        }
        Video a = m81551a(aweme6);
        if (a != null) {
            i4 = a.getDuration();
        }
        kVar.mo84244b(i4);
        DiggView diggView = this.f65493I;
        if (diggView != null) {
            FragmentActivity fragmentActivity = this.f65502R;
            Aweme aweme7 = this.f65513d;
            if (aweme7 == null) {
                C7573i.m23583a("mAweme");
            }
            diggView.mo84148a(fragmentActivity, aweme7, null, m81557c(true));
        }
        m81554a(i, i2);
    }

    public C24846b(View view, FragmentActivity fragmentActivity, C43316v vVar, C28297e eVar, boolean z) {
        C7573i.m23587b(view, "convertView");
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(vVar, "playerManager");
        C7573i.m23587b(eVar, "dialogController");
        this.f65501Q = view;
        this.f65502R = fragmentActivity;
        this.f65503S = vVar;
        this.f65504T = eVar;
        this.f65505U = z;
        m81560q();
    }
}
