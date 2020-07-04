package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.Rect;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.p564d.C10788b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24571k;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24574n;
import com.p280ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView;
import com.p280ss.android.ugc.aweme.commercialize.views.ProfileBrandGuideTextView.C25488a;
import com.p280ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment;
import com.p280ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment.C25591a;
import com.p280ss.android.ugc.aweme.commercialize.views.longvideo.AdLongVideoPlayFragment.C25592b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.C25763a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.UserAwemeCover;
import com.p280ss.android.ugc.aweme.profile.p1487ui.BaseDTProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36481a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.C36533be;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager */
public final class ProfileBrandCoverManager implements C0042h, C25263bb, C25763a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66370a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "screenHeight", "getScreenHeight()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "screenWidth", "getScreenWidth()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "visibleCoverHeight", "getVisibleCoverHeight()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "userCoverOriginalTranslationY", "getUserCoverOriginalTranslationY()F")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "touchSlop", "getTouchSlop()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "enterTranslationY", "getEnterTranslationY()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "exitTranslationY", "getExitTranslationY()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileBrandCoverManager.class), "userCoverArea", "getUserCoverArea()Landroid/graphics/Rect;"))};

    /* renamed from: l */
    public static final C25158b f66371l = new C25158b(null);

    /* renamed from: A */
    private Direction f66372A;

    /* renamed from: B */
    private boolean f66373B;

    /* renamed from: C */
    private User f66374C;

    /* renamed from: D */
    private UserAwemeCover f66375D;

    /* renamed from: E */
    private Aweme f66376E;

    /* renamed from: F */
    private final C7541d f66377F = C7546e.m23569a(new C25171o(this));

    /* renamed from: G */
    private C25271bj f66378G;

    /* renamed from: H */
    private String f66379H;

    /* renamed from: b */
    public Context f66380b;

    /* renamed from: c */
    public DampScrollableLayout f66381c;

    /* renamed from: d */
    public ViewGroup f66382d;

    /* renamed from: e */
    public C36481a f66383e;

    /* renamed from: f */
    public ViewGroup f66384f;

    /* renamed from: g */
    public AdLongVideoPlayFragment f66385g;

    /* renamed from: h */
    public boolean f66386h;

    /* renamed from: i */
    public boolean f66387i;

    /* renamed from: j */
    public C25159c f66388j;

    /* renamed from: k */
    public boolean f66389k;

    /* renamed from: m */
    private WeakReference<C0043i> f66390m;

    /* renamed from: n */
    private ProfileBrandGuideTextView f66391n;

    /* renamed from: o */
    private final C7541d f66392o = C7546e.m23569a(new C25165i(this));

    /* renamed from: p */
    private final C7541d f66393p = C7546e.m23569a(new C25166j(this));

    /* renamed from: q */
    private final C7541d f66394q = C7546e.m23569a(C25173q.f66424a);

    /* renamed from: r */
    private final C7541d f66395r = C7546e.m23569a(new C25172p(this));

    /* renamed from: s */
    private int f66396s;

    /* renamed from: t */
    private final C7541d f66397t = C7546e.m23569a(new C25170n(this));

    /* renamed from: u */
    private final C7541d f66398u = C7546e.m23569a(C25161e.f66407a);

    /* renamed from: v */
    private final C7541d f66399v = C7546e.m23569a(new C25162f(this));

    /* renamed from: w */
    private int f66400w;

    /* renamed from: x */
    private float f66401x;

    /* renamed from: y */
    private float f66402y;

    /* renamed from: z */
    private long f66403z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$Direction */
    public enum Direction {
        UP,
        DOWN
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$a */
    public static final class C25157a {

        /* renamed from: a */
        public final ProfileBrandCoverManager f66405a;

        public C25157a() {
            this(null, 1, null);
        }

        /* renamed from: a */
        public final C25157a mo65733a(Context context) {
            C25157a aVar = this;
            aVar.f66405a.f66380b = context;
            return aVar;
        }

        public C25157a(ProfileBrandCoverManager profileBrandCoverManager) {
            C7573i.m23587b(profileBrandCoverManager, "inst");
            this.f66405a = profileBrandCoverManager;
        }

        /* renamed from: a */
        public final C25157a mo65734a(ViewGroup viewGroup) {
            C25157a aVar = this;
            aVar.f66405a.f66384f = viewGroup;
            return aVar;
        }

        /* renamed from: a */
        public final C25157a mo65735a(FrameLayout frameLayout) {
            C25157a aVar = this;
            aVar.f66405a.f66382d = frameLayout;
            return aVar;
        }

        /* renamed from: a */
        public final C25157a mo65736a(C25159c cVar) {
            C25157a aVar = this;
            aVar.f66405a.f66388j = cVar;
            return aVar;
        }

        /* renamed from: a */
        public final C25157a mo65737a(DampScrollableLayout dampScrollableLayout) {
            C25157a aVar = this;
            aVar.f66405a.f66381c = dampScrollableLayout;
            return aVar;
        }

        /* renamed from: a */
        public final C25157a mo65738a(C36481a aVar) {
            C25157a aVar2 = this;
            aVar2.f66405a.f66383e = aVar;
            return aVar2;
        }

        private /* synthetic */ C25157a(ProfileBrandCoverManager profileBrandCoverManager, int i, C7571f fVar) {
            this(new ProfileBrandCoverManager());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$b */
    public static final class C25158b {
        private C25158b() {
        }

        public /* synthetic */ C25158b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$c */
    public interface C25159c {
        /* renamed from: a */
        void mo65739a();

        /* renamed from: b */
        void mo65740b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$d */
    static final class C25160d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66406a;

        C25160d(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66406a = profileBrandCoverManager;
        }

        public final void run() {
            C25159c cVar = this.f66406a.f66388j;
            if (cVar != null) {
                cVar.mo65739a();
            }
            C42961az.m136380a(new C24571k());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$e */
    static final class C25161e extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C25161e f66407a = new C25161e();

        C25161e() {
            super(0);
        }

        /* renamed from: a */
        private static int m82799a() {
            return -C23486n.m77122a(100.0d);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82799a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$f */
    static final class C25162f extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66408a;

        C25162f(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66408a = profileBrandCoverManager;
            super(0);
        }

        /* renamed from: a */
        private int m82800a() {
            return (-this.f66408a.mo65723a()) + C23486n.m77122a(100.0d);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82800a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$g */
    public static final class C25163g extends C25271bj {

        /* renamed from: b */
        final /* synthetic */ ProfileBrandCoverManager f66409b;

        C25163g(ProfileBrandCoverManager profileBrandCoverManager, Activity activity) {
            this.f66409b = profileBrandCoverManager;
            super(activity);
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66409b.f66385g;
            if (adLongVideoPlayFragment != null) {
                adLongVideoPlayFragment.mo66373a();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$h */
    public static final class C25164h implements C25591a {

        /* renamed from: a */
        public boolean f66410a = true;

        /* renamed from: b */
        final /* synthetic */ AdLongVideoPlayFragment f66411b;

        /* renamed from: c */
        final /* synthetic */ ProfileBrandCoverManager f66412c;

        /* renamed from: d */
        final /* synthetic */ Aweme f66413d;

        /* renamed from: e */
        final /* synthetic */ Fragment f66414e;

        /* renamed from: a */
        public final void mo65742a() {
            this.f66412c.mo65730e();
        }

        /* renamed from: b */
        public final void mo65744b() {
            Object obj;
            if (this.f66410a) {
                this.f66410a = false;
                this.f66411b.mo66378f();
                String str = "personal_head_video_play";
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", this.f66412c.mo65729d());
                String str2 = "author_id";
                Aweme aweme = this.f66413d;
                String str3 = null;
                if (aweme != null) {
                    obj = aweme.getAuthorUid();
                } else {
                    obj = null;
                }
                linkedHashMap.put(str2, obj);
                String str4 = "group_id";
                Aweme aweme2 = this.f66413d;
                if (aweme2 != null) {
                    str3 = aweme2.getAid();
                }
                linkedHashMap.put(str4, str3);
                C6907h.m21524a(str, linkedHashMap);
            }
        }

        /* renamed from: a */
        public final void mo65743a(boolean z) {
            this.f66412c.f66389k = z;
        }

        C25164h(AdLongVideoPlayFragment adLongVideoPlayFragment, ProfileBrandCoverManager profileBrandCoverManager, Aweme aweme, Fragment fragment) {
            this.f66411b = adLongVideoPlayFragment;
            this.f66412c = profileBrandCoverManager;
            this.f66413d = aweme;
            this.f66414e = fragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$i */
    static final class C25165i extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66415a;

        C25165i(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66415a = profileBrandCoverManager;
            super(0);
        }

        /* renamed from: a */
        private int m82805a() {
            return C10788b.m31501b(this.f66415a.f66380b);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82805a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$j */
    static final class C25166j extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66416a;

        C25166j(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66416a = profileBrandCoverManager;
            super(0);
        }

        /* renamed from: a */
        private int m82806a() {
            return C10788b.m31500a(this.f66416a.f66380b);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82806a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$k */
    static final class C25167k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66417a;

        /* renamed from: b */
        final /* synthetic */ boolean f66418b;

        C25167k(ProfileBrandCoverManager profileBrandCoverManager, boolean z) {
            this.f66417a = profileBrandCoverManager;
            this.f66418b = z;
        }

        public final void run() {
            if (this.f66418b) {
                DampScrollableLayout dampScrollableLayout = this.f66417a.f66381c;
                if (dampScrollableLayout != null) {
                    dampScrollableLayout.mo66845b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$l */
    static final class C25168l implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ DampScrollableLayout f66419a;

        C25168l(DampScrollableLayout dampScrollableLayout) {
            this.f66419a = dampScrollableLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object obj;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                this.f66419a.scrollTo(0, ((Integer) obj).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$m */
    public static final class C25169m implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f66420a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C25169m(Runnable runnable) {
            this.f66420a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            Runnable runnable = this.f66420a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$n */
    static final class C25170n extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66421a;

        C25170n(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66421a = profileBrandCoverManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82807a());
        }

        /* renamed from: a */
        private int m82807a() {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f66421a.f66380b);
            C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
            return viewConfiguration.getScaledTouchSlop();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$o */
    static final class C25171o extends Lambda implements C7561a<Rect> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66422a;

        C25171o(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66422a = profileBrandCoverManager;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Rect invoke() {
            return new Rect(0, 0, this.f66422a.mo65727b(), this.f66422a.mo65728c());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$p */
    static final class C25172p extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        final /* synthetic */ ProfileBrandCoverManager f66423a;

        C25172p(ProfileBrandCoverManager profileBrandCoverManager) {
            this.f66423a = profileBrandCoverManager;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m82809a());
        }

        /* renamed from: a */
        private float m82809a() {
            return ((float) ((-this.f66423a.mo65723a()) + this.f66423a.mo65728c())) / 2.0f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ProfileBrandCoverManager$q */
    static final class C25173q extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C25173q f66424a = new C25173q();

        C25173q() {
            super(0);
        }

        /* renamed from: a */
        private static int m82810a() {
            return BaseDTProfileFragment.m116450m();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m82810a());
        }
    }

    /* renamed from: g */
    private final float m82768g() {
        return ((Number) this.f66395r.getValue()).floatValue();
    }

    /* renamed from: h */
    private final int m82769h() {
        return ((Number) this.f66397t.getValue()).intValue();
    }

    /* renamed from: i */
    private final int m82770i() {
        return ((Number) this.f66398u.getValue()).intValue();
    }

    /* renamed from: j */
    private final int m82771j() {
        return ((Number) this.f66399v.getValue()).intValue();
    }

    /* renamed from: k */
    private final Rect m82772k() {
        return (Rect) this.f66377F.getValue();
    }

    /* renamed from: a */
    public final int mo65723a() {
        return ((Number) this.f66392o.getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo61694a(float f, float f2) {
    }

    /* renamed from: b */
    public final int mo65727b() {
        return ((Number) this.f66393p.getValue()).intValue();
    }

    /* renamed from: c */
    public final int mo65728c() {
        return ((Number) this.f66394q.getValue()).intValue();
    }

    /* renamed from: a */
    public final void mo65724a(BaseDTProfileFragment baseDTProfileFragment, User user) {
        C7573i.m23587b(baseDTProfileFragment, "fragment");
        ViewGroup viewGroup = this.f66382d;
        if (viewGroup != null) {
            viewGroup.setTranslationY(0.0f);
        }
        C36481a aVar = this.f66383e;
        if (aVar != null) {
            View view = aVar.f95766v;
            if (view != null) {
                view.setClickable(true);
            }
        }
        if (this.f66383e instanceof C36533be) {
            C36481a aVar2 = this.f66383e;
            if (aVar2 != null) {
                ((C36533be) aVar2).mo92752g(false);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.header.UserEnterpriseHeaderLayout");
            }
        }
        DampScrollableLayout dampScrollableLayout = this.f66381c;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.f68002K = null;
        }
        DampScrollableLayout dampScrollableLayout2 = this.f66381c;
        if (dampScrollableLayout2 != null) {
            dampScrollableLayout2.mo66846b(this);
        }
        baseDTProfileFragment.mo91950l(user);
        WeakReference<C0043i> weakReference = this.f66390m;
        if (weakReference != null) {
            C0043i iVar = (C0043i) weakReference.get();
            if (iVar != null) {
                Lifecycle lifecycle = iVar.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.mo56b(this);
                }
            }
        }
        m82774m();
        m82762a((Fragment) baseDTProfileFragment);
        this.f66378G = null;
    }

    /* renamed from: a */
    public final boolean mo65726a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "ev");
        float y = motionEvent.getY() - this.f66402y;
        float abs = Math.abs(motionEvent.getX() - this.f66401x);
        float abs2 = Math.abs(y);
        int action = motionEvent.getAction();
        if (action != 5) {
            switch (action) {
                case 0:
                    break;
                case 1:
                case 3:
                    this.f66373B = false;
                    if (System.currentTimeMillis() - this.f66403z < 100 && m82772k().contains((int) this.f66401x, (int) this.f66402y) && m82772k().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        m82775n();
                        break;
                    } else {
                        this.f66379H = "slidedown";
                        break;
                    }
                case 2:
                    if (abs2 > abs && abs2 > ((float) m82769h())) {
                        this.f66372A = y > 0.0f ? Direction.DOWN : Direction.UP;
                        break;
                    }
            }
        }
        this.f66401x = motionEvent.getX();
        this.f66402y = motionEvent.getY();
        this.f66403z = System.currentTimeMillis();
        this.f66373B = true;
        ViewGroup viewGroup = this.f66382d;
        if (viewGroup != null) {
            viewGroup.dispatchTouchEvent(motionEvent);
        }
        return this.f66389k;
    }

    /* renamed from: f */
    public final C25157a mo65731f() {
        return new C25157a(this);
    }

    /* renamed from: m */
    private final void m82774m() {
        C36481a aVar = this.f66383e;
        if (aVar == null || aVar.indexOfChild(this.f66391n) != -1) {
            C36481a aVar2 = this.f66383e;
            if (aVar2 != null) {
                aVar2.removeView(this.f66391n);
            }
        }
    }

    /* renamed from: n */
    private void m82775n() {
        if (!this.f66387i) {
            this.f66379H = "click";
            this.f66372A = Direction.DOWN;
            m82767b(true);
        }
    }

    /* renamed from: o */
    private final boolean m82776o() {
        if (this.f66387i || this.f66400w >= m82770i() || this.f66372A != Direction.DOWN || this.f66373B) {
            return false;
        }
        m82777p();
        return true;
    }

    /* renamed from: r */
    public final boolean mo62081r() {
        if (m82776o() || m82778q()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private final void m82773l() {
        String str;
        C36481a aVar = this.f66383e;
        if (aVar != null) {
            this.f66391n = C25488a.m83816a(aVar);
            aVar.addView(this.f66391n);
            ProfileBrandGuideTextView profileBrandGuideTextView = this.f66391n;
            if (profileBrandGuideTextView != null) {
                UserAwemeCover userAwemeCover = this.f66375D;
                if (userAwemeCover != null) {
                    str = userAwemeCover.getPullText();
                } else {
                    str = null;
                }
                profileBrandGuideTextView.setup(str);
            }
        }
    }

    /* renamed from: q */
    private final boolean m82778q() {
        if (!this.f66387i) {
            return false;
        }
        if (this.f66400w < m82771j() || this.f66372A != Direction.UP || this.f66373B) {
            m82767b(false);
        } else {
            mo65730e();
        }
        return true;
    }

    /* renamed from: d */
    public final String mo65729d() {
        String str;
        User user = this.f66374C;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (C7573i.m23585a((Object) str, (Object) f.getCurUserId())) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        WeakReference<C0043i> weakReference = this.f66390m;
        if (weakReference != null) {
            C0043i iVar = (C0043i) weakReference.get();
            if (iVar != null) {
                m82774m();
                if (iVar instanceof Fragment) {
                    m82762a((Fragment) iVar);
                }
                C7573i.m23582a((Object) iVar, "it");
                iVar.getLifecycle().mo56b(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo65730e() {
        this.f66387i = false;
        this.f66372A = Direction.UP;
        DampScrollableLayout dampScrollableLayout = this.f66381c;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.mo66847c();
        }
        C25271bj bjVar = this.f66378G;
        if (bjVar != null) {
            bjVar.mo65885a(false);
        }
        AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66385g;
        if (adLongVideoPlayFragment != null) {
            adLongVideoPlayFragment.mo66378f();
        }
        m82765a(true);
        if (this.f66380b instanceof MainActivity) {
            Context context = this.f66380b;
            if (context != null) {
                C30246a.m98970a((MainActivity) context).mo79716a(false);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            }
        }
        C25159c cVar = this.f66388j;
        if (cVar != null) {
            cVar.mo65740b();
        }
    }

    /* renamed from: p */
    private final void m82777p() {
        Object obj;
        this.f66387i = true;
        if (C7573i.m23585a((Object) this.f66379H, (Object) "slidedown")) {
            m82767b(true);
        }
        C25271bj bjVar = this.f66378G;
        if (bjVar != null) {
            bjVar.mo65885a(true);
        }
        m82765a(false);
        AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66385g;
        if (adLongVideoPlayFragment != null) {
            adLongVideoPlayFragment.mo66379g();
        }
        if (this.f66380b instanceof MainActivity) {
            Context context = this.f66380b;
            if (context != null) {
                C30246a.m98970a((MainActivity) context).mo79716a(false);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
            }
        }
        String str = "enter_head_fullscreen";
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", mo65729d());
        String str2 = "author_id";
        Aweme aweme = this.f66376E;
        String str3 = null;
        if (aweme != null) {
            obj = aweme.getAuthorUid();
        } else {
            obj = null;
        }
        linkedHashMap.put(str2, obj);
        String str4 = "group_id";
        Aweme aweme2 = this.f66376E;
        if (aweme2 != null) {
            str3 = aweme2.getAid();
        }
        linkedHashMap.put(str4, str3);
        linkedHashMap.put("enter_method", this.f66379H);
        C6907h.m21524a(str, linkedHashMap);
        DampScrollableLayout dampScrollableLayout = this.f66381c;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.postDelayed(new C25160d(this), 200);
        }
    }

    /* renamed from: b */
    private final void m82767b(boolean z) {
        DampScrollableLayout dampScrollableLayout = this.f66381c;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.setMinY(-mo65723a());
        }
        DampScrollableLayout dampScrollableLayout2 = this.f66381c;
        if (dampScrollableLayout2 != null) {
            ValueAnimator a = m82761a(dampScrollableLayout2, -mo65723a(), 200, (Runnable) new C25167k(this, z));
            if (a != null) {
                a.start();
            }
        }
    }

    /* renamed from: a */
    private final void m82762a(Fragment fragment) {
        C0608j childFragmentManager = fragment.getChildFragmentManager();
        C7573i.m23582a((Object) childFragmentManager, "fragment.childFragmentManager");
        Fragment a = childFragmentManager.mo2642a((int) R.id.ckb);
        if (a != null) {
            childFragmentManager.mo2645a().mo2587a(a).mo2606d();
            this.f66385g = null;
        }
    }

    /* renamed from: a */
    private final void m82765a(boolean z) {
        int i;
        if (z) {
            UserAwemeCover userAwemeCover = this.f66375D;
            int i2 = 0;
            if (userAwemeCover != null) {
                i = userAwemeCover.getPreviewStart();
            } else {
                i = 0;
            }
            UserAwemeCover userAwemeCover2 = this.f66375D;
            if (userAwemeCover2 != null) {
                i2 = userAwemeCover2.getPreviewEnd();
            }
            if (i < i2) {
                AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66385g;
                if (adLongVideoPlayFragment != null) {
                    C24574n nVar = new C24574n(true, TimeUnit.SECONDS.toMillis((long) i), TimeUnit.SECONDS.toMillis((long) i2));
                    adLongVideoPlayFragment.mo66374a(nVar);
                }
            }
        } else {
            AdLongVideoPlayFragment adLongVideoPlayFragment2 = this.f66385g;
            if (adLongVideoPlayFragment2 != null) {
                C24574n nVar2 = new C24574n(false, 0, 0, 6, null);
                adLongVideoPlayFragment2.mo66374a(nVar2);
            }
        }
    }

    /* renamed from: a */
    private final boolean m82766a(User user) {
        if (user == null || user.getAwemeCover() == null) {
            return false;
        }
        this.f66374C = user;
        this.f66375D = user.getAwemeCover();
        try {
            UserAwemeCover awemeCover = user.getAwemeCover();
            C7573i.m23582a((Object) awemeCover, "user.awemeCover");
            this.f66376E = (Aweme) C25352e.m83318a(awemeCover.getAwemeInfo(), Aweme.class);
            if (this.f66376E != null) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        int i3;
        if (this.f66372A == Direction.DOWN) {
            m82776o();
        }
        if (i >= this.f66396s && this.f66372A == Direction.UP) {
            DampScrollableLayout dampScrollableLayout = this.f66381c;
            if (dampScrollableLayout != null) {
                dampScrollableLayout.setMinY(this.f66396s);
            }
        }
        ViewGroup viewGroup = this.f66382d;
        if (viewGroup != null) {
            viewGroup.setTranslationY(((m82768g() / ((float) mo65723a())) * ((float) i)) + m82768g());
        }
        AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66385g;
        int i4 = 8;
        if (adLongVideoPlayFragment != null) {
            ImageView imageView = adLongVideoPlayFragment.f67402g;
            if (imageView != null) {
                float f = (float) i;
                imageView.setTranslationY(-(((m82768g() / ((float) mo65723a())) * f) + m82768g()));
                imageView.setAlpha(-(((2.0f / ((float) mo65723a())) * f) + 1.0f));
                if (imageView.getAlpha() > 0.0f) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                imageView.setVisibility(i3);
            }
        }
        ViewGroup viewGroup2 = this.f66384f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(((2.0f / ((float) mo65723a())) * ((float) i)) + 1.0f);
            if (viewGroup2.getAlpha() > 0.0f) {
                i4 = 0;
            }
            viewGroup2.setVisibility(i4);
        }
        if (this.f66387i || !this.f66373B) {
            ProfileBrandGuideTextView profileBrandGuideTextView = this.f66391n;
            if (profileBrandGuideTextView != null && profileBrandGuideTextView.getAlpha() == 1.0f) {
                ProfileBrandGuideTextView profileBrandGuideTextView2 = this.f66391n;
                if (profileBrandGuideTextView2 != null) {
                    profileBrandGuideTextView2.dismiss();
                }
            }
        } else {
            ProfileBrandGuideTextView profileBrandGuideTextView3 = this.f66391n;
            if (profileBrandGuideTextView3 != null) {
                profileBrandGuideTextView3.mo66185a(i);
            }
        }
        this.f66400w = i;
    }

    /* renamed from: a */
    private final void m82764a(BaseDTProfileFragment baseDTProfileFragment, String str, int i) {
        ViewGroup viewGroup = this.f66382d;
        if (viewGroup != null) {
            viewGroup.setTranslationY(m82768g());
        }
        C36481a aVar = this.f66383e;
        int i2 = 0;
        if (aVar != null) {
            View view = aVar.f95766v;
            if (view != null) {
                view.setClickable(false);
            }
        }
        if (this.f66383e instanceof C36533be) {
            C36481a aVar2 = this.f66383e;
            if (aVar2 != null) {
                ((C36533be) aVar2).mo92752g(true);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.header.UserEnterpriseHeaderLayout");
            }
        }
        DampScrollableLayout dampScrollableLayout = this.f66381c;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.f68002K = this;
        }
        DampScrollableLayout dampScrollableLayout2 = this.f66381c;
        if (dampScrollableLayout2 != null) {
            dampScrollableLayout2.mo66844a(this);
        }
        baseDTProfileFragment.mo91956x();
        this.f66390m = new WeakReference<>(baseDTProfileFragment);
        WeakReference<C0043i> weakReference = this.f66390m;
        if (weakReference != null) {
            C0043i iVar = (C0043i) weakReference.get();
            if (iVar != null) {
                Lifecycle lifecycle = iVar.getLifecycle();
                if (lifecycle != null) {
                    lifecycle.mo55a(this);
                }
            }
        }
        DampScrollableLayout dampScrollableLayout3 = this.f66381c;
        if (dampScrollableLayout3 != null) {
            i2 = dampScrollableLayout3.getMinY();
        }
        this.f66396s = i2;
        m82773l();
        m82763a(this.f66376E, str, i, (Fragment) baseDTProfileFragment);
        Context context = this.f66380b;
        if (context != null) {
            this.f66378G = new C25163g(this, (Activity) context);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public final void mo65725a(BaseDTProfileFragment baseDTProfileFragment, User user, String str, int i) {
        C7573i.m23587b(baseDTProfileFragment, "fragment");
        this.f66386h = m82766a(user);
        if (this.f66386h) {
            if (str == null) {
                str = "";
            }
            m82764a(baseDTProfileFragment, str, 0);
            return;
        }
        mo65724a(baseDTProfileFragment, user);
    }

    /* renamed from: a */
    private static ValueAnimator m82761a(DampScrollableLayout dampScrollableLayout, int i, long j, Runnable runnable) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{dampScrollableLayout.getCurScrollY(), i});
        ofInt.addUpdateListener(new C25168l(dampScrollableLayout));
        C7573i.m23582a((Object) ofInt, "animator");
        ofInt.setDuration(200);
        ofInt.addListener(new C25169m(runnable));
        return ofInt;
    }

    /* renamed from: a */
    private final void m82763a(Aweme aweme, String str, int i, Fragment fragment) {
        this.f66385g = C25592b.m84139a(aweme, str, i, "long_video_player_activity");
        AdLongVideoPlayFragment adLongVideoPlayFragment = this.f66385g;
        if (adLongVideoPlayFragment != null) {
            adLongVideoPlayFragment.f67403h = new C25164h(adLongVideoPlayFragment, this, aweme, fragment);
            m82765a(true);
            fragment.getChildFragmentManager().mo2645a().mo2599b(R.id.ckb, adLongVideoPlayFragment).mo2606d();
        }
    }
}
