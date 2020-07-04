package com.p280ss.android.ugc.aweme.tools.beauty;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
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
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34860g.C34861a;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38519c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.tools.C42137ad;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
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
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.e */
public final class C42177e extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f109737i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42177e.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42177e.class), "beautyViewModule", "getBeautyViewModule()Lcom/ss/android/ugc/aweme/tools/beauty/BeautyViewModule;"))};

    /* renamed from: k */
    public static final C42178a f109738k = new C42178a(null);

    /* renamed from: j */
    public final C43868d f109739j;

    /* renamed from: l */
    private final C7541d f109740l;

    /* renamed from: m */
    private final C7541d f109741m = C7546e.m23569a(new C42179b(this));

    /* renamed from: n */
    private C42169b f109742n;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.e$a */
    public static final class C42178a {
        private C42178a() {
        }

        public /* synthetic */ C42178a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.e$b */
    static final class C42179b extends Lambda implements C7561a<C42163a> {

        /* renamed from: a */
        final /* synthetic */ C42177e f109743a;

        C42179b(C42177e eVar) {
            this.f109743a = eVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C42163a invoke() {
            C38519c i = this.f109743a.f109739j.mo106150i();
            FragmentActivity d = this.f109743a.f109739j.mo106145d();
            if (d != null) {
                return new C42163a(i, (AppCompatActivity) d);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.e$c */
    public static final class C42180c extends C34861a {

        /* renamed from: a */
        final /* synthetic */ C42177e f109744a;

        /* renamed from: a */
        public final void mo74767a() {
            this.f109744a.f109739j.mo106141b().mo103594a((Object) this.f109744a.f109739j.mo106145d(), (C42155av) new C42137ad(0));
        }

        /* renamed from: d */
        public final void mo74768d() {
            this.f109744a.f109739j.mo106141b().mo103594a((Object) this.f109744a.f109739j.mo106145d(), (C42155av) new C42137ad(4));
        }

        C42180c(C42177e eVar) {
            this.f109744a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.e$d */
    static final class C42181d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C42177e f109745a;

        C42181d(C42177e eVar) {
            this.f109745a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m134200a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134200a() {
            this.f109745a.mo30920G().mo106842g(false);
        }
    }

    /* renamed from: H */
    private final C42163a m134177H() {
        return (C42163a) this.f109741m.getValue();
    }

    /* renamed from: G */
    public final RecordViewModel mo30920G() {
        return (RecordViewModel) this.f109740l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
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

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        m134177H().mo103607c();
        C42169b bVar = this.f109742n;
        if (bVar == null) {
            C7573i.m23583a("mChooseBeautyTransition");
        }
        bVar.mo74849b(new C40582c());
    }

    public C42177e(C43868d dVar) {
        C7573i.m23587b(dVar, "recordEnv");
        this.f109739j = dVar;
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f109740l = C7546e.m23569a(new RecordBeautyScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        View view = this.f33523b;
        if (view != null) {
            this.f109742n = new C42169b((ViewGroup) view, m134177H().mo103604a().getContainerView(), m134177H().mo103604a().getBeautyLayout());
            C42169b bVar = this.f109742n;
            if (bVar == null) {
                C7573i.m23583a("mChooseBeautyTransition");
            }
            bVar.mo74846a((C34860g) new C42180c(this));
            m134177H().mo103606b();
            m134177H().mo103605a(new C42181d(this));
            C42169b bVar2 = this.f109742n;
            if (bVar2 == null) {
                C7573i.m23583a("mChooseBeautyTransition");
            }
            bVar2.mo74845a((C34856c) new C40582c());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
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
        View inflate = layoutInflater.inflate(R.layout.b1w, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
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
