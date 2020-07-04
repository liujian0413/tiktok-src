package com.p280ss.android.ugc.aweme.longvideo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.CoordinatorLayout;
import android.support.p022v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.AudioControlView;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24641b;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24655d;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24664i;
import com.p280ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p280ss.android.ugc.aweme.commercialize.egg.p1123a.C24638b;
import com.p280ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.listener.C28519d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.p280ss.android.ugc.aweme.longvideo.DiggView.C32699a;
import com.p280ss.android.ugc.aweme.longvideo.LongVideoPlayView.C32712b;
import com.p280ss.android.ugc.aweme.longvideo.feature.C32744a;
import com.p280ss.android.ugc.aweme.longvideo.feature.LoadingController;
import com.p280ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob;
import com.p280ss.android.ugc.aweme.longvideo.feature.NoOperateModeController;
import com.p280ss.android.ugc.aweme.longvideo.feature.NoOperateModeController.C32736a;
import com.p280ss.android.ugc.aweme.longvideo.feature.Rotate;
import com.p280ss.android.ugc.aweme.longvideo.feature.Rotate.C32738a;
import com.p280ss.android.ugc.aweme.longvideo.feature.VolumeController;
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
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.playerkit.videoview.C44962h;
import com.p280ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity */
public final class LongVideoPlayActivity extends AmeSSActivity implements OnClickListener, C28343z<C28318an>, C28519d, C32715a, C32736a {

    /* renamed from: P */
    public static final C32700a f85215P = new C32700a(null);

    /* renamed from: A */
    public LinearLayout f85216A;

    /* renamed from: B */
    public LineProgressBar f85217B;

    /* renamed from: C */
    public AudioControlView f85218C;

    /* renamed from: D */
    public boolean f85219D;

    /* renamed from: E */
    public Rotate f85220E;

    /* renamed from: F */
    public DiggView f85221F;

    /* renamed from: G */
    public String f85222G = "";

    /* renamed from: H */
    public int f85223H;

    /* renamed from: I */
    public LongVideoPlayMob f85224I;

    /* renamed from: J */
    public LongVideoMobViewModel f85225J;

    /* renamed from: K */
    public C32752l f85226K;

    /* renamed from: L */
    public NoOperateModeController f85227L;

    /* renamed from: M */
    public C24641b f85228M;

    /* renamed from: N */
    public C24638b f85229N;

    /* renamed from: O */
    public C32726d f85230O = new C32726d(0, 0);

    /* renamed from: Q */
    private final ArrayList<C23254a> f85231Q = new ArrayList<>();

    /* renamed from: a */
    public View f85232a;

    /* renamed from: b */
    public ImageView f85233b;

    /* renamed from: c */
    public ImageView f85234c;

    /* renamed from: d */
    public Aweme f85235d;

    /* renamed from: e */
    public C28297e f85236e;

    /* renamed from: f */
    public CustomBottomSheetBehavior<View> f85237f;

    /* renamed from: g */
    public VideoViewComponent f85238g;

    /* renamed from: h */
    public View f85239h;

    /* renamed from: i */
    public CommerceLikeLayout f85240i;

    /* renamed from: j */
    public CommerceEggLayout f85241j;

    /* renamed from: k */
    public VideoPlaySeekBar f85242k;

    /* renamed from: l */
    public LongVideoPlayView f85243l;

    /* renamed from: m */
    public C32750k f85244m;

    /* renamed from: n */
    public LongVideoDiggAnimationView f85245n;

    /* renamed from: o */
    public ImageView f85246o;

    /* renamed from: p */
    public ImageView f85247p;

    /* renamed from: q */
    public ImageView f85248q;

    /* renamed from: r */
    public ImageView f85249r;

    /* renamed from: s */
    public DoubleClickDiggFrameLayout f85250s;

    /* renamed from: t */
    public AnimatedImageView f85251t;

    /* renamed from: u */
    public FrameLayout f85252u;

    /* renamed from: v */
    public View f85253v;

    /* renamed from: w */
    public RelativeLayout f85254w;

    /* renamed from: x */
    public FrameLayout f85255x;

    /* renamed from: y */
    public C32748j f85256y;

    /* renamed from: z */
    public LinearLayout f85257z;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$a */
    public static final class C32700a {
        private C32700a() {
        }

        public /* synthetic */ C32700a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$b */
    static final class C32701b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85258a;

        C32701b(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85258a = longVideoPlayActivity;
        }

