package com.p280ss.android.ugc.aweme.commercialize.loft.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.facebook.drawee.controller.C13400c;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24889d;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24859c;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24860d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController */
public final class IntermediateStateViewController implements C24858b, C24860d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f65641a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "rootView", "getRootView()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivClose", "getIvClose()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "background", "getBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivGoodsBackground", "getIvGoodsBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivGoods", "getIvGoods()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "llDesc", "getLlDesc()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivLogo", "getIvLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivTitle", "getIvTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "tvTime", "getTvTime()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivTopLeft", "getIvTopLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivTopRight", "getIvTopRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivBottomLeft", "getIvBottomLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivBottomRight", "getIvBottomRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "llLoadDesc", "getLlLoadDesc()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivLoadLogo", "getIvLoadLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivLoadTitle", "getIvLoadTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "tvLoadTime", "getTvLoadTime()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "llLoadState", "getLlLoadState()Landroid/widget/LinearLayout;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivLoadBlue", "getIvLoadBlue()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "ivLoadRed", "getIvLoadRed()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "tvLoadState", "getTvLoadState()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(IntermediateStateViewController.class), "normalLoading", "getNormalLoading()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;"))};

    /* renamed from: h */
    public static final C24893a f65642h = new C24893a(null);

    /* renamed from: A */
    private final C7541d f65643A;

    /* renamed from: B */
    private final C7541d f65644B;

    /* renamed from: C */
    private final C7541d f65645C;

    /* renamed from: D */
    private final C7541d f65646D;

    /* renamed from: E */
    private float f65647E;

    /* renamed from: F */
    private float f65648F;

    /* renamed from: G */
    private Loft f65649G;

    /* renamed from: H */
    private ViewType f65650H;

    /* renamed from: I */
    private float f65651I;

    /* renamed from: J */
    private int f65652J;

    /* renamed from: K */
    private int f65653K;

    /* renamed from: L */
    private ViewState f65654L;

    /* renamed from: M */
    private ObjectAnimator f65655M;

    /* renamed from: N */
    private ObjectAnimator f65656N;

    /* renamed from: O */
    private ObjectAnimator f65657O;

    /* renamed from: P */
    private boolean f65658P;

    /* renamed from: Q */
    private AnimatorSet f65659Q;

    /* renamed from: R */
    private ObjectAnimator f65660R;

    /* renamed from: S */
    private ObjectAnimator f65661S;

    /* renamed from: T */
    private ObjectAnimator f65662T;

    /* renamed from: U */
    private ObjectAnimator f65663U;

    /* renamed from: V */
    private boolean f65664V;

    /* renamed from: W */
    private AnimatorSet f65665W;

    /* renamed from: X */
    private ObjectAnimator f65666X;

    /* renamed from: Y */
    private ObjectAnimator f65667Y;

    /* renamed from: Z */
    private ObjectAnimator f65668Z;

    /* renamed from: aa */
    private ObjectAnimator f65669aa;

    /* renamed from: ab */
    private final boolean f65670ab;

    /* renamed from: ac */
    private final boolean f65671ac;

    /* renamed from: b */
    public OnClickListener f65672b;

    /* renamed from: c */
    public C24859c f65673c;

    /* renamed from: d */
    public Loft f65674d;

    /* renamed from: e */
    public AnimatorSet f65675e;

    /* renamed from: f */
    public final Context f65676f;

    /* renamed from: g */
    public final ViewGroup f65677g;

    /* renamed from: i */
    private final C7541d f65678i;

    /* renamed from: j */
    private final C7541d f65679j;

    /* renamed from: k */
    private final C7541d f65680k;

    /* renamed from: l */
    private final C7541d f65681l;

    /* renamed from: m */
    private final C7541d f65682m;

    /* renamed from: n */
    private final C7541d f65683n;

    /* renamed from: o */
    private final C7541d f65684o;

    /* renamed from: p */
    private final C7541d f65685p;

    /* renamed from: q */
    private final C7541d f65686q;

    /* renamed from: r */
    private final C7541d f65687r;

    /* renamed from: s */
    private final C7541d f65688s;

    /* renamed from: t */
    private final C7541d f65689t;

    /* renamed from: u */
    private final C7541d f65690u;

    /* renamed from: v */
    private final C7541d f65691v;

    /* renamed from: w */
    private final C7541d f65692w;

    /* renamed from: x */
    private final C7541d f65693x;

    /* renamed from: y */
    private final C7541d f65694y;

    /* renamed from: z */
    private final C7541d f65695z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ViewState */
    public enum ViewState {
        CLOSE,
        PULL_DOWN_FIRST,
        PULL_DOWN_SECOND,
        PULL_DOWN_THIRD,
        TO_REFRESH,
        REFRESHING,
        REFRESH_BACK,
        BACKING,
        EXPENDING,
        EXPENDED
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ViewType */
    public enum ViewType {
        SECOND_LOFT,
        DIRECT_OPEN,
        VIDEO_PLACEHOLDER
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$a */
    public static final class C24893a {
        private C24893a() {
        }

        public /* synthetic */ C24893a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$aa */
    public static final class C24894aa implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65696a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C24894aa(IntermediateStateViewController intermediateStateViewController) {
            this.f65696a = intermediateStateViewController;
        }

        public final void onAnimationEnd(Animator animator) {
            C24859c cVar = this.f65696a.f65673c;
            if (cVar != null) {
                cVar.mo64995a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ab */
    static final class C24895ab extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65697a;

        C24895ab(IntermediateStateViewController intermediateStateViewController) {
            this.f65697a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f65697a.mo65142g().findViewById(R.id.dxa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ac */
    static final class C24896ac extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65698a;

        C24896ac(IntermediateStateViewController intermediateStateViewController) {
            this.f65698a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f65698a.mo65142g().findViewById(R.id.dxb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ad */
    static final class C24897ad extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65699a;

        C24897ad(IntermediateStateViewController intermediateStateViewController) {
            this.f65699a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f65699a.mo65142g().findViewById(R.id.e3_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$b */
    static final class C24898b extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65700a;

        C24898b(IntermediateStateViewController intermediateStateViewController) {
            this.f65700a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65700a.mo65142g().findViewById(R.id.b6b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$c */
    public static final class C24899c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65701a;

        /* renamed from: b */
        final /* synthetic */ int f65702b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f65703c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f65701a.mo65147l().setTag(Integer.valueOf(this.f65702b));
            this.f65701a.mo65147l().setText(this.f65701a.mo65137a(this.f65702b));
            this.f65701a.f65675e = new AnimatorSet();
            AnimatorSet animatorSet = this.f65701a.f65675e;
            if (animatorSet != null) {
                Builder play = animatorSet.play(this.f65703c);
                if (play != null) {
                    play.after(50);
                }
            }
            AnimatorSet animatorSet2 = this.f65701a.f65675e;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(100);
            }
            AnimatorSet animatorSet3 = this.f65701a.f65675e;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }

        C24899c(IntermediateStateViewController intermediateStateViewController, int i, ObjectAnimator objectAnimator) {
            this.f65701a = intermediateStateViewController;
            this.f65702b = i;
            this.f65703c = objectAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$d */
    public static final class C24900d extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65704a;

        /* renamed from: b */
        final /* synthetic */ Loft f65705b;

        /* renamed from: c */
        final /* synthetic */ ViewType f65706c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f65707d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                IntermediateStateViewController.m81697a(this.f65704a.mo65143h(), fVar);
            }
        }

        C24900d(IntermediateStateViewController intermediateStateViewController, Loft loft, ViewType viewType, OnClickListener onClickListener) {
            this.f65704a = intermediateStateViewController;
            this.f65705b = loft;
            this.f65706c = viewType;
            this.f65707d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$e */
    public static final class C24901e extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65708a;

        /* renamed from: b */
        final /* synthetic */ Loft f65709b;

        /* renamed from: c */
        final /* synthetic */ ViewType f65710c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f65711d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                IntermediateStateViewController.m81697a(this.f65708a.mo65144i(), fVar);
            }
        }

        C24901e(IntermediateStateViewController intermediateStateViewController, Loft loft, ViewType viewType, OnClickListener onClickListener) {
            this.f65708a = intermediateStateViewController;
            this.f65709b = loft;
            this.f65710c = viewType;
            this.f65711d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$f */
    public static final class C24902f extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65712a;

        /* renamed from: b */
        final /* synthetic */ Loft f65713b;

        /* renamed from: c */
        final /* synthetic */ ViewType f65714c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f65715d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                IntermediateStateViewController.m81697a(this.f65712a.mo65145j(), fVar);
            }
        }

        C24902f(IntermediateStateViewController intermediateStateViewController, Loft loft, ViewType viewType, OnClickListener onClickListener) {
            this.f65712a = intermediateStateViewController;
            this.f65713b = loft;
            this.f65714c = viewType;
            this.f65715d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$g */
    public static final class C24903g extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65716a;

        /* renamed from: b */
        final /* synthetic */ Loft f65717b;

        /* renamed from: c */
        final /* synthetic */ ViewType f65718c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f65719d;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                IntermediateStateViewController.m81697a(this.f65716a.mo65146k(), fVar);
            }
        }

        C24903g(IntermediateStateViewController intermediateStateViewController, Loft loft, ViewType viewType, OnClickListener onClickListener) {
            this.f65716a = intermediateStateViewController;
            this.f65717b = loft;
            this.f65718c = viewType;
            this.f65719d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$h */
    static final class C24904h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65720a;

        /* renamed from: b */
        final /* synthetic */ Loft f65721b;

        /* renamed from: c */
        final /* synthetic */ ViewType f65722c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f65723d;

        C24904h(IntermediateStateViewController intermediateStateViewController, Loft loft, ViewType viewType, OnClickListener onClickListener) {
            this.f65720a = intermediateStateViewController;
            this.f65721b = loft;
            this.f65722c = viewType;
            this.f65723d = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65720a.mo65151p();
            this.f65720a.mo65152q();
            OnClickListener onClickListener = this.f65723d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$i */
    static final class C24905i extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65724a;

        C24905i(IntermediateStateViewController intermediateStateViewController) {
            this.f65724a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65724a.mo65142g().findViewById(R.id.b6q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$j */
    static final class C24906j extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65725a;

        C24906j(IntermediateStateViewController intermediateStateViewController) {
            this.f65725a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65725a.mo65142g().findViewById(R.id.b6r);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$k */
    static final class C24907k extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65726a;

        C24907k(IntermediateStateViewController intermediateStateViewController) {
            this.f65726a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f65726a.mo65142g().findViewById(R.id.b7g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$l */
    static final class C24908l extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65727a;

        C24908l(IntermediateStateViewController intermediateStateViewController) {
            this.f65727a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65727a.mo65142g().findViewById(R.id.b9m);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$m */
    static final class C24909m extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65728a;

        C24909m(IntermediateStateViewController intermediateStateViewController) {
            this.f65728a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65728a.mo65142g().findViewById(R.id.b9n);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$n */
    static final class C24910n extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65729a;

        C24910n(IntermediateStateViewController intermediateStateViewController) {
            this.f65729a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f65729a.mo65142g().findViewById(R.id.b_s);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$o */
    static final class C24911o extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65730a;

        C24911o(IntermediateStateViewController intermediateStateViewController) {
            this.f65730a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65730a.mo65142g().findViewById(R.id.b_t);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$p */
    static final class C24912p extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65731a;

        C24912p(IntermediateStateViewController intermediateStateViewController) {
            this.f65731a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f65731a.mo65142g().findViewById(R.id.b_u);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$q */
    static final class C24913q extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65732a;

        C24913q(IntermediateStateViewController intermediateStateViewController) {
            this.f65732a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65732a.mo65142g().findViewById(R.id.b_v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$r */
    static final class C24914r extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65733a;

        C24914r(IntermediateStateViewController intermediateStateViewController) {
            this.f65733a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65733a.mo65142g().findViewById(R.id.ba0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$s */
    static final class C24915s extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65734a;

        C24915s(IntermediateStateViewController intermediateStateViewController) {
            this.f65734a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65734a.mo65142g().findViewById(R.id.bd2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$t */
    static final class C24916t extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65735a;

        C24916t(IntermediateStateViewController intermediateStateViewController) {
            this.f65735a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65735a.mo65142g().findViewById(R.id.bd7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$u */
    static final class C24917u extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65736a;

        C24917u(IntermediateStateViewController intermediateStateViewController) {
            this.f65736a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f65736a.mo65142g().findViewById(R.id.bd8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$v */
    static final class C24918v extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65737a;

        C24918v(IntermediateStateViewController intermediateStateViewController) {
            this.f65737a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f65737a.mo65142g().findViewById(R.id.br3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$w */
    static final class C24919w extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65738a;

        C24919w(IntermediateStateViewController intermediateStateViewController) {
            this.f65738a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f65738a.mo65142g().findViewById(R.id.bru);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$x */
    static final class C24920x extends Lambda implements C7561a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65739a;

        C24920x(IntermediateStateViewController intermediateStateViewController) {
            this.f65739a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LinearLayout invoke() {
            return (LinearLayout) this.f65739a.mo65142g().findViewById(R.id.brv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$y */
    static final class C24921y extends Lambda implements C7561a<DmtLoadingLayout> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65740a;

        C24921y(IntermediateStateViewController intermediateStateViewController) {
            this.f65740a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtLoadingLayout invoke() {
            return (DmtLoadingLayout) this.f65740a.mo65142g().findViewById(R.id.c53);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$z */
    static final class C24922z extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ IntermediateStateViewController f65741a;

        C24922z(IntermediateStateViewController intermediateStateViewController) {
            this.f65741a = intermediateStateViewController;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return LayoutInflater.from(this.f65741a.f65676f).inflate(R.layout.a8b, this.f65741a.f65677g, false);
        }
    }

    /* renamed from: A */
    private final RemoteImageView m81678A() {
        return (RemoteImageView) this.f65690u.getValue();
    }

    /* renamed from: B */
    private final LinearLayout m81679B() {
        return (LinearLayout) this.f65691v.getValue();
    }

    /* renamed from: C */
    private final TextView m81680C() {
        return (TextView) this.f65694y.getValue();
    }

    /* renamed from: D */
    private final LinearLayout m81681D() {
        return (LinearLayout) this.f65695z.getValue();
    }

    /* renamed from: E */
    private final ImageView m81682E() {
        return (ImageView) this.f65643A.getValue();
    }

    /* renamed from: F */
    private final ImageView m81683F() {
        return (ImageView) this.f65644B.getValue();
    }

    /* renamed from: G */
    private final DmtLoadingLayout m81684G() {
        return (DmtLoadingLayout) this.f65646D.getValue();
    }

    /* renamed from: r */
    private final ImageView m81706r() {
        return (ImageView) this.f65679j.getValue();
    }

    /* renamed from: s */
    private final RemoteImageView m81707s() {
        return (RemoteImageView) this.f65680k.getValue();
    }

    /* renamed from: t */
    private final RemoteImageView m81708t() {
        return (RemoteImageView) this.f65681l.getValue();
    }

    /* renamed from: u */
    private final RemoteImageView m81709u() {
        return (RemoteImageView) this.f65682m.getValue();
    }

    /* renamed from: v */
    private final LinearLayout m81710v() {
        return (LinearLayout) this.f65683n.getValue();
    }

    /* renamed from: w */
    private final TextView m81711w() {
        return (TextView) this.f65686q.getValue();
    }

    /* renamed from: x */
    private final RemoteImageView m81712x() {
        return (RemoteImageView) this.f65687r.getValue();
    }

    /* renamed from: y */
    private final RemoteImageView m81713y() {
        return (RemoteImageView) this.f65688s.getValue();
    }

    /* renamed from: z */
    private final RemoteImageView m81714z() {
        return (RemoteImageView) this.f65689t.getValue();
    }

    /* renamed from: d */
    public final void mo64994d() {
    }

    /* renamed from: g */
    public final View mo65142g() {
        return (View) this.f65678i.getValue();
    }

    /* renamed from: h */
    public final RemoteImageView mo65143h() {
        return (RemoteImageView) this.f65684o.getValue();
    }

    /* renamed from: i */
    public final RemoteImageView mo65144i() {
        return (RemoteImageView) this.f65685p.getValue();
    }

    /* renamed from: j */
    public final RemoteImageView mo65145j() {
        return (RemoteImageView) this.f65692w.getValue();
    }

    /* renamed from: k */
    public final RemoteImageView mo65146k() {
        return (RemoteImageView) this.f65693x.getValue();
    }

    /* renamed from: l */
    public final TextView mo65147l() {
        return (TextView) this.f65645C.getValue();
    }

    /* renamed from: a */
    public final void mo65141a(String str, String str2) {
        C7573i.m23587b(str, "startColor");
        C7573i.m23587b(str2, "endColor");
        mo65142g().setBackground(new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str), Color.parseColor(str2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if ((!kotlin.jvm.internal.C7573i.m23585a(r0, (java.lang.Object) r2)) != false) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65140a(com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft r7, com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType r8, android.view.View.OnClickListener r9) {
        /*
            r6 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            if (r7 != 0) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r0 = r7.getId()
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r1 = r6.f65649G
            r2 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.String r1 = r1.getId()
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0040
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes r0 = r7.getAnimationRes()
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.getDownloadUrl()
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r3 = r6.f65649G
            if (r3 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes r3 = r3.getAnimationRes()
            if (r3 == 0) goto L_0x0039
            java.lang.String r2 = r3.getDownloadUrl()
        L_0x0039:
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0184
        L_0x0040:
            com.ss.android.ugc.aweme.commercialize.loft.model.LoftAnimationRes r0 = r7.getAnimationRes()
            if (r0 == 0) goto L_0x0184
            java.lang.String r2 = r0.getStartColor()
            java.lang.String r3 = r0.getEndColor()
            r6.mo65141a(r2, r3)
            int r2 = r7.getStatus()
            int r3 = com.p280ss.android.ugc.aweme.commercialize.loft.model.C24889d.f65631c
            if (r2 != r3) goto L_0x0064
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81707s()
            java.lang.String r3 = r0.getBackgroundUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r3)
        L_0x0064:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81707s()
            r3 = 0
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ViewType r2 = com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType.SECOND_LOFT
            if (r8 != r2) goto L_0x0079
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81707s()
            r4 = 0
            r2.setAlpha(r4)
            goto L_0x0082
        L_0x0079:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81707s()
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r4)
        L_0x0082:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81708t()
            java.lang.String r4 = r0.getGoodsBackgroundUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81708t()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81709u()
            java.lang.String r4 = r0.getGoodsUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81709u()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.mo65143h()
            java.lang.String r4 = r0.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$d r5 = new com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$d
            r5.<init>(r6, r7, r8, r9)
            com.facebook.drawee.controller.d r5 = (com.facebook.drawee.controller.C13401d) r5
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83378a(r2, r4, r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.mo65144i()
            java.lang.String r4 = r0.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$e r5 = new com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$e
            r5.<init>(r6, r7, r8, r9)
            com.facebook.drawee.controller.d r5 = (com.facebook.drawee.controller.C13401d) r5
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83378a(r2, r4, r5)
            android.widget.LinearLayout r2 = r6.m81710v()
            r2.setVisibility(r3)
            android.widget.TextView r2 = r6.m81711w()
            java.lang.String r4 = r0.getTimeDesc()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.setText(r4)
            android.widget.TextView r2 = r6.m81711w()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81712x()
            java.lang.String r4 = r0.getFloatLeftTopUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81712x()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81713y()
            java.lang.String r4 = r0.getFloatRightTopUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81713y()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81714z()
            java.lang.String r4 = r0.getFloatLeftBottomUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81714z()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81678A()
            java.lang.String r4 = r0.getFloatRightBottomUri()
            com.p280ss.android.ugc.aweme.base.C23323e.m76514a(r2, r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.m81678A()
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.mo65145j()
            java.lang.String r4 = r0.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$f r5 = new com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$f
            r5.<init>(r6, r7, r8, r9)
            com.facebook.drawee.controller.d r5 = (com.facebook.drawee.controller.C13401d) r5
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83378a(r2, r4, r5)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = r6.mo65146k()
            java.lang.String r4 = r0.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$g r5 = new com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$g
            r5.<init>(r6, r7, r8, r9)
            com.facebook.drawee.controller.d r5 = (com.facebook.drawee.controller.C13401d) r5
            com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.m83378a(r2, r4, r5)
            android.widget.LinearLayout r2 = r6.m81679B()
            r2.setVisibility(r3)
            android.widget.TextView r2 = r6.m81680C()
            java.lang.String r0 = r0.getTimeDesc()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setText(r0)
            android.widget.TextView r0 = r6.m81680C()
            r0.setVisibility(r3)
            r6.m81701b(r1)
            android.widget.LinearLayout r0 = r6.m81681D()
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r6.m81706r()
            com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$h r1 = new com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$h
            r1.<init>(r6, r7, r8, r9)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0184:
            int r0 = r7.getStatus()
            com.ss.android.ugc.aweme.commercialize.loft.model.Loft r1 = r6.f65649G
            if (r1 == 0) goto L_0x0192
            int r1 = r1.getStatus()
            if (r0 == r1) goto L_0x0195
        L_0x0192:
            r6.m81702b(r7)
        L_0x0195:
            r6.mo65148m()
            r6.m81698a(r7, r8)
            r6.m81703b(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.mo65140a(com.ss.android.ugc.aweme.commercialize.loft.model.Loft, com.ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController$ViewType, android.view.View$OnClickListener):void");
    }

    /* renamed from: a */
    public final void mo65139a(Loft loft) {
        if (loft != null && loft.getStatus() == C24889d.f65631c) {
            mo65152q();
            mo65151p();
            this.f65665W = new AnimatorSet();
            this.f65664V = false;
            if (this.f65666X == null) {
                this.f65666X = m81695a((View) m81712x(), -80.0f, -100.0f);
            }
            if (this.f65667Y == null) {
                this.f65667Y = m81695a((View) m81713y(), -110.0f, -125.0f);
            }
            if (this.f65668Z == null) {
                this.f65668Z = m81695a((View) m81714z(), 68.0f, 53.0f);
            }
            if (this.f65669aa == null) {
                this.f65669aa = m81695a((View) m81678A(), 21.0f, 1.0f);
            }
            AnimatorSet animatorSet = this.f65665W;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.f65666X, this.f65667Y, this.f65668Z, this.f65669aa});
            }
            AnimatorSet animatorSet2 = this.f65665W;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(2000);
            }
            AnimatorSet animatorSet3 = this.f65665W;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    /* renamed from: O */
    private final void m81692O() {
        m81701b(2);
    }

    /* renamed from: a */
    public final void mo64991a() {
        m81699a(ViewState.EXPENDING);
    }

    /* renamed from: n */
    public final void mo65149n() {
        m81699a(ViewState.CLOSE);
    }

    /* renamed from: o */
    public final View mo65150o() {
        return mo65142g();
    }

    /* renamed from: N */
    private final void m81691N() {
        m81701b(1);
        if (this.f65665W == null) {
            m81704c(this.f65649G);
        }
    }

    /* renamed from: b */
    public final void mo64992b() {
        m81699a(ViewState.EXPENDED);
    }

    /* renamed from: f */
    public final void mo64997f() {
        if (this.f65654L == ViewState.TO_REFRESH) {
            m81699a(ViewState.REFRESHING);
        }
    }

    /* renamed from: J */
    private final void m81687J() {
        m81679B().setVisibility(4);
        m81680C().setVisibility(4);
        m81681D().setVisibility(4);
        m81696a(this.f65647E, this.f65648F);
    }

    /* renamed from: K */
    private final void m81688K() {
        mo65147l().setScaleX(1.0f);
        mo65147l().setScaleY(1.0f);
        m81682E().setTranslationX(0.0f);
        m81683F().setTranslationX(0.0f);
    }

    /* renamed from: M */
    private final void m81690M() {
        m81684G().setVisibility(0);
        m81681D().setVisibility(4);
    }

    /* renamed from: P */
    private final void m81693P() {
        Loft loft = this.f65649G;
        if (loft != null) {
            if (loft.getStatus() == C24889d.f65631c) {
                m81701b(3);
            } else {
                m81701b(2);
            }
        }
        m81694Q();
    }

    /* renamed from: Q */
    private final void m81694Q() {
        this.f65651I = m81683F().getX() - m81682E().getX();
    }

    /* renamed from: c */
    public final void mo64993c() {
        if (this.f65654L == ViewState.REFRESHING) {
            m81699a(ViewState.REFRESH_BACK);
            return;
        }
        if (!(this.f65654L == ViewState.BACKING || this.f65654L == ViewState.REFRESH_BACK)) {
            m81699a(ViewState.BACKING);
        }
    }

    /* renamed from: e */
    public final void mo64996e() {
        if (this.f65654L != ViewState.REFRESHING && this.f65654L != ViewState.REFRESH_BACK && this.f65654L != ViewState.TO_REFRESH) {
            m81699a(ViewState.TO_REFRESH);
            this.f65653K = this.f65652J;
        }
    }

    /* renamed from: p */
    public final void mo65151p() {
        if (!this.f65664V) {
            AnimatorSet animatorSet = this.f65665W;
            if (animatorSet != null) {
                this.f65664V = true;
                animatorSet.cancel();
                this.f65665W = null;
            }
        }
    }

    /* renamed from: q */
    public final void mo65152q() {
        if (!this.f65658P) {
            AnimatorSet animatorSet = this.f65659Q;
            if (animatorSet != null) {
                this.f65658P = true;
                animatorSet.removeAllListeners();
                animatorSet.cancel();
                this.f65659Q = null;
            }
        }
    }

    /* renamed from: I */
    private final void m81686I() {
        if (this.f65655M == null) {
            this.f65655M = ObjectAnimator.ofFloat(m81707s(), "alpha", new float[]{0.0f, 1.0f});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(this.f65655M);
        animatorSet.setDuration(200);
        animatorSet.start();
        m81705d(this.f65649G);
    }

    /* renamed from: L */
    private final void m81689L() {
        m81707s().setAlpha(0.0f);
        m81679B().setVisibility(0);
        m81680C().setVisibility(0);
        m81681D().setVisibility(0);
        m81684G().setVisibility(4);
        Loft loft = this.f65674d;
        if (loft != null) {
            ViewType viewType = this.f65650H;
            if (viewType == null) {
                C7573i.m23583a("viewType");
            }
            mo65140a(loft, viewType, this.f65672b);
            this.f65674d = null;
        }
        mo65151p();
    }

    /* renamed from: m */
    public final void mo65148m() {
        if (!this.f65670ab) {
            m81706r().setImageResource(R.drawable.vw);
            m81679B().setVisibility(8);
            mo65145j().setVisibility(8);
            mo65146k().setVisibility(8);
            m81680C().setVisibility(8);
            m81681D().setVisibility(8);
            m81682E().setVisibility(8);
            m81683F().setVisibility(8);
            mo65147l().setVisibility(8);
            m81684G().setVisibility(8);
            return;
        }
        m81706r().setImageResource(R.drawable.vx);
    }

    /* renamed from: H */
    private final void m81685H() {
        if ((this.f65654L == ViewState.BACKING || this.f65654L == ViewState.PULL_DOWN_FIRST) && this.f65652J < 60) {
            float f = ((this.f65651I / 2.0f) * ((float) (60 - this.f65652J))) / 60.0f;
            float f2 = ((float) this.f65652J) / 60.0f;
            m81681D().setVisibility(0);
            mo65147l().setScaleX(f2);
            mo65147l().setScaleY(f2);
            m81682E().setTranslationX(f);
            m81683F().setTranslationX(-f);
        } else if (this.f65654L != ViewState.TO_REFRESH || this.f65652J < 60) {
            m81688K();
        } else {
            float f3 = ((this.f65651I / 2.0f) * ((float) (this.f65653K - this.f65652J))) / ((float) (this.f65653K - 60));
            float f4 = ((float) (this.f65652J - 60)) / ((float) (this.f65653K - 60));
            m81681D().setVisibility(0);
            mo65147l().setScaleX(f4);
            mo65147l().setScaleY(f4);
            m81682E().setTranslationX(f3);
            m81683F().setTranslationX(-f3);
        }
    }

    /* renamed from: b */
    private final void m81702b(Loft loft) {
        if (loft.getStatus() == C24889d.f65631c) {
            m81708t().setVisibility(0);
            m81709u().setVisibility(0);
            m81712x().setVisibility(0);
            m81713y().setVisibility(0);
            m81714z().setVisibility(0);
            m81678A().setVisibility(0);
            return;
        }
        m81708t().setVisibility(4);
        m81709u().setVisibility(4);
        m81712x().setVisibility(4);
        m81713y().setVisibility(4);
        m81714z().setVisibility(4);
        m81678A().setVisibility(4);
    }

    /* renamed from: b */
    private final void m81701b(int i) {
        int i2;
        if (mo65147l().getTag() instanceof Integer) {
            Object tag = mo65147l().getTag();
            if (tag != null) {
                i2 = ((Integer) tag).intValue();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
        } else {
            i2 = 0;
        }
        if ((i2 == 2 && i == 3) || (i2 == 3 && i == 2)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo65147l(), "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo65147l(), "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = this.f65675e;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f65675e = null;
            }
            this.f65675e = new AnimatorSet();
            AnimatorSet animatorSet2 = this.f65675e;
            if (animatorSet2 != null) {
                animatorSet2.play(ofFloat);
            }
            AnimatorSet animatorSet3 = this.f65675e;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(100);
            }
            AnimatorSet animatorSet4 = this.f65675e;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new C24899c(this, i, ofFloat2));
            }
            AnimatorSet animatorSet5 = this.f65675e;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        } else {
            AnimatorSet animatorSet6 = this.f65675e;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
                this.f65675e = null;
            }
            mo65147l().setTag(Integer.valueOf(i));
            mo65147l().setAlpha(1.0f);
            mo65147l().setText(mo65137a(i));
        }
    }

    /* renamed from: c */
    private final void m81704c(Loft loft) {
        if (loft != null && loft.getStatus() == C24889d.f65631c) {
            mo65152q();
            mo65151p();
            this.f65665W = new AnimatorSet();
            this.f65664V = false;
            if (this.f65666X == null) {
                this.f65666X = m81695a((View) m81712x(), -80.0f, -100.0f);
            }
            if (this.f65667Y == null) {
                this.f65667Y = m81695a((View) m81713y(), -110.0f, -125.0f);
            }
            if (this.f65668Z == null) {
                this.f65668Z = m81695a((View) m81714z(), 68.0f, 53.0f);
            }
            if (this.f65669aa == null) {
                this.f65669aa = m81695a((View) m81678A(), 21.0f, 1.0f);
            }
            AnimatorSet animatorSet = this.f65665W;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.f65666X, this.f65667Y, this.f65668Z, this.f65669aa});
            }
            AnimatorSet animatorSet2 = this.f65665W;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(2000);
            }
            AnimatorSet animatorSet3 = this.f65665W;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    /* renamed from: d */
    private final void m81705d(Loft loft) {
        if (loft != null && loft.getStatus() == C24889d.f65631c) {
            mo65152q();
            mo65151p();
            this.f65659Q = new AnimatorSet();
            this.f65658P = false;
            if (this.f65660R == null) {
                this.f65660R = m81700b((View) m81712x(), -87.0f, -80.0f);
            }
            if (this.f65661S == null) {
                this.f65661S = m81700b((View) m81713y(), -115.25f, -110.0f);
            }
            if (this.f65662T == null) {
                this.f65662T = m81700b((View) m81714z(), 62.75f, 68.0f);
            }
            if (this.f65663U == null) {
                this.f65663U = m81700b((View) m81678A(), 14.0f, 21.0f);
            }
            AnimatorSet animatorSet = this.f65659Q;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.f65660R, this.f65661S, this.f65662T, this.f65663U});
            }
            AnimatorSet animatorSet2 = this.f65659Q;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(700);
            }
            AnimatorSet animatorSet3 = this.f65659Q;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new C24894aa(this));
            }
            AnimatorSet animatorSet4 = this.f65659Q;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }

    /* renamed from: a */
    private final void m81699a(ViewState viewState) {
        this.f65654L = viewState;
        switch (C24923a.f65742a[viewState.ordinal()]) {
            case 1:
                m81691N();
                return;
            case 2:
                m81692O();
                return;
            case 3:
                m81693P();
                return;
            case 4:
                m81690M();
                return;
            case 5:
                m81689L();
                return;
            case 6:
                m81686I();
                return;
            case 7:
                m81687J();
                break;
        }
    }

    /* renamed from: a */
    public final int mo65137a(int i) {
        if (this.f65671ac) {
            switch (i) {
                case 1:
                    Loft loft = this.f65649G;
                    if (loft == null || loft.getStatus() != C24889d.f65630b) {
                        return R.string.c5f;
                    }
                    return R.string.c59;
                case 2:
                    Loft loft2 = this.f65649G;
                    if (loft2 == null || loft2.getStatus() != C24889d.f65630b) {
                        return R.string.c5f;
                    }
                    return R.string.c59;
                case 3:
                    Loft loft3 = this.f65649G;
                    if (loft3 == null || loft3.getStatus() != C24889d.f65630b) {
                        return R.string.c58;
                    }
                    return R.string.c59;
                default:
                    return R.string.c5a;
            }
        } else {
            switch (i) {
                case 1:
                    return R.string.c5a;
                case 2:
                    return R.string.c5_;
                case 3:
                    return R.string.c58;
                default:
                    return R.string.c5a;
            }
        }
    }

    /* renamed from: a */
    public final void mo65138a(float f) {
        this.f65652J = C9738o.m28714c(this.f65676f, f);
        if (f == 0.0f) {
            if (this.f65654L == ViewState.BACKING || this.f65654L == ViewState.REFRESH_BACK) {
                m81699a(ViewState.CLOSE);
            }
        } else if (this.f65652J < 60) {
            if (this.f65654L == ViewState.CLOSE || this.f65654L == ViewState.PULL_DOWN_SECOND || this.f65654L == ViewState.PULL_DOWN_THIRD) {
                m81699a(ViewState.PULL_DOWN_FIRST);
            }
        } else if (this.f65652J < 120) {
            if (this.f65654L == ViewState.CLOSE || this.f65654L == ViewState.PULL_DOWN_FIRST || this.f65654L == ViewState.PULL_DOWN_THIRD) {
                m81699a(ViewState.PULL_DOWN_SECOND);
            }
        } else if (this.f65654L == ViewState.CLOSE || this.f65654L == ViewState.PULL_DOWN_FIRST || this.f65654L == ViewState.PULL_DOWN_SECOND) {
            m81699a(ViewState.PULL_DOWN_THIRD);
        }
        if (this.f65651I == 0.0f) {
            m81694Q();
        }
        if (this.f65654L == ViewState.PULL_DOWN_FIRST || this.f65654L == ViewState.PULL_DOWN_SECOND || this.f65654L == ViewState.PULL_DOWN_THIRD) {
            float measuredHeight = 1.0f - (f / ((float) mo65142g().getMeasuredHeight()));
            this.f65647E = C9738o.m28708b(this.f65676f, -40.0f * measuredHeight);
            this.f65648F = C9738o.m28708b(this.f65676f, measuredHeight * -15.0f);
            m81709u().setTranslationY(this.f65647E);
            m81708t().setTranslationY(this.f65648F);
        }
        m81685H();
    }

    /* renamed from: a */
    public static void m81697a(RemoteImageView remoteImageView, C13648f fVar) {
        LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = (layoutParams.height * fVar.getWidth()) / fVar.getHeight();
        remoteImageView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m81696a(float f, float f2) {
        if (this.f65656N == null) {
            this.f65656N = ObjectAnimator.ofFloat(m81709u(), "translationY", new float[]{f, 0.0f});
        }
        if (this.f65657O == null) {
            this.f65657O = ObjectAnimator.ofFloat(m81708t(), "translationY", new float[]{f2, 0.0f});
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{this.f65656N, this.f65657O});
        animatorSet.setDuration(500);
        animatorSet.start();
    }

    /* renamed from: a */
    private final void m81698a(Loft loft, ViewType viewType) {
        switch (C24923a.f65743b[viewType.ordinal()]) {
            case 1:
                m81704c(loft);
                return;
            case 2:
                m81707s().setAlpha(1.0f);
                m81679B().setVisibility(4);
                m81680C().setVisibility(4);
                m81681D().setVisibility(4);
                m81705d(loft);
                return;
            case 3:
                m81707s().setAlpha(1.0f);
                m81679B().setVisibility(4);
                m81680C().setVisibility(4);
                m81681D().setVisibility(4);
                m81704c(loft);
                break;
        }
    }

    /* renamed from: b */
    private final void m81703b(Loft loft, ViewType viewType, OnClickListener onClickListener) {
        this.f65649G = loft;
        this.f65650H = viewType;
        this.f65672b = onClickListener;
    }

    public IntermediateStateViewController(Context context, ViewGroup viewGroup, boolean z) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "parentView");
        this(context, viewGroup, z, false);
    }

    /* renamed from: a */
    private final ObjectAnimator m81695a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9738o.m28708b(this.f65676f, f), C9738o.m28708b(this.f65676f, f2)});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    /* renamed from: b */
    private final ObjectAnimator m81700b(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9738o.m28708b(this.f65676f, f), C9738o.m28708b(this.f65676f, f2)});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(v…lationY\", startDb, endDb)");
        return ofFloat;
    }

    public IntermediateStateViewController(Context context, ViewGroup viewGroup, boolean z, boolean z2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(viewGroup, "parentView");
        this.f65676f = context;
        this.f65677g = viewGroup;
        this.f65670ab = z;
        this.f65671ac = z2;
        this.f65678i = C7546e.m23569a(new C24922z(this));
        this.f65679j = C7546e.m23569a(new C24907k(this));
        this.f65680k = C7546e.m23569a(new C24898b(this));
        this.f65681l = C7546e.m23569a(new C24909m(this));
        this.f65682m = C7546e.m23569a(new C24908l(this));
        this.f65683n = C7546e.m23569a(new C24918v(this));
        this.f65684o = C7546e.m23569a(new C24914r(this));
        this.f65685p = C7546e.m23569a(new C24915s(this));
        this.f65686q = C7546e.m23569a(new C24897ad(this));
        this.f65687r = C7546e.m23569a(new C24916t(this));
        this.f65688s = C7546e.m23569a(new C24917u(this));
        this.f65689t = C7546e.m23569a(new C24905i(this));
        this.f65690u = C7546e.m23569a(new C24906j(this));
        this.f65691v = C7546e.m23569a(new C24919w(this));
        this.f65692w = C7546e.m23569a(new C24911o(this));
        this.f65693x = C7546e.m23569a(new C24913q(this));
        this.f65694y = C7546e.m23569a(new C24896ac(this));
        this.f65695z = C7546e.m23569a(new C24920x(this));
        this.f65643A = C7546e.m23569a(new C24910n(this));
        this.f65644B = C7546e.m23569a(new C24912p(this));
        this.f65645C = C7546e.m23569a(new C24895ab(this));
        this.f65646D = C7546e.m23569a(new C24921y(this));
        this.f65654L = ViewState.CLOSE;
    }
}
