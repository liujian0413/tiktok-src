package com.p280ss.android.ugc.aweme.welcome;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.dataplatform.p507a.C10034a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.BarHide;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.interest.C32190g.C32191a;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.utils.C42941at;
import com.p280ss.android.ugc.aweme.utils.C42941at.C42945c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity */
public final class WelcomeScreenActivity extends AmeBaseActivity implements C6310a {

    /* renamed from: u */
    public static long f112701u;

    /* renamed from: v */
    public static int f112702v;

    /* renamed from: w */
    public static boolean f112703w;

    /* renamed from: x */
    public static final C43534a f112704x;

    /* renamed from: A */
    private DmtTextView f112705A;

    /* renamed from: B */
    private DmtTextView f112706B;

    /* renamed from: C */
    private RelativeLayout f112707C;

    /* renamed from: D */
    private LayoutParams f112708D;

    /* renamed from: E */
    private ImmersionBar f112709E;

    /* renamed from: F */
    private boolean f112710F;

    /* renamed from: G */
    private Intent f112711G;

    /* renamed from: H */
    private HomeWatcherReceiver f112712H;

    /* renamed from: I */
    private WidgetManager f112713I;

    /* renamed from: a */
    public ViewGroup f112714a;

    /* renamed from: b */
    public LottieAnimationView f112715b;

    /* renamed from: c */
    public boolean f112716c;

    /* renamed from: d */
    public boolean f112717d;

    /* renamed from: e */
    public int f112718e;

    /* renamed from: q */
    public final C6309f f112719q = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: r */
    public float f112720r;

    /* renamed from: s */
    public float f112721s;

    /* renamed from: t */
    public GestureDetector f112722t;

    /* renamed from: y */
    private View f112723y;

    /* renamed from: z */
    private View f112724z;

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$HomeWatcherReceiver */
    public static final class HomeWatcherReceiver extends BroadcastReceiver {

        /* renamed from: a */
        public static final C43533a f112725a = new C43533a(null);

        /* renamed from: b */
        private static final String f112726b = f112726b;

        /* renamed from: c */
        private static final String f112727c = f112727c;

        /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$HomeWatcherReceiver$a */
        public static final class C43533a {
            private C43533a() {
            }

            public /* synthetic */ C43533a(C7571f fVar) {
                this();
            }
        }

