package com.p280ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
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
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.C7492s;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel */
public abstract class BaseJediViewModel<S extends C11670t> extends JediViewModel<S> {

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$a */
    static final class C44391a extends Lambda implements C7562b<S, S> {

        /* renamed from: a */
        public static final C44391a f114653a = new C44391a();

        C44391a() {
            super(1);
        }

        /* renamed from: a */
        private static S m140472a(S s) {
            C7573i.m23587b(s, "it");
            return s;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m140472a((C11670t) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$b */
    public static final class C44392b implements C44396a {

        /* renamed from: a */
        final /* synthetic */ C0043i f114654a;

        /* access modifiers changed from: private */
        /* renamed from: f */
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

        public final Lifecycle getLifecycle() {
            Lifecycle lifecycle = this.f114654a.getLifecycle();
            C7573i.m23582a((Object) lifecycle, "lifecycleOwner.lifecycle");
            return lifecycle;
        }

        C44392b(C0043i iVar) {
            this.f114654a = iVar;
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

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$c */
    static final class C44393c extends Lambda implements C7562b<A, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f114655a;

        C44393c(C7562b bVar) {
            this.f114655a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140488a(obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140488a(A a) {
            if (a != null) {
                this.f114655a.invoke(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.BaseJediViewModel$d */
    static final class C44394d extends Lambda implements C7562b<C44403b<? extends A>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f114656a;

        C44394d(C7562b bVar) {
            this.f114656a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140489a((C44403b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140489a(C44403b<? extends A> bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo106827a(new C7562b<A, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C44394d f114657a;

                {
                    this.f114657a = r1;
                }

                /* renamed from: a */
                private void m140490a(A a) {
                    this.f114657a.f114656a.invoke(a);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m140490a(obj);
                    return C7581n.f20898a;
                }
            });
        }
    }

    /* renamed from: a */
    public final S mo106825a(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        return (C11670t) new C44392b(iVar).mo29066a(this, C44391a.f114653a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <A> C7321c m140467b(C0043i iVar, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        return m140465a(iVar, lVar, vVar, new C44393c(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public <A> C7321c m140469c(C0043i iVar, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        return m140467b(iVar, lVar, vVar, new C44394d(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public <A> C7321c m140465a(C0043i iVar, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        Lifecycle lifecycle = iVar.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.mo54a() == State.DESTROYED) {
            C7321c l = C7492s.m23303c().mo19333l();
            C7573i.m23582a((Object) l, "Observable.empty<Int>().subscribe()");
            return l;
        }
        C7321c a = mo29032a(lVar, vVar, bVar);
        iVar.getLifecycle().mo55a(new BaseJediViewModel$selectSubscribe$2(a));
        return a;
    }
}
