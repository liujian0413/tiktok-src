package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.internal.C11640h;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.C7492s;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.jedi.arch.m */
public class C11650m<S extends C11670t, PROP extends C11670t> {

    /* renamed from: a */
    public JediViewModel<S> f31319a;

    /* renamed from: b */
    public C7599l<S, ? extends PROP> f31320b;

    /* renamed from: c */
    public C7563m<? super S, ? super PROP, ? extends S> f31321c;

    /* renamed from: d */
    private C47562b f31322d;

    /* renamed from: com.bytedance.jedi.arch.m$a */
    static final class C11651a extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31323a;

        /* renamed from: b */
        final /* synthetic */ C11669s f31324b;

        C11651a(C7563m mVar, C11669s sVar) {
            this.f31323a = mVar;
            this.f31324b = sVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34138a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34138a(Throwable th) {
            C7573i.m23587b(th, "it");
            C11501d e = this.f31324b.mo29191e();
            if (e != null) {
                this.f31323a.invoke(e, th);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$b */
    static final class C11652b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31325a;

        /* renamed from: b */
        final /* synthetic */ C11669s f31326b;

        C11652b(C7562b bVar, C11669s sVar) {
            this.f31325a = bVar;
            this.f31326b = sVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m34139a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34139a() {
            C11501d e = this.f31326b.mo29191e();
            if (e != null) {
                this.f31325a.invoke(e);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$c */
    static final class C11653c extends Lambda implements C7562b<T, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31327a;

        /* renamed from: b */
        final /* synthetic */ C11669s f31328b;

        C11653c(C7563m mVar, C11669s sVar) {
            this.f31327a = mVar;
            this.f31328b = sVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34140a(obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34140a(T t) {
            C11501d e = this.f31328b.mo29191e();
            if (e != null) {
                this.f31327a.invoke(e, t);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$d */
    static final class C11654d extends Lambda implements C7562b<T, T> {

        /* renamed from: a */
        public static final C11654d f31329a = new C11654d();

        C11654d() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$e */
    static final class C11655e extends Lambda implements C7562b<PROP, PROP> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31330a;

        C11655e(C7563m mVar) {
            this.f31330a = mVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public PROP invoke(PROP prop) {
            C7573i.m23587b(prop, "$receiver");
            return (C11670t) this.f31330a.invoke(prop, new C11649l());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$f */
    static final class C11656f<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31331a;

        C11656f(C7562b bVar) {
            this.f31331a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C11674x<V> apply(T t) {
            return new C11674x<>(this.f31331a.invoke(t));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$g */
    static final class C11657g<T, R> implements C7327h<Throwable, C11491a<? extends V>> {

        /* renamed from: a */
        public static final C11657g f31332a = new C11657g();

        C11657g() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m34143a((Throwable) obj);
        }

        /* renamed from: a */
        private static C11500c<V> m34143a(Throwable th) {
            C7573i.m23587b(th, "it");
            return new C11500c<>(th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$h */
    static final class C11658h<T> implements C7326g<C11491a<? extends V>> {

        /* renamed from: a */
        final /* synthetic */ C11650m f31333a;

        /* renamed from: b */
        final /* synthetic */ boolean f31334b = false;

        /* renamed from: c */
        final /* synthetic */ Thread f31335c = null;

        /* renamed from: d */
        final /* synthetic */ C7563m f31336d;

        C11658h(C11650m mVar, boolean z, Thread thread, C7563m mVar2) {
            this.f31333a = mVar;
            this.f31336d = mVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(final C11491a<? extends V> aVar) {
            this.f31333a.mo29187b(new C7562b<PROP, PROP>(this) {

                /* renamed from: a */
                final /* synthetic */ C11658h f31337a;

                {
                    this.f31337a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public PROP invoke(PROP prop) {
                    C7573i.m23587b(prop, "$receiver");
                    C7563m mVar = this.f31337a.f31336d;
                    C11491a aVar = aVar;
                    C7573i.m23582a((Object) aVar, "asyncData");
                    return (C11670t) mVar.invoke(prop, aVar);
                }
            });
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$i */
    static final class C11660i extends Lambda implements C7562b<A, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11669s f31339a;

        /* renamed from: b */
        final /* synthetic */ C11650m f31340b;

        /* renamed from: c */
        final /* synthetic */ C11502e f31341c;

        /* renamed from: d */
        final /* synthetic */ C7599l f31342d;

        /* renamed from: e */
        final /* synthetic */ boolean f31343e;

        /* renamed from: f */
        final /* synthetic */ boolean f31344f;

        /* renamed from: g */
        final /* synthetic */ C7563m f31345g;

        C11660i(C11669s sVar, C11650m mVar, C11502e eVar, C7599l lVar, boolean z, boolean z2, C7563m mVar2) {
            this.f31339a = sVar;
            this.f31340b = mVar;
            this.f31341c = eVar;
            this.f31342d = lVar;
            this.f31343e = z;
            this.f31344f = z2;
            this.f31345g = mVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34146a(obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34146a(A a) {
            C11501d e = this.f31339a.mo29191e();
            if (e != null) {
                this.f31345g.invoke(e, a);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$j */
    static final class C11661j extends Lambda implements C7562b<S, S> {

        /* renamed from: a */
        final /* synthetic */ C11650m f31346a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31347b;

        C11661j(C11650m mVar, C7562b bVar) {
            this.f31346a = mVar;
            this.f31347b = bVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public S invoke(S s) {
            C7573i.m23587b(s, "$receiver");
            return (C11670t) C11650m.m34128a(this.f31346a).invoke(s, this.f31347b.invoke(this.f31346a.mo29182a().invoke(s)));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$k */
    static final class C11662k extends Lambda implements C7562b<S, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11650m f31348a;

        /* renamed from: b */
        final /* synthetic */ C7563m f31349b;

        C11662k(C11650m mVar, C7563m mVar2) {
            this.f31348a = mVar;
            this.f31349b = mVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34148a((C11670t) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34148a(S s) {
            C7573i.m23587b(s, "it");
            this.f31349b.invoke(s, this.f31348a.mo29182a().invoke(s));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.m$l */
    static final class C11663l extends Lambda implements C7562b<S, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11650m f31350a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31351b;

        C11663l(C11650m mVar, C7562b bVar) {
            this.f31350a = mVar;
            this.f31351b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34149a((C11670t) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m34149a(S s) {
            C7573i.m23587b(s, "it");
            this.f31351b.invoke(this.f31350a.mo29182a().invoke(s));
        }
    }

    /* renamed from: a */
    public final void mo29186a(C7599l<S, ? extends PROP> lVar, C7563m<? super S, ? super PROP, ? extends S> mVar) {
        C7573i.m23587b(lVar, "subState");
        C7573i.m23587b(mVar, "mainStateReducer");
        this.f31320b = lVar;
        this.f31321c = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29185a(C7563m<? super S, ? super PROP, C7581n> mVar) {
        C7573i.m23587b(mVar, "block");
        JediViewModel<S> jediViewModel = this.f31319a;
        if (jediViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        jediViewModel.mo29040d(new C11662k(this, mVar));
    }

    /* renamed from: a */
    public final void mo29184a(C7562b<? super PROP, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        JediViewModel<S> jediViewModel = this.f31319a;
        if (jediViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        jediViewModel.mo29040d(new C11663l(this, bVar));
    }

    /* renamed from: a */
    public final C7599l<S, PROP> mo29182a() {
        C7599l<S, ? extends PROP> lVar = this.f31320b;
        if (lVar == null) {
            C7573i.m23583a("substate");
        }
        return lVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C7563m m34128a(C11650m mVar) {
        C7563m<? super S, ? super PROP, ? extends S> mVar2 = mVar.f31321c;
        if (mVar2 == null) {
            C7573i.m23583a("mainStateReducer");
        }
        return mVar2;
    }

    /* renamed from: a */
    private C7321c m34126a(C7321c cVar) {
        C7573i.m23587b(cVar, "$this$disposeOnClear");
        C47562b bVar = this.f31322d;
        if (bVar == null) {
            C7573i.m23583a("disposables");
        }
        bVar.mo119661a(cVar);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29187b(C7562b<? super PROP, ? extends PROP> bVar) {
        C7573i.m23587b(bVar, "reducer");
        JediViewModel<S> jediViewModel = this.f31319a;
        if (jediViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        jediViewModel.mo29042e(new C11661j(this, bVar));
    }

    /* renamed from: a */
    public final <T> C7321c mo29181a(C7492s<T> sVar, C7563m<? super PROP, ? super C11491a<? extends T>, ? extends PROP> mVar) {
        C7573i.m23587b(sVar, "$this$execute");
        C7573i.m23587b(mVar, "stateReducer");
        return m34127a(sVar, C11654d.f31329a, mVar);
    }

    /* renamed from: a */
    public final void mo29183a(C47562b bVar, JediViewModel<S> jediViewModel) {
        C7573i.m23587b(bVar, "disposables");
        C7573i.m23587b(jediViewModel, "viewModel");
        this.f31322d = bVar;
        this.f31319a = jediViewModel;
    }

    /* renamed from: a */
    private <T, V> C7321c m34127a(C7492s<T> sVar, C7562b<? super T, ? extends V> bVar, C7563m<? super PROP, ? super C11491a<? extends V>, ? extends PROP> mVar) {
        C7573i.m23587b(sVar, "$this$execute");
        C7573i.m23587b(bVar, "mapper");
        C7573i.m23587b(mVar, "stateReducer");
        mo29187b(new C11655e(mVar));
        C7321c f = sVar.mo19317d((C7327h<? super T, ? extends R>) new C11656f<Object,Object>(bVar)).mo19327f((C7327h<? super Throwable, ? extends T>) C11657g.f31332a).mo19325f((C7326g<? super T>) new C11658h<Object>(this, false, null, mVar));
        C7573i.m23582a((Object) f, "map<Async<V>> { Success(…syncData) }\n            }");
        return m34126a(f);
    }

    /* renamed from: a */
    public final <RECEIVER extends C11501d, A> C7321c mo29179a(C11502e<? extends RECEIVER> eVar, C7599l<PROP, ? extends A> lVar, boolean z, boolean z2, C7563m<? super RECEIVER, ? super A, C7581n> mVar) {
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(mVar, "subscriber");
        C11669s b = eVar.mo29067b();
        JediViewModel<S> jediViewModel = this.f31319a;
        if (jediViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        C0043i d = eVar.mo29060a().mo29173d();
        C7599l<S, ? extends PROP> lVar2 = this.f31320b;
        if (lVar2 == null) {
            C7573i.m23583a("substate");
        }
        boolean z3 = z;
        boolean z4 = z2;
        C11660i iVar = new C11660i(b, this, eVar, lVar, z3, z4, mVar);
        return C11640h.m34116a(jediViewModel, d, lVar, lVar2, z3, z4, iVar);
    }

    /* renamed from: a */
    public final <RECEIVER extends C11501d, T> C7321c mo29180a(C11502e<? extends RECEIVER> eVar, C7599l<PROP, ? extends C11491a<? extends T>> lVar, boolean z, boolean z2, C7563m<? super RECEIVER, ? super Throwable, C7581n> mVar, C7562b<? super RECEIVER, C7581n> bVar, C7563m<? super RECEIVER, ? super T, C7581n> mVar2) {
        C11502e<? extends RECEIVER> eVar2 = eVar;
        C7573i.m23587b(eVar, "$this$asyncSubscribe");
        C7599l<PROP, ? extends C11491a<? extends T>> lVar2 = lVar;
        C7573i.m23587b(lVar, "prop");
        C11669s b = eVar.mo29067b();
        JediViewModel<S> jediViewModel = this.f31319a;
        if (jediViewModel == null) {
            C7573i.m23583a("viewModel");
        }
        C0043i d = eVar.mo29060a().mo29173d();
        C7599l<S, ? extends PROP> lVar3 = this.f31320b;
        if (lVar3 == null) {
            C7573i.m23583a("substate");
        }
        return C11640h.m34117a(jediViewModel, d, lVar, lVar3, z, z2, new C11651a(mVar, b), new C11652b(bVar, b), new C11653c(mVar2, b));
    }
}
