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
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordToolbarAdapterWrapperExpC;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h */
public final class C44802h extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115252i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44802h.class), "keva", "getKeva()Lcom/bytedance/keva/Keva;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44802h.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44802h.class), "expandCollapseAnimator", "getExpandCollapseAnimator()Lcom/ss/android/ugc/aweme/shortvideo/widget/animation/TranslateFadeInOutAnimator;"))};

    /* renamed from: p */
    public static final C44803a f115253p = new C44803a(null);

    /* renamed from: j */
    public final int f115254j = C23486n.m77122a(32.0d);

    /* renamed from: k */
    public RecordToolbarAdapterWrapperExpC f115255k;

    /* renamed from: l */
    public boolean f115256l;

    /* renamed from: m */
    public View f115257m;

    /* renamed from: n */
    public View f115258n;

    /* renamed from: o */
    public RecyclerView f115259o;

    /* renamed from: q */
    private int f115260q;

    /* renamed from: r */
    private C44781c f115261r;

    /* renamed from: s */
    private final C7541d f115262s = C7546e.m23569a(C44812f.f115284a);

    /* renamed from: t */
    private final C7541d f115263t;

    /* renamed from: u */
    private boolean f115264u;

    /* renamed from: v */
    private final C7541d f115265v;

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$a */
    public static final class C44803a {
        private C44803a() {
        }

        public /* synthetic */ C44803a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$b */
    static final class C44804b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44802h f115266a;

        C44804b(C44802h hVar) {
            this.f115266a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m141429a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141429a() {
            this.f115266a.mo107253b((C7561a<C7581n>) new C7561a<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C44804b f115267a;

                {
                    this.f115267a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    m141430a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m141430a() {
                    this.f115267a.f115266a.mo107251a((View) C44802h.m141401b(this.f115267a.f115266a), (C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C448051 f115268a;

                        {
                            this.f115268a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m141431a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m141431a() {
                            this.f115268a.f115267a.f115266a.mo107252a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C448061 f115269a;

                                {
                                    this.f115269a = r1;
                                }

                                public final /* synthetic */ Object invoke() {
                                    m141432a();
                                    return C7581n.f20898a;
                                }

                                /* renamed from: a */
                                private void m141432a() {
                                    this.f115269a.f115268a.f115267a.f115266a.mo107251a((View) C44802h.m141401b(this.f115269a.f115268a.f115267a.f115266a), (C7561a<C7581n>) new C7561a<C7581n>(this) {

                                        /* renamed from: a */
                                        final /* synthetic */ C448071 f115270a;

                                        {
                                            this.f115270a = r1;
                                        }

                                        public final /* synthetic */ Object invoke() {
                                            m141433a();
                                            return C7581n.f20898a;
                                        }

                                        /* renamed from: a */
                                        private void m141433a() {
                                            C44458ai.m140630a(this.f115270a.f115269a.f115268a.f115267a.f115266a.f33526d_, C44802h.m141403c(this.f115270a.f115269a.f115268a.f115267a.f115266a));
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$c */
    public static final class C44809c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44802h f115271a;

        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f115272b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f115273c;

        /* renamed from: d */
        final /* synthetic */ ObjectAnimator f115274d;

        /* renamed from: e */
        final /* synthetic */ ObjectAnimator f115275e;

        /* renamed from: f */
        final /* synthetic */ C7561a f115276f;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f115271a.mo30921H();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f115271a.mo30922I()) {
                this.f115271a.mo30921H();
                C7561a aVar = this.f115276f;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f115271a.f115256l = true;
            C44802h.m141403c(this.f115271a).setVisibility(0);
            C44802h.m141404d(this.f115271a).mo101580b();
        }

        C44809c(C44802h hVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4, C7561a aVar) {
            this.f115271a = hVar;
            this.f115272b = objectAnimator;
            this.f115273c = objectAnimator2;
            this.f115274d = objectAnimator3;
            this.f115275e = objectAnimator4;
            this.f115276f = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$d */
    public static final class C44810d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44802h f115277a;

        /* renamed from: b */
        final /* synthetic */ ObjectAnimator f115278b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f115279c;

        /* renamed from: d */
        final /* synthetic */ ObjectAnimator f115280d;

        /* renamed from: e */
        final /* synthetic */ ObjectAnimator f115281e;

        /* renamed from: f */
        final /* synthetic */ C7561a f115282f;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f115277a.mo30920G();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f115277a.mo30922I()) {
                this.f115277a.mo30920G();
                C7561a aVar = this.f115282f;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f115277a.f115256l = true;
            C44802h.m141399a(this.f115277a).setVisibility(0);
            C44802h.m141404d(this.f115277a).mo101579a();
        }

        C44810d(C44802h hVar, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4, C7561a aVar) {
            this.f115277a = hVar;
            this.f115278b = objectAnimator;
            this.f115279c = objectAnimator2;
            this.f115280d = objectAnimator3;
            this.f115281e = objectAnimator4;
            this.f115282f = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$e */
    static final class C44811e extends Lambda implements C7561a<TranslateFadeInOutAnimator> {

        /* renamed from: a */
        public static final C44811e f115283a = new C44811e();

        C44811e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m141434a();
        }

        /* renamed from: a */
        private static TranslateFadeInOutAnimator m141434a() {
            TranslateFadeInOutAnimator translateFadeInOutAnimator = new TranslateFadeInOutAnimator();
            translateFadeInOutAnimator.f108453n = new DecelerateInterpolator();
            translateFadeInOutAnimator.f4940i = 250;
            translateFadeInOutAnimator.f4941j = 250;
            return translateFadeInOutAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$f */
    static final class C44812f extends Lambda implements C7561a<Keva> {

        /* renamed from: a */
        public static final C44812f f115284a = new C44812f();

        C44812f() {
            super(0);
        }

        /* renamed from: a */
        private static Keva m141435a() {
            return Keva.getRepo("recorder");
        }

        public final /* synthetic */ Object invoke() {
            return m141435a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$g */
    static final class C44813g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44802h f115285a;

        C44813g(C44802h hVar) {
            this.f115285a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m141436a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141436a() {
            if (!this.f115285a.f115256l) {
                C44802h.m141399a(this.f115285a).setTranslationY((float) C44802h.m141401b(this.f115285a).getHeight());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$h */
    static final class C44814h extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44802h f115286a;

        C44814h(C44802h hVar) {
            this.f115286a = hVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141437a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141437a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            View view = this.f115286a.f33523b;
            C7573i.m23582a((Object) view, "view");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                int i = this.f115286a.f115254j;
                Activity activity = this.f115286a.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                marginLayoutParams.topMargin = i + C39805en.m127450c(activity);
                View view2 = this.f115286a.f33523b;
                C7573i.m23582a((Object) view2, "view");
                view2.setLayoutParams(marginLayoutParams);
                StringBuilder sb = new StringBuilder("receive topMarginUpdate in RecordToolbarSceneExpC,now margin is:");
                sb.append(marginLayoutParams.topMargin);
                sb.append(",top is:");
                View view3 = this.f115286a.f33523b;
                C7573i.m23582a((Object) view3, "view");
                sb.append(view3.getTop());
                C41530am.m132280a(sb.toString());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$i */
    static final class C44815i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44802h f115287a;

        C44815i(C44802h hVar) {
            this.f115287a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f115287a.mo30922I()) {
                this.f115287a.mo107253b(null);
                Activity v = this.f115287a.mo31015v();
                if (v != null) {
                    C0063u a = C0069x.m159a((FragmentActivity) v).mo147a(ShortVideoContextViewModel.class);
                    C7573i.m23582a((Object) a, "ViewModelProviders.of(re…extViewModel::class.java)");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
                    if (shortVideoContext != null) {
                        C6907h.m21524a("click_more_icon", (Map) C22984d.m75611a().mo59973a("creation_id", shortVideoContext.f99787w).mo59973a("enter_from", "video_shoot_page").mo59973a("shoot_way", shortVideoContext.f99788x).mo59973a("content_type", shortVideoContext.mo96148i().getContentType()).f60753a);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$j */
    static final class C44816j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44802h f115288a;

        C44816j(C44802h hVar) {
            this.f115288a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f115288a.mo107252a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.h$k */
    static final class C44817k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44802h f115289a;

        /* renamed from: b */
        final /* synthetic */ C7561a f115290b;

        C44817k(C44802h hVar, C7561a aVar) {
            this.f115289a = hVar;
            this.f115290b = aVar;
        }

        public final void run() {
            if (!this.f115289a.mo30922I()) {
                this.f115290b.invoke();
            }
        }
    }

    /* renamed from: J */
    private final Keva m141392J() {
        return (Keva) this.f115262s.getValue();
    }

    /* renamed from: K */
    private final RecordViewModel m141393K() {
        return (RecordViewModel) this.f115263t.getValue();
    }

    /* renamed from: L */
    private final TranslateFadeInOutAnimator m141394L() {
        return (TranslateFadeInOutAnimator) this.f115265v.getValue();
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
        this.f115259o = (RecyclerView) h_;
        View findViewById = view.findViewById(R.id.baa);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.iv_more)");
        this.f115257m = findViewById;
        View findViewById2 = view.findViewById(R.id.b7k);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.iv_collapse)");
        this.f115258n = findViewById2;
        View view2 = this.f115257m;
        if (view2 == null) {
            C7573i.m23583a("ivMore");
        }
        view2.setOnClickListener(new C44815i(this));
        View view3 = this.f115258n;
        if (view3 == null) {
            C7573i.m23583a("ivCollapse");
        }
        view3.setOnClickListener(new C44816j(this));
    }

    /* renamed from: a */
    public final void mo107252a(C7561a<C7581n> aVar) {
        if (!this.f115256l && this.f115264u && !mo30922I()) {
            m141396N();
            RecyclerView recyclerView = this.f115259o;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.setItemAnimator(m141394L());
            View view = this.f115257m;
            if (view == null) {
                C7573i.m23583a("ivMore");
            }
            String str = "rotation";
            float[] fArr = new float[2];
            View view2 = this.f115257m;
            if (view2 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr[0] = view2.getRotation();
            fArr[1] = 0.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
            View view3 = this.f115257m;
            if (view3 == null) {
                C7573i.m23583a("ivMore");
            }
            String str2 = "alpha";
            float[] fArr2 = new float[2];
            View view4 = this.f115257m;
            if (view4 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr2[0] = view4.getAlpha();
            fArr2[1] = 1.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, str2, fArr2);
            View view5 = this.f115258n;
            if (view5 == null) {
                C7573i.m23583a("ivCollapse");
            }
            String str3 = "alpha";
            float[] fArr3 = new float[2];
            View view6 = this.f115258n;
            if (view6 == null) {
                C7573i.m23583a("ivCollapse");
            }
            fArr3[0] = view6.getAlpha();
            fArr3[1] = 0.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view5, str3, fArr3);
            View view7 = this.f115258n;
            if (view7 == null) {
                C7573i.m23583a("ivCollapse");
            }
            String str4 = "translationY";
            float[] fArr4 = new float[2];
            View view8 = this.f115258n;
            if (view8 == null) {
                C7573i.m23583a("ivCollapse");
            }
            fArr4[0] = view8.getTranslationY();
            fArr4[1] = 0.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view7, str4, fArr4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat, ofFloat3, ofFloat4});
            C44809c cVar = new C44809c(this, ofFloat2, ofFloat, ofFloat3, ofFloat4, aVar);
            animatorSet.addListener(cVar);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final void mo107251a(View view, C7561a<C7581n> aVar, long j) {
        view.postDelayed(new C44817k(this, aVar), j);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
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

    /* renamed from: O */
    private final void m141397O() {
        RecyclerView recyclerView = this.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.height = -2;
        RecyclerView recyclerView2 = this.f115259o;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setLayoutParams(layoutParams);
    }

    /* renamed from: I */
    public final boolean mo30922I() {
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

    public C44802h() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115263t = C7546e.m23569a(new RecordToolbarSceneExpC$$special$$inlined$activityViewModel$1(this, a, a));
        this.f115265v = C7546e.m23569a(C44811e.f115283a);
    }

    /* renamed from: M */
    private final void m141395M() {
        if (m141392J().getBoolean("is_first_exp_c_tip_show", true)) {
            m141392J().storeBoolean("is_first_exp_c_tip_show", false);
            RecyclerView recyclerView = this.f115259o;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            mo107251a((View) recyclerView, (C7561a<C7581n>) new C44804b<C7581n>(this), 500);
        }
    }

    /* renamed from: N */
    private final void m141396N() {
        RecyclerView recyclerView = this.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        RecyclerView recyclerView2 = this.f115259o;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        LayoutParams layoutParams = recyclerView2.getLayoutParams();
        layoutParams.height = measuredHeight;
        RecyclerView recyclerView3 = this.f115259o;
        if (recyclerView3 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView3.setLayoutParams(layoutParams);
    }

    /* renamed from: G */
    public final void mo30920G() {
        this.f115264u = true;
        this.f115256l = false;
        View view = this.f115257m;
        if (view == null) {
            C7573i.m23583a("ivMore");
        }
        view.setVisibility(8);
        RecyclerView recyclerView = this.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: H */
    public final void mo30921H() {
        this.f115256l = false;
        this.f115264u = false;
        View view = this.f115258n;
        if (view == null) {
            C7573i.m23583a("ivCollapse");
        }
        view.setAlpha(0.0f);
        View view2 = this.f115258n;
        if (view2 == null) {
            C7573i.m23583a("ivCollapse");
        }
        view2.setTranslationY(0.0f);
        View view3 = this.f115258n;
        if (view3 == null) {
            C7573i.m23583a("ivCollapse");
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        m141397O();
    }

    /* renamed from: a */
    public static final /* synthetic */ View m141399a(C44802h hVar) {
        View view = hVar.f115258n;
        if (view == null) {
            C7573i.m23583a("ivCollapse");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m141401b(C44802h hVar) {
        RecyclerView recyclerView = hVar.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m141403c(C44802h hVar) {
        View view = hVar.f115257m;
        if (view == null) {
            C7573i.m23583a("ivMore");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ RecordToolbarAdapterWrapperExpC m141404d(C44802h hVar) {
        RecordToolbarAdapterWrapperExpC recordToolbarAdapterWrapperExpC = hVar.f115255k;
        if (recordToolbarAdapterWrapperExpC == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        return recordToolbarAdapterWrapperExpC;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "toolbar_manager");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115261r = (C44781c) b;
        C44781c cVar = this.f115261r;
        if (cVar == null) {
            C7573i.m23583a("toolbarManager");
        }
        this.f115255k = new RecordToolbarAdapterWrapperExpC(cVar);
        C44781c cVar2 = this.f115261r;
        if (cVar2 == null) {
            C7573i.m23583a("toolbarManager");
        }
        RecordToolbarAdapterWrapperExpC recordToolbarAdapterWrapperExpC = this.f115255k;
        if (recordToolbarAdapterWrapperExpC == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        cVar2.mo107234a((RecordToolbarAdapter) recordToolbarAdapterWrapperExpC);
        Context u = mo31014u();
        C7573i.m23582a((Object) u, "requireSceneContext()");
        C44781c cVar3 = this.f115261r;
        if (cVar3 == null) {
            C7573i.m23583a("toolbarManager");
        }
        this.f115260q = C41123a.m131304a(u, cVar3.mo107238c(), 6, C39960gg.m127843a(mo31015v()));
        RecyclerView recyclerView = this.f115259o;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        HeightLimitLinearLayoutManager heightLimitLinearLayoutManager = new HeightLimitLinearLayoutManager(mo31015v(), 1, false);
        heightLimitLinearLayoutManager.f108558a = this.f115260q;
        heightLimitLinearLayoutManager.f108559b = new C44813g(this);
        recyclerView.setLayoutManager(heightLimitLinearLayoutManager);
        RecordToolbarAdapterWrapperExpC recordToolbarAdapterWrapperExpC2 = this.f115255k;
        if (recordToolbarAdapterWrapperExpC2 == null) {
            C7573i.m23583a("toolbarAdapterWrapper");
        }
        recyclerView.setAdapter(recordToolbarAdapterWrapperExpC2);
        DontDrawLastItemDividerItemDecoration dontDrawLastItemDividerItemDecoration = new DontDrawLastItemDividerItemDecoration(mo31015v(), 1);
        Drawable a = C0683b.m2903a((Context) mo31015v(), (int) R.drawable.ga);
        if (a == null) {
            C7573i.m23580a();
        }
        dontDrawLastItemDividerItemDecoration.mo5355a(a);
        recyclerView.mo5525a((C1272h) dontDrawLastItemDividerItemDecoration);
        mo91870d(m141393K(), C44818i.f115291a, new C11672v(), new C44814h(this));
        m141395M();
    }

    /* renamed from: b */
    public final void mo107253b(C7561a<C7581n> aVar) {
        if (!this.f115256l && !this.f115264u && !mo30922I()) {
            RecyclerView recyclerView = this.f115259o;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.setItemAnimator(m141394L());
            Activity v = mo31015v();
            C7573i.m23582a((Object) v, "requireActivity()");
            Context context = v;
            boolean a = C39960gg.m127843a(mo31015v());
            C44781c cVar = this.f115261r;
            if (cVar == null) {
                C7573i.m23583a("toolbarManager");
            }
            int a2 = C41123a.m131306a(context, a, cVar.mo107238c());
            View view = this.f115257m;
            if (view == null) {
                C7573i.m23583a("ivMore");
            }
            String str = "rotation";
            float[] fArr = new float[2];
            View view2 = this.f115257m;
            if (view2 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr[0] = view2.getRotation();
            fArr[1] = 90.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
            View view3 = this.f115257m;
            if (view3 == null) {
                C7573i.m23583a("ivMore");
            }
            String str2 = "alpha";
            float[] fArr2 = new float[2];
            View view4 = this.f115257m;
            if (view4 == null) {
                C7573i.m23583a("ivMore");
            }
            fArr2[0] = view4.getAlpha();
            fArr2[1] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, str2, fArr2);
            View view5 = this.f115258n;
            if (view5 == null) {
                C7573i.m23583a("ivCollapse");
            }
            String str3 = "alpha";
            float[] fArr3 = new float[2];
            View view6 = this.f115258n;
            if (view6 == null) {
                C7573i.m23583a("ivCollapse");
            }
            fArr3[0] = view6.getAlpha();
            fArr3[1] = 1.0f;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view5, str3, fArr3);
            View view7 = this.f115258n;
            if (view7 == null) {
                C7573i.m23583a("ivCollapse");
            }
            String str4 = "translationY";
            float[] fArr4 = new float[2];
            View view8 = this.f115258n;
            if (view8 == null) {
                C7573i.m23583a("ivCollapse");
            }
            fArr4[0] = view8.getTranslationY();
            fArr4[1] = (float) a2;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view7, str4, fArr4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.playTogether(new Animator[]{ofFloat2, ofFloat, ofFloat3, ofFloat4});
            C44810d dVar = new C44810d(this, ofFloat2, ofFloat, ofFloat3, ofFloat4, aVar);
            animatorSet.addListener(dVar);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b2e, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_exp_c, container, false)");
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
