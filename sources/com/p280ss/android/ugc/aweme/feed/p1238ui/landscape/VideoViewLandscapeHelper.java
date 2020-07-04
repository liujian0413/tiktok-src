package com.p280ss.android.ugc.aweme.feed.p1238ui.landscape;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ContentResolver;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.support.p022v4.app.Fragment;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p564d.C10788b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper */
public final class VideoViewLandscapeHelper implements C0042h, C0053p<C23083a> {

    /* renamed from: l */
    public static final C28903a f76189l = new C28903a(null);

    /* renamed from: A */
    private final int f76190A;

    /* renamed from: a */
    public int f76191a;

    /* renamed from: b */
    public int f76192b;

    /* renamed from: c */
    public float f76193c = 1.0f;

    /* renamed from: d */
    public int f76194d = -1;

    /* renamed from: e */
    public int f76195e;

    /* renamed from: f */
    public final Runnable f76196f;

    /* renamed from: g */
    public final FrameLayout f76197g;

    /* renamed from: h */
    public final View f76198h;

    /* renamed from: i */
    public final TextView f76199i;

    /* renamed from: j */
    public final DataCenter f76200j;

    /* renamed from: k */
    public final InteractStickerViewModel f76201k;

    /* renamed from: m */
    private Aweme f76202m;

    /* renamed from: n */
    private boolean f76203n;

    /* renamed from: o */
    private int f76204o = -1;

    /* renamed from: p */
    private int f76205p = -1;

    /* renamed from: q */
    private int f76206q;

    /* renamed from: r */
    private int f76207r;

    /* renamed from: s */
    private int f76208s;

    /* renamed from: t */
    private int f76209t;

    /* renamed from: u */
    private long f76210u = -1;

    /* renamed from: v */
    private final Runnable f76211v;

    /* renamed from: w */
    private final Fragment f76212w;

    /* renamed from: x */
    private final View f76213x;

    /* renamed from: y */
    private final View f76214y;

    /* renamed from: z */
    private final String f76215z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$ViewWrapper */
    public static final class ViewWrapper {
        private final View mTargetView;

        public final int getHeight() {
            return this.mTargetView.getLayoutParams().height;
        }

        public final int getWidth() {
            return this.mTargetView.getLayoutParams().width;
        }

        public ViewWrapper(View view) {
            C7573i.m23587b(view, "mTargetView");
            this.mTargetView = view;
        }

        public final void setHeight(int i) {
            this.mTargetView.getLayoutParams().height = i;
            this.mTargetView.requestLayout();
        }

