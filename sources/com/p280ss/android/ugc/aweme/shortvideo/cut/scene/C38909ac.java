package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39145b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39165c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac */
public final class C38909ac extends C12629j implements C44396a {

    /* renamed from: m */
    public static final C38910a f101058m = new C38910a(null);

    /* renamed from: i */
    public C38982av f101059i;

    /* renamed from: j */
    public C39165c f101060j;

    /* renamed from: k */
    public StickPointModeChangeView f101061k;

    /* renamed from: l */
    public CutVideoMultiModeViewModel f101062l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac$a */
    public static final class C38910a {
        private C38910a() {
        }

        public /* synthetic */ C38910a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac$b */
    public static final class C38911b implements C39165c {

        /* renamed from: a */
        final /* synthetic */ C38909ac f101063a;

        C38911b(C38909ac acVar) {
            this.f101063a = acVar;
        }

        /* renamed from: a */
        public final void mo97196a(int i) {
            if (C38909ac.m124244a(this.f101063a).f100958c != i) {
                C38909ac.m124244a(this.f101063a).f100958c = i;
                if (C38909ac.m124244a(this.f101063a).f100958c == 1) {
                    CutVideoMultiModeViewModel a = C38909ac.m124244a(this.f101063a);
                    Activity activity = this.f101063a.f33526d_;
                    if (activity != null) {
                        a.mo97073b((FragmentActivity) activity, false);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                } else {
                    CutVideoMultiModeViewModel a2 = C38909ac.m124244a(this.f101063a);
                    Activity activity2 = this.f101063a.f33526d_;
                    if (activity2 != null) {
                        a2.mo97070a((FragmentActivity) activity2, false);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
                C39165c cVar = this.f101063a.f101060j;
                if (cVar != null) {
                    cVar.mo97196a(i);
                }
                C39193g.f101577a.mo97481a(C38909ac.m124244a(this.f101063a).mo29069f());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac$c */
    static final class C38912c extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38909ac f101064a;

        C38912c(C38909ac acVar) {
            this.f101064a = acVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124265a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124265a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C39145b.m124991a(this.f101064a.mo30920G());
            } else {
                this.f101064a.mo30920G().setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.ac$d */
    static final class C38913d extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38909ac f101065a;

        C38913d(C38909ac acVar) {
            this.f101065a = acVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124266a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124266a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C39145b.m124992a(this.f101065a.mo30920G(), true);
            } else {
                this.f101065a.mo30920G().setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo97201a(C38982av avVar) {
        C7573i.m23587b(avVar, "<set-?>");
        this.f101059i = avVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.bzp);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.mode_view)");
        this.f101061k = (StickPointModeChangeView) h_;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
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

    /* renamed from: G */
    public final StickPointModeChangeView mo30920G() {
        StickPointModeChangeView stickPointModeChangeView = this.f101061k;
        if (stickPointModeChangeView == null) {
            C7573i.m23583a("modelChangeView");
        }
        return stickPointModeChangeView;
    }

    /* renamed from: H */
    private final void m124241H() {
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(CutVideoMultiModeViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…odeViewModel::class.java)");
            this.f101062l = (CutVideoMultiModeViewModel) a;
            StickPointModeChangeView stickPointModeChangeView = this.f101061k;
            if (stickPointModeChangeView == null) {
                C7573i.m23583a("modelChangeView");
            }
            stickPointModeChangeView.setStickPointModeChangeListener(new C38911b(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: I */
    private final void m124242I() {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = this.f101062l;
        if (cutVideoMultiModeViewModel == null) {
            C7573i.m23583a("multiModelViewModel");
        }
        mo91869c(cutVideoMultiModeViewModel, C38914ad.f101066a, new C11672v(), new C38912c(this));
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel2 = this.f101062l;
        if (cutVideoMultiModeViewModel2 == null) {
            C7573i.m23583a("multiModelViewModel");
        }
        mo91869c(cutVideoMultiModeViewModel2, C38915ae.f101067a, new C11672v(), new C38913d(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ CutVideoMultiModeViewModel m124244a(C38909ac acVar) {
        CutVideoMultiModeViewModel cutVideoMultiModeViewModel = acVar.f101062l;
        if (cutVideoMultiModeViewModel == null) {
            C7573i.m23583a("multiModelViewModel");
        }
        return cutVideoMultiModeViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m124241H();
        m124242I();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ai6, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…i_mode, container, false)");
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
