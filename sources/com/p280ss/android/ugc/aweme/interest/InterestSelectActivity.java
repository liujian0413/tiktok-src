package com.p280ss.android.ugc.aweme.interest;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bolts.C1588d;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.interest.C32183c.C32184a;
import com.p280ss.android.ugc.aweme.interest.C32186e.C32187a;
import com.p280ss.android.ugc.aweme.interest.C32190g.C32191a;
import com.p280ss.android.ugc.aweme.journey.C32246j;
import com.p280ss.android.ugc.aweme.journey.C32257o;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.welcome.C43543a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity */
public final class InterestSelectActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83973a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mSkipView", "getMSkipView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mDoneView", "getMDoneView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mDoneParentView", "getMDoneParentView()Landroid/widget/FrameLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "titleView", "getTitleView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mDoneText", "getMDoneText()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mLoadingParent", "getMLoadingParent()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mLoadingImageView", "getMLoadingImageView()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mLoadingDoneImageView", "getMLoadingDoneImageView()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/interest/IntereSelectAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "mLayoutManager", "getMLayoutManager()Landroid/support/v7/widget/GridLayoutManager;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InterestSelectActivity.class), "finishMsg", "getFinishMsg()Landroid/os/Message;"))};

    /* renamed from: y */
    public static final C7541d f83974y = C7546e.m23569a(C32154b.f84009a);

    /* renamed from: z */
    public static final C32153a f83975z = new C32153a(null);

    /* renamed from: A */
    private Intent f83976A;

    /* renamed from: B */
    private final C7541d f83977B = C7546e.m23569a(new C32167n(this));

    /* renamed from: C */
    private final C7541d f83978C = C7546e.m23569a(new C32168o(this));

    /* renamed from: D */
    private final C7541d f83979D = C7546e.m23569a(new C32162i(this));

    /* renamed from: E */
    private final C7541d f83980E = C7546e.m23569a(new C32160g(this));

    /* renamed from: F */
    private final C7541d f83981F = C7546e.m23569a(new C32175u(this));

    /* renamed from: G */
    private final C7541d f83982G = C7546e.m23569a(new C32169p(this));

    /* renamed from: H */
    private final C7541d f83983H = C7546e.m23569a(new C32161h(this));

    /* renamed from: I */
    private final C7541d f83984I = C7546e.m23569a(new C32166m(this));

    /* renamed from: J */
    private final C7541d f83985J = C7546e.m23569a(new C32165l(this));

    /* renamed from: K */
    private final C7541d f83986K = C7546e.m23569a(new C32164k(this));

    /* renamed from: L */
    private long f83987L;

    /* renamed from: M */
    private ValueAnimator f83988M;

    /* renamed from: N */
    private ObjectAnimator f83989N;

    /* renamed from: O */
    private boolean f83990O = true;

    /* renamed from: P */
    private final C7541d f83991P = C7546e.m23569a(new C32159f(this));

    /* renamed from: Q */
    private final C7541d f83992Q = C7546e.m23569a(new C32163j(this));

    /* renamed from: R */
    private final C7541d f83993R = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C32156d(this));

    /* renamed from: S */
    private C1590f f83994S;

    /* renamed from: T */
    private HashMap f83995T;

    /* renamed from: b */
    public int f83996b;

    /* renamed from: c */
    public int f83997c = -1;

    /* renamed from: d */
    public int f83998d = -1;

    /* renamed from: e */
    public boolean f83999e;

    /* renamed from: q */
    public Handler f84000q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    public boolean f84001r;

    /* renamed from: s */
    public boolean f84002s;

    /* renamed from: t */
    public boolean f84003t;

    /* renamed from: u */
    public int f84004u = -1;

    /* renamed from: v */
    public boolean f84005v;

    /* renamed from: w */
    public long f84006w;

    /* renamed from: x */
    public final C7562b<Integer, C7581n> f84007x = new C32155c(this);

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$a */
    public static final class C32153a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f84008a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32153a.class), "SCROLL_VALUE", "getSCROLL_VALUE()F"))};

        private C32153a() {
        }

        /* renamed from: a */
        public static float m104428a() {
            return ((Number) InterestSelectActivity.f83974y.getValue()).floatValue();
        }

        public /* synthetic */ C32153a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m104429a(Activity activity) {
            if (activity == null || !C32191a.m104467c() || C32190g.f84056f) {
                return false;
            }
            Intent intent = new Intent(activity, InterestSelectActivity.class);
            if (activity instanceof MainActivity) {
                intent.putExtra("from_main", true);
            }
            activity.startActivityForResult(intent, 18);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$b */
    static final class C32154b extends Lambda implements C7561a<Float> {

        /* renamed from: a */
        public static final C32154b f84009a = new C32154b();

        C32154b() {
            super(0);
        }

        /* renamed from: a */
        private static float m104430a() {
            return C9738o.m28708b(C6399b.m19921a(), 11.5f);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(m104430a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$c */
    static final class C32155c extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84010a;

        C32155c(InterestSelectActivity interestSelectActivity) {
            this.f84010a = interestSelectActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104431a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104431a(int i) {
            if (i == 1) {
                FrameLayout c = this.f84010a.mo58711c();
                C7573i.m23582a((Object) c, "mDoneView");
                c.setSelected(true);
                FrameLayout c2 = this.f84010a.mo58711c();
                C7573i.m23582a((Object) c2, "mDoneView");
                c2.setEnabled(true);
                return;
            }
            if (i == 0) {
                FrameLayout c3 = this.f84010a.mo58711c();
                C7573i.m23582a((Object) c3, "mDoneView");
                c3.setSelected(false);
                FrameLayout c4 = this.f84010a.mo58711c();
                C7573i.m23582a((Object) c4, "mDoneView");
                c4.setEnabled(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$d */
    static final class C32156d extends Lambda implements C7561a<Message> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84011a;

        C32156d(InterestSelectActivity interestSelectActivity) {
            this.f84011a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Message invoke() {
            return Message.obtain(this.f84011a.f84000q, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C32156d f84012a;

                {
                    this.f84012a = r1;
                }

                public final void run() {
                    this.f84012a.f84011a.f84002s = true;
                    this.f84012a.f84011a.mo83297a(true);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$e */
    public static final class C32158e implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f84013a;

        /* renamed from: b */
        final /* synthetic */ InterestSelectActivity f84014b;

        C32158e(RecyclerView recyclerView, InterestSelectActivity interestSelectActivity) {
            this.f84013a = recyclerView;
            this.f84014b = interestSelectActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (!this.f84014b.mo83305l().f83953b.isEmpty()) {
                int l = this.f84014b.mo83306m().mo5447l();
                if (l >= this.f84014b.mo83305l().f83953b.size() + 1) {
                    this.f84014b.f83998d = this.f84014b.mo83305l().f83953b.size() + 1;
                } else {
                    this.f84014b.mo83296a(l + 1, l + 3);
                }
                if (this.f84014b.mo83298a(l)) {
                    this.f84014b.mo83300b(1, l);
                } else {
                    this.f84014b.mo83300b(1, l - 3);
                }
                this.f84013a.removeOnLayoutChangeListener(this);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$f */
    static final class C32159f extends Lambda implements C7561a<IntereSelectAdapter> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84015a;

        C32159f(InterestSelectActivity interestSelectActivity) {
            this.f84015a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public IntereSelectAdapter invoke() {
            return new IntereSelectAdapter(this.f84015a.f84007x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$g */
    static final class C32160g extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84016a;

        C32160g(InterestSelectActivity interestSelectActivity) {
            this.f84016a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f84016a.mo83299b((int) R.id.am9);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$h */
    static final class C32161h extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84017a;

        C32161h(InterestSelectActivity interestSelectActivity) {
            this.f84017a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f84017a.mo83299b((int) R.id.dti);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$i */
    static final class C32162i extends Lambda implements C7561a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84018a;

        C32162i(InterestSelectActivity interestSelectActivity) {
            this.f84018a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FrameLayout invoke() {
            return (FrameLayout) this.f84018a.mo83299b((int) R.id.a__);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$j */
    static final class C32163j extends Lambda implements C7561a<GridLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84019a;

        C32163j(InterestSelectActivity interestSelectActivity) {
            this.f84019a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public GridLayoutManager invoke() {
            return new GridLayoutManager(this.f84019a, 3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$k */
    static final class C32164k extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84020a;

        C32164k(InterestSelectActivity interestSelectActivity) {
            this.f84020a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f84020a.mo83299b((int) R.id.b_x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$l */
    static final class C32165l extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84021a;

        C32165l(InterestSelectActivity interestSelectActivity) {
            this.f84021a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f84021a.mo83299b((int) R.id.b_w);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$m */
    static final class C32166m extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84022a;

        C32166m(InterestSelectActivity interestSelectActivity) {
            this.f84022a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f84022a.mo83299b((int) R.id.brw);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$n */
    static final class C32167n extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84023a;

        C32167n(InterestSelectActivity interestSelectActivity) {
            this.f84023a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f84023a.mo83299b((int) R.id.cxh);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$o */
    static final class C32168o extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84024a;

        C32168o(InterestSelectActivity interestSelectActivity) {
            this.f84024a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f84024a.mo83299b((int) R.id.d7l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$p */
    static final class C32169p extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84025a;

        C32169p(InterestSelectActivity interestSelectActivity) {
            this.f84025a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f84025a.mo83299b((int) R.id.dav);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$q */
    static final class C32170q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84026a;

        C32170q(InterestSelectActivity interestSelectActivity) {
            this.f84026a = interestSelectActivity;
        }

        public final void run() {
            IntereSelectAdapter l = this.f84026a.mo83305l();
            if (l.f83953b.isEmpty()) {
                l.mo83288a(C32185d.m104451a(this.f84026a));
                this.f84026a.mo83301b(true);
                l.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$r */
    public static final class C32171r implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84027a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C32171r(InterestSelectActivity interestSelectActivity) {
            this.f84027a = interestSelectActivity;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f84027a.f83999e) {
                if (this.f84027a.f84004u == 1) {
                    this.f84027a.f84005v = this.f84027a.f84000q.hasMessages(9711);
                    if (this.f84027a.f84005v) {
                        this.f84027a.f84000q.removeMessages(9711);
                    }
                }
                C6877n.m21407a("service_monitor", "interest_select_not_finish", C6869c.m21381a().mo16882a("destroy", Boolean.valueOf(this.f84027a.f84001r)).mo16882a("postdelay", Boolean.valueOf(this.f84027a.f84002s)).mo16882a("completeevent", Boolean.valueOf(this.f84027a.f84003t)).mo16885a("enqueueFlag", Integer.valueOf(this.f84027a.f84004u)).mo16882a("hasMessageFlag", Boolean.valueOf(this.f84027a.f84005v)).mo16886a("sendTime", Long.valueOf(SystemClock.uptimeMillis() - this.f84027a.f84006w)).mo16888b());
                this.f84027a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$s */
    static final class C32172s implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84028a;

        /* renamed from: b */
        final /* synthetic */ boolean f84029b;

        C32172s(InterestSelectActivity interestSelectActivity, boolean z) {
            this.f84028a = interestSelectActivity;
            this.f84029b = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (!this.f84029b) {
                    DmtTextView i = this.f84028a.mo83302i();
                    C7573i.m23582a((Object) i, "mDoneText");
                    i.setAlpha(1.0f - floatValue);
                } else {
                    ImageView k = this.f84028a.mo83304k();
                    C7573i.m23582a((Object) k, "mLoadingDoneImageView");
                    float f = 1.0f - floatValue;
                    k.setScaleX(f);
                    ImageView k2 = this.f84028a.mo83304k();
                    C7573i.m23582a((Object) k2, "mLoadingDoneImageView");
                    k2.setScaleY(f);
                }
                LinearLayout j = this.f84028a.mo83303j();
                C7573i.m23582a((Object) j, "mLoadingParent");
                j.setAlpha(floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$t */
    public static final class C32173t implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84030a;

        /* renamed from: b */
        final /* synthetic */ boolean f84031b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f84031b) {
                this.f84030a.f84000q.postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32173t f84032a;

                    {
                        this.f84032a = r1;
                    }

                    public final void run() {
                        this.f84032a.f84030a.finish();
                    }
                }, 300);
            }
        }

        C32173t(InterestSelectActivity interestSelectActivity, boolean z) {
            this.f84030a = interestSelectActivity;
            this.f84031b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$u */
    static final class C32175u extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84033a;

        C32175u(InterestSelectActivity interestSelectActivity) {
            this.f84033a = interestSelectActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f84033a.mo83299b((int) R.id.e3f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$v */
    static final class C32176v<T> implements C7326g<BaseResponse> {

        /* renamed from: a */
        public static final C32176v f84034a = new C32176v();

        C32176v() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$w */
    static final class C32177w<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C32177w f84035a = new C32177w();

        C32177w() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.InterestSelectActivity$x */
    static final class C32178x<TTaskResult, TContinuationResult> implements C1591g<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ InterestSelectActivity f84036a;

        C32178x(InterestSelectActivity interestSelectActivity) {
            this.f84036a = interestSelectActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Void> hVar) {
            this.f84036a.f84002s = true;
            this.f84036a.mo83297a(true);
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m104407a(Activity activity) {
        return C32153a.m104429a(activity);
    }

    /* renamed from: n */
    private final RecyclerView m104408n() {
        return (RecyclerView) this.f83977B.getValue();
    }

    /* renamed from: o */
    private final DmtTextView m104409o() {
        return (DmtTextView) this.f83978C.getValue();
    }

    /* renamed from: p */
    private final FrameLayout m104410p() {
        return (FrameLayout) this.f83980E.getValue();
    }

    /* renamed from: q */
    private final DmtStatusView m104411q() {
        return (DmtStatusView) this.f83982G.getValue();
    }

    /* renamed from: r */
    private final ImageView m104412r() {
        return (ImageView) this.f83985J.getValue();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.cd;
    }

    /* renamed from: b */
    public final View mo83299b(int i) {
        if (this.f83995T == null) {
            this.f83995T = new HashMap();
        }
        View view = (View) this.f83995T.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83995T.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final FrameLayout mo58711c() {
        return (FrameLayout) this.f83979D.getValue();
    }

    /* renamed from: d */
    public final DmtTextView mo59893d() {
        return (DmtTextView) this.f83981F.getValue();
    }

    /* renamed from: i */
    public final DmtTextView mo83302i() {
        return (DmtTextView) this.f83983H.getValue();
    }

    /* renamed from: j */
    public final LinearLayout mo83303j() {
        return (LinearLayout) this.f83984I.getValue();
    }

    /* renamed from: k */
    public final ImageView mo83304k() {
        return (ImageView) this.f83986K.getValue();
    }

    /* renamed from: l */
    public final IntereSelectAdapter mo83305l() {
        return (IntereSelectAdapter) this.f83991P.getValue();
    }

    /* renamed from: m */
    public final GridLayoutManager mo83306m() {
        return (GridLayoutManager) this.f83992Q.getValue();
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.interest.InterestSelectActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.interest.InterestSelectActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.interest.InterestSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        if (VERSION.SDK_INT >= 23) {
            C23487o.m77155c((Activity) this);
        }
    }

    public final void finish() {
        C43543a.m138035a(this.f83976A, this);
        C32190g.f84056f = true;
        super.finish();
        overridePendingTransition(0, R.anim.an);
    }

    public final int getStatusBarColor() {
        if (VERSION.SDK_INT >= 23) {
            return getColor(R.color.az3);
        }
        return super.getStatusBarColor();
    }

    public final void onDestroy() {
        C1590f fVar = this.f83994S;
        if (fVar != null) {
            fVar.mo6871c();
        }
        ValueAnimator valueAnimator = this.f83988M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimator = this.f83989N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f84001r = true;
        C32190g.f84056f = true;
        C32191a.m104464a(false);
        C42961az.m136383d(this);
        super.onDestroy();
        this.f84000q.removeCallbacksAndMessages(null);
    }

    /* renamed from: s */
    private final void m104413s() {
        C1588d dVar;
        List b = mo83305l().mo83289b();
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        Iterator it = b.iterator();
        int i = 0;
        while (true) {
            dVar = null;
            if (!it.hasNext()) {
                break;
            }
            int intValue = ((Number) it.next()).intValue();
            C32246j jVar = (C32246j) mo83305l().f83953b.get(intValue);
            C32246j jVar2 = new C32246j(jVar.f84277a, null, null);
            JSONObject jSONObject = new JSONObject();
            i++;
            jSONObject.put("select_rank", i).put("show_rank", intValue + 1).put("interest", C7634n.m23711a(jVar.f84277a, "&", "and", false));
            jSONArray.put(jSONObject);
            linkedList.add(jVar2);
        }
        C6600e f = new C6607f().mo15991e().mo15992f();
        C32257o oVar = new C32257o(linkedList, C32191a.m104461a(), Integer.valueOf(this.f83990O ^ true ? 1 : 0), null, null, 24, null);
        String b2 = f.mo15979b((Object) oVar);
        C32191a.m104463a(b2);
        if (this.f83990O) {
            C42961az.m136380a(new C32196i(false));
            C32191a.m104464a(true);
            mo83297a(false);
        }
        C32184a.m104450a().uploadInterest(b2).mo19304b(C7333a.m23044b()).mo19280a((C7326g<? super T>) C32176v.f84034a, (C7326g<? super Throwable>) C32177w.f84035a);
        String jSONArray2 = jSONArray.toString();
        C7573i.m23582a((Object) jSONArray2, "mobJsonArray.toString()");
        m104406a(false, jSONArray2);
        if (!this.f83990O) {
            finish();
            return;
        }
        this.f84006w = SystemClock.uptimeMillis();
        this.f83994S = new C1590f();
        C1592h a = C1592h.m7848a(2000);
        C1591g xVar = new C32178x(this);
        Executor executor = C1592h.f5958b;
        C1590f fVar = this.f83994S;
        if (fVar != null) {
            dVar = fVar.mo6870b();
        }
        a.mo6877a(xVar, executor, dVar);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(C32195h hVar) {
        C7573i.m23587b(hVar, "event");
        C32191a.m104464a(false);
        this.f84003t = true;
        mo83297a(true);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m104404a(intent);
        setIntent(intent);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putInt("total_dy", this.f83996b);
        }
    }

    /* renamed from: a */
    private final void m104404a(Intent intent) {
        Intent intent2;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            this.f83976A = intent2;
            if (!C32187a.m104456a()) {
                C32187a.m104454a((Context) this);
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN, mo20401b = true)
    public final void onEvent(C32181a aVar) {
        C7573i.m23587b(aVar, "event");
        IntereSelectAdapter l = mo83305l();
        if (l.f83953b.isEmpty()) {
            l.mo83288a(aVar.f84043a);
            mo83301b(true);
            l.notifyDataSetChanged();
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.d7l) {
                view.setEnabled(false);
                if (!this.f83990O) {
                    C32191a.m104462a(1);
                }
                m104406a(true, "");
                C42961az.m136380a(new C32196i(true));
                finish();
            } else {
                if (id == R.id.a__) {
                    Context context = this;
                    if (!C32182b.m104449a(context)) {
                        C10761a.m31399c(context, (int) R.string.cjs).mo25750a();
                        return;
                    }
                    mo83305l().f83954c = false;
                    view.setEnabled(false);
                    DmtTextView o = m104409o();
                    C7573i.m23582a((Object) o, "mSkipView");
                    o.setEnabled(false);
                    m104413s();
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.interest.InterestSelectActivity", "onCreate", true);
        super.onCreate(bundle);
        C32190g.f84056f = false;
        C6887b.m21436b().mo16902a(C6399b.m19921a(), "key_interest_select_show", true);
        m104405a(bundle);
        C6907h.m21524a("show_interest_selection", (Map) new HashMap());
        this.f83990O = getIntent().getBooleanExtra("from_main", false);
        m104404a(getIntent());
        this.f84000q.postDelayed(new C32170q(this), 2000);
        C42961az.m136382c(this);
        this.f83987L = System.currentTimeMillis();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.interest.InterestSelectActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m104405a(Bundle bundle) {
        int i;
        Context context = this;
        int a = C9738o.m28691a(context);
        int b = C9738o.m28709b(context);
        if (a > 0 && b > 0 && (((float) b) + 0.0f) / ((float) a) > 1.7777778f) {
            FrameLayout p = m104410p();
            int paddingBottom = p.getPaddingBottom();
            C7573i.m23582a((Object) p, "this");
            p.setPadding(p.getPaddingLeft(), p.getPaddingTop(), p.getPaddingRight(), paddingBottom + ((int) C9738o.m28708b(p.getContext(), 8.0f)));
        }
        m104411q().setBuilder(C10803a.m31631a(context));
        m104411q().mo25942f();
        mo83301b(!mo83305l().f83953b.isEmpty());
        FrameLayout c = mo58711c();
        C7573i.m23582a((Object) c, "mDoneView");
        c.setEnabled(false);
        mo83306m().f4721g = new InterestSelectActivity$initView$2();
        if (bundle != null) {
            i = bundle.getInt("total_dy", 0);
        } else {
            i = 0;
        }
        this.f83996b = i;
        RecyclerView n = m104408n();
        n.mo5528a((C1281m) new InterestSelectActivity$initView$$inlined$apply$lambda$1(this));
        n.addOnLayoutChangeListener(new C32158e(n, this));
        n.mo5525a((C1272h) new InterestDivider());
        n.setLayoutManager(mo83306m());
        if (n.getItemAnimator() instanceof SimpleItemAnimator) {
            C1267f itemAnimator = n.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).f5112m = false;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
            }
        }
        RecyclerView n2 = m104408n();
        C7573i.m23582a((Object) n2, "mRecyclerView");
        n2.setAdapter(mo83305l());
        OnClickListener onClickListener = this;
        m104409o().setOnClickListener(onClickListener);
        mo58711c().setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final void mo83301b(boolean z) {
        if (z) {
            FrameLayout p = m104410p();
            C7573i.m23582a((Object) p, "mDoneParentView");
            p.setVisibility(0);
            RecyclerView n = m104408n();
            C7573i.m23582a((Object) n, "mRecyclerView");
            n.setVisibility(0);
            DmtStatusView q = m104411q();
            C7573i.m23582a((Object) q, "mStatusView");
            q.setVisibility(8);
            return;
        }
        FrameLayout p2 = m104410p();
        C7573i.m23582a((Object) p2, "mDoneParentView");
        p2.setVisibility(8);
        RecyclerView n2 = m104408n();
        C7573i.m23582a((Object) n2, "mRecyclerView");
        n2.setVisibility(8);
        DmtStatusView q2 = m104411q();
        C7573i.m23582a((Object) q2, "mStatusView");
        q2.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo83297a(boolean z) {
        float[] fArr;
        if (!z) {
            this.f83989N = ObjectAnimator.ofFloat(m104412r(), "rotation", new float[]{360.0f});
            ObjectAnimator objectAnimator = this.f83989N;
            if (objectAnimator != null) {
                objectAnimator.setRepeatCount(10);
                objectAnimator.setInterpolator(new LinearInterpolator());
                objectAnimator.setDuration(400);
                objectAnimator.addListener(new C32171r(this));
                objectAnimator.start();
            }
        } else if (!this.f83999e && !isFinishing()) {
            this.f83999e = true;
        } else {
            return;
        }
        ValueAnimator valueAnimator = this.f83988M;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.end();
        }
        if (z) {
            fArr = new float[]{1.0f, 0.0f};
        } else {
            fArr = new float[]{0.0f, 1.0f};
        }
        this.f83988M = ValueAnimator.ofFloat(fArr);
        ValueAnimator valueAnimator2 = this.f83988M;
        if (valueAnimator2 != null) {
            valueAnimator2.setDuration(300);
            valueAnimator2.addUpdateListener(new C32172s(this, z));
            valueAnimator2.addListener(new C32173t(this, z));
            valueAnimator2.start();
        }
    }

    /* renamed from: a */
    public final boolean mo83298a(int i) {
        View c = mo83306m().mo5432c(i);
        if (c == null) {
            return false;
        }
        RecyclerView n = m104408n();
        C7573i.m23582a((Object) n, "mRecyclerView");
        if (((float) (n.getHeight() - c.getTop())) >= ((float) c.getHeight()) * 0.3f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m104406a(boolean z, String str) {
        C22984d a = C22984d.m75611a().mo59971a("stay_time", System.currentTimeMillis() - this.f83987L);
        String str2 = "skip";
        if (!z) {
            str2 = "done";
            a.mo59973a("interests_list", str);
        }
        C6907h.m21524a("exit_interest_selection", (Map) a.mo59973a("exit_method", str2).f60753a);
    }

    /* renamed from: a */
    public final void mo83296a(int i, int i2) {
        if (i <= i2) {
            while (true) {
                if (i > 0 && i <= mo83305l().f83953b.size()) {
                    C13380c.m39172c().mo33182c(ImageRequest.fromUri(((C32246j) mo83305l().f83953b.get(i - 1)).f84279c), this);
                    this.f83998d = i;
                }
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo83300b(int i, int i2) {
        if (i2 > this.f83997c) {
            this.f83997c = i2;
        }
        if (i <= i2) {
            while (true) {
                C6907h.m21524a("show_interest_category", (Map) C22984d.m75611a().mo59973a("interest", C7634n.m23711a(((C32246j) mo83305l().f83953b.get(i - 1)).f84277a, "&", "and", false)).mo59970a("show_rank", i).f60753a);
                if (i != i2) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
