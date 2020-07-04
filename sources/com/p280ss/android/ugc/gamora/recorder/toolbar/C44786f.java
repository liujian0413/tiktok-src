package com.p280ss.android.ugc.gamora.recorder.toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.DefaultItemAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39960gg;
import com.p280ss.android.ugc.aweme.shortvideo.DontDrawLastItemDividerItemDecoration;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.C41123a;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordToolbarAdapterWrapperExpA;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.widget.animation.TranslateFadeInOutAnimator;
import com.p280ss.android.ugc.aweme.shortvideo.widget.layoutmanager.HeightLimitLinearLayoutManager;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.C44458ai;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f */
public class C44786f extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115215i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44786f.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44786f.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44786f.class), "expandCollapseAnimator", "getExpandCollapseAnimator()Lcom/ss/android/ugc/aweme/shortvideo/widget/animation/TranslateFadeInOutAnimator;"))};

    /* renamed from: o */
    public static final C44787a f115216o = new C44787a(null);

    /* renamed from: j */
    public RecyclerView f115217j;

    /* renamed from: k */
    public ImageView f115218k;

    /* renamed from: l */
    public View f115219l;

    /* renamed from: m */
    public boolean f115220m;

    /* renamed from: n */
    public RecordToolbarAdapterWrapperExpA f115221n;

    /* renamed from: p */
    private TextView f115222p;

    /* renamed from: q */
    private float f115223q;

    /* renamed from: r */
    private boolean f115224r;

    /* renamed from: s */
    private final int f115225s = C23486n.m77122a(32.0d);

    /* renamed from: t */
    private int f115226t;

    /* renamed from: u */
    private C44781c f115227u;

    /* renamed from: v */
    private final C7541d f115228v = C7546e.m23569a(C44796f.f115245a);

    /* renamed from: w */
    private final C7541d f115229w;

    /* renamed from: x */
    private final C7541d f115230x;

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$a */
    public static final class C44787a {
        private C44787a() {
        }

        public /* synthetic */ C44787a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$b */
    static final class C44788b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44786f f115231a;

        C44788b(C44786f fVar) {
            this.f115231a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m141383a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141383a() {
            this.f115231a.mo107242b((C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C44788b f115232a;

                {
                    this.f115232a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m141384a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m141384a() {
                    this.f115232a.f115231a.mo107240a((View) C44786f.m141353b(this.f115232a.f115231a), (C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C447891 f115233a;

                        {
                            this.f115233a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m141385a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m141385a() {
                            this.f115233a.f115232a.f115231a.mo107241a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C447901 f115234a;

                                {
                                    this.f115234a = r1;
                                }

                                public final /* synthetic */ Object invoke() {
                                    m141386a();
                                    return C7581n.f20898a;
                                }

                                /* renamed from: a */
                                private void m141386a() {
                                    this.f115234a.f115233a.f115232a.f115231a.mo107240a((View) C44786f.m141353b(this.f115234a.f115233a.f115232a.f115231a), (C7561a<C7581n>) new C7561a<C7581n>(this) {

                                        /* renamed from: a */
                                        final /* synthetic */ C447911 f115235a;

                                        {
                                            this.f115235a = r1;
                                        }

                                        public final /* synthetic */ Object invoke() {
                                            m141387a();
                                            return C7581n.f20898a;
                                        }

                                        /* renamed from: a */
                                        private void m141387a() {
                                            C44458ai.m140630a(this.f115235a.f115234a.f115233a.f115232a.f115231a.f33526d_, C44786f.m141356d(this.f115235a.f115234a.f115233a.f115232a.f115231a));
                                        }
                                    }, 500);
                                }
                            });
                        }
                    }, 3000);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$c */
    public static final class C44793c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44786f f115236a;

        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f115237b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f115238c;

        /* renamed from: d */
        final /* synthetic */ C7561a f115239d;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f115236a.mo107239J();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f115236a.mo96987K()) {
                this.f115236a.mo107239J();
                C7561a aVar = this.f115239d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f115236a.f115220m = true;
            C44786f.m141355c(this.f115236a).mo101578b();
        }

        C44793c(C44786f fVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, C7561a aVar) {
            this.f115236a = fVar;
            this.f115237b = objectAnimator;
            this.f115238c = objectAnimator2;
            this.f115239d = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$d */
    public static final class C44794d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44786f f115240a;

        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f115241b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f115242c;

        /* renamed from: d */
        final /* synthetic */ C7561a f115243d;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f115240a.mo30922I();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f115240a.mo96987K()) {
                this.f115240a.mo30922I();
                C7561a aVar = this.f115243d;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f115240a.f115220m = true;
            C44786f.m141355c(this.f115240a).mo101577a();
        }

        C44794d(C44786f fVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, C7561a aVar) {
            this.f115240a = fVar;
            this.f115241b = objectAnimator;
            this.f115242c = objectAnimator2;
            this.f115243d = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$e */
    static final class C44795e extends Lambda implements C7561a<TranslateFadeInOutAnimator> {

        /* renamed from: a */
        public static final C44795e f115244a = new C44795e();

        C44795e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m141388a();
        }

        /* renamed from: a */
        private static TranslateFadeInOutAnimator m141388a() {
            TranslateFadeInOutAnimator translateFadeInOutAnimator = new TranslateFadeInOutAnimator();
            translateFadeInOutAnimator.f108453n = new DecelerateInterpolator();
            translateFadeInOutAnimator.f4940i = 250;
            translateFadeInOutAnimator.f4941j = 250;
            return translateFadeInOutAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$f */
    static final class C44796f extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C44796f f115245a = new C44796f();

        C44796f() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m141389a() {
            return Keva.getRepo("recorder");
        }

        public final /* synthetic */ Object invoke() {
            return m141389a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$g */
    static final class C44797g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44786f f115246a;

        C44797g(C44786f fVar) {
            this.f115246a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m141390a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141390a() {
            if (!this.f115246a.f115220m) {
                C44786f.m141351a(this.f115246a).setTranslationY((float) C44786f.m141353b(this.f115246a).getHeight());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$h */
    static final class C44798h extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44786f f115247a;

        C44798h(C44786f fVar) {
            this.f115247a = fVar;
            super(2);
        }

        /* renamed from: a */
        private void m141391a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f115247a.mo30920G();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141391a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$i */
    static final class C44799i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44786f f115248a;

        C44799i(C44786f fVar) {
            this.f115248a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f115248a.mo30921H();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.f$j */
    static final class C44800j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44786f f115249a;

        /* renamed from: b */
        final /* synthetic */ C7561a f115250b;

        C44800j(C44786f fVar, C7561a aVar) {
            this.f115249a = fVar;
            this.f115250b = aVar;
        }

        public final void run() {
            if (!this.f115249a.mo96987K()) {
                this.f115250b.invoke();
            }
        }
    }

    /* renamed from: L */
    private final Keva m141344L() {
        return (Keva) this.f115228v.getValue();
    }

    /* renamed from: M */
    private final RecordViewModel m141345M() {
        return (RecordViewModel) this.f115229w.getValue();
    }

    /* renamed from: N */
    private final TranslateFadeInOutAnimator m141346N() {
        return (TranslateFadeInOutAnimator) this.f115230x.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.cqn);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.recycler_toolbar)");
        this.f115217j = (RecyclerView) h_;
        View findViewById = view.findViewById(R.id.brz);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.ll_more_container)");
        this.f115219l = findViewById;
        View view2 = this.f115219l;
        if (view2 == null) {
            C7573i.m23583a("moreContainer");
        }
        View findViewById2 = view2.findViewById(R.id.b_a);
        C7573i.m23582a((Object) findViewById2, "moreContainer.findViewById(R.id.iv_icon)");
        this.f115218k = (ImageView) findViewById2;
        View view3 = this.f115219l;
        if (view3 == null) {
            C7573i.m23583a("moreContainer");
        }
        View findViewById3 = view3.findViewById(R.id.dw4);
        C7573i.m23582a((Object) findViewById3, "moreContainer.findViewById(R.id.tv_icon_desc)");
        this.f115222p = (TextView) findViewById3;
        ImageView imageView = this.f115218k;
        if (imageView == null) {
            C7573i.m23583a("ivMore");
        }
        imageView.setImageResource(R.drawable.aci);
        TextView textView = this.f115222p;
        if (textView == null) {
            C7573i.m23583a("tvMore");
        }
        textView.setText(R.string.ca1);
        View view4 = this.f115219l;
        if (view4 == null) {
            C7573i.m23583a("moreContainer");
        }
        view4.setOnClickListener(new C44799i(this));
    }

    /* renamed from: a */
    public final void mo107241a(C7561a<C7581n> aVar) {
        if (!this.f115220m && this.f115224r && !mo96987K()) {
            m141348P();
            RecyclerView recyclerView = this.f115217j;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.setItemAnimator(m141346N());
            ImageView imageView = this.f115218k;
            if (imageView == null) {
                C7573i.m23583a("ivMore");
            }
            String str = "rotation";
            float[] fArr = new float[2];
            ImageView imageView2 = this.f115218k;
            if (imageView2 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr[0] = imageView2.getRotation();
            fArr[1] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, fArr);
            View view = this.f115219l;
            if (view == null) {
                C7573i.m23583a("moreContainer");
            }
            String str2 = "translationY";
            float[] fArr2 = new float[2];
            View view2 = this.f115219l;
            if (view2 == null) {
                C7573i.m23583a("moreContainer");
            }
            fArr2[0] = view2.getTranslationY();
            fArr2[1] = this.f115223q;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new C44793c(this, ofFloat, ofFloat2, aVar));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo107240a(View view, C7561a<C7581n> aVar, long j) {
        view.postDelayed(new C44800j(this, aVar), j);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C41123a.m131307a();
    }

    /* renamed from: Q */
    private final void m141349Q() {
        RecyclerView recyclerView = this.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = -2;
        RecyclerView recyclerView2 = this.f115217j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setLayoutParams(layoutParams);
    }

    /* renamed from: K */
    public final boolean mo96987K() {
        if (this.f33526d_ != null) {
            Activity activity = this.f33526d_;
            if (activity == null || !activity.isFinishing()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    public C44786f() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115229w = C7546e.m23569a(new RecordToolbarSceneExpA$$special$$inlined$activityViewModel$1(this, a, a));
        this.f115230x = C7546e.m23569a(C44795e.f115244a);
    }

    /* renamed from: O */
    private final void m141347O() {
        if (m141344L().getBoolean("is_first_exp_a_tip_show", true)) {
            m141344L().storeBoolean("is_first_exp_a_tip_show", false);
            RecyclerView recyclerView = this.f115217j;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            mo107240a((View) recyclerView, (C7561a<C7581n>) new C44788b<C7581n>(this), 500);
        }
    }

    /* renamed from: P */
    private final void m141348P() {
        RecyclerView recyclerView = this.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        RecyclerView recyclerView2 = this.f115217j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        LayoutParams layoutParams = recyclerView2.getLayoutParams();
        layoutParams.height = measuredHeight;
        RecyclerView recyclerView3 = this.f115217j;
        if (recyclerView3 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView3.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo30920G() {
        View view = this.f33523b;
        C7573i.m23582a((Object) view, "view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            int i = this.f115225s;
            Activity activity = this.f33526d_;
            if (activity == null) {
                C7573i.m23580a();
            }
            marginLayoutParams.topMargin = i + C39805en.m127450c(activity);
            View view2 = this.f33523b;
            C7573i.m23582a((Object) view2, "view");
            view2.setLayoutParams(marginLayoutParams);
            StringBuilder sb = new StringBuilder("receive topMarginUpdate in RecordToolbarSceneExpA,now margin is:");
            sb.append(marginLayoutParams.topMargin);
            sb.append(",top is:");
            View view3 = this.f33523b;
            C7573i.m23582a((Object) view3, "view");
            sb.append(view3.getTop());
            C41530am.m132280a(sb.toString());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: H */
    public final void mo30921H() {
        if (!this.f115224r) {
            mo107242b(null);
            Activity v = mo31015v();
            if (v != null) {
                C0063u a = C0069x.m159a((FragmentActivity) v).mo147a(ShortVideoContextViewModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(re…extViewModel::class.java)");
                ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
                if (shortVideoContext != null) {
                    C6907h.m21524a("click_more_icon", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("enter_from", "video_shoot_page").mo59973a("shoot_way", shortVideoContext.f99788x).mo59973a("content_type", shortVideoContext.mo96148i().getContentType()).f60753a);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        } else {
            mo107241a(null);
        }
    }

    /* renamed from: I */
    public final void mo30922I() {
        this.f115220m = false;
        this.f115224r = true;
        ImageView imageView = this.f115218k;
        if (imageView == null) {
            C7573i.m23583a("ivMore");
        }
        imageView.setRotation(180.0f);
        TextView textView = this.f115222p;
        if (textView == null) {
            C7573i.m23583a("tvMore");
        }
        textView.setText(R.string.b7q);
        View view = this.f115219l;
        if (view == null) {
            C7573i.m23583a("moreContainer");
        }
        RecyclerView recyclerView = this.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        view.setTranslationY((float) recyclerView.getHeight());
        RecyclerView recyclerView2 = this.f115217j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
    }

    /* renamed from: J */
    public final void mo107239J() {
        this.f115220m = false;
        this.f115224r = false;
        View view = this.f115219l;
        if (view == null) {
            C7573i.m23583a("moreContainer");
        }
        RecyclerView recyclerView = this.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        view.setTranslationY((float) recyclerView.getHeight());
        RecyclerView recyclerView2 = this.f115217j;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        TextView textView = this.f115222p;
        if (textView == null) {
            C7573i.m23583a("tvMore");
        }
        textView.setText(R.string.ca1);
        m141349Q();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m141351a(C44786f fVar) {
        View view = fVar.f115219l;
        if (view == null) {
            C7573i.m23583a("moreContainer");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m141353b(C44786f fVar) {
        RecyclerView recyclerView = fVar.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ RecordToolbarAdapterWrapperExpA m141355c(C44786f fVar) {
        RecordToolbarAdapterWrapperExpA recordToolbarAdapterWrapperExpA = fVar.f115221n;
        if (recordToolbarAdapterWrapperExpA == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        return recordToolbarAdapterWrapperExpA;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m141356d(C44786f fVar) {
        ImageView imageView = fVar.f115218k;
        if (imageView == null) {
            C7573i.m23583a("ivMore");
        }
        return imageView;
    }

    /* renamed from: b */
    public final void mo107242b(C7561a<C7581n> aVar) {
        if (!this.f115220m && !this.f115224r && !mo96987K()) {
            RecyclerView recyclerView = this.f115217j;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.setItemAnimator(m141346N());
            View view = this.f115219l;
            if (view == null) {
                C7573i.m23583a("moreContainer");
            }
            this.f115223q = view.getTranslationY();
            Activity v = mo31015v();
            C7573i.m23582a((Object) v, "requireActivity()");
            Context context = v;
            boolean a = C39960gg.m127843a(mo31015v());
            C44781c cVar = this.f115227u;
            if (cVar == null) {
                C7573i.m23583a("toolbarManager");
            }
            int a2 = C41123a.m131306a(context, a, cVar.mo107238c());
            ImageView imageView = this.f115218k;
            if (imageView == null) {
                C7573i.m23583a("ivMore");
            }
            String str = "rotation";
            float[] fArr = new float[2];
            ImageView imageView2 = this.f115218k;
            if (imageView2 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr[0] = imageView2.getRotation();
            fArr[1] = 180.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, fArr);
            View view2 = this.f115219l;
            if (view2 == null) {
                C7573i.m23583a("moreContainer");
            }
            String str2 = "translationY";
            float[] fArr2 = new float[2];
            View view3 = this.f115219l;
            if (view3 == null) {
                C7573i.m23583a("moreContainer");
            }
            fArr2[0] = view3.getTranslationY();
            fArr2[1] = (float) a2;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, str2, fArr2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.addListener(new C44794d(this, ofFloat, ofFloat2, aVar));
            animatorSet.start();
        }
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "toolbar_manager");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115227u = (C44781c) b;
        C44781c cVar = this.f115227u;
        if (cVar == null) {
            C7573i.m23583a("toolbarManager");
        }
        this.f115221n = new RecordToolbarAdapterWrapperExpA(cVar);
        C44781c cVar2 = this.f115227u;
        if (cVar2 == null) {
            C7573i.m23583a("toolbarManager");
        }
        RecordToolbarAdapterWrapperExpA recordToolbarAdapterWrapperExpA = this.f115221n;
        if (recordToolbarAdapterWrapperExpA == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        cVar2.mo107234a((RecordToolbarAdapter) recordToolbarAdapterWrapperExpA);
        Context u = mo31014u();
        C7573i.m23582a((Object) u, "requireSceneContext()");
        C44781c cVar3 = this.f115227u;
        if (cVar3 == null) {
            C7573i.m23583a("toolbarManager");
        }
        this.f115226t = C41123a.m131304a(u, cVar3.mo107238c(), 6, C39960gg.m127843a(mo31015v()));
        RecyclerView recyclerView = this.f115217j;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        HeightLimitLinearLayoutManager heightLimitLinearLayoutManager = new HeightLimitLinearLayoutManager(mo31015v(), 1, false);
        heightLimitLinearLayoutManager.f108558a = this.f115226t;
        heightLimitLinearLayoutManager.f108559b = new C44797g(this);
        recyclerView.setLayoutManager(heightLimitLinearLayoutManager);
        RecordToolbarAdapterWrapperExpA recordToolbarAdapterWrapperExpA2 = this.f115221n;
        if (recordToolbarAdapterWrapperExpA2 == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        recyclerView.setAdapter(recordToolbarAdapterWrapperExpA2);
        DontDrawLastItemDividerItemDecoration dontDrawLastItemDividerItemDecoration = new DontDrawLastItemDividerItemDecoration(mo31015v(), 1);
        Drawable a = C0683b.m2903a((Context) mo31015v(), (int) R.drawable.ga);
        if (a == null) {
            C7573i.m23580a();
        }
        dontDrawLastItemDividerItemDecoration.mo5355a(a);
        recyclerView.mo5525a((C1272h) dontDrawLastItemDividerItemDecoration);
        mo91870d(m141345M(), C44801g.f115251a, new C11672v(), new C44798h(this));
        m141347O();
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b2d, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(getLayo…esId(), container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
