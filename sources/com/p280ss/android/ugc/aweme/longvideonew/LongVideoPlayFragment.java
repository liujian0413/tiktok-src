package com.p280ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
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
import com.p280ss.android.ugc.aweme.longvideo.p1374a.C32716a;
import com.p280ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior.C32756a;
import com.p280ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout;
import com.p280ss.android.ugc.aweme.longvideo.view.DoubleClickDiggFrameLayout.C32757a;
import com.p280ss.android.ugc.aweme.longvideonew.C32779c.C32780a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32793a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32795b.C32796a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32797c;
import com.p280ss.android.ugc.aweme.longvideonew.feature.C32798d;
import com.p280ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController;
import com.p280ss.android.ugc.aweme.longvideonew.feature.NoOperateModeController.C32785a;
import com.p280ss.android.ugc.aweme.longvideonew.feature.Rotate;
import com.p280ss.android.ugc.aweme.longvideonew.feature.Rotate.C32787a;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoFunctionalLayerWidget;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoOperationWidget;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget;
import com.p280ss.android.ugc.aweme.longvideonew.widget.VideoSeekContainerWidget;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43527w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment */
public final class LongVideoPlayFragment extends AmeBaseFragment implements C0053p<C23083a>, OnClickListener, C23254a, C28343z<C28318an>, C28519d, C32785a {

    /* renamed from: y */
    public static final C32764a f85438y = new C32764a(null);

    /* renamed from: A */
    private int f85439A;

    /* renamed from: B */
    private String f85440B = "";

    /* renamed from: C */
    private C28297e f85441C;

    /* renamed from: D */
    private FrameLayout f85442D;

    /* renamed from: E */
    private FrameLayout f85443E;

    /* renamed from: F */
    private C32797c f85444F;

    /* renamed from: G */
    private HashMap f85445G;

    /* renamed from: e */
    public Aweme f85446e;

    /* renamed from: f */
    public boolean f85447f;

    /* renamed from: g */
    public DataCenter f85448g;

    /* renamed from: h */
    public Rotate f85449h;

    /* renamed from: i */
    public Video f85450i;

    /* renamed from: j */
    public String f85451j = "";

    /* renamed from: k */
    public C32793a f85452k;

    /* renamed from: l */
    public NoOperateModeController f85453l;

    /* renamed from: m */
    public FrameLayout f85454m;

    /* renamed from: n */
    public DoubleClickDiggFrameLayout f85455n;

    /* renamed from: o */
    public FrameLayout f85456o;

    /* renamed from: p */
    public FrameLayout f85457p;

    /* renamed from: q */
    public CommerceLikeLayout f85458q;

    /* renamed from: r */
    public CommerceEggLayout f85459r;

    /* renamed from: s */
    public View f85460s;

    /* renamed from: t */
    public ImageView f85461t;

    /* renamed from: u */
    public RelativeLayout f85462u;

    /* renamed from: v */
    public VideoPlayerWidget f85463v;

    /* renamed from: w */
    public C24641b f85464w;

    /* renamed from: x */
    public C24638b f85465x;

    /* renamed from: z */
    private String f85466z = "noBusinessType";

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$a */
    public static final class C32764a {
        private C32764a() {
        }