        public final void setWidth(int i) {
            this.mTargetView.getLayoutParams().width = i;
            this.mTargetView.requestLayout();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$a */
    public static final class C28903a {
        private C28903a() {
        }

        /* renamed from: a */
        public static boolean m95102a(int i, int i2) {
            return i > i2;
        }

        public /* synthetic */ C28903a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$b */
    public static final class C28904b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f76216a;

        public final void onGlobalLayout() {
            this.f76216a.f76191a = this.f76216a.f76197g.getWidth();
            this.f76216a.f76192b = this.f76216a.f76197g.getHeight();
            this.f76216a.mo74185f();
            this.f76216a.f76197g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C28904b(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f76216a = videoViewLandscapeHelper;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$c */
    static final class C28905c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f76217a;

        C28905c(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f76217a = videoViewLandscapeHelper;
        }

        public final void run() {
            switch (this.f76217a.f76195e) {
                case 0:
                    this.f76217a.f76200j.mo60134a("action_is_landscape", (Object) Boolean.valueOf(false));
                    this.f76217a.f76201k.mo101067a("action_is_landscape", (Object) Boolean.valueOf(false));
                    if (!this.f76217a.mo74180a()) {
                        this.f76217a.f76198h.postDelayed(this.f76217a.f76196f, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                    }
                    if (this.f76217a.f76194d == 1) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76222a;

                            {
                                this.f76222a = r1;
                            }

                            public final void run() {
                                this.f76222a.f76217a.mo74177a(this.f76222a.f76217a.f76193c, 1.0f, 90.0f, 0.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f76217a.mo74184e();
                    }
                    if (this.f76217a.f76194d == 2) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76223a;

                            {
                                this.f76223a = r1;
                            }

                            public final void run() {
                                this.f76223a.f76217a.mo74177a(this.f76223a.f76217a.f76193c, 1.0f, -90.0f, 0.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f76217a.mo74184e();
                        break;
                    }
                    break;
                case 1:
                    this.f76217a.f76200j.mo60134a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f76217a.f76201k.mo101067a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f76217a.f76199i.setVisibility(8);
                    if (!this.f76217a.mo74180a()) {
                        this.f76217a.f76198h.removeCallbacks(this.f76217a.f76196f);
                        this.f76217a.mo74179a(true);
                    }
                    if (this.f76217a.f76194d == -1 || this.f76217a.f76194d == 0) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76218a;

                            {
                                this.f76218a = r1;
                            }

                            public final void run() {
                                this.f76218a.f76217a.mo74177a(1.0f, this.f76218a.f76217a.f76193c, 0.0f, 90.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f76217a.mo74183d();
                    }
                    if (this.f76217a.f76194d == 2) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76219a;

                            {
                                this.f76219a = r1;
                            }

                            public final void run() {
                                this.f76219a.f76217a.mo74176a(this.f76219a.f76217a.f76193c, 1.0f, this.f76219a.f76217a.f76193c, -90.0f, -180.0f, -270.0f, null);
                            }
                        }, 250);
                        break;
                    }
                    break;
                case 2:
                    this.f76217a.f76200j.mo60134a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f76217a.f76201k.mo101067a("action_is_landscape", (Object) Boolean.valueOf(true));
                    this.f76217a.f76199i.setVisibility(8);
                    if (!this.f76217a.mo74180a()) {
                        this.f76217a.f76198h.removeCallbacks(this.f76217a.f76196f);
                        this.f76217a.mo74179a(true);
                    }
                    if (this.f76217a.f76194d == -1 || this.f76217a.f76194d == 0) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76220a;

                            {
                                this.f76220a = r1;
                            }

                            public final void run() {
                                this.f76220a.f76217a.mo74177a(1.0f, this.f76220a.f76217a.f76193c, 0.0f, -90.0f, (Runnable) null);
                            }
                        }, 250);
                        this.f76217a.mo74183d();
                    }
                    if (this.f76217a.f76194d == 1) {
                        this.f76217a.f76197g.postDelayed(new Runnable(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28905c f76221a;

                            {
                                this.f76221a = r1;
                            }

                            public final void run() {
                                this.f76221a.f76217a.mo74176a(this.f76221a.f76217a.f76193c, 1.0f, this.f76221a.f76217a.f76193c, 90.0f, 180.0f, 270.0f, null);
                            }
                        }, 250);
                        break;
                    }
                    break;
                case 3:
                    return;
            }
            this.f76217a.f76194d = this.f76217a.f76195e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$d */
    static final class C28912d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoViewLandscapeHelper f76224a;

        C28912d(VideoViewLandscapeHelper videoViewLandscapeHelper) {
            this.f76224a = videoViewLandscapeHelper;
        }

        public final void run() {
            ContentResolver contentResolver;
            String str;
            if (this.f76224a.f76195e == -1 || this.f76224a.f76195e == 0) {
                String str2 = "";
                try {
                    Context context = this.f76224a.f76198h.getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    } else {
                        contentResolver = null;
                    }
                    if (System.getInt(contentResolver, "accelerometer_rotation") == 0) {
                        str = this.f76224a.f76197g.getContext().getString(R.string.fom);
                        C7573i.m23582a((Object) str, "mRootPlayerView.context.…deo_open_auto_rotate_tip)");
                    } else {
                        str = this.f76224a.f76197g.getContext().getString(R.string.fos);
                        C7573i.m23582a((Object) str, "mRootPlayerView.context.….string.video_rotate_tip)");
                    }
                    str2 = str;
                    this.f76224a.f76199i.setText(str2);
                } catch (SettingNotFoundException unused) {
                }
                int top = this.f76224a.f76198h.getTop() - (VideoViewLandscapeHelper.m95086a(this.f76224a.f76199i, str2, (int) C9738o.m28708b(this.f76224a.f76198h.getContext(), 240.0f), 5) + ((int) C9738o.m28708b(this.f76224a.f76198h.getContext(), 32.0f)));
                LayoutParams layoutParams = this.f76224a.f76199i.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = top;
                    this.f76224a.f76199i.setLayoutParams(layoutParams2);
                    this.f76224a.f76199i.setVisibility(0);
                    this.f76224a.mo74179a(true);
                    this.f76224a.f76198h.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C28912d f76225a;

                        {
                            this.f76225a = r1;
                        }

                        public final void run() {
                            this.f76225a.f76224a.f76199i.setVisibility(8);
                        }
                    }, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$e */
    public static final class C28914e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f76226a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C28914e(Runnable runnable) {
            this.f76226a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f76226a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$f */
    public static final class C28915f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f76227a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C28915f(Runnable runnable) {
            this.f76227a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f76227a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    private static float m95085a(int i, int i2, int i3, int i4, int i5) {
        float f = (float) i;
        float f2 = ((float) i2) / f;
        return ((float) i3) / ((float) i4) > f2 ? f2 : f / ((float) i5);
    }

    /* renamed from: c */
    public final boolean mo74182c() {
        if (this.f76195e == 1 || this.f76195e == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final void m95089h() {
        this.f76193c = 1.0f;
        this.f76194d = -1;
        this.f76195e = 0;
        this.f76204o = -1;
        this.f76205p = -1;
        this.f76191a = 0;
        this.f76192b = 0;
        this.f76206q = 0;
        this.f76207r = 0;
        this.f76208s = 0;
        this.f76209t = 0;
        this.f76210u = 0;
    }

    /* renamed from: b */
    public final void mo74181b() {
        this.f76198h.removeCallbacks(this.f76196f);
        if (this.f76203n && !mo74180a()) {
            this.f76198h.postDelayed(this.f76196f, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: g */
    private static String m95088g() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        String curUserId = f.getCurUserId();
        String str = "rotate_";
        if (TextUtils.isEmpty(curUserId)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("default");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(curUserId);
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m95090i() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f76202m
            r1 = 0
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x0010
            int r0 = r0.getWidth()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.f76202m
            if (r2 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            if (r2 == 0) goto L_0x0020
            int r2 = r2.getHeight()
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r0 <= 0) goto L_0x002a
            if (r2 <= 0) goto L_0x002a
            boolean r0 = com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.VideoViewLandscapeHelper.C28903a.m95102a(r0, r2)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r3.f76203n = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f76202m
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.utils.C25329c.m83231n(r0)
            if (r0 != 0) goto L_0x003d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f76202m
            boolean r0 = com.p280ss.android.ugc.aweme.commercialize.splash.livesplash.C25072c.m82575a(r0)
            if (r0 == 0) goto L_0x003f
        L_0x003d:
            r3.f76203n = r1
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.VideoViewLandscapeHelper.m95090i():void");
    }

    /* renamed from: j */
    private final void m95091j() {
        if (this.f76206q == 0 || this.f76207r == 0 || this.f76208s == 0 || this.f76209t == 0) {
            this.f76206q = this.f76198h.getLayoutParams().height;
            this.f76207r = (int) (((float) this.f76198h.getLayoutParams().height) * this.f76193c);
            this.f76208s = C10788b.m31500a(this.f76197g.getContext());
            this.f76209t = (int) (((float) C10788b.m31500a(this.f76197g.getContext())) * this.f76193c);
        }
    }

    /* renamed from: d */
    public final void mo74183d() {
        String str;
        String str2 = "enter_full_screen";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76215z);
        String str3 = "author_id";
        Aweme aweme = this.f76202m;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str).mo59973a("enter_method", "auto").mo59973a("impr_type", C33230ac.m107245t(this.f76202m));
        String str5 = "group_id";
        Aweme aweme2 = this.f76202m;
        if (aweme2 != null) {
            str4 = aweme2.getAid();
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).f60753a);
        this.f76210u = SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public final void mo74184e() {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76215z);
        String str2 = "author_id";
        Aweme aweme = this.f76202m;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str2, str).mo59973a("enter_method", "auto").mo59973a("impr_type", C33230ac.m107245t(this.f76202m));
        String str4 = "group_id";
        Aweme aweme2 = this.f76202m;
        if (aweme2 != null) {
            str3 = aweme2.getAid();
        }
        C22984d a3 = a2.mo59973a(str4, str3);
        if (this.f76210u > 0) {
            a3.mo59971a("play_time", SystemClock.elapsedRealtime() - this.f76210u);
        }
        C6907h.m21524a("cancel_full_screen", (Map) a3.f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74185f() {
        /*
            r5 = this;
            boolean r0 = r5.f76203n
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f76202m
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f76202m
            if (r0 == 0) goto L_0x0011
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x004f
            int r0 = r5.f76191a
            if (r0 <= 0) goto L_0x004f
            int r0 = r5.f76192b
            if (r0 > 0) goto L_0x001d
            goto L_0x004f
        L_0x001d:
            int r0 = r5.f76191a
            int r1 = r5.f76192b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f76202m
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            if (r2 == 0) goto L_0x0031
            int r2 = r2.getWidth()
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r5.f76202m
            if (r4 == 0) goto L_0x0040
            com.ss.android.ugc.aweme.feed.model.Video r4 = r4.getVideo()
            if (r4 == 0) goto L_0x0040
            int r3 = r4.getHeight()
        L_0x0040:
            android.view.View r4 = r5.f76198h
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            int r4 = r4.height
            float r0 = m95085a(r0, r1, r2, r3, r4)
            r5.f76193c = r0
            return
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.VideoViewLandscapeHelper.mo74185f():void");
    }

    /* renamed from: a */
    public final boolean mo74180a() {
        return Keva.getRepo("landscape").getBoolean(m95088g(), false);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        C42961az.m136383d(this);
    }

    /* renamed from: a */
    public final void mo74178a(Aweme aweme) {
        this.f76202m = aweme;
        m95089h();
        m95090i();
        mo74185f();
        this.f76197g.getViewTreeObserver().addOnGlobalLayoutListener(new C28904b(this));
    }

    /* renamed from: a */
    public final void mo74179a(boolean z) {
        Keva.getRepo("landscape").storeBoolean(m95088g(), true);
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
            if (hashCode != 350216171) {
                if (hashCode == 1628582276 && str.equals("on_page_unselected")) {
                    this.f76198h.removeCallbacks(this.f76196f);
                    this.f76199i.setVisibility(8);
                    if (this.f76195e == 1) {
                        mo74177a(this.f76193c, 1.0f, 90.0f, 0.0f, (Runnable) null);
                        mo74184e();
                    }
                    if (this.f76195e == 2) {
                        mo74177a(this.f76193c, 1.0f, -90.0f, 0.0f, (Runnable) null);
                        mo74184e();
                    }
                    this.f76194d = -1;
                    this.f76195e = 0;
                }
            } else if (str.equals("on_page_selected")) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r0 == null) goto L_0x0028;
     */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScreenRotateEvent(com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.C28918b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "screenRotateEvent"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76202m
            if (r0 == 0) goto L_0x0080
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.f76229a
            if (r0 != 0) goto L_0x000f
            goto L_0x0080
        L_0x000f:
            boolean r0 = r4.f76203n
            if (r0 != 0) goto L_0x0014
            return
        L_0x0014:
            int r0 = r4.f76204o
            r1 = -1
            if (r0 != r1) goto L_0x001e
            int r5 = r5.f76231c
            r4.f76204o = r5
            return
        L_0x001e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f76202m
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r0 = ""
        L_0x002a:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r5.f76229a
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.getAid()
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007f
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x007f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004d
            goto L_0x007f
        L_0x004d:
            int r0 = r4.f76205p
            if (r0 != r1) goto L_0x0056
            int r5 = r5.f76231c
            r4.f76205p = r5
            return
        L_0x0056:
            int r0 = r5.f76231c
            r4.f76205p = r0
            int r0 = r4.f76204o
            r1 = 1
            if (r0 == r1) goto L_0x0064
            int r0 = r4.f76204o
            r1 = 2
            if (r0 != r1) goto L_0x006f
        L_0x0064:
            int r0 = r4.f76205p
            int r1 = r4.f76204o
            if (r0 != r1) goto L_0x006f
            int r5 = r5.f76231c
            r4.f76204o = r5
            return
        L_0x006f:
            int r0 = r5.f76231c
            r4.f76204o = r0
            int r5 = r5.f76231c
            r4.f76195e = r5
            android.widget.FrameLayout r5 = r4.f76197g
            java.lang.Runnable r0 = r4.f76211v
            r5.post(r0)
            return
        L_0x007f:
            return
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.landscape.VideoViewLandscapeHelper.onScreenRotateEvent(com.ss.android.ugc.aweme.feed.ui.landscape.b):void");
    }

    /* renamed from: a */
    public static int m95086a(TextView textView, String str, int i, int i2) {
        TextPaint paint = textView.getPaint();
        C7573i.m23582a((Object) paint, "textView.paint");
        StaticLayout staticLayout = new StaticLayout(str, paint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        if (staticLayout.getLineCount() <= 5) {
            return staticLayout.getHeight();
        }
        int lineStart = staticLayout.getLineStart(5) - 1;
        if (str != null) {
            String substring = str.substring(0, lineStart);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            StaticLayout staticLayout2 = new StaticLayout(substring, paint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            return staticLayout2.getHeight();
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final void mo74177a(float f, float f2, float f3, float f4, Runnable runnable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (f == 1.0f && f2 > 1.0f) {
            m95091j();
            i3 = this.f76208s;
            i2 = this.f76209t;
            i = this.f76206q;
            i4 = this.f76207r;
        } else if (f > 1.0f && f2 == 1.0f) {
            i3 = this.f76209t;
            i2 = this.f76208s;
            i = this.f76207r;
            i4 = this.f76206q;
        } else {
            return;
        }
        ViewWrapper viewWrapper = new ViewWrapper(this.f76198h);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{i3, i2});
        C7573i.m23582a((Object) ofInt, "ObjectAnimator.ofInt(vie…fromWidthInt, toWidthInt)");
        ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{i, i4});
        C7573i.m23582a((Object) ofInt2, "ObjectAnimator.ofInt(vie…omHeightInt, toHeightInt)");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f76198h, "rotation", new float[]{f3, f4});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        ViewWrapper viewWrapper2 = new ViewWrapper(this.f76213x);
        ObjectAnimator ofInt3 = ObjectAnimator.ofInt(viewWrapper2, "width", new int[]{i3, i2});
        C7573i.m23582a((Object) ofInt3, "ObjectAnimator.ofInt(cov…fromWidthInt, toWidthInt)");
        ObjectAnimator ofInt4 = ObjectAnimator.ofInt(viewWrapper2, "height", new int[]{i, i4});
        C7573i.m23582a((Object) ofInt4, "ObjectAnimator.ofInt(cov…omHeightInt, toHeightInt)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f76213x, "rotation", new float[]{f3, f4});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f76214y, "rotation", new float[]{f3, f4});
        C7573i.m23582a((Object) ofFloat3, "ObjectAnimator.ofFloat(m…fromRotation, toRotation)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofInt, ofInt2, ofFloat, ofInt3, ofInt4, ofFloat2, ofFloat3});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C28914e(null));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo74176a(float f, float f2, float f3, float f4, float f5, float f6, Runnable runnable) {
        if (f > 1.0f && f3 > 1.0f) {
            int i = this.f76209t;
            int i2 = this.f76208s;
            int i3 = this.f76209t;
            int i4 = this.f76207r;
            int i5 = this.f76206q;
            int i6 = this.f76207r;
            ViewWrapper viewWrapper = new ViewWrapper(this.f76198h);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(viewWrapper, "width", new int[]{i, i2, i3});
            C7573i.m23582a((Object) ofInt, "ObjectAnimator.ofInt(vie…ddleWidthInt, toWidthInt)");
            ObjectAnimator objectAnimator = ofInt;
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(viewWrapper, "height", new int[]{i4, i5, i6});
            C7573i.m23582a((Object) ofInt2, "ObjectAnimator.ofInt(vie…leHeightInt, toHeightInt)");
            ObjectAnimator objectAnimator2 = ofInt2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f76198h, "rotation", new float[]{f4, f5, f6});
            C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            ViewWrapper viewWrapper2 = new ViewWrapper(this.f76213x);
            ObjectAnimator objectAnimator3 = ofFloat;
            ObjectAnimator ofInt3 = ObjectAnimator.ofInt(viewWrapper2, "width", new int[]{i, i2, i3});
            C7573i.m23582a((Object) ofInt3, "ObjectAnimator.ofInt(cov…ddleWidthInt, toWidthInt)");
            ObjectAnimator ofInt4 = ObjectAnimator.ofInt(viewWrapper2, "height", new int[]{i4, i5, i6});
            C7573i.m23582a((Object) ofInt4, "ObjectAnimator.ofInt(cov…leHeightInt, toHeightInt)");
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f76213x, "rotation", new float[]{f4, f5, f6});
            C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f76214y, "rotation", new float[]{f4, f5, f6});
            C7573i.m23582a((Object) ofFloat3, "ObjectAnimator.ofFloat(m…ddleRotation, toRotation)");
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{objectAnimator, objectAnimator2, objectAnimator3, ofInt4, ofInt3, ofFloat2, ofFloat3});
            animatorSet.setDuration(600);
            animatorSet.addListener(new C28915f(null));
            animatorSet.start();
        }
    }

    public VideoViewLandscapeHelper(Fragment fragment, FrameLayout frameLayout, View view, View view2, TextView textView, View view3, DataCenter dataCenter, InteractStickerViewModel interactStickerViewModel, String str, int i) {
        C7573i.m23587b(fragment, "mFragment");
        C7573i.m23587b(frameLayout, "mRootPlayerView");
        C7573i.m23587b(view, "mPlayerView");
        C7573i.m23587b(view2, "mCoverView");
        C7573i.m23587b(textView, "mLandscapeTextView");
        C7573i.m23587b(view3, "mPlayButton");
        C7573i.m23587b(dataCenter, "mDataCenter");
        C7573i.m23587b(interactStickerViewModel, "mInteractStickerViewModel");
        C7573i.m23587b(str, "mEventType");
        this.f76212w = fragment;
        this.f76197g = frameLayout;
        this.f76198h = view;
        this.f76213x = view2;
        this.f76199i = textView;
        this.f76214y = view3;
        this.f76200j = dataCenter;
        this.f76201k = interactStickerViewModel;
        this.f76215z = str;
        this.f76190A = i;
        this.f76212w.getLifecycle().mo55a(this);
        C0053p pVar = this;
        this.f76200j.mo60132a("on_page_unselected", pVar);
        this.f76200j.mo60132a("on_page_selected", pVar);
        C42961az.m136382c(this);
        this.f76196f = new C28912d(this);
        this.f76211v = new C28905c(this);
    }
}