        public final void run() {
            LinearLayout linearLayout = this.f85258a.f85216A;
            if (linearLayout != null) {
                linearLayout.setAlpha(1.0f);
            }
            LinearLayout linearLayout2 = this.f85258a.f85216A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$c */
    static final class C32702c implements Runnable {

        /* renamed from: a */
        public static final C32702c f85259a = new C32702c();

        C32702c() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$d */
    public static final class C32703d extends C0343a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85260a;

        C32703d(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85260a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f85260a.f85220E;
                if (rotate != null && rotate.f85352d) {
                    CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f85260a.f85237f;
                    if (customBottomSheetBehavior != null) {
                        customBottomSheetBehavior.mo1357b(4);
                    }
                }
            } else if (i == 5) {
                this.f85260a.finish();
            }
        }

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                this.f85260a.mo84165h().setAlpha(1.0f);
                this.f85260a.mo84166i().setAlpha(1.0f);
                return;
            }
            float abs = Math.abs(f);
            if (abs > 0.0f && abs < 0.15f) {
                this.f85260a.mo84166i().setAlpha(1.0f - (abs / 0.15f));
            }
            if (abs > 0.15f) {
                this.f85260a.mo84165h().setAlpha(1.0f - ((abs - 0.15f) / 0.85f));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$e */
    public static final class C32704e implements C32756a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85261a;

        C32704e(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85261a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo64987a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C7573i.m23587b(coordinatorLayout, "parent");
            C7573i.m23587b(view, "child");
            C7573i.m23587b(motionEvent, "event");
            this.f85261a.mo84163f().mo84250a(motionEvent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$f */
    static final class C32705f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85262a;

        C32705f(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85262a = longVideoPlayActivity;
        }

        public final void run() {
            this.f85262a.mo84159b(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$g */
    public static final class C32706g implements C32712b {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85263a;

        /* renamed from: a */
        public final View mo84176a() {
            return this.f85263a.mo84156a();
        }

        /* renamed from: b */
        public final void mo84177b() {
            this.f85263a.mo84156a().setSelected(false);
        }

        /* renamed from: c */
        public final void mo84178c() {
            this.f85263a.mo84156a().setSelected(true);
        }

        C32706g(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85263a = longVideoPlayActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$h */
    public static final class C32707h implements C32738a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85264a;

        C32707h(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85264a = longVideoPlayActivity;
        }

        /* renamed from: a */
        public final void mo84179a(boolean z) {
            LongVideoPlayActivity.m105839k();
            if (z) {
                this.f85264a.f85219D = true;
                C32725a.m105934a((Activity) this.f85264a, this.f85264a.mo84158b(), (View) this.f85264a.mo84164g(), this.f85264a.mo84157a(this.f85264a.f85235d), this.f85264a.f85230O, z);
                ImageView imageView = this.f85264a.f85234c;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.a2u);
                }
                LinearLayout linearLayout = this.f85264a.f85216A;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.f85264a.mo84162e().setImageResource(R.drawable.aby);
            } else {
                this.f85264a.f85219D = false;
                C32725a.m105934a((Activity) this.f85264a, this.f85264a.mo84158b(), (View) this.f85264a.mo84164g(), this.f85264a.mo84157a(this.f85264a.f85235d), this.f85264a.f85230O, z);
                ImageView imageView2 = this.f85264a.f85234c;
                if (imageView2 != null) {
                    imageView2.setImageResource(R.drawable.vx);
                }
                LinearLayout linearLayout2 = this.f85264a.f85216A;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                this.f85264a.mo84162e().setImageResource(R.drawable.abu);
            }
            this.f85264a.mo84167j().mo84241a(this.f85264a.f85219D);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$i */
    public static final class C32708i implements C32757a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85265a;

        /* renamed from: b */
        public final void mo64985b() {
            if (LongVideoPlayActivity.m105836a(this.f85265a).f85340c) {
                LongVideoPlayActivity.m105839k();
            } else {
                LongVideoPlayActivity.m105836a(this.f85265a).mo84216a(0);
            }
        }

        /* renamed from: a */
        public final void mo64984a() {
            String str;
            DiggView diggView = this.f85265a.f85221F;
            if (diggView != null) {
                diggView.mo84147a();
            }
            if (this.f85265a.f85235d != null) {
                if (C24664i.m80832a()) {
                    this.f85265a.mo84161d().mo64484a(this.f85265a.f85228M, this.f85265a.f85229N, 1, true);
                    return;
                }
                CommerceLikeLayout c = this.f85265a.mo84160c();
                String a = this.f85265a.mo64928a(true);
                Aweme aweme = this.f85265a.f85235d;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                c.mo66138a(a, str);
            }
        }

        C32708i(LongVideoPlayActivity longVideoPlayActivity) {
            this.f85265a = longVideoPlayActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity$j */
    public static final class C32709j extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayActivity f85266a;

        /* renamed from: b */
        final /* synthetic */ boolean f85267b;

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            super.onAnimationEnd(animator);
            if (!this.f85267b) {
                this.f85266a.finish();
            }
        }

        C32709j(LongVideoPlayActivity longVideoPlayActivity, boolean z) {
            this.f85266a = longVideoPlayActivity;
            this.f85267b = z;
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        m105840l();
    }

    /* renamed from: k */
    public static void m105839k() {
        C42961az.m136380a(new C32716a());
    }

    /* renamed from: b */
    public final View mo84158b() {
        View view = this.f85239h;
        if (view == null) {
            C7573i.m23583a("mVideoView");
        }
        return view;
    }

    /* renamed from: c */
    public final CommerceLikeLayout mo84160c() {
        CommerceLikeLayout commerceLikeLayout = this.f85240i;
        if (commerceLikeLayout == null) {
            C7573i.m23583a("mCommerceLikeLayout");
        }
        return commerceLikeLayout;
    }

    /* renamed from: d */
    public final CommerceEggLayout mo84161d() {
        CommerceEggLayout commerceEggLayout = this.f85241j;
        if (commerceEggLayout == null) {
            C7573i.m23583a("mCommerceEggLayout");
        }
        return commerceEggLayout;
    }

    /* renamed from: e */
    public final ImageView mo84162e() {
        ImageView imageView = this.f85248q;
        if (imageView == null) {
            C7573i.m23583a("mIvRotate");
        }
        return imageView;
    }

    /* renamed from: f */
    public final DoubleClickDiggFrameLayout mo84163f() {
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85250s;
        if (doubleClickDiggFrameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        return doubleClickDiggFrameLayout;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ax);
    }

    /* renamed from: g */
    public final FrameLayout mo84164g() {
        FrameLayout frameLayout = this.f85252u;
        if (frameLayout == null) {
            C7573i.m23583a("coverContainer");
        }
        return frameLayout;
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.ac4);
    }

    /* renamed from: h */
    public final View mo84165h() {
        View view = this.f85253v;
        if (view == null) {
            C7573i.m23583a("mBgContainer");
        }
        return view;
    }

    /* renamed from: i */
    public final RelativeLayout mo84166i() {
        RelativeLayout relativeLayout = this.f85254w;
        if (relativeLayout == null) {
            C7573i.m23583a("mToolContainer");
        }
        return relativeLayout;
    }

    /* renamed from: j */
    public final C32748j mo84167j() {
        C32748j jVar = this.f85256y;
        if (jVar == null) {
            C7573i.m23583a("mLongVideoScreenHelper");
        }
        return jVar;
    }

    /* renamed from: l */
    private void m105840l() {
        if (C22911a.m75401a(this)) {
            m105842q();
        } else {
            m105841m();
        }
    }

    /* renamed from: r */
    private final void m105843r() {
        String stringExtra = getIntent().getStringExtra("extra_event_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f85222G = stringExtra;
        this.f85223H = getIntent().getIntExtra("extra_page_type", 0);
    }

    /* renamed from: t */
    private final int m105845t() {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    public final void onBackPressed() {
        if (this.f85219D) {
            Rotate rotate = this.f85220E;
            if (rotate != null) {
                rotate.mo84226b();
            }
        } else {
            mo84159b(false);
        }
    }

    /* renamed from: p */
    public final void mo64983p() {
        if (!this.f85219D) {
            ImageView imageView = this.f85234c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            mo64981o();
            NoOperateModeController noOperateModeController = this.f85227L;
            if (noOperateModeController == null) {
                C7573i.m23583a("noOperationModeController");
            }
            noOperateModeController.f85340c = false;
        }
    }

    /* renamed from: m */
    private final void m105841m() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            return;
        }
        Window window = getWindow();
        C7573i.m23582a((Object) window, "window");
        View decorView = window.getDecorView();
        C7573i.m23582a((Object) decorView, "decorView");
        decorView.setSystemUiVisibility(1284);
    }

    /* renamed from: q */
    private final void m105842q() {
        if (VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            C7573i.m23582a((Object) window, "window");
            window.setStatusBarColor(getStatusBarColor());
        } else if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(this, getStatusBarColor());
        }
        C23487o.m77149b((Activity) this);
    }

    /* renamed from: v */
    private C32726d m105847v() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = getWindowManager();
        C7573i.m23582a((Object) windowManager, "windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return C32725a.m105938b(displayMetrics.widthPixels, C23482j.m77105f(this));
    }

    /* renamed from: a */
    public final ImageView mo84156a() {
        ImageView imageView = this.f85233b;
        if (imageView == null) {
            C7573i.m23583a("mIvPlay");
        }
        return imageView;
    }

    public final void onDestroy() {
        super.onDestroy();
        C28297e eVar = this.f85236e;
        if (eVar != null) {
            eVar.mo71836c();
        }
        this.f85231Q.clear();
        if (C24664i.m80832a()) {
            CommerceEggLayout commerceEggLayout = this.f85241j;
            if (commerceEggLayout == null) {
                C7573i.m23583a("mCommerceEggLayout");
            }
            commerceEggLayout.mo64482a();
            this.f85228M = null;
            this.f85229N = null;
            return;
        }
        CommerceLikeLayout commerceLikeLayout = this.f85240i;
        if (commerceLikeLayout == null) {
            C7573i.m23583a("mCommerceLikeLayout");
        }
        commerceLikeLayout.mo66137a();
    }

    /* renamed from: s */
    private final void m105844s() {
        BottomSheetBehavior a = BottomSheetBehavior.m1365a(findViewById(R.id.cws));
        if (a != null) {
            this.f85237f = (CustomBottomSheetBehavior) a;
            CustomBottomSheetBehavior<View> customBottomSheetBehavior = this.f85237f;
            if (customBottomSheetBehavior != null) {
                customBottomSheetBehavior.f1347m = new C32703d(this);
                customBottomSheetBehavior.f1340f = true;
                Context context = this;
                if (!C22911a.m75401a(context)) {
                    customBottomSheetBehavior.mo1352a(C23482j.m77095a(context) + m105845t() + C21085a.m71116a(context));
                } else {
                    customBottomSheetBehavior.mo1352a(C23482j.m77095a(context) + m105845t());
                }
                customBottomSheetBehavior.f1341g = true;
                customBottomSheetBehavior.mo1357b(3);
            }
            CustomBottomSheetBehavior<View> customBottomSheetBehavior2 = this.f85237f;
            if (customBottomSheetBehavior2 != null) {
                customBottomSheetBehavior2.mo84249a(new C32704e(this));
            }
            FrameLayout frameLayout = this.f85255x;
            if (frameLayout == null) {
                C7573i.m23583a("mRootContainer");
            }
            frameLayout.postDelayed(new C32705f(this), 50);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior<android.view.View!>");
    }

    /* renamed from: n */
    public final void mo64980n() {
        if (!this.f85219D) {
            ImageView imageView = this.f85234c;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        LinearLayout linearLayout = this.f85216A;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        ViewPropertyAnimator withEndAction = duration.withEndAction(new C32701b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
        LinearLayout linearLayout2 = this.f85257z;
        if (linearLayout2 != null) {
            ViewPropertyAnimator animate2 = linearLayout2.animate();
            if (animate2 != null) {
                ViewPropertyAnimator alpha2 = animate2.alpha(0.34f);
                if (alpha2 != null) {
                    ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                    if (duration2 != null) {
                        duration2.start();
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo64981o() {
        ImageView imageView = this.f85234c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        LinearLayout linearLayout = this.f85257z;
        if (linearLayout != null) {
            ViewPropertyAnimator animate = linearLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(1.0f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (!this.f85219D) {
            LinearLayout linearLayout2 = this.f85216A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = this.f85216A;
            if (linearLayout3 != null) {
                linearLayout3.setAlpha(0.0f);
            }
            LinearLayout linearLayout4 = this.f85216A;
            if (linearLayout4 != null) {
                ViewPropertyAnimator animate2 = linearLayout4.animate();
                if (animate2 != null) {
                    ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                    if (alpha2 != null) {
                        ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                        if (duration2 != null) {
                            ViewPropertyAnimator withEndAction = duration2.withEndAction(C32702c.f85259a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private void m105846u() {
        Video video;
        int i;
        int i2;
        C43316v vVar = new C43316v(true);
        this.f85226K = C32752l.f85394b;
        Context context = this;
        if (!C32746h.m106009a(context)) {
            C10761a.m31399c(context, (int) R.string.cjt);
        }
        FragmentActivity fragmentActivity = this;
        this.f85225J = C32719a.m105913a(fragmentActivity, this.f85235d, this.f85222G, this.f85223H, 1);
        this.f85230O = m105847v();
        Activity activity = this;
        View view = this.f85239h;
        if (view == null) {
            C7573i.m23583a("mVideoView");
        }
        FrameLayout frameLayout = this.f85252u;
        if (frameLayout == null) {
            C7573i.m23583a("coverContainer");
        }
        View view2 = frameLayout;
        C32752l lVar = this.f85226K;
        if (lVar != null) {
            video = lVar.mo84248a(this.f85235d);
        } else {
            video = null;
        }
        C32725a.m105934a(activity, view, view2, video, this.f85230O, this.f85219D);
        C32752l lVar2 = this.f85226K;
        VideoViewComponent videoViewComponent = this.f85238g;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoViewComponent");
        }
        AnimatedImageView animatedImageView = this.f85251t;
        if (animatedImageView == null) {
            C7573i.m23583a("mCover");
        }
        ImageView imageView = this.f85249r;
        if (imageView == null) {
            C7573i.m23583a("mIvReplay");
        }
        LongVideoPlayView longVideoPlayView = new LongVideoPlayView(this, lVar2, videoViewComponent, animatedImageView, imageView, vVar);
        this.f85243l = longVideoPlayView;
        LongVideoPlayView longVideoPlayView2 = this.f85243l;
        if (longVideoPlayView2 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        longVideoPlayView2.mo84183a(this.f85235d);
        LongVideoPlayView longVideoPlayView3 = this.f85243l;
        if (longVideoPlayView3 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        longVideoPlayView3.mo84184a((C32712b) new C32706g(this));
        VideoPlaySeekBar videoPlaySeekBar = this.f85242k;
        if (videoPlaySeekBar == null) {
            C7573i.m23583a("mVideoSeekBar");
        }
        LongVideoPlayView longVideoPlayView4 = this.f85243l;
        if (longVideoPlayView4 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        this.f85244m = new C32750k(videoPlaySeekBar, longVideoPlayView4);
        C32750k kVar = this.f85244m;
        if (kVar == null) {
            C7573i.m23583a("mLongVideoSeekView");
        }
        Video a = mo84157a(this.f85235d);
        int i3 = 0;
        if (a != null) {
            i = a.getDuration();
        } else {
            i = 0;
        }
        kVar.mo84244b(i);
        LongVideoPlayView longVideoPlayView5 = this.f85243l;
        if (longVideoPlayView5 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        C32750k kVar2 = this.f85244m;
        if (kVar2 == null) {
            C7573i.m23583a("mLongVideoSeekView");
        }
        longVideoPlayView5.f85270b = kVar2;
        this.f85236e = new C28297e(this.f85222G, this.f85223H, this, this);
        C28297e eVar = this.f85236e;
        if (eVar != null) {
            eVar.mo71834a(activity, null);
        }
        C28297e eVar2 = this.f85236e;
        if (eVar2 != null) {
            eVar2.mo71830a();
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85250s;
        if (doubleClickDiggFrameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        View view3 = doubleClickDiggFrameLayout;
        View view4 = this.f85239h;
        if (view4 == null) {
            C7573i.m23583a("mVideoView");
        }
        this.f85220E = new Rotate(fragmentActivity, view3, view4, mo84157a(this.f85235d));
        Rotate rotate = this.f85220E;
        if (rotate != null) {
            rotate.mo84225a((C32738a) new C32707h(this));
        }
        Video a2 = mo84157a(this.f85235d);
        if (a2 != null) {
            i2 = a2.getWidth();
        } else {
            i2 = 0;
        }
        Video a3 = mo84157a(this.f85235d);
        if (a3 != null) {
            i3 = a3.getHeight();
        }
        if (!C32725a.m105937a(i2, i3)) {
            ImageView imageView2 = this.f85248q;
            if (imageView2 == null) {
                C7573i.m23583a("mIvRotate");
            }
            imageView2.setVisibility(8);
        }
        this.f85224I = new LongVideoPlayMob(fragmentActivity, vVar);
        LongVideoPlayView longVideoPlayView6 = this.f85243l;
        if (longVideoPlayView6 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        LongVideoPlayMob longVideoPlayMob = this.f85224I;
        if (longVideoPlayMob == null) {
            C7573i.m23583a("mLongVideoPlayMob");
        }
        longVideoPlayView6.mo84186a((C34976f) longVideoPlayMob);
        C32750k kVar3 = this.f85244m;
        if (kVar3 == null) {
            C7573i.m23583a("mLongVideoSeekView");
        }
        LongVideoPlayMob longVideoPlayMob2 = this.f85224I;
        if (longVideoPlayMob2 == null) {
            C7573i.m23583a("mLongVideoPlayMob");
        }
        kVar3.mo84243a((OnSeekBarChangeListener) longVideoPlayMob2);
        LongVideoDiggAnimationView longVideoDiggAnimationView = this.f85245n;
        if (longVideoDiggAnimationView == null) {
            C7573i.m23583a("mIvDigg");
        }
        this.f85221F = new DiggView(longVideoDiggAnimationView, null, this.f85222G);
        DiggView diggView = this.f85221F;
        if (diggView != null) {
            Aweme aweme = this.f85235d;
            CommerceLikeLayout commerceLikeLayout = this.f85240i;
            if (commerceLikeLayout == null) {
                C7573i.m23583a("mCommerceLikeLayout");
            }
            diggView.mo84148a(fragmentActivity, aweme, commerceLikeLayout, mo64928a(true));
        }
        DiggView diggView2 = this.f85221F;
        if (diggView2 != null) {
            LongVideoPlayMob longVideoPlayMob3 = this.f85224I;
            if (longVideoPlayMob3 == null) {
                C7573i.m23583a("mLongVideoPlayMob");
            }
            diggView2.mo84150a((C32699a) longVideoPlayMob3);
        }
        DiggView diggView3 = this.f85221F;
        if (diggView3 != null) {
            CommerceEggLayout commerceEggLayout = this.f85241j;
            if (commerceEggLayout == null) {
                C7573i.m23583a("mCommerceEggLayout");
            }
            diggView3.mo84149a(commerceEggLayout, this.f85228M, this.f85229N);
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout2 = this.f85250s;
        if (doubleClickDiggFrameLayout2 == null) {
            C7573i.m23583a("mRootView");
        }
        this.f85227L = new NoOperateModeController(fragmentActivity, doubleClickDiggFrameLayout2);
        NoOperateModeController noOperateModeController = this.f85227L;
        if (noOperateModeController == null) {
            C7573i.m23583a("noOperationModeController");
        }
        noOperateModeController.mo84217a((C32736a) this);
        ImageView imageView3 = this.f85234c;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
        ImageView imageView4 = this.f85246o;
        if (imageView4 == null) {
            C7573i.m23583a("mCommentView");
        }
        OnClickListener onClickListener = this;
        imageView4.setOnClickListener(onClickListener);
        ImageView imageView5 = this.f85247p;
        if (imageView5 == null) {
            C7573i.m23583a("mShareView");
        }
        imageView5.setOnClickListener(onClickListener);
        ImageView imageView6 = this.f85248q;
        if (imageView6 == null) {
            C7573i.m23583a("mIvRotate");
        }
        imageView6.setOnClickListener(onClickListener);
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout3 = this.f85250s;
        if (doubleClickDiggFrameLayout3 == null) {
            C7573i.m23583a("mRootView");
        }
        doubleClickDiggFrameLayout3.setOnDiggListener(new C32708i(this));
        LongVideoPlayView longVideoPlayView7 = this.f85243l;
        if (longVideoPlayView7 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        C28297e eVar3 = this.f85236e;
        LongVideoPlayView longVideoPlayView8 = this.f85243l;
        if (longVideoPlayView8 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        longVideoPlayView7.mo84185a((C32733d) new C32744a(eVar3, longVideoPlayView8, vVar));
        LoadingController loadingController = new LoadingController(fragmentActivity, this.f85217B);
        LongVideoPlayView longVideoPlayView9 = this.f85243l;
        if (longVideoPlayView9 == null) {
            C7573i.m23583a("mLongVideoPlayView");
        }
        longVideoPlayView9.mo84186a((C34976f) loadingController);
        VolumeController volumeController = new VolumeController(fragmentActivity, this.f85218C);
        if (C24664i.m80832a()) {
            this.f85228M = C24655d.m80817a(this.f85235d, true);
            if (this.f85228M != null) {
                this.f85229N = C24655d.m80816a(this.f85235d, mo64928a(true));
            }
        } else {
            CommerceLikeLayout commerceLikeLayout2 = this.f85240i;
            if (commerceLikeLayout2 == null) {
                C7573i.m23583a("mCommerceLikeLayout");
            }
            commerceLikeLayout2.setCommerceDigg(this.f85235d);
        }
        m105837a((C23254a) volumeController);
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f85222G;
    }

    public final void setRootView(View view) {
        this.f85232a = view;
    }

    public final void setMBgContainer(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f85253v = view;
    }

    public final void setMVideoView(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f85239h = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ NoOperateModeController m105836a(LongVideoPlayActivity longVideoPlayActivity) {
        NoOperateModeController noOperateModeController = longVideoPlayActivity.f85227L;
        if (noOperateModeController == null) {
            C7573i.m23583a("noOperationModeController");
        }
        return noOperateModeController;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Rotate rotate = this.f85220E;
        if (rotate != null) {
            rotate.mo84224a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: a */
    private void m105837a(C23254a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f85231Q.add(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo64929a(C28318an anVar) {
        Integer num;
        User user;
        String str = null;
        if (anVar != null) {
            num = Integer.valueOf(anVar.f74631a);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            C6900g b = C6900g.m21454b();
            C7573i.m23582a((Object) b, "NetworkStateManager.getInstance()");
            if (!b.mo16943d()) {
                C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
                return;
            }
            Object obj = anVar.f74632b;
            if (obj != null) {
                Aweme aweme = (Aweme) obj;
                if (aweme != null) {
                    user = aweme.getAuthor();
                } else {
                    user = null;
                }
                if (user != null) {
                    ShareDependService a = C37950a.m121238a();
                    C28297e eVar = this.f85236e;
                    if (eVar != null) {
                        str = eVar.mo71843n();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a.showReportDialog(aweme, str, this, "");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* renamed from: a */
    public final Video mo84157a(Aweme aweme) {
        C32752l lVar = this.f85226K;
        if (lVar != null) {
            return lVar.mo84248a(aweme);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo84159b(boolean z) {
        float f = 0.0f;
        if (z) {
            View view = this.f85253v;
            if (view == null) {
                C7573i.m23583a("mBgContainer");
            }
            view.setAlpha(0.0f);
            FrameLayout frameLayout = this.f85255x;
            if (frameLayout == null) {
                C7573i.m23583a("mRootContainer");
            }
            frameLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.f85254w;
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
        View view2 = this.f85253v;
        if (view2 == null) {
            C7573i.m23583a("mBgContainer");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "alpha", new float[]{f, f2}).setDuration(250);
        FrameLayout frameLayout2 = this.f85255x;
        if (frameLayout2 == null) {
            C7573i.m23583a("mRootContainer");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(frameLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        RelativeLayout relativeLayout2 = this.f85254w;
        if (relativeLayout2 == null) {
            C7573i.m23583a("mToolContainer");
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(relativeLayout2, "alpha", new float[]{f, f2}).setDuration(250);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(duration).with(duration2).with(duration3);
        animatorSet.start();
        animatorSet.addListener(new C32709j(this, z));
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        m105839k();
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b7g) {
            onBackPressed();
            return;
        }
        if (num != null && num.intValue() == R.id.b7p) {
            C28297e eVar = this.f85236e;
            if (eVar != null) {
                eVar.mo62620a(new C24202a(this.f85235d).mo62904a());
            }
        } else if (num != null && num.intValue() == R.id.bc7) {
            C28297e eVar2 = this.f85236e;
            if (eVar2 != null) {
                eVar2.mo71983a((Activity) this, this.f85235d);
            }
            Aweme aweme = this.f85235d;
            if (aweme != null) {
                new C33267i().mo85268d(this.f85222G).mo85269e(this.f85222G).mo85071g(aweme).mo85275k(C33230ac.m107205a(aweme)).mo85263a(1).mo85252e();
            }
        } else if (num != null && num.intValue() == R.id.bcx) {
            Rotate rotate = this.f85220E;
            if (rotate != null) {
                rotate.mo84226b();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onCreate", true);
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (window != null) {
                window.setNavigationBarColor(-16777216);
            }
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        superOverridePendingTransition(R.anim.aw, 0);
        setContentView((int) R.layout.kn);
        m105843r();
        View findViewById = findViewById(R.id.cws);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root_view)");
        this.f85250s = (DoubleClickDiggFrameLayout) findViewById;
        this.f85238g = new VideoViewComponent();
        VideoViewComponent videoViewComponent = this.f85238g;
        if (videoViewComponent == null) {
            C7573i.m23583a("mVideoViewComponent");
        }
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85250s;
        if (doubleClickDiggFrameLayout == null) {
            C7573i.m23583a("mRootView");
        }
        videoViewComponent.mo107432a((ViewGroup) doubleClickDiggFrameLayout);
        VideoViewComponent videoViewComponent2 = this.f85238g;
        if (videoViewComponent2 == null) {
            C7573i.m23583a("mVideoViewComponent");
        }
        C44962h hVar = videoViewComponent2.f115582b;
        C7573i.m23582a((Object) hVar, "mVideoViewComponent.surfaceHolder");
        View a = hVar.mo107454a();
        C7573i.m23582a((Object) a, "mVideoViewComponent.surfaceHolder.view");
        this.f85239h = a;
        View findViewById2 = findViewById(R.id.a0_);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.commerce_like_layout)");
        this.f85240i = (CommerceLikeLayout) findViewById2;
        View findViewById3 = findViewById(R.id.a0o);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.commmerce_egg_layout)");
        this.f85241j = (CommerceEggLayout) findViewById3;
        this.f85234c = (ImageView) findViewById(R.id.b7g);
        View findViewById4 = findViewById(R.id.ebh);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.video_seek_bar)");
        this.f85242k = (VideoPlaySeekBar) findViewById4;
        View findViewById5 = findViewById(R.id.bb4);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.iv_play)");
        this.f85233b = (ImageView) findViewById5;
        View findViewById6 = findViewById(R.id.bbh);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.iv_replay)");
        this.f85249r = (ImageView) findViewById6;
        View findViewById7 = findViewById(R.id.b8j);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.iv_digg)");
        this.f85245n = (LongVideoDiggAnimationView) findViewById7;
        View findViewById8 = findViewById(R.id.b7p);
        C7573i.m23582a((Object) findViewById8, "findViewById(R.id.iv_comment)");
        this.f85246o = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.bc7);
        C7573i.m23582a((Object) findViewById9, "findViewById(R.id.iv_share)");
        this.f85247p = (ImageView) findViewById9;
        View findViewById10 = findViewById(R.id.bcx);
        C7573i.m23582a((Object) findViewById10, "findViewById(R.id.iv_switch_mode)");
        this.f85248q = (ImageView) findViewById10;
        this.f85216A = (LinearLayout) findViewById(R.id.c8y);
        this.f85257z = (LinearLayout) findViewById(R.id.ccf);
        this.f85217B = (LineProgressBar) findViewById(R.id.cce);
        this.f85218C = (AudioControlView) findViewById(R.id.hs);
        View findViewById11 = findViewById(R.id.a4g);
        C7573i.m23582a((Object) findViewById11, "findViewById(R.id.cover)");
        this.f85251t = (AnimatedImageView) findViewById11;
        View findViewById12 = findViewById(R.id.a4h);
        C7573i.m23582a((Object) findViewById12, "findViewById(R.id.cover_container)");
        this.f85252u = (FrameLayout) findViewById12;
        View findViewById13 = findViewById(R.id.lm);
        C7573i.m23582a((Object) findViewById13, "findViewById(R.id.bg_container)");
        this.f85253v = findViewById13;
        View findViewById14 = findViewById(R.id.dl5);
        C7573i.m23582a((Object) findViewById14, "findViewById(R.id.tool_container)");
        this.f85254w = (RelativeLayout) findViewById14;
        View findViewById15 = findViewById(R.id.amt);
        C7573i.m23582a((Object) findViewById15, "findViewById(R.id.fl_root_container)");
        this.f85255x = (FrameLayout) findViewById15;
        Context context = this;
        FrameLayout frameLayout = this.f85255x;
        if (frameLayout == null) {
            C7573i.m23583a("mRootContainer");
        }
        View view = frameLayout;
        LinearLayout linearLayout = this.f85257z;
        if (linearLayout != null) {
            this.f85256y = new C32748j(context, view, linearLayout);
            this.f85235d = C32734e.m105951a();
            m105844s();
            m105846u();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideo.LongVideoPlayActivity", "onCreate", false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        Iterator it = this.f85231Q.iterator();
        while (it.hasNext()) {
            if (((C23254a) it.next()).mo60522a(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