        public /* synthetic */ C32764a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static LongVideoPlayFragment m106062a(Aweme aweme, String str, int i, String str2, int i2, String str3) {
            C7573i.m23587b(str, "eventType");
            C7573i.m23587b(str2, "businessType");
            C7573i.m23587b(str3, "reactSessionId");
            Bundle bundle = new Bundle();
            bundle.putString("extra_event_type", str);
            bundle.putInt("extra_page_type", i);
            bundle.putString("extra_business_type", str2);
            bundle.putInt("extra_initial_time", i2);
            bundle.putString("extra_react_session_id", str3);
            LongVideoPlayFragment longVideoPlayFragment = new LongVideoPlayFragment();
            longVideoPlayFragment.setArguments(bundle);
            longVideoPlayFragment.f85446e = aweme;
            return longVideoPlayFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$b */
    static final class C32765b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85467a;

        C32765b(LongVideoPlayFragment longVideoPlayFragment) {
            this.f85467a = longVideoPlayFragment;
        }

        public final void run() {
            FrameLayout frameLayout = this.f85467a.f85457p;
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            FrameLayout frameLayout2 = this.f85467a.f85457p;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$c */
    static final class C32766c implements Runnable {

        /* renamed from: a */
        public static final C32766c f85468a = new C32766c();

        C32766c() {
        }

        public final void run() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$d */
    public static final class C32767d extends C0343a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85469a;

        /* renamed from: b */
        final /* synthetic */ CustomBottomSheetBehavior f85470b;

        C32767d(LongVideoPlayFragment longVideoPlayFragment, CustomBottomSheetBehavior customBottomSheetBehavior) {
            this.f85469a = longVideoPlayFragment;
            this.f85470b = customBottomSheetBehavior;
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i == 1) {
                Rotate rotate = this.f85469a.f85449h;
                if (rotate != null && rotate.f85525d) {
                    this.f85470b.mo1357b(4);
                }
            } else if (i == 5) {
                FragmentActivity activity = this.f85469a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
            if (Float.isNaN(f)) {
                View view2 = this.f85469a.f85460s;
                if (view2 != null) {
                    view2.setAlpha(1.0f);
                }
                RelativeLayout relativeLayout = this.f85469a.f85462u;
                if (relativeLayout != null) {
                    relativeLayout.setAlpha(1.0f);
                }
                return;
            }
            float abs = Math.abs(f);
            if (abs > 0.0f && abs < 0.15f) {
                float f2 = abs / 0.15f;
                RelativeLayout relativeLayout2 = this.f85469a.f85462u;
                if (relativeLayout2 != null) {
                    relativeLayout2.setAlpha(1.0f - f2);
                }
            }
            if (abs > 0.15f) {
                float f3 = (abs - 0.15f) / 0.85f;
                View view3 = this.f85469a.f85460s;
                if (view3 != null) {
                    view3.setAlpha(1.0f - f3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$e */
    public static final class C32768e implements C32756a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85471a;

        C32768e(LongVideoPlayFragment longVideoPlayFragment) {
            this.f85471a = longVideoPlayFragment;
        }

        /* renamed from: a */
        public final void mo64987a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C7573i.m23587b(coordinatorLayout, "parent");
            C7573i.m23587b(view, "child");
            C7573i.m23587b(motionEvent, "event");
            DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85471a.f85455n;
            if (doubleClickDiggFrameLayout != null) {
                doubleClickDiggFrameLayout.mo84250a(motionEvent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$f */
    public static final class C32769f implements C32787a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85472a;

        /* renamed from: b */
        final /* synthetic */ C32798d f85473b;

        /* renamed from: a */
        public final void mo84277a(boolean z) {
            this.f85472a.f85447f = z;
            ImageView imageView = this.f85472a.f85461t;
            if (imageView != null) {
                imageView.setSelected(this.f85472a.f85447f);
            }
            DataCenter dataCenter = this.f85472a.f85448g;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f85472a.f85447f));
            }
            C32793a aVar = this.f85472a.f85452k;
            if (aVar != null) {
                aVar.mo84323a(this.f85472a.f85447f);
            }
            C32796a.m106156a((Activity) this.f85472a.getActivity(), (View) this.f85472a.f85456o, (View) this.f85472a.f85454m, this.f85472a.f85450i, this.f85473b, this.f85472a.f85447f);
            LongVideoPlayFragment.m106049f();
        }

        C32769f(LongVideoPlayFragment longVideoPlayFragment, C32798d dVar) {
            this.f85472a = longVideoPlayFragment;
            this.f85473b = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$g */
    public static final class C32770g implements C32778b {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85474a;

        /* renamed from: a */
        public final long mo84278a() {
            VideoPlayerWidget videoPlayerWidget = this.f85474a.f85463v;
            if (videoPlayerWidget != null) {
                return videoPlayerWidget.mo84340a();
            }
            return 0;
        }

        C32770g(LongVideoPlayFragment longVideoPlayFragment) {
            this.f85474a = longVideoPlayFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment$h */
    public static final class C32771h implements C32757a {

        /* renamed from: a */
        final /* synthetic */ LongVideoPlayFragment f85475a;

        /* renamed from: b */
        public final void mo64985b() {
            NoOperateModeController noOperateModeController = this.f85475a.f85453l;
            if (noOperateModeController == null || !noOperateModeController.f85514c) {
                NoOperateModeController noOperateModeController2 = this.f85475a.f85453l;
                if (noOperateModeController2 != null) {
                    noOperateModeController2.mo84298a(0);
                    return;
                }
                return;
            }
            LongVideoPlayFragment.m106049f();
        }

        /* renamed from: a */
        public final void mo64984a() {
            String str;
            DataCenter dataCenter = this.f85475a.f85448g;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_container_on_double_click_digg", (Object) "onDoubleClickDigg");
            }
            if (this.f85475a.f85446e != null) {
                if (C24664i.m80832a()) {
                    CommerceEggLayout commerceEggLayout = this.f85475a.f85459r;
                    if (commerceEggLayout != null) {
                        commerceEggLayout.mo64484a(this.f85475a.f85464w, this.f85475a.f85465x, 1, true);
                    }
                } else {
                    CommerceLikeLayout commerceLikeLayout = this.f85475a.f85458q;
                    if (commerceLikeLayout != null) {
                        String str2 = this.f85475a.f85451j;
                        Aweme aweme = this.f85475a.f85446e;
                        if (aweme != null) {
                            str = aweme.getAid();
                        } else {
                            str = null;
                        }
                        commerceLikeLayout.mo66138a(str2, str);
                    }
                }
            }
        }

        C32771h(LongVideoPlayFragment longVideoPlayFragment) {
            this.f85475a = longVideoPlayFragment;
        }
    }

    /* renamed from: m */
    private void m106055m() {
        if (this.f85445G != null) {
            this.f85445G.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m106055m();
    }

    /* renamed from: f */
    public static void m106049f() {
        C42961az.m136380a(new C32716a());
    }

    /* renamed from: k */
    private final int m106053k() {
        Resources resources = getResources();
        C7573i.m23582a((Object) resources, "resources");
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public final void mo84273a() {
        if (this.f85447f) {
            Rotate rotate = this.f85449h;
            if (rotate != null) {
                rotate.mo84308b();
            }
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: l */
    private final C32798d m106054l() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WindowManager windowManager = activity.getWindowManager();
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (defaultDisplay != null) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
        }
        return C32796a.m106153a(displayMetrics.widthPixels, C23482j.m77105f(getActivity()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m106050g() {
        /*
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0010
            java.lang.String r1 = "extra_event_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            r3.f85451j = r0
            android.os.Bundle r0 = r3.getArguments()
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r2 = "extra_page_type"
            int r1 = r0.getInt(r2, r1)
        L_0x0021:
            r3.f85439A = r1
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0033
            java.lang.String r1 = "extra_business_type"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r0 = ""
        L_0x0035:
            r3.f85466z = r0
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = "extra_react_session_id"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto L_0x0049
        L_0x0047:
            java.lang.String r0 = ""
        L_0x0049:
            r3.f85440B = r0
            r0 = 0
            r3.f85450i = r0
            java.lang.String r0 = "long_video_player_activity"
            java.lang.String r1 = r3.f85466z
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.longvideonew.g r0 = com.p280ss.android.ugc.aweme.longvideonew.C32799g.f85556b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f85446e
            r0.mo84325a(r1)
        L_0x005f:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.f85450i
            if (r0 != 0) goto L_0x006d
            com.ss.android.ugc.aweme.longvideonew.g r0 = com.p280ss.android.ugc.aweme.longvideonew.C32799g.f85555a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r3.f85446e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.mo84325a(r1)
            r3.f85450i = r0
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.m106050g():void");
    }

    /* renamed from: i */
    private final void m106051i() {
        if ("long_video_player_activity".equals(this.f85466z)) {
            C32798d l = m106054l();
            DataCenter dataCenter = this.f85448g;
            if (dataCenter != null) {
                dataCenter.mo60134a("action_is_landscape_mode", (Object) Boolean.valueOf(this.f85447f));
            }
            C32796a.m106156a((Activity) getActivity(), (View) this.f85456o, (View) this.f85454m, this.f85450i, l, this.f85447f);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f85449h = new Rotate((AmeSSActivity) activity, this.f85450i);
                Rotate rotate = this.f85449h;
                if (rotate != null) {
                    rotate.mo84307a((C32787a) new C32769f(this, l));
                }
                m106052j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
        }
    }

    /* renamed from: j */
    private final void m106052j() {
        LayoutParams layoutParams;
        CustomBottomSheetBehavior customBottomSheetBehavior = new CustomBottomSheetBehavior();
        customBottomSheetBehavior.f1347m = new C32767d(this, customBottomSheetBehavior);
        customBottomSheetBehavior.f1340f = true;
        if (!C22911a.m75401a(getActivity())) {
            customBottomSheetBehavior.mo1352a(C23482j.m77095a(getActivity()) + m106053k() + C21085a.m71116a((Context) getActivity()));
        } else {
            customBottomSheetBehavior.mo1352a(C23482j.m77095a(getActivity()) + m106053k());
        }
        customBottomSheetBehavior.f1341g = true;
        customBottomSheetBehavior.mo1357b(3);
        customBottomSheetBehavior.mo84249a(new C32768e(this));
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85455n;
        if (doubleClickDiggFrameLayout != null) {
            layoutParams = doubleClickDiggFrameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            C0355d dVar = (C0355d) layoutParams;
            if (dVar != null) {
                dVar.mo1454a((Behavior) customBottomSheetBehavior);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.design.widget.CoordinatorLayout.LayoutParams");
    }

    /* renamed from: d */
    public final void mo66376d() {
        if (!this.f85447f) {
            ImageView imageView = this.f85461t;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        FrameLayout frameLayout = this.f85443E;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (animate != null) {
                ViewPropertyAnimator alpha = animate.alpha(0.34f);
                if (alpha != null) {
                    ViewPropertyAnimator duration = alpha.setDuration(200);
                    if (duration != null) {
                        duration.start();
                    }
                }
            }
        }
        if (C32780a.m106109a()) {
            FrameLayout frameLayout2 = this.f85457p;
            if (frameLayout2 != null) {
                ViewPropertyAnimator animate2 = frameLayout2.animate();
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
            return;
        }
        FrameLayout frameLayout3 = this.f85457p;
        if (frameLayout3 != null) {
            ViewPropertyAnimator animate3 = frameLayout3.animate();
            if (animate3 != null) {
                ViewPropertyAnimator alpha3 = animate3.alpha(0.0f);
                if (alpha3 != null) {
                    ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                    if (duration3 != null) {
                        ViewPropertyAnimator withEndAction = duration3.withEndAction(new C32765b(this));
                        if (withEndAction != null) {
                            withEndAction.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo66377e() {
        ImageView imageView = this.f85461t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        FrameLayout frameLayout = this.f85443E;
        if (frameLayout != null) {
            ViewPropertyAnimator animate = frameLayout.animate();
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
        if (!this.f85447f) {
            if (C32780a.m106109a()) {
                FrameLayout frameLayout2 = this.f85457p;
                if (frameLayout2 != null) {
                    ViewPropertyAnimator animate2 = frameLayout2.animate();
                    if (animate2 != null) {
                        ViewPropertyAnimator alpha2 = animate2.alpha(1.0f);
                        if (alpha2 != null) {
                            ViewPropertyAnimator duration2 = alpha2.setDuration(200);
                            if (duration2 != null) {
                                duration2.start();
                            }
                        }
                    }
                }
                return;
            }
            FrameLayout frameLayout3 = this.f85457p;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(0);
            }
            FrameLayout frameLayout4 = this.f85457p;
            if (frameLayout4 != null) {
                frameLayout4.setAlpha(0.0f);
            }
            FrameLayout frameLayout5 = this.f85457p;
            if (frameLayout5 != null) {
                ViewPropertyAnimator animate3 = frameLayout5.animate();
                if (animate3 != null) {
                    ViewPropertyAnimator alpha3 = animate3.alpha(1.0f);
                    if (alpha3 != null) {
                        ViewPropertyAnimator duration3 = alpha3.setDuration(200);
                        if (duration3 != null) {
                            ViewPropertyAnimator withEndAction = duration3.withEndAction(C32766c.f85468a);
                            if (withEndAction != null) {
                                withEndAction.start();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onDestroy() {
        boolean z;
        LongVideoPlayFragment longVideoPlayFragment;
        super.onDestroy();
        C28297e eVar = this.f85441C;
        if (eVar != null) {
            eVar.mo71836c();
        }
        if (C13015c.m37973a(this.f85440B) || this.f85463v == null || this.f85446e == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            longVideoPlayFragment = this;
        } else {
            longVideoPlayFragment = null;
        }
        LongVideoPlayFragment longVideoPlayFragment2 = longVideoPlayFragment;
        if (longVideoPlayFragment2 != null) {
            String str = longVideoPlayFragment2.f85440B;
            VideoPlayerWidget videoPlayerWidget = longVideoPlayFragment2.f85463v;
            if (videoPlayerWidget == null) {
                C7573i.m23580a();
            }
            long a = videoPlayerWidget.mo84340a();
            Aweme aweme = longVideoPlayFragment2.f85446e;
            if (aweme == null) {
                C7573i.m23580a();
            }
            String aid = aweme.getAid();
            C7573i.m23582a((Object) aid, "mAweme!!.aid");
            C43527w wVar = new C43527w(str, 2, a, aid);
            C42961az.m136380a(wVar);
        }
        if (C24664i.m80832a()) {
            CommerceEggLayout commerceEggLayout = this.f85459r;
            if (commerceEggLayout != null) {
                commerceEggLayout.mo64482a();
            }
            this.f85464w = null;
            this.f85465x = null;
        }
    }

    /* renamed from: a */
    public final String mo64928a(boolean z) {
        return this.f85451j;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Rotate rotate = this.f85449h;
        if (rotate != null) {
            rotate.mo84306a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b7g) {
            mo84273a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2091198651) {
                if (hashCode != 356960147) {
                    if (hashCode == 441659136 && str.equals("resize_video_and_cover")) {
                        this.f85444F = (C32797c) aVar.mo60161a();
                        C32796a.m106156a((Activity) getActivity(), (View) this.f85456o, (View) this.f85454m, this.f85450i, m106054l(), this.f85447f);
                    }
                } else if (str.equals("action_video_on_play_completed") && !this.f85447f) {
                    ImageView imageView = this.f85461t;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    mo66377e();
                    NoOperateModeController noOperateModeController = this.f85453l;
                    if (noOperateModeController != null) {
                        noOperateModeController.f85514c = false;
                    }
                }
            } else if (str.equals("action_switch_mode")) {
                Rotate rotate = this.f85449h;
                if (rotate != null) {
                    rotate.mo84308b();
                }
            }
        }
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
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
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
                    C28297e eVar = this.f85441C;
                    if (eVar != null) {
                        str = eVar.mo71843n();
                    }
                    if (str == null) {
                        str = "";
                    }
                    FragmentActivity requireActivity = requireActivity();
                    C7573i.m23582a((Object) requireActivity, "requireActivity()");
                    a.showReportDialog(aweme, str, requireActivity, "");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo60522a(int i, KeyEvent keyEvent) {
        switch (i) {
            case 24:
                DataCenter dataCenter = this.f85448g;
                if (dataCenter != null) {
                    dataCenter.mo60134a("action_keycode_volume_up", (Object) Integer.valueOf(i));
                }
                return true;
            case 25:
                DataCenter dataCenter2 = this.f85448g;
                if (dataCenter2 != null) {
                    dataCenter2.mo60134a("action_keycode_volume_down", (Object) Integer.valueOf(i));
                }
                return true;
            default:
                return false;
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m106050g();
        if (C24664i.m80832a()) {
            this.f85464w = C24655d.m80817a(this.f85446e, true);
            if (this.f85464w != null) {
                this.f85465x = C24655d.m80816a(this.f85446e, this.f85451j);
            }
        } else {
            CommerceLikeLayout commerceLikeLayout = this.f85458q;
            if (commerceLikeLayout != null) {
                commerceLikeLayout.setCommerceDigg(this.f85446e);
            }
        }
        this.f85441C = new C28297e(this.f85451j, this.f85439A, this, this);
        C28297e eVar = this.f85441C;
        if (eVar != null) {
            eVar.mo71834a(getActivity(), this);
        }
        C28297e eVar2 = this.f85441C;
        if (eVar2 != null) {
            eVar2.mo71830a();
        }
        Fragment fragment = this;
        this.f85448g = DataCenter.m75849a(C23087c.m75887a(fragment, this), (C0043i) this);
        DataCenter dataCenter = this.f85448g;
        if (dataCenter != null) {
            dataCenter.mo60132a("action_switch_mode", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter2 = this.f85448g;
        if (dataCenter2 != null) {
            dataCenter2.mo60132a("action_video_on_play_completed", (C0053p<C23083a>) this);
        }
        DataCenter dataCenter3 = this.f85448g;
        if (dataCenter3 != null) {
            dataCenter3.mo60132a("resize_video_and_cover", (C0053p<C23083a>) this);
        }
        WidgetManager a = WidgetManager.m75867a(fragment, (View) this.f85442D);
        C7573i.m23582a((Object) a, "widgetManager");
        a.mo60153a(this.f85448g);
        Aweme aweme = this.f85446e;
        String str = this.f85451j;
        int i = this.f85439A;
        String str2 = this.f85466z;
        C28297e eVar3 = this.f85441C;
        Bundle arguments = getArguments();
        if (arguments == null) {
            C7573i.m23580a();
        }
        VideoPlayerWidget videoPlayerWidget = new VideoPlayerWidget(aweme, str, i, str2, eVar3, arguments.getInt("extra_initial_time", 0), this.f85440B);
        this.f85463v = videoPlayerWidget;
        a.mo60157b(R.id.eba, this.f85463v);
        VideoOperationWidget videoOperationWidget = new VideoOperationWidget(this.f85446e, this.f85451j, this.f85439A, this.f85466z, new C32770g(this), this.f85441C);
        a.mo60157b(R.id.c8z, videoOperationWidget);
        a.mo60157b(R.id.cch, new VideoSeekContainerWidget(this.f85446e, this.f85451j, this.f85439A, this.f85466z));
        a.mo60157b(R.id.apu, new VideoFunctionalLayerWidget(this.f85446e, this.f85451j, this.f85439A, this.f85466z));
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout = this.f85455n;
        if (doubleClickDiggFrameLayout != null) {
            doubleClickDiggFrameLayout.setOnDiggListener(new C32771h(this));
        }
        if (!C32782e.m106111a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjt);
        }
        m106051i();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        DoubleClickDiggFrameLayout doubleClickDiggFrameLayout;
        RelativeLayout relativeLayout;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        CommerceLikeLayout commerceLikeLayout;
        CommerceEggLayout commerceEggLayout;
        ImageView imageView;
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.os, viewGroup, false);
        if (inflate != null) {
            this.f85442D = (FrameLayout) inflate;
            FrameLayout frameLayout4 = this.f85442D;
            FrameLayout frameLayout5 = null;
            if (frameLayout4 != null) {
                view = frameLayout4.findViewById(R.id.lm);
            } else {
                view = null;
            }
            this.f85460s = view;
            FrameLayout frameLayout6 = this.f85442D;
            if (frameLayout6 != null) {
                doubleClickDiggFrameLayout = (DoubleClickDiggFrameLayout) frameLayout6.findViewById(R.id.eb9);
            } else {
                doubleClickDiggFrameLayout = null;
            }
            this.f85455n = doubleClickDiggFrameLayout;
            FrameLayout frameLayout7 = this.f85442D;
            if (frameLayout7 != null) {
                relativeLayout = (RelativeLayout) frameLayout7.findViewById(R.id.dl5);
            } else {
                relativeLayout = null;
            }
            this.f85462u = relativeLayout;
            FrameLayout frameLayout8 = this.f85442D;
            if (frameLayout8 != null) {
                frameLayout = (FrameLayout) frameLayout8.findViewById(R.id.apu);
            } else {
                frameLayout = null;
            }
            this.f85454m = frameLayout;
            FrameLayout frameLayout9 = this.f85442D;
            if (frameLayout9 != null) {
                frameLayout2 = (FrameLayout) frameLayout9.findViewById(R.id.c8z);
            } else {
                frameLayout2 = null;
            }
            this.f85457p = frameLayout2;
            FrameLayout frameLayout10 = this.f85442D;
            if (frameLayout10 != null) {
                frameLayout3 = (FrameLayout) frameLayout10.findViewById(R.id.eba);
            } else {
                frameLayout3 = null;
            }
            this.f85456o = frameLayout3;
            FrameLayout frameLayout11 = this.f85442D;
            if (frameLayout11 != null) {
                commerceLikeLayout = (CommerceLikeLayout) frameLayout11.findViewById(R.id.a0_);
            } else {
                commerceLikeLayout = null;
            }
            this.f85458q = commerceLikeLayout;
            FrameLayout frameLayout12 = this.f85442D;
            if (frameLayout12 != null) {
                commerceEggLayout = (CommerceEggLayout) frameLayout12.findViewById(R.id.a0o);
            } else {
                commerceEggLayout = null;
            }
            this.f85459r = commerceEggLayout;
            FrameLayout frameLayout13 = this.f85442D;
            if (frameLayout13 != null) {
                imageView = (ImageView) frameLayout13.findViewById(R.id.b7g);
            } else {
                imageView = null;
            }
            this.f85461t = imageView;
            ImageView imageView2 = this.f85461t;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            ImageView imageView3 = this.f85461t;
            if (imageView3 != null) {
                imageView3.setSelected(false);
            }
            FrameLayout frameLayout14 = this.f85442D;
            if (frameLayout14 != null) {
                frameLayout5 = (FrameLayout) frameLayout14.findViewById(R.id.cch);
            }
            this.f85443E = frameLayout5;
            this.f85452k = new C32793a(getActivity(), this.f85442D, this.f85443E);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f85453l = new NoOperateModeController((AmeSSActivity) activity);
                NoOperateModeController noOperateModeController = this.f85453l;
                if (noOperateModeController != null) {
                    noOperateModeController.mo84299a((C32785a) this);
                }
                return this.f85442D;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.AmeSSActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