        public final void onReceive(Context context, Intent intent) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(intent, "intent");
            if (TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                if (C7573i.m23585a((Object) f112727c, (Object) intent.getStringExtra(f112726b))) {
                    WelcomeScreenActivity.f112704x.mo105437a("background");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$a */
    public static final class C43534a {
        private C43534a() {
        }

        /* renamed from: a */
        public static int m138021a() {
            return WelcomeScreenActivity.f112702v;
        }

        /* renamed from: b */
        public static boolean m138022b() {
            return WelcomeScreenActivity.f112703w;
        }

        /* renamed from: f */
        private static long m138023f() {
            return WelcomeScreenActivity.f112701u;
        }

        /* renamed from: g */
        private static boolean m138024g() {
            if (TextUtils.isEmpty(C32191a.m104469e())) {
                String g = C32326h.m104885g();
                C7573i.m23582a((Object) g, "RegionHelper.getRegion()");
                C32191a.m104466b(g);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("US");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C7634n.m23717a((String) it.next(), C32191a.m104469e(), true)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo105439c() {
            if (C6399b.m19946v() && m138024g()) {
                Boolean a = C28580o.m93828a();
                C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                if (a.booleanValue() && !C6887b.m21436b().mo16909b(C6399b.m19921a(), "key_welcome_has_show", false) && !m138022b() && m138021a() != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo105440d() {
            if (C6399b.m19946v() && m138024g()) {
                Boolean a = C28580o.m93828a();
                C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                if (a.booleanValue() && m138022b() && m138021a() != 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public final int mo105441e() {
            if (!m138024g() || !C32326h.m104882f()) {
                return 0;
            }
            Integer b = C10034a.m29819b(true);
            if (b != null && b.intValue() == 1) {
                return 1;
            }
            if (b != null && b.intValue() == 2) {
                return 2;
            }
            return 0;
        }

        public /* synthetic */ C43534a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo105437a(String str) {
            String str2;
            C7573i.m23587b(str, "enterMethod");
            String str3 = "exit_welcomescreen";
            C22984d a = C22984d.m75611a().mo59973a("enter_method", str).mo59971a("duration", System.currentTimeMillis() - m138023f());
            String str4 = "if_send_fake_feed";
            if (C28434i.m93471b()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
        }

        /* renamed from: a */
        public final boolean mo105438a(Activity activity) {
            if (!mo105439c() || m138022b() || activity == null) {
                return false;
            }
            activity.startActivityForResult(new Intent(activity, WelcomeScreenActivity.class), 18);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$b */
    public static final class C43535b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112728a;

        C43535b(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112728a = welcomeScreenActivity;
        }

        public final void onAnimationEnd(Animator animator) {
            WelcomeScreenActivity.m138011c(this.f112728a).mo7083d();
            WelcomeScreenActivity.m138011c(this.f112728a).mo7085f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$c */
    static final class C43536c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112729a;

        C43536c(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112729a = welcomeScreenActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            WelcomeScreenActivity.f112704x.mo105437a("click");
            this.f112729a.mo59893d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$d */
    public static final class C43537d extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112730a;

        C43537d(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112730a = welcomeScreenActivity;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C7573i.m23587b(motionEvent, "e1");
            C7573i.m23587b(motionEvent2, "e2");
            if (motionEvent2.getRawY() - motionEvent.getRawY() < 0.0f && Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) >= 25.0f && Math.abs(f2) >= 400.0f) {
                WelcomeScreenActivity.f112704x.mo105437a("slide_up");
                this.f112730a.mo59893d();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$e */
    static final class C43538e implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112731a;

        C43538e(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112731a = welcomeScreenActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23582a((Object) motionEvent, "event");
            switch (motionEvent.getAction()) {
                case 0:
                    this.f112731a.f112720r = motionEvent.getRawY();
                    break;
                case 1:
                    if (Math.abs(WelcomeScreenActivity.m138007a(this.f112731a).getTranslationY()) < ((float) (WelcomeScreenActivity.m138007a(this.f112731a).getMeasuredHeight() / 3))) {
                        this.f112731a.mo58711c();
                        break;
                    } else {
                        WelcomeScreenActivity.f112704x.mo105437a("slide_up");
                        this.f112731a.mo59893d();
                        break;
                    }
                case 2:
                    this.f112731a.f112721s = ((float) ((int) motionEvent.getRawY())) - this.f112731a.f112720r;
                    if (this.f112731a.f112721s < 0.0f) {
                        WelcomeScreenActivity.m138007a(this.f112731a).setTranslationY(this.f112731a.f112721s);
                        break;
                    }
                    break;
            }
            WelcomeScreenActivity.m138010b(this.f112731a).onTouchEvent(motionEvent);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$f */
    static final class C43539f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112732a;

        C43539f(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112732a = welcomeScreenActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C43534a.m138021a() == 2 && !this.f112732a.f112716c) {
                this.f112732a.f112717d = true;
                if (this.f112732a.f112719q.hasMessages(0)) {
                    this.f112732a.f112719q.removeMessages(0);
                }
                this.f112732a.f112719q.sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity$g */
    public static final class C43540g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ WelcomeScreenActivity f112733a;

        C43540g(WelcomeScreenActivity welcomeScreenActivity) {
            this.f112733a = welcomeScreenActivity;
        }

        public final void onAnimationStart(Animator animator) {
            this.f112733a.f112719q.sendEmptyMessageDelayed(0, 5500);
        }

        public final void onAnimationRepeat(Animator animator) {
            this.f112733a.f112718e++;
            if (this.f112733a.f112718e == 2) {
                this.f112733a.mo105434i();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m138009a(Activity activity) {
        return f112704x.mo105438a(activity);
    }

    /* renamed from: j */
    public static final boolean m138012j() {
        return f112704x.mo105439c();
    }

    /* renamed from: k */
    public static final boolean m138013k() {
        return f112704x.mo105440d();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.fh;
    }

    public final void onBackPressed() {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        C43534a aVar = new C43534a(null);
        f112704x = aVar;
        f112702v = aVar.mo105441e();
    }

    /* renamed from: d */
    public final void mo59893d() {
        C43543a.m138035a(this.f112711G, this);
        finish();
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ch);
    }

    public final void onDestroy() {
        super.onDestroy();
        f112703w = false;
        ImmersionBar immersionBar = this.f112709E;
        if (immersionBar == null) {
            C7573i.m23583a("mImmersionBar");
        }
        immersionBar.destroy();
    }

    public final void onStop() {
        super.onStop();
        if (this.f112710F) {
            this.f112710F = false;
            unregisterReceiver(this.f112712H);
        }
    }

    /* renamed from: n */
    private final void m138016n() {
        if (this.f112717d) {
            m138008a("click");
        } else {
            m138008a("auto");
        }
        RelativeLayout relativeLayout = this.f112707C;
        if (relativeLayout == null) {
            C7573i.m23583a("mStartWatching");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "fadeIn");
        ofFloat.setDuration(1300);
        this.f112716c = true;
        ofFloat.start();
    }

    /* renamed from: c */
    public final void mo58711c() {
        ViewGroup viewGroup = this.f112714a;
        if (viewGroup == null) {
            C7573i.m23583a("mFrameRootView");
        }
        viewGroup.clearAnimation();
        ViewGroup viewGroup2 = this.f112714a;
        if (viewGroup2 == null) {
            C7573i.m23583a("mFrameRootView");
        }
        ObjectAnimator.ofFloat(viewGroup2, View.TRANSLATION_Y, new float[]{0.0f}).start();
    }

    /* renamed from: i */
    public final void mo105434i() {
        LottieAnimationView lottieAnimationView = this.f112715b;
        if (lottieAnimationView == null) {
            C7573i.m23583a("mSwipeUpHand");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lottieAnimationView, "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "fadeOut");
        ofFloat.setDuration(400);
        ofFloat.addListener(new C43535b(this));
        ofFloat.start();
    }

    /* renamed from: m */
    private final void m138015m() {
        if (f112702v == 2) {
            RelativeLayout relativeLayout = this.f112707C;
            if (relativeLayout == null) {
                C7573i.m23583a("mStartWatching");
            }
            relativeLayout.setOnClickListener(new C43536c(this));
        }
        if (f112702v == 1) {
            ViewGroup viewGroup = this.f112714a;
            if (viewGroup == null) {
                C7573i.m23583a("mFrameRootView");
            }
            this.f112722t = new GestureDetector(viewGroup.getContext(), new C43537d(this));
            ViewGroup viewGroup2 = this.f112714a;
            if (viewGroup2 == null) {
                C7573i.m23583a("mFrameRootView");
            }
            viewGroup2.setOnTouchListener(new C43538e(this));
        }
        ViewGroup viewGroup3 = this.f112714a;
        if (viewGroup3 == null) {
            C7573i.m23583a("mFrameRootView");
        }
        viewGroup3.setOnClickListener(new C43539f(this));
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity", "onResume", true);
        super.onResume();
        ImmersionBar fullScreen = ImmersionBar.with((Activity) this).hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR).fullScreen(true);
        C7573i.m23582a((Object) fullScreen, "ImmersionBar.with(this).…ION_BAR).fullScreen(true)");
        this.f112709E = fullScreen;
        ImmersionBar immersionBar = this.f112709E;
        if (immersionBar == null) {
            C7573i.m23583a("mImmersionBar");
        }
        immersionBar.init();
        this.f112712H = new HomeWatcherReceiver();
        registerReceiver(this.f112712H, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        this.f112710F = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity", "onResume", false);
    }

    /* renamed from: l */
    private final void m138014l() {
        View findViewById = findViewById(R.id.apb);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.frame_root_view)");
        this.f112714a = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.eac);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.video_container)");
        this.f112723y = findViewById2;
        View findViewById3 = findViewById(R.id.eh6);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.widget_root)");
        this.f112724z = findViewById3;
        View findViewById4 = findViewById(R.id.dej);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.swipe_up_text)");
        this.f112705A = (DmtTextView) findViewById4;
        DmtTextView dmtTextView = this.f112705A;
        if (dmtTextView == null) {
            C7573i.m23583a("mSwipeUpText");
        }
        dmtTextView.setFontType(C10834d.f29332b);
        View findViewById5 = findViewById(R.id.dac);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.start_watching_text)");
        this.f112706B = (DmtTextView) findViewById5;
        DmtTextView dmtTextView2 = this.f112706B;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mStartWatchText");
        }
        dmtTextView2.setFontType(C10834d.f29332b);
        View findViewById6 = findViewById(R.id.deh);
        C7573i.m23582a((Object) findViewById6, "findViewById(R.id.swipe_up_hand)");
        this.f112715b = (LottieAnimationView) findViewById6;
        View findViewById7 = findViewById(R.id.dab);
        C7573i.m23582a((Object) findViewById7, "findViewById(R.id.start_watching)");
        this.f112707C = (RelativeLayout) findViewById7;
        RelativeLayout relativeLayout = this.f112707C;
        if (relativeLayout == null) {
            C7573i.m23583a("mStartWatching");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            this.f112708D = (LayoutParams) layoutParams;
            LayoutParams layoutParams2 = this.f112708D;
            if (layoutParams2 == null) {
                C7573i.m23583a("mLayoutParams");
            }
            C42945c a = C42941at.m136307a((Context) this);
            C7573i.m23582a((Object) a, "DeviceInfo.getScreenInfo(this)");
            double d = (double) a.f111482c;
            Double.isNaN(d);
            layoutParams2.bottomMargin = (int) (d * 0.07d);
            RelativeLayout relativeLayout2 = this.f112707C;
            if (relativeLayout2 == null) {
                C7573i.m23583a("mStartWatching");
            }
            LayoutParams layoutParams3 = this.f112708D;
            if (layoutParams3 == null) {
                C7573i.m23583a("mLayoutParams");
            }
            relativeLayout2.setLayoutParams(layoutParams3);
            if (f112702v == 1) {
                DmtTextView dmtTextView3 = this.f112705A;
                if (dmtTextView3 == null) {
                    C7573i.m23583a("mSwipeUpText");
                }
                dmtTextView3.setVisibility(0);
            } else if (f112702v == 2) {
                LottieAnimationView lottieAnimationView = this.f112715b;
                if (lottieAnimationView == null) {
                    C7573i.m23583a("mSwipeUpHand");
                }
                lottieAnimationView.mo7076a((AnimatorListener) new C43540g(this));
            }
            FragmentActivity fragmentActivity = this;
            View view = this.f112724z;
            if (view == null) {
                C7573i.m23583a("mWidgetRoot");
            }
            this.f112713I = WidgetManager.m75869a(fragmentActivity, view);
            WidgetManager widgetManager = this.f112713I;
            if (widgetManager != null) {
                View view2 = this.f112723y;
                if (view2 == null) {
                    C7573i.m23583a("mVideoContainer");
                }
                widgetManager.mo60152a(view2, (Widget) new WelcomeVideoWidget());
            }
            m138015m();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m138007a(WelcomeScreenActivity welcomeScreenActivity) {
        ViewGroup viewGroup = welcomeScreenActivity.f112714a;
        if (viewGroup == null) {
            C7573i.m23583a("mFrameRootView");
        }
        return viewGroup;
    }

    /* renamed from: b */
    public static final /* synthetic */ GestureDetector m138010b(WelcomeScreenActivity welcomeScreenActivity) {
        GestureDetector gestureDetector = welcomeScreenActivity.f112722t;
        if (gestureDetector == null) {
            C7573i.m23583a("mGestureDetector");
        }
        return gestureDetector;
    }

    /* renamed from: c */
    public static final /* synthetic */ LottieAnimationView m138011c(WelcomeScreenActivity welcomeScreenActivity) {
        LottieAnimationView lottieAnimationView = welcomeScreenActivity.f112715b;
        if (lottieAnimationView == null) {
            C7573i.m23583a("mSwipeUpHand");
        }
        return lottieAnimationView;
    }

    /* renamed from: a */
    private static void m138008a(String str) {
        C6907h.m21524a("start_watching_button_show", (Map) C22984d.m75611a().mo59973a("start_watching_button_show", str).mo59971a("duration", System.currentTimeMillis() - f112701u).f60753a);
    }

    public final void onNewIntent(Intent intent) {
        Intent intent2;
        super.onNewIntent(intent);
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            this.f112711G = intent2;
        }
        setIntent(intent);
    }

    public final void handleMsg(Message message) {
        Integer num;
        if (message != null) {
            num = Integer.valueOf(message.what);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            RelativeLayout relativeLayout = this.f112707C;
            if (relativeLayout == null) {
                C7573i.m23583a("mStartWatching");
            }
            relativeLayout.setAlpha(0.0f);
            RelativeLayout relativeLayout2 = this.f112707C;
            if (relativeLayout2 == null) {
                C7573i.m23583a("mStartWatching");
            }
            relativeLayout2.setVisibility(0);
            this.f112716c = true;
            m138016n();
        } else if (num != null && num.intValue() == 1) {
            LottieAnimationView lottieAnimationView = this.f112715b;
            if (lottieAnimationView == null) {
                C7573i.m23583a("mSwipeUpHand");
            }
            lottieAnimationView.mo7078b();
        } else {
            if (num != null && num.intValue() == 2 && f112702v == 1) {
                LottieAnimationView lottieAnimationView2 = this.f112715b;
                if (lottieAnimationView2 == null) {
                    C7573i.m23583a("mSwipeUpHand");
                }
                lottieAnimationView2.mo7085f();
                LottieAnimationView lottieAnimationView3 = this.f112715b;
                if (lottieAnimationView3 == null) {
                    C7573i.m23583a("mSwipeUpHand");
                }
                lottieAnimationView3.mo7078b();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity", "onCreate", true);
        super.onCreate(bundle);
        f112701u = System.currentTimeMillis();
        f112703w = true;
        m138014l();
        C6907h.m21524a("welcomescreen_show", (Map) new HashMap());
        C6887b.m21436b().mo16902a(C6399b.m19921a(), "key_welcome_has_show", true);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            intent = (Intent) intent2.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent = null;
        }
        if (intent != null) {
            this.f112711G = intent;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.welcome.WelcomeScreenActivity", "onCreate", false);
    }
}
