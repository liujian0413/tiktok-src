package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
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
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39368b;
import com.p280ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator;
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

/* renamed from: com.ss.android.ugc.gamora.editor.p */
public final class C44345p extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114563i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44345p.class), "filterIndicator", "getFilterIndicator()Lcom/ss/android/ugc/aweme/story/widget/CompositeStoryFilterIndicator;"))};

    /* renamed from: l */
    public static final C44346a f114564l = new C44346a(null);

    /* renamed from: j */
    public EditFilterIndicatorViewModel f114565j;

    /* renamed from: k */
    public ViewStub f114566k;

    /* renamed from: m */
    private final C7541d f114567m = C7546e.m23569a(new C44347b(this));

    /* renamed from: n */
    private C29296g f114568n;

    /* renamed from: com.ss.android.ugc.gamora.editor.p$a */
    public static final class C44346a {
        private C44346a() {
        }

        public /* synthetic */ C44346a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.p$b */
    static final class C44347b extends Lambda implements C7561a<CompositeStoryFilterIndicator> {

        /* renamed from: a */
        final /* synthetic */ C44345p f114569a;

        C44347b(C44345p pVar) {
            this.f114569a = pVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CompositeStoryFilterIndicator invoke() {
            View inflate = C44345p.m140281b(this.f114569a).inflate();
            if (inflate != null) {
                return (CompositeStoryFilterIndicator) inflate;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.story.widget.CompositeStoryFilterIndicator");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.p$c */
    static final class C44348c extends Lambda implements C7563m<C44396a, C29296g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44345p f114570a;

        C44348c(C44345p pVar) {
            this.f114570a = pVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140300a((C44396a) obj, (C29296g) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140300a(C44396a aVar, C29296g gVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(gVar, "it");
            this.f114570a.mo106792a(gVar, C44345p.m140280a(this.f114570a).f113673c);
        }
    }

    /* renamed from: G */
    private final CompositeStoryFilterIndicator m140278G() {
        return (CompositeStoryFilterIndicator) this.f114567m.getValue();
    }

    /* renamed from: a */
    public final void mo106792a(C29296g gVar, boolean z) {
        C29296g gVar2 = this.f114568n;
        if (!(gVar2 == null || gVar.f77270e == gVar2.f77270e)) {
            String c = C35563c.m114837d().mo74828c(gVar2);
            String c2 = C35563c.m114837d().mo74828c(gVar);
            CompositeStoryFilterIndicator G = m140278G();
            String str = gVar2.f77267b;
            C7573i.m23582a((Object) str, "it.name");
            C39368b bVar = new C39368b(str, c);
            String str2 = gVar.f77267b;
            C7573i.m23582a((Object) str2, "filterBean.name");
            G.mo103467a(bVar, new C39368b(str2, c2), gVar2.f77270e < gVar.f77270e, z);
            this.f114568n = gVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
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

    /* renamed from: a */
    public static final /* synthetic */ EditFilterIndicatorViewModel m140280a(C44345p pVar) {
        EditFilterIndicatorViewModel editFilterIndicatorViewModel = pVar.f114565j;
        if (editFilterIndicatorViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        return editFilterIndicatorViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewStub m140281b(C44345p pVar) {
        ViewStub viewStub = pVar.f114566k;
        if (viewStub == null) {
            C7573i.m23583a("filterIndicatorStub");
        }
        return viewStub;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(EditFilterIndicatorViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…torViewModel::class.java]");
            this.f114565j = (EditFilterIndicatorViewModel) a;
            this.f114568n = C35563c.f93224F.mo70097l().mo74949b().mo74962a(0);
            EditFilterIndicatorViewModel editFilterIndicatorViewModel = this.f114565j;
            if (editFilterIndicatorViewModel == null) {
                C7573i.m23583a("viewModel");
            }
            mo91868b(editFilterIndicatorViewModel, C44349q.f114571a, new C11672v(), new C44348c(this));
            return;
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
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aik, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.dc5);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.stub_filter_indicator)");
        this.f114566k = (ViewStub) findViewById;
        C7573i.m23582a((Object) inflate, "view");
        return inflate;
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
