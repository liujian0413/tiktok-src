package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
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
import com.bytedance.scene.group.C12604b;
import com.p280ss.android.ugc.aweme.shortvideo.C38576cg;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.C39252c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.gamora.editor.C44337l;
import com.p280ss.android.ugc.gamora.editor.EditCornerViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq */
public final class C38965aq extends C12604b implements C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f101186j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38965aq.class), "bottomBarScene", "getBottomBarScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoBottomBarScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38965aq.class), "videoEditScene", "getVideoEditScene()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoEditScene;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38965aq.class), "cornerScene", "getCornerScene()Lcom/ss/android/ugc/gamora/editor/EditCornerScene;"))};

    /* renamed from: o */
    public static final C38966a f101187o = new C38966a(null);

    /* renamed from: k */
    public C38916af f101188k;

    /* renamed from: l */
    public C39052bl f101189l;

    /* renamed from: m */
    public VideoEditViewModel f101190m;

    /* renamed from: n */
    public CutVideoPreviewViewModel f101191n;

    /* renamed from: p */
    private final C7541d f101192p = C7546e.m23569a(new C38967b(this));

    /* renamed from: q */
    private final C7541d f101193q = C7546e.m23569a(new C38970e(this));

    /* renamed from: r */
    private final C7541d f101194r = C7546e.m23569a(new C38968c(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq$a */
    public static final class C38966a {
        private C38966a() {
        }

        public /* synthetic */ C38966a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq$b */
    static final class C38967b extends Lambda implements C7561a<C39012b> {

        /* renamed from: a */
        final /* synthetic */ C38965aq f101195a;

        C38967b(C38965aq aqVar) {
            this.f101195a = aqVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39012b invoke() {
            C39012b bVar = new C39012b();
            bVar.mo97333a(this.f101195a.mo97248J());
            bVar.mo97334a(this.f101195a.mo96987K());
            this.f101195a.mo30925a((int) R.id.d70, (C12629j) bVar, "CutVideoBottomBarScene");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq$c */
    static final class C38968c extends Lambda implements C7561a<C44337l> {

        /* renamed from: a */
        final /* synthetic */ C38965aq f101196a;

        C38968c(C38965aq aqVar) {
            this.f101196a = aqVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C44337l invoke() {
            C44337l lVar = new C44337l();
            this.f101196a.mo30925a((int) R.id.d70, (C12629j) lVar, "EditCornerScene");
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq$d */
    static final class C38969d extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38965aq f101197a;

        C38969d(C38965aq aqVar) {
            this.f101197a = aqVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m124461a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m124461a(int i) {
            C38965aq.m124432b(this.f101197a).mo97090a(Math.min(((VideoSegment) C38965aq.m124430a(this.f101197a).mo97721n().get(0)).f100765g, ((VideoSegment) C38965aq.m124430a(this.f101197a).mo97721n().get(0)).f100766h), Math.max(((VideoSegment) C38965aq.m124430a(this.f101197a).mo97721n().get(0)).f100765g, ((VideoSegment) C38965aq.m124430a(this.f101197a).mo97721n().get(0)).f100766h));
            this.f101197a.mo97249L();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aq$e */
    static final class C38970e extends Lambda implements C7561a<C39064k> {

        /* renamed from: a */
        final /* synthetic */ C38965aq f101198a;

        C38970e(C38965aq aqVar) {
            this.f101198a = aqVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C39064k invoke() {
            C39064k kVar = new C39064k();
            kVar.mo97356a(this.f101198a.mo97248J());
            this.f101198a.mo30925a((int) R.id.d70, (C12629j) kVar, "CutVideoEditScene");
            return kVar;
        }
    }

    /* renamed from: O */
    private final C39012b m124425O() {
        return (C39012b) this.f101192p.getValue();
    }

    /* renamed from: P */
    private final C39064k m124426P() {
        return (C39064k) this.f101193q.getValue();
    }

    /* renamed from: Q */
    private final C44337l m124427Q() {
        return (C44337l) this.f101194r.getValue();
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo97252a(C38916af afVar) {
        C7573i.m23587b(afVar, "<set-?>");
        this.f101188k = afVar;
    }

    /* renamed from: a */
    public final void mo97253a(C39052bl blVar) {
        C7573i.m23587b(blVar, "<set-?>");
        this.f101189l = blVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        mo30945d((C12629j) m124425O());
        mo30945d((C12629j) m124426P());
        if (C39805en.m127445a()) {
            mo30945d((C12629j) m124427Q());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: N */
    public final void mo97251N() {
        m124426P().mo30922I();
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
    public final C38916af mo97248J() {
        C38916af afVar = this.f101188k;
        if (afVar == null) {
            C7573i.m23583a("presenter");
        }
        return afVar;
    }

    /* renamed from: K */
    public final C39052bl mo96987K() {
        C39052bl blVar = this.f101189l;
        if (blVar == null) {
            C7573i.m23583a("previewEditCallback");
        }
        return blVar;
    }

    /* renamed from: M */
    public final C39252c mo97250M() {
        return m124426P().mo30921H();
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: R */
    private final void m124428R() {
        View view = m124425O().f33523b;
        C7573i.m23582a((Object) view, "bottomBarScene.view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            View view2 = m124425O().f33523b;
            C7573i.m23582a((Object) view2, "bottomBarScene.view");
            view2.setLayoutParams(layoutParams2);
            View view3 = m124426P().f33523b;
            C7573i.m23582a((Object) view3, "videoEditScene.view");
            LayoutParams layoutParams3 = view3.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 80;
                View view4 = m124426P().f33523b;
                C7573i.m23582a((Object) view4, "videoEditScene.view");
                view4.setLayoutParams(layoutParams4);
                mo97249L();
                Activity activity = this.f33526d_;
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                new C38576cg(activity).mo96554a(C38577a.f100216a, new C38969d(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: L */
    public final void mo97249L() {
        if (C39805en.m127445a()) {
            switch (C39804em.f103457a) {
                case 1:
                    m124431a(true);
                    m124433b(true);
                    return;
                case 2:
                    m124431a(false);
                    m124433b(true);
                    return;
                case 3:
                    m124431a(true);
                    m124433b(false);
                    return;
                case 4:
                    m124431a(true);
                    m124433b(true);
                    return;
                case 5:
                    m124431a(false);
                    m124433b(true);
                    return;
                case 6:
                    m124431a(true);
                    m124433b(false);
                    return;
                case 7:
                    m124431a(false);
                    m124433b(false);
                    return;
                default:
                    m124431a(false);
                    m124433b(false);
                    return;
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoEditViewModel m124430a(C38965aq aqVar) {
        VideoEditViewModel videoEditViewModel = aqVar.f101190m;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ CutVideoPreviewViewModel m124432b(C38965aq aqVar) {
        CutVideoPreviewViewModel cutVideoPreviewViewModel = aqVar.f101191n;
        if (cutVideoPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        return cutVideoPreviewViewModel;
    }

    /* renamed from: a */
    private final void m124431a(boolean z) {
        int i;
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditCornerViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…nerViewModel::class.java)");
            EditCornerViewModel editCornerViewModel = (EditCornerViewModel) a;
            if (z) {
                i = C39805en.m127450c(this.f33526d_);
            } else {
                i = 0;
            }
            editCornerViewModel.mo106197a(i);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ditViewModel::class.java)");
            this.f101190m = (VideoEditViewModel) a;
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(CutVideoPreviewViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…iewViewModel::class.java)");
                this.f101191n = (CutVideoPreviewViewModel) a2;
                if (C39805en.m127445a()) {
                    m124428R();
                    return;
                }
                View view = this.f33523b;
                C7573i.m23582a((Object) view, "view");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 80;
                    View view2 = this.f33523b;
                    C7573i.m23582a((Object) view2, "view");
                    view2.setLayoutParams(layoutParams2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    private final void m124433b(boolean z) {
        int i;
        int i2;
        int dimensionPixelSize = mo31017x().getDimensionPixelSize(R.dimen.cp);
        View view = m124425O().f33523b;
        C7573i.m23582a((Object) view, "bottomBarScene.view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (z) {
                i = dimensionPixelSize;
            } else {
                i = (int) C9738o.m28708b((Context) this.f33526d_, 132.0f);
            }
            marginLayoutParams.height = i;
            View view2 = m124425O().f33523b;
            C7573i.m23582a((Object) view2, "bottomBarScene.view");
            view2.setLayoutParams(marginLayoutParams);
            View view3 = m124426P().f33523b;
            C7573i.m23582a((Object) view3, "videoEditScene.view");
            LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                if (z) {
                    i2 = (int) (C9738o.m28708b((Context) this.f33526d_, 5.5f) + ((float) dimensionPixelSize));
                } else {
                    i2 = 0;
                }
                marginLayoutParams2.bottomMargin = i2;
                View view4 = m124426P().f33523b;
                C7573i.m23582a((Object) view4, "videoEditScene.view");
                view4.setLayoutParams(marginLayoutParams2);
                Activity activity = this.f33526d_;
                if (activity != null) {
                    JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditCornerViewModel.class);
                    C7573i.m23582a((Object) a, "JediViewModelProviders.o…nerViewModel::class.java)");
                    EditCornerViewModel editCornerViewModel = (EditCornerViewModel) a;
                    if (!z) {
                        dimensionPixelSize = 0;
                    }
                    editCornerViewModel.mo106199b(dimensionPixelSize);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        if (C39805en.m127445a()) {
            View inflate = layoutInflater.inflate(R.layout.ai_, viewGroup, false);
            if (inflate != null) {
                return (ViewGroup) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        View inflate2 = layoutInflater.inflate(R.layout.ai9, viewGroup, false);
        if (inflate2 != null) {
            return (ViewGroup) inflate2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
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
