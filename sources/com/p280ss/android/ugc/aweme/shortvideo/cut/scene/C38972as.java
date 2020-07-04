package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.FrameLayout;
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
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38774k;
import com.p280ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39575f;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40308e;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40308e.C40310a;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
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
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as */
public final class C38972as extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f101199i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38972as.class), "speedModule", "getSpeedModule()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;"))};

    /* renamed from: m */
    public static final C38973a f101200m = new C38973a(null);

    /* renamed from: j */
    public C39052bl f101201j;

    /* renamed from: k */
    public ViewStub f101202k;

    /* renamed from: l */
    public CutMultiVideoViewModel f101203l;

    /* renamed from: n */
    private CutVideoSpeedViewModel f101204n;

    /* renamed from: o */
    private CutVideoViewModel f101205o;

    /* renamed from: p */
    private final C7541d f101206p = C7546e.m23569a(new C38978f(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$a */
    public static final class C38973a {
        private C38973a() {
        }

        public /* synthetic */ C38973a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$b */
    static final class C38974b extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38972as f101207a;

        C38974b(C38972as asVar) {
            this.f101207a = asVar;
            super(2);
        }

        /* renamed from: a */
        private void m124490a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            this.f101207a.mo30921H().f104694a = z;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124490a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$c */
    static final class C38975c extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38972as f101208a;

        C38975c(C38972as asVar) {
            this.f101208a = asVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124491a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124491a(C44396a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                this.f101208a.mo30922I();
            }
            if (z) {
                this.f101208a.mo30921H().mo100133a(C38774k.m123824d(this.f101208a.mo30920G().mo97241P().getCurrentSpeed()));
            }
            C40308e H = this.f101208a.mo30921H();
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            H.mo100131a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$d */
    static final class C38976d<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ C38972as f101209a;

        C38976d(C38972as asVar) {
            this.f101209a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f != null) {
                View view = this.f101209a.f33523b;
                C7573i.m23582a((Object) view, "view");
                C7573i.m23582a((Object) f, "it");
                view.setAlpha(f.floatValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$e */
    static final class C38977e<T> implements C0053p<RecordingSpeed> {

        /* renamed from: a */
        final /* synthetic */ C38972as f101210a;

        C38977e(C38972as asVar) {
            this.f101210a = asVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(RecordingSpeed recordingSpeed) {
            if (recordingSpeed != null) {
                this.f101210a.mo30921H().mo100133a(recordingSpeed);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.as$f */
    static final class C38978f extends Lambda implements C7561a<C40308e> {

        /* renamed from: a */
        final /* synthetic */ C38972as f101211a;

        C38978f(C38972as asVar) {
            this.f101211a = asVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C40308e invoke() {
            return new C40308e(C38972as.m124467a(this.f101211a), new C40310a(this) {

                /* renamed from: a */
                final /* synthetic */ C38978f f101212a;

                {
                    this.f101212a = r1;
                }

                /* renamed from: a */
                public final void mo96729a(RecordingSpeed recordingSpeed) {
                    C38972as.m124468b(this.f101212a.f101211a).mo96663a(recordingSpeed.value());
                }
            });
        }
    }

    /* renamed from: H */
    public final C40308e mo30921H() {
        return (C40308e) this.f101206p.getValue();
    }

    /* renamed from: a */
    public final void mo97254a(C39052bl blVar) {
        C7573i.m23587b(blVar, "<set-?>");
        this.f101201j = blVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        View h_ = mo31004h_(R.id.dbu);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.stubSpeedLayout)");
        this.f101202k = (ViewStub) h_;
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

    /* renamed from: G */
    public final C39052bl mo30920G() {
        C39052bl blVar = this.f101201j;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        return blVar;
    }

    /* renamed from: J */
    private final void m124465J() {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.f101204n;
        if (cutVideoSpeedViewModel == null) {
            C7573i.m23583a("speedViewModel");
        }
        mo91868b(cutVideoSpeedViewModel, C38980at.f101213a, new C11672v(), new C38974b(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f101204n;
        if (cutVideoSpeedViewModel2 == null) {
            C7573i.m23583a("speedViewModel");
        }
        mo91868b(cutVideoSpeedViewModel2, C38981au.f101214a, new C11672v(), new C38975c(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f101204n;
        if (cutVideoSpeedViewModel3 == null) {
            C7573i.m23583a("speedViewModel");
        }
        C0043i iVar = this;
        cutVideoSpeedViewModel3.mo97107g().observe(iVar, new C38976d(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel4 = this.f101204n;
        if (cutVideoSpeedViewModel4 == null) {
            C7573i.m23583a("speedViewModel");
        }
        cutVideoSpeedViewModel4.mo29069f().observe(iVar, new C38977e(this));
    }

    /* renamed from: I */
    public final void mo30922I() {
        View view = this.f33523b;
        C7573i.m23582a((Object) view, "view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            CutVideoViewModel cutVideoViewModel = this.f101205o;
            if (cutVideoViewModel == null) {
                C7573i.m23583a("cutVideoViewModel");
            }
            if (cutVideoViewModel.mo97157i()) {
                C39052bl blVar = this.f101201j;
                if (blVar == null) {
                    C7573i.m23583a("previewEditCallback");
                }
                layoutParams2.bottomMargin = blVar.mo97240O() + mo31017x().getDimensionPixelSize(R.dimen.kg);
            } else {
                Activity v = mo31015v();
                C7573i.m23582a((Object) v, "requireActivity()");
                layoutParams2.bottomMargin = (int) C39575f.m126467a(v, 163.0f);
                Activity v2 = mo31015v();
                C7573i.m23582a((Object) v2, "requireActivity()");
                layoutParams2.leftMargin = (int) C39575f.m126467a(v2, 32.5f);
                Activity v3 = mo31015v();
                C7573i.m23582a((Object) v3, "requireActivity()");
                layoutParams2.rightMargin = (int) C39575f.m126467a(v3, 32.5f);
            }
            layoutParams2.gravity = 80;
            View view2 = this.f33523b;
            C7573i.m23582a((Object) view2, "view");
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewStub m124467a(C38972as asVar) {
        ViewStub viewStub = asVar.f101202k;
        if (viewStub == null) {
            C7573i.m23583a("speedStub");
        }
        return viewStub;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutMultiVideoViewModel m124468b(C38972as asVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = asVar.f101203l;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(CutMultiVideoViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f101203l = (CutMultiVideoViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoSpeedViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…eedViewModel::class.java]");
                this.f101204n = (CutVideoSpeedViewModel) a2;
                Activity activity3 = this.f33526d_;
                if (activity3 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(CutVideoViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…deoViewModel::class.java)");
                    this.f101205o = (CutVideoViewModel) a3;
                    m124465J();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
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
        View inflate = layoutInflater.inflate(R.layout.aia, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_speed, container, false)");
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
