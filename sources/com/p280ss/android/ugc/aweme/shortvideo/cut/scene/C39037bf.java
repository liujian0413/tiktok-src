package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
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
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf */
public final class C39037bf extends C12629j implements C44396a {

    /* renamed from: l */
    public static final C39038a f101332l = new C39038a(null);

    /* renamed from: i */
    public ImageView f101333i;

    /* renamed from: j */
    public TextView f101334j;

    /* renamed from: k */
    public CutVideoViewModel f101335k;

    /* renamed from: m */
    private CutVideoTitleBarViewModel f101336m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$a */
    public static final class C39038a {
        private C39038a() {
        }

        public /* synthetic */ C39038a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$b */
    static final class C39039b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101337a;

        C39039b(C39037bf bfVar) {
            this.f101337a = bfVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39037bf.m124706c(this.f101337a).mo29069f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$c */
    static final class C39040c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101338a;

        C39040c(C39037bf bfVar) {
            this.f101338a = bfVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39037bf.m124706c(this.f101338a).mo97155g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$d */
    static final class C39041d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101339a;

        C39041d(C39037bf bfVar) {
            this.f101339a = bfVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124724a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124724a(C44396a aVar, final boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            float f = 1.0f;
            float f2 = 0.0f;
            if (z) {
                f = 0.0f;
                f2 = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f101339a.f33523b, "alpha", new float[]{f, f2});
            C7573i.m23582a((Object) ofFloat, "objectAnimator");
            ofFloat.setDuration(200);
            ofFloat.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C39041d f101340a;

                public final void onAnimationEnd(Animator animator) {
                    C7573i.m23587b(animator, "animation");
                    super.onAnimationEnd(animator);
                    if (z) {
                        View view = this.f101340a.f101339a.f33523b;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        return;
                    }
                    View view2 = this.f101340a.f101339a.f33523b;
                    if (view2 != null) {
                        view2.setVisibility(4);
                    }
                }

                {
                    this.f101340a = r1;
                }
            });
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$e */
    static final class C39043e extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101342a;

        C39043e(C39037bf bfVar) {
            this.f101342a = bfVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124725a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124725a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            ImageView a = C39037bf.m124703a(this.f101342a);
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            a.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$f */
    static final class C39044f extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101343a;

        C39044f(C39037bf bfVar) {
            this.f101343a = bfVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124726a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124726a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            TextView b = C39037bf.m124705b(this.f101343a);
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$g */
    static final class C39045g extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101344a;

        C39045g(C39037bf bfVar) {
            this.f101344a = bfVar;
            super(2);
        }

        /* renamed from: a */
        private void m124727a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39037bf.m124703a(this.f101344a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124727a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.bf$h */
    static final class C39046h extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C39037bf f101345a;

        C39046h(C39037bf bfVar) {
            this.f101345a = bfVar;
            super(2);
        }

        /* renamed from: a */
        private void m124728a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C39037bf.m124705b(this.f101345a).setEnabled(z);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124728a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
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
        View h_ = mo31004h_(R.id.b5g);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.ivBack)");
        this.f101333i = (ImageView) h_;
        View h_2 = mo31004h_(R.id.dq1);
        C7573i.m23582a((Object) h_2, "requireViewById(R.id.tvNext)");
        this.f101334j = (TextView) h_2;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: J */
    private final void m124701J() {
        ImageView imageView = this.f101333i;
        if (imageView == null) {
            C7573i.m23583a("ivBack");
        }
        imageView.setOnClickListener(new C39039b(this));
        TextView textView = this.f101334j;
        if (textView == null) {
            C7573i.m23583a("tvNext");
        }
        textView.setOnClickListener(new C39040c(this));
    }

    /* renamed from: G */
    private final void m124698G() {
        if (C39805en.m127445a()) {
            View view = this.f33523b;
            C7573i.m23582a((Object) view, "view");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.topMargin = ((int) C9738o.m28708b((Context) this.f33526d_, 25.0f)) + C39805en.m127450c(this.f33526d_);
                View view2 = this.f33523b;
                C7573i.m23582a((Object) view2, "view");
                view2.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: H */
    private final void m124699H() {
        if (C39805en.m127445a()) {
            View view = this.f33523b;
            C7573i.m23582a((Object) view, "layoutTop");
            if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = C39805en.m127450c(this.f33526d_);
                    view.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = C39805en.m127450c(this.f33526d_);
                    view.setLayoutParams(layoutParams4);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    /* renamed from: I */
    private final void m124700I() {
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.f101336m;
        if (cutVideoTitleBarViewModel == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        mo91868b(cutVideoTitleBarViewModel, C39047bg.f101346a, new C11672v(), new C39043e(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel2 = this.f101336m;
        if (cutVideoTitleBarViewModel2 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        mo91868b(cutVideoTitleBarViewModel2, C39048bh.f101347a, new C11672v(), new C39044f(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel3 = this.f101336m;
        if (cutVideoTitleBarViewModel3 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        mo91868b(cutVideoTitleBarViewModel3, C39049bi.f101348a, new C11672v(), new C39045g(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel4 = this.f101336m;
        if (cutVideoTitleBarViewModel4 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        mo91868b(cutVideoTitleBarViewModel4, C39050bj.f101349a, new C11672v(), new C39046h(this));
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel5 = this.f101336m;
        if (cutVideoTitleBarViewModel5 == null) {
            C7573i.m23583a("titleBarViewModel");
        }
        mo91869c(cutVideoTitleBarViewModel5, C39051bk.f101350a, new C11672v(), new C39041d(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m124703a(C39037bf bfVar) {
        ImageView imageView = bfVar.f101333i;
        if (imageView == null) {
            C7573i.m23583a("ivBack");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TextView m124705b(C39037bf bfVar) {
        TextView textView = bfVar.f101334j;
        if (textView == null) {
            C7573i.m23583a("tvNext");
        }
        return textView;
    }

    /* renamed from: c */
    public static final /* synthetic */ CutVideoViewModel m124706c(C39037bf bfVar) {
        CutVideoViewModel cutVideoViewModel = bfVar.f101335k;
        if (cutVideoViewModel == null) {
            C7573i.m23583a("cutVideoViewModel");
        }
        return cutVideoViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…deoViewModel::class.java)");
            this.f101335k = (CutVideoViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoTitleBarViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…BarViewModel::class.java)");
                this.f101336m = (CutVideoTitleBarViewModel) a2;
                CutVideoViewModel cutVideoViewModel = this.f101335k;
                if (cutVideoViewModel == null) {
                    C7573i.m23583a("cutVideoViewModel");
                }
                if (cutVideoViewModel.mo97156h().f100999c) {
                    Activity activity3 = this.f33526d_;
                    if (activity3 == null) {
                        C7573i.m23580a();
                    }
                    m124704a((int) R.drawable.tr, C0683b.m2912c(activity3, R.color.ab1));
                }
                CutVideoViewModel cutVideoViewModel2 = this.f101335k;
                if (cutVideoViewModel2 == null) {
                    C7573i.m23583a("cutVideoViewModel");
                }
                if (!cutVideoViewModel2.mo97157i()) {
                    m124698G();
                } else {
                    m124699H();
                }
                m124700I();
                m124701J();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    private final void m124704a(int i, int i2) {
        TextView textView = this.f101334j;
        if (textView == null) {
            C7573i.m23583a("tvNext");
        }
        textView.setBackgroundResource(R.drawable.tr);
        TextView textView2 = this.f101334j;
        if (textView2 == null) {
            C7573i.m23583a("tvNext");
        }
        textView2.setTextColor(i2);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aic, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…tlebar, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
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
